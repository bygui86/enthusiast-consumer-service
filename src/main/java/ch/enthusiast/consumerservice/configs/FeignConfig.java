package ch.enthusiast.consumerservice.configs;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;


@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter(value = AccessLevel.PROTECTED)
@Configuration("feignConfig")
@EnableFeignClients(basePackages = "ch.enthusiast.consumerservice.feign.clients")
public class FeignConfig {

	// no-op
}
