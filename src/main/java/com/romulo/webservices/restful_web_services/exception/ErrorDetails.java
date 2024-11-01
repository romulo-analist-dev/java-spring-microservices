package com.romulo.webservices.restful_web_services.exception;

import java.time.LocalDateTime;

public class ErrorDetails {

	private LocalDateTime timestamp;
	private String message;
	private String datails;

	public ErrorDetails(LocalDateTime timestamp, String message, String datails) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.datails = datails;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDatails() {
		return datails;
	}

	public void setDatails(String datails) {
		this.datails = datails;
	}

}
