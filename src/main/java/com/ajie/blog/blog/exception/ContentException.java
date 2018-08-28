package com.ajie.blog.blog.exception;

/**
 * @author niezhenjie
 */
public class ContentException extends Exception {

	private static final long serialVersionUID = 1L;

	public ContentException() {
		super();
	}

	public ContentException(String message) {
		super(message);
	}

	public ContentException(Throwable e) {
		super(e);
	}

	public ContentException(String message, Throwable e) {
		super(message, e);
	}
}
