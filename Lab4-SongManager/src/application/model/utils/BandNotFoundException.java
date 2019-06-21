package application.model.utils;

public class BandNotFoundException extends Exception {
	public BandNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}
