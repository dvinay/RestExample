package com.vinay.fuppino.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.vinay.fuppino.messenger.model.ErrorMessage;
/*
 * This catches all the exceptions
 */
//@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable exp) {
		ErrorMessage errorMessage = new ErrorMessage(exp.getMessage(), 500, "https://google.com"); 
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(errorMessage)
				.build();
	}
	
}
