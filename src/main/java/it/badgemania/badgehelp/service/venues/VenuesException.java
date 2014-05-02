package it.badgemania.badgehelp.service.venues;

public class VenuesException extends Exception {

	private static final long serialVersionUID = -5168974543706875282L;

	public VenuesException() {
	}

	public VenuesException(String message) {
		super(message);
	}

	public VenuesException(Throwable cause) {
		super(cause);
	}

	public VenuesException(String message, Throwable cause) {
		super(message, cause);
	}

	public VenuesException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
