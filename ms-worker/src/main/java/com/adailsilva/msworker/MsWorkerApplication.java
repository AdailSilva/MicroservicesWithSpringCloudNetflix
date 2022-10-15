package com.adailsilva.msworker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

//@RefreshScope // For all classes that have access to some custom configuration
//@EnableEurekaClient
@SpringBootApplication
public class MsWorkerApplication implements CommandLineRunner {

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private Environment environment;

	@Value("${spring.application.name}")
	private String springApplicationName;
	
//	@Value("${server.port}")
//	private String serverPort;

//	@Value("${eureka.instance.instance-id}")
	private String eurekaInstanceInstanceId;

//	@Value("${eureka.client.service-url.defaultZone}")
	private String eurekaClientServiceUrlDefaultZone;

	@Value("${spring.datasource.url}")
	private String springDatasourceUrl;

	@Value("${spring.datasource.username}")
	private String springDatasourceUsername;

	@Value("${spring.datasource.password}")
	private String springDatasourcePassword;

	@Value("${spring.h2.console.enabled}")
	private String springH2ConsoleEnable;

	@Value("${spring.h2.console.path}")
	private String springH2ConsolePath;
	
//	@Value("${adailsilva.config}")
	private String remoteConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(MsWorkerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Spring Application Name: " + springApplicationName);
		System.out.println("Server Port: " + environment.getProperty("local.server.port"));
		System.out.println("Eureka Instance Instance ID: " + eurekaInstanceInstanceId);
		System.out.println("Eureka Client Service URL Default Zone: " + eurekaClientServiceUrlDefaultZone);
		System.out.println("Spring Datasource URL: " + springDatasourceUrl);
		System.out.println("Spring Datasource Username: " + springDatasourceUsername);
		System.out.println("Spring Datasource Password: " + springDatasourcePassword);
		System.out.println("Spring H2 Console Enable: " + springH2ConsoleEnable);
		System.out.println("Spring H2 Console Path: " + springH2ConsolePath);
		System.out.println("[ Remote Configuration ] --> " + remoteConfiguration);
//		System.out.println("BCrypt: " + bCryptPasswordEncoder.encode("@Hacker101"));
		
	}

}
