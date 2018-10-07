package com.cloudbu.common.mq.support.zipkin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import zipkin2.codec.Encoding;
import zipkin2.reporter.Sender;
import zipkin2.reporter.kafka11.KafkaSender;

@Configuration
public class ZipkinKafkaConfig {
	
//	@Value("${spring.cloud.stream.kafka.binder.brokers}")
//	private String kafkaBorkers;
//	
//	@Value("${spring.zipkin.kafka.queue:zipkin}")
//    private String queue;
//	
//	@Bean
//	Sender sender() {
//		return KafkaSender.newBuilder().bootstrapServers(kafkaBorkers).topic(queue)
//				.encoding(Encoding.JSON).build();
//	}

}
