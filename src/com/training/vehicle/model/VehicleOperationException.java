package com.training.vehicle.model;

public class VehicleOperationException extends RuntimeException {

	private static final long serialVersionUID = -326954625234797487L;

	public VehicleOperationException() {
		super();
	}

	public VehicleOperationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public VehicleOperationException(String message, Throwable cause) {
		super(message, cause);
	}

	public VehicleOperationException(String message) {
		super(message);
	}

	public VehicleOperationException(Throwable cause) {
		super(cause);
	}

}
