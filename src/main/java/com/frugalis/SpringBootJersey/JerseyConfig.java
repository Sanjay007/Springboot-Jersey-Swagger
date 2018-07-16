package com.frugalis.SpringBootJersey;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;


@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

	@Autowired
	public JerseyConfig(ObjectMapper objectMapper) {
	
		packages("com.frugalis.resourcesImpl");		
		register(new ObjectMapperContextResolver(objectMapper));
	}

	@Provider
	public static class ObjectMapperContextResolver implements ContextResolver<ObjectMapper> {
		private final ObjectMapper mapper;
		public ObjectMapperContextResolver(ObjectMapper mapper) {
			this.mapper = mapper;
		}

		@Override
		public ObjectMapper getContext(Class<?> type) {
			return mapper;
		}
	
	}
	
	 @PostConstruct
	  public void init() {
	    // Register components where DI is needed
	    this.SwaggerConfig();
	  }
	private void SwaggerConfig() {
		this.register(ApiListingResource.class);
		this.register(SwaggerSerializers.class);
		
	    BeanConfig swaggerConfigBean = new BeanConfig();
	    swaggerConfigBean.setConfigId("Frugalis Swagger Jersey Example");
	    swaggerConfigBean.setTitle("Using Swagger,Jersey And Spring Boot ");
	    swaggerConfigBean.setVersion("v1");
	    swaggerConfigBean.setContact("frugalisAdmin");
	    swaggerConfigBean.setSchemes(new String[] { "http", "https" });
	    swaggerConfigBean.setBasePath("/api");
	    swaggerConfigBean.setResourcePackage("com.frugalis.resources");
	    swaggerConfigBean.setPrettyPrint(true);
	    swaggerConfigBean.setScan(true);
	  }
}
