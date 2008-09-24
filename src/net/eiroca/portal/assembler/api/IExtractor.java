package net.eiroca.portal.assembler.api;

import java.util.*;

import org.apache.commons.httpclient.*;
import net.eiroca.portal.assembler.gen.*;

public interface IExtractor {

  public Map decodeSections(Resource res, HttpMethod method);

}
