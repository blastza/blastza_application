package com.platform.security.model;

import lombok.Getter;

@Getter
public enum Role {
    STUDENT_ROLE,
    ADMIN_ROLE,
    CUSTOMER_ROLE,
    STAFF_ROLE;

    @Override
    public String toString() {
        return super.toString();
    }
}
