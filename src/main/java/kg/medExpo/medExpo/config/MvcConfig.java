package kg.medExpo.medExpo.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("img/**")
                .addResourceLocations("file:\\C:\\Users\\Dei\\Desktop\\medExpo\\src\\main\\images\\");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
