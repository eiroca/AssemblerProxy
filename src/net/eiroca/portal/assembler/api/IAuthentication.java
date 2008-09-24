package net.eiroca.portal.assembler.api;

import net.eiroca.portal.assembler.exception.*;
import net.eiroca.portal.assembler.util.*;

public interface IAuthentication {

  public void execute(RequestData data, String authID, String connID, boolean forceSSO, boolean decode, boolean forceValid) throws AssemblerException;

}
