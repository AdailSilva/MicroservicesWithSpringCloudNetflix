package com.adailsilva.mspayroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class MsPayhollApplication implements CommandLineRunner {

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private Environment environment;

	@Value("${spring.application.name}")
	private String springApplicationName;

//	@Value("${server.port}")
//	private String serverPort;
	
//	@Value("${eureka.instance.instance-id}")
//	private String eurekaInstanceInstanceId;

//	@Value("${eureka.client.service-url.defaultZone}")
//	private String eurekaClientServiceUrlDefaultZone;

//	@Value("${hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds}")
//	private String hystrixCommandDefaultExecutionIsolationThreadTimeoutInMilliseconds;

//	@Value("${ribbon.ConnectTimeout}")
//	private String ribbonConnectTimeout;

//	@Value("${ribbon.ReadTimeout}")
//	private String ribbonReadTimeout;

//	@Value("${adailsilva.config}")
//	private String remoteConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(MsPayhollApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		System.out.println("Spring Application Name: " + springApplicationName);
		System.out.println("Server Port: " + environment.getProperty("local.server.port"));
//		System.out.println("Eureka Instance Instance Id" + eurekaInstanceInstanceId);
//		System.out.println("Eureka Client Service URL Default Zone: " + eurekaClientServiceUrlDefaultZone);
//		System.out.println("Hystrix Command Default Execution Isolation Thread Timeout In Milliseconds: "
//				+ hystrixCommandDefaultExecutionIsolationThreadTimeoutInMilliseconds);
//		System.out.println("Ribbon Connect Timeout: " + ribbonConnectTimeout);
//		System.out.println("Ribbon Read Timeout: " + ribbonReadTimeout);
//		System.out.println("[ Remote Configuration ] --> " + remoteConfiguration);
//		System.out.println("BCrypt: " + bCryptPasswordEncoder.encode("@Hacker101"));
	}

}
