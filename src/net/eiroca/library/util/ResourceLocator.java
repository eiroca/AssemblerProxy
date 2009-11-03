/*
 * ResourceLocator.java
 *
 * Created on 21. Januar 2003, 21:33
 */

package net.eiroca.library.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 * Adopted from <a href="http://www.onjava.com/pub/a/onjava/excerpt/jebp_3/index1.html?page=3">Servlet Best Practices, Part 1</a>
 *
 * A class to locate resources, retrieve their contents, and determine their
 * last modified time. To find the resource the class searches the CLASSPATH
 * first, then Resource.class.getResource("/" + name). If the Resource finds
 * a "file:" URL, the file path will be treated as a file. Otherwise, the
 * path is treated as a URL and has limited last modified info.
 *
 * @author Andreas Mecky <andreas.mecky@jzonic.org>
 * @author Terry Dye <terry.dye@jzonic.org>
 */
public class ResourceLocator implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1L;
  private final String name;
  private File file;
  private URL url;

  public ResourceLocator(final String name) throws IOException {
    this.name = name;
    SecurityException exception = null;
    try {
      // Search using the CLASSPATH. If found, "file" is set and the call
      // returns true.  A SecurityException might bubble up.
      if (tryClasspath(name)) {
        return;
      }
    }
    catch (final SecurityException e) {
      exception = e; // Save for later.
    }
    try {
      // Search using the classloader getResource(  ). If found as a file,
      // "file" is set; if found as a URL, "url" is set.
      if (tryLoader(name)) {
        return;
      }
    }
    catch (final SecurityException e) {
      exception = e; // Save for later.
    }
    // If you get here, something went wrong. Report the exception.
    String msg = "";
    if (exception != null) {
      msg = ": " + exception;
    }
    throw new IOException("Resource '" + name + "' could not be found in the CLASSPATH (" + System.getProperty("java.class.path") +
                          "), nor could it be located by the classloader responsible for the web application (WEB-INF/classes)" + msg);
  }

  /**
   * Method findResource.
   * @param fileName
   * @return InputStream
   */
  public InputStream findResource(final String fileName) {
    return getClass().getClassLoader().getResourceAsStream(fileName);
  }

  /**
   * Returns the resource name, as passed to the constructor
   */
  public String getName() {
    return name;
  }

  /**
   * Returns an input stream to read the resource contents
   */
  public InputStream getInputStream() throws IOException {
    if (file != null) {
      return new BufferedInputStream(new FileInputStream(file));
    }
    else if (url != null) {
      return new BufferedInputStream(url.openStream());
    }
    return null;
  }

  /**
   * Returns when the resource was last modified. If the resource
   * was found using a URL, this method will work only if the URL
   * connection supports last modified information. If there's no
   * support, Long.MAX_VALUE is returned. Perhaps this should return
   * -1, but you should return MAX_VALUE on the assumption that if
   * you can't determine the time, it's maximally new.
   */
  public long lastModified() {
    if (file != null) {
      return file.lastModified();
    }
    else if (url != null) {
      try {
        return url.openConnection().getLastModified(); // Hail Mary
      }
      catch (final IOException e) {
        return Long.MAX_VALUE;
      }
    }
    return 0; // can't happen
  }

  /**
   * Returns the directory containing the resource, or null if the
   * resource isn't directly available on the filesystem.
   * This value can be used to locate the configuration file on disk,
   * or to write files in the same directory.
   */
  public String getDirectory() {
    if (file != null) {
      return file.getParent();
    }
    else if (url != null) {
      return null;
    }
    return null;
  }

  // Returns true if found
  private boolean tryClasspath(final String filename) {
    final String classpath = System.getProperty("java.class.path");
    final String[] paths = ResourceLocator.split(classpath, File.pathSeparator);
    file = ResourceLocator.searchDirectories(paths, filename);
    return (file != null);
  }

  private static File searchDirectories(final String[] paths, final String filename) {
    SecurityException exception = null;
    for (final String path : paths) {
      try {
        final File file = new File(path, filename);
        if (file.exists() && !file.isDirectory()) {
          return file;
        }
      }
      catch (final SecurityException e) {
        // Security exceptions can usually be ignored, but if all attempts
        // to find the file fail, report the (last) security exception.
        exception = e;
      }
    }
    // Couldn't find any match
    if (exception != null) {
      throw exception;
    }
    else {
      return null;
    }
  }

  // Splits a String into pieces according to a delimiter.
  // Uses JDK 1.1 classes for backward compatibility.
  // JDK 1.4 actually has a split(  ) method now.
  private static String[] split(final String str, final String delim) {
    // Use a Vector to hold the split strings.
    final Vector v = new Vector();
    // Use a StringTokenizer to do the splitting.
    final StringTokenizer tokenizer = new StringTokenizer(str, delim);
    while (tokenizer.hasMoreTokens()) {
      v.addElement(tokenizer.nextToken());
    }
    final String[] ret = new String[v.size()];
    v.copyInto(ret);
    return ret;
  }

  // Returns true if found
  private boolean tryLoader(String name) {
    name = "/" + name;
    final URL res = ResourceLocator.class.getResource(name);
    if (res == null) {
      return false;
    }
    // Try converting from a URL to a File.
    final File resFile = ResourceLocator.urlToFile(res);
    if (resFile != null) {
      file = resFile;
    }
    else {
      url = res;
    }
    return true;
  }

  private static File urlToFile(final URL res) {
    final String externalForm = res.toExternalForm();
    if (externalForm.startsWith("file:")) {
      return new File(externalForm.substring(5));
    }
    return null;
  }

  @Override
  public String toString() {
    return "[Resource: File: " + file + " URL: " + url + "]";
  }

  /**
   * Returns the file.
   * @return File
   */
  public File getFile() {
    return file;
  }

}
