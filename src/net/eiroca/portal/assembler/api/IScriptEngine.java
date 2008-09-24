package net.eiroca.portal.assembler.api;

import java.util.*;
import javax.servlet.*;

import net.eiroca.portal.assembler.util.*;

public interface IScriptEngine {

  public void execute(String who, RequestData data, Map secs) throws ServletException;

}
