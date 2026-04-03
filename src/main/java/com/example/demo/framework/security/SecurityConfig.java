package com.example.demo.framework.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

	private final CorsConfigurationSource corsConfigurationSource;

	private final JwtFilter jwtFilter;
	
	public SecurityConfig(JwtFilter jwtFilter, CorsConfigurationSource corsConfigurationSource) {
		this.jwtFilter = jwtFilter;
		this.corsConfigurationSource = corsConfigurationSource;
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
			.csrf(csrf -> csrf.disable())
			// .cors(cors -> CorsConfig.corsConfigurationSource())
			.cors(cors -> cors.configurationSource(corsConfigurationSource))
			.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.STATELESS) // JWT(STATELESS : 세션 사용 안함 (JWT 필수) / ALWAYS : 항상 세션 생성 / IF_REQUIRED : 필요할 때만 생성 (기본값) / NEVER : 만들진 않지만 있으면 사용)
			.and()
			.authorizeHttpRequests(auth -> auth
					.requestMatchers("/login", "/loginProc").permitAll().anyRequest().authenticated()
			) // 부분 허용
			.formLogin(form -> form.disable())
			.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

		return http.build();
	}
}	