package com.sensoric.enose.configuration

import com.sensoric.enose.service.impl.CustomAuditorAware
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.domain.AuditorAware
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
 class AuditingConfiguration {
    @Bean
    fun auditorProvider(): AuditorAware<String> {
        return CustomAuditorAware()
    }
}