package com.fd.sb.configuration;

import jdk.jfr.Enabled;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@Enabled
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    // intellij Alt  + insert
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        http.formLogin();
        http.authorizeRequests().antMatchers("/dashboard").hasAnyRole("admin","user")
                .antMatchers("/admin").hasRole("admin")
                .and()
                .authorizeRequests()
                .antMatchers("/index")
                .permitAll();

    }

    /** Override ettiğim AuthenticationManagerBuilder ile application.properties teki kullanıcı parolayı ezmiş oldum
     * bu işleme inmemory Autentication diyoruz
     * Burada
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //super.configure(auth);
        auth.inMemoryAuthentication()
                .withUser("admin").password("{noop}1234").roles("admin")
                .and()
                .withUser("akd").password("{noop}1234").roles("user");
    }
}

