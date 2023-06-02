package site.shaerware.patientqueue.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class ResourcesConfig extends WebMvcConfigurationSupport{

	@Value("${spring.mvc.staticfolder}")
	private String staticFolder;
	
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		registry
			.addResourceHandler("/**")
			.addResourceLocations("file:" + staticFolder);
	}

	
}
