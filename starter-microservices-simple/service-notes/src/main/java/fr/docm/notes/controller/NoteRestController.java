package fr.docm.notes.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RefreshScope: If config values changes, associated parameters are refreshing 
 * 
 * @author Romain Mathieu
 *
 */
@RefreshScope
@RestController
public class NoteRestController
{
	@Value("${server.port}")
	private int serverPort;

	@Value("${spring.data.mongodb.host}")
	private String mongoHost;
	
	@RequestMapping("/config")
	public Map<String, Object> config(){
		Map<String, Object> params = new HashMap<>();
		params.put("serverPort", serverPort);
		params.put("mongoHost", mongoHost);
		params.put("threadName", Thread.currentThread().getName());
		return params;
	}
}
