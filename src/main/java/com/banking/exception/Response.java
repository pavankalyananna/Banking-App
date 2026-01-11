package com.banking.exception;

public class Response {

	private String message;
	private String statusCode;
	private String path;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Response(String message, String statusCode, String path) {
		this.message = message;
		this.statusCode = statusCode;
		this.path = path;
	}
	
	
	
}
