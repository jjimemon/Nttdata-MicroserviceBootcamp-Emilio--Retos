package com.nttdata.bootcamp.gateway.gatewaymicroservice.filter;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Mono;

@Configuration
@Log4j2
public class FilterGateway {

	@Bean
	@Order(-1)
	public GlobalFilter globalFilter1() {
		return (exchange, chain) ->{
			log.info("Primer filtro");
			return chain.filter(exchange).then(Mono.fromRunnable(() ->{
				log.info("tercer filtro");
			}));
		};
	}

	@Bean
	@Order(-2)
	public GlobalFilter globalFilter2() {
		return (exchange, chain) ->{
			log.info("Segundo filtro");
			return chain.filter(exchange).then(Mono.fromRunnable(() ->{
				log.info("Segundo filtro");
			}));
		};
	}
	
	@Bean
	@Order(-3)
	public GlobalFilter globalFilter3() {
		return (exchange, chain) ->{
			log.info("Tercer filtro");
			return chain.filter(exchange).then(Mono.fromRunnable(() ->{
				log.info("Primero filtro");
			}));
		};
	}
}
