package com.sensoric.enose.service.impl

import org.springframework.data.domain.AuditorAware
import org.springframework.security.core.context.SecurityContextHolder
import java.util.*

class CustomAuditorAware : AuditorAware<String> {
    override fun getCurrentAuditor(): Optional<String> {
        val username = SecurityContextHolder.getContext()?.authentication?.name

        return if(username != null) Optional.of(username) else Optional.empty()
    }

}