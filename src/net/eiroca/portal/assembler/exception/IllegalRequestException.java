package net.eiroca.portal.assembler.exception;

/**
 * Exception generata in caso di un errore legato ad un'errata invocazione
 * del assembler
 */
public final class IllegalRequestException extends AssemblerException {

  public IllegalRequestException(String msg) {
    super(msg);
  }

}