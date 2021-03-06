package com.arfan.adhib.ecommerce.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;

/**
 *
 * @Author AdhibArfan <adhib.arfan@gmail.com>
 * @Web <https://adhibarfan.github.io>
 * @Since Feb 16, 2017
 * @Time 11:02:29 PM
 * @Encoding UTF-8
 * @Project Spring-Ecommerce
 * @Package com.arfan.adhib.ecommerce.configuration
 *
 */
@Configuration
public class OAuth2Configuration {

    private static final String RESOURCE_ID = "belajar";

    @Configuration
    @EnableResourceServer
    protected static class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

        @Override
        public void configure(ResourceServerSecurityConfigurer resourceServerSecurityConfigurer) {
            resourceServerSecurityConfigurer
                    .resourceId(RESOURCE_ID);
        }

        @Override
        public void configure(HttpSecurity httpSecurity) throws Exception {
            httpSecurity
                    .authorizeRequests()
                    .antMatchers("/api").fullyAuthenticated()
                    .and()
                    .addFilterBefore(new CorsConfiguration(), ChannelProcessingFilter.class);
        }

    }

    @Configuration
    @EnableAuthorizationServer
    protected static class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

        @Autowired
        @Qualifier("authenticationManagerBean")
        private AuthenticationManager authenticationManager;

        @Bean
        public JwtAccessTokenConverter jwtAccessTokenConverter() {
            return new JwtAccessTokenConverter();
        }

        @Override
        public void configure(AuthorizationServerEndpointsConfigurer authorizationServerEndpointsConfigurer) throws Exception {
            authorizationServerEndpointsConfigurer.accessTokenConverter(jwtAccessTokenConverter()).authenticationManager(authenticationManager);
        }

        @Override
        public void configure(ClientDetailsServiceConfigurer clientDetailsServiceConfigurer) throws Exception {
            clientDetailsServiceConfigurer
                    .inMemory()
                    .withClient("clientapp")
                    .authorizedGrantTypes("password", "refresh_token")
                    .authorities("USER")
                    .scopes("read", "write")
                    .resourceIds(RESOURCE_ID)
                    .secret("123456");
        }

    }

}
