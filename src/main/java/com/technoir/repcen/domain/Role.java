package com.technoir.repcen.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    ADMIN, MANAGER, ENGINEER;

    @Override
    public String getAuthority() {
        return name();
    }
}
