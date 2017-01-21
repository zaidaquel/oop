package com.training.assignment.controller;

public class ConstraintViolationException extends RuntimeException {

	private static final long serialVersionUID = -8574601526366777538L;

	public ConstraintViolationException() {
		super();
	}

	public ConstraintViolationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ConstraintViolationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConstraintViolationException(String message) {
		super(message);
	}

	public ConstraintViolationException(Throwable cause) {
		super(cause);

	}
}