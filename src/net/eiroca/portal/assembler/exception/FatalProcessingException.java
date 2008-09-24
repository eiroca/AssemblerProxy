package net.eiroca.portal.assembler.exception;

/**
 * Exception generata in caso di un errore "fatale" che avviene all'interno
 * del assembler
 */
public final class FatalProcessingException extends AssemblerException {

  public FatalProcessingException(String msg) {
    super(msg);
  }

}