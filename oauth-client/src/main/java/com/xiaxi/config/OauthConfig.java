package com.xiaxi.config;

import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.OAuth2ClientConfiguration;
import org.springframework.web.client.ResponseErrorHandler;

/**
 * Created by BaoCai on 18/2/5.
 * Description:
 */
@Configuration
@Import({OAuth2ClientConfiguration.class})
public class OauthConfig {

    @Bean
    public OAuth2RestTemplate oauthRestTemplate(OAuth2ClientContext oauth2ClientContext) {
        return new OAuth2RestTemplate(oauthResource(), oauth2ClientContext){
            @Override
            public void setErrorHandler(ResponseErrorHandler errorHandler) {
                super.setErrorHandler(errorHandler);
            }
        };
    }

    @ConfigurationProperties(prefix = "security.oauth2.client")
    @Bean
    public OAuth2ProtectedResourceDetails oauthResource() {
        ResourceOwnerPasswordResourceDetails details = new
                ResourceOwnerPasswordResourceDetails(){
                    @Override
                    public boolean isClientOnly() {
                        //FIXED: 仅仅借用Oauth2ClientConf
                        return true;
                    }
                };
        return details;
    }

    @Bean
    public UserInfoRestTemplateCustomizer userInfoRestTemplateCustomizer(){
        return (oAuth2RestTemplate) -> {};
    }

}
