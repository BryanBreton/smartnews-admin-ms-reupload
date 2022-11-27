package fr.su.smartnewsadmin;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;

@Configuration
public class SmartnewsAdminConfigurationTest {
    @Configuration
    @ActiveProfiles("test")
    @PropertySource("classpath:env-test.properties")
    static class TestProperty {
    }

    @Configuration
    @ActiveProfiles("ti-local")
    @PropertySource("classpath:env-ti-local.properties")
    static class TILocalProperty {
    }
}
