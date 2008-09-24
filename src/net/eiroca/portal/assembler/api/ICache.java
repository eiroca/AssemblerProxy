package net.eiroca.portal.assembler.api;

import net.eiroca.portal.assembler.exception.*;
import net.eiroca.portal.assembler.util.*;

public interface ICache {

  public String getCacheKey(RequestData data, String localKey) throws AssemblerException;

  public Object get(RequestData data, String key);

  public void put(RequestData data, String key, Object o);

}
