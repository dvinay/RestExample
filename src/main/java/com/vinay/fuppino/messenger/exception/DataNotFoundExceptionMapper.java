package com.vinay.fuppino.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.vinay.fuppino.messenger.model.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException exp) {
		ErrorMessage errorMessage = new ErrorMessage(exp.getMessage(), 404, "https://google.com"); 
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}
	
}
