package com.vinay.fuppino.messenger.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String errorMessage;
	private int errorCode;
	private String documentation;
	
	public ErrorMessage(String errorMessage, int errorCode, String documentation) {
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.documentation = documentation;
	}
	
	public ErrorMessage() {}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
	
}
