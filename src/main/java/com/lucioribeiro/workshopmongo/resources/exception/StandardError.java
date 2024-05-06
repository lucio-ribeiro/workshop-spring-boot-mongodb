package com.lucioribeiro.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;
	
	public StandardError() {
		
	}

	public StandardError(Long timestamp, Integer status, String error, String message, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
	}

	public final Long getTimestamp() {
		return timestamp;
	}

	public final void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public final Integer getStatus() {
		return status;
	}

	public final void setStatus(Integer status) {
		this.status = status;
	}

	public final String getError() {
		return error;
	}

	public final void setError(String error) {
		this.error = error;
	}

	public final String getMessage() {
		return message;
	}

	public final void setMessage(String message) {
		this.message = message;
	}

	public final String getPath() {
		return path;
	}

	public final void setPath(String path) {
		this.path = path;
	}
	
	

}
