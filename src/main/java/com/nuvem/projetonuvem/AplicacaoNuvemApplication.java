package com.nuvem.projetonuvem;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;


//@EnableFeignClients
//@Slf4j
//@EnableCaching
@SpringBootApplication
//@EnableSpringDataWebSupport
public class AplicacaoNuvemApplication extends SpringBootServletInitializer {

	/*@Autowired(required = false)
	private MyCustomBean myCustomBean;*/

	public static void main(String[] args) {

		final Logger LOGGER = LoggerFactory.getLogger(AplicacaoNuvemApplication.class);
		LOGGER.info("Iniciando a Aplicação!");
		SpringApplication.run(AplicacaoNuvemApplication.class, args);

	}

	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("Hello World");
			}
		};
	}
	@Component
	@ConditionalOnProperty("application.properties")
	public static class MyCustomBean {
		public MyCustomBean() {
		}
	}*/

	/*@Bean
	public ServerCodecConfigurer serverCodecConfigurer() {
		return ServerCodecConfigurer.create();
	}*/

	/*@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:3000");
			}
		};
	}*/
}

