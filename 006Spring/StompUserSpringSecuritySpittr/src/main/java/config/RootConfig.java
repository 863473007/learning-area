package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Date 2019-05-03
 * @Author lifei
 */
@Configuration
@ComponentScan(basePackages = {"com.hef.spittr", "config"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
        classes = {EnableWebMvc.class})})
public class RootConfig {
}
