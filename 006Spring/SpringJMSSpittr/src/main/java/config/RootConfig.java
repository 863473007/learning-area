package config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Date 2019-04-24
 * @Author lifei
 */
@Configuration
@ComponentScan(basePackages = {"com.hef.spittr"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
        classes = {EnableWebMvc.class})})
@Import(value = {SpringDataJpaConfig.class})
@ImportResource(locations = {"classpath:/spring/activemq-config.xml"})
public class RootConfig {
}
