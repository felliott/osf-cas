package org.apereo.cas.configuration.model.support.osf;

import org.apereo.cas.adaptors.osf.authentication.handler.support.OsfPostgresAuthenticationHandler;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.io.Serializable;

/**
 * This is {@link OsfPostgresAuthenticationProperties}.
 *
 * @author Longze Chen
 * @since 6.2.1
 */
@Getter
@Setter
@Accessors(chain = true)
public class OsfPostgresAuthenticationProperties implements Serializable {

    private static final long serialVersionUID = -6126944686676618138L;

    /**
     * The name of the authentication handler.
     */
    private String name = OsfPostgresAuthenticationHandler.class.getSimpleName();

    /**
     * The flag to enable / disable the authentication handler.
     */
    private boolean enabled = Boolean.TRUE;

    /**
     * The order of the authentication handler.
     */
    private int order;

    /**
     * Nested JPA properties for OSF PostgreSQL database.
     */
    @NestedConfigurationProperty
    private OsfPostgresJpaProperties jpa = new OsfPostgresJpaProperties();
}
