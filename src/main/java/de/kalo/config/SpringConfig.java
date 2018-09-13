package de.kalo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Value("${json.feldname.prio}")
	public static String jsonNamePrioProperty;
	
//	@Value("${json.feldname.prio}")
	public final static String JSON_NAME_PRIO = jsonNamePrioProperty ;
	
}
