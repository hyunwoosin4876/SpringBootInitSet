package com.example.demo.framework.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .requestMatchers("/user/**").hasRole("USER")
                .requestMatchers("/login/**").permitAll()
                .requestMatchers("/swagger-ui/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
            		.loginPage("/login")
            		.loginProcessingUrl("/loginProc")
            		.usernameParameter("id")
            		.passwordParameter("password")
            		.defaultSuccessUrl("/")
            		.failureUrl("/login?error=true")
            ) // 기본 로그인 폼
            .logout(logout -> logout
            		.logoutUrl("/logoutProc")
            		.logoutSuccessUrl("/login?logout=true")
            ) // 로그아웃 설정
            .csrf().disable(); // 개발 중엔 비활성화 가능

        return http.build();
    }
}