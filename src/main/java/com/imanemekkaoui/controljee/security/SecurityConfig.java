package com.imanemekkaoui.controljee.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        return http
                .cors(Customizer.withDefaults())
                .csrf(csrf -> csrf.disable())

                .sessionManagement(session ->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )

                .authorizeHttpRequests(auth -> auth


                        .requestMatchers(
                                "/auth/**",
                                "/swagger-ui/**",
                                "/v3/api-docs/**",
                                "/h2-console/**"
                        ).permitAll()


                        .requestMatchers(HttpMethod.GET, "/api/vehicules/**")
                        .hasAnyRole("CLIENT", "EMPLOYE", "ADMIN")


                        .requestMatchers(HttpMethod.POST, "/api/vehicules/**")
                        .hasRole("ADMIN")

                        .requestMatchers(HttpMethod.PUT, "/api/vehicules/**")
                        .hasRole("ADMIN")

                        .requestMatchers(HttpMethod.DELETE, "/api/vehicules/**")
                        .hasRole("ADMIN")

                        // locations : employé + admin
                        .requestMatchers("/api/locations/**")
                        .hasAnyRole("EMPLOYE", "ADMIN")

                        // agences : admin
                        .requestMatchers("/api/agences/**")
                        .hasRole("ADMIN")

                        .anyRequest().authenticated()
                )

                
                .headers(headers -> headers.frameOptions(frame -> frame.disable()))

                .build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {

        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(List.of("http://localhost:4200"));
        configuration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        configuration.setAllowedHeaders(List.of("*"));
        configuration.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source =
                new UrlBasedCorsConfigurationSource();

        source.registerCorsConfiguration("/**", configuration);

        return source;
    }
}