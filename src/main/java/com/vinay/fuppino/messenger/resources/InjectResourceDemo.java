package com.vinay.fuppino.messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectResourceDemo {
	/*
	 * This is a demo class for the learning extra parameters passing throug rest calls 
	 * Matrix param: 
	 *  ";" as spearator
	 * 	matrix param example : protocol :// uri ; matrixparam : value
	 *  e.g: http://localhost:8080/messenger/webapi/injectdemo/annotations;matrixparam:value
	 * 
	 * HeaderParam:
	 *  pass as custom header value, usually API key will pass as custom header value
	 *  
	 * cookie param:
	 *  http cookie param we pass to rest.
	 * 
	 * form param:
	 *  used to submit a form 
	 */
	@GET
	@Path("annotations")
	public String getAnnotation(@MatrixParam("matrixparam") String matrixparam,
							  	@HeaderParam("customheaderparam") String customHeaderparam,
							  	@CookieParam("cookieparam") String cookieparam,
							  	@QueryParam("queryparam") String data) {
		return "Matrix param passed " + matrixparam + " separated with ; \n" +
				"customer header param " + customHeaderparam + "\n" +
				"cookie params "+ cookieparam + "\n";
				
	}

	/*
	 * Another way to get the params and uri and httpheader value by using @context  
	 */
	@GET
	@Path("context")
	public String getContext(@Context UriInfo uriInfo,
							 @Context HttpHeaders headers) {
		String path = uriInfo.getAbsolutePath().toString();
		String cookies = headers.getCookies().toString();
		
		return "Path :" + path + "\n" +
				"Cookies :" + cookies;
				
	}
}
