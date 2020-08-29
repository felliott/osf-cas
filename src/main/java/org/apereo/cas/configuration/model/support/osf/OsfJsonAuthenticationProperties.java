package org.apereo.cas.configuration.model.support.osf;

import org.apereo.cas.adaptors.osf.authentication.handler.support.OsfJsonAuthenticationHandler;
import org.apereo.cas.configuration.model.core.authentication.PasswordEncoderProperties;
import org.apereo.cas.configuration.model.core.authentication.PasswordPolicyProperties;
import org.apereo.cas.configuration.model.core.authentication.PrincipalTransformationProperties;
import org.apereo.cas.configuration.support.SpringResourceProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * This is {@link OsfJsonAuthenticationProperties}.
 *
 * @author Longze Chen
 * @since 6.2.1
 */
@Getter
@Setter
@Accessors(chain = true)
public class OsfJsonAuthenticationProperties extends SpringResourceProperties {

    private static final long serialVersionUID = -5224122351618085790L;

    /**
     * Password policy settings.
     */
    @NestedConfigurationProperty
    private PasswordPolicyProperties passwordPolicy = new PasswordPolicyProperties();

    /**
     * Password encoder properties.
     */
    @NestedConfigurationProperty
    private PasswordEncoderProperties passwordEncoder = new PasswordEncoderProperties();

    /**
     * Principal transformation settings for this authentication.
     */
    @NestedConfigurationProperty
    private PrincipalTransformationProperties principalTransformation = new PrincipalTransformationProperties();

    /**
     * The name of the authentication handler.
     */
    private String name = OsfJsonAuthenticationHandler.class.getSimpleName();

    /**
     * The flag to enable / disable the authentication handler.
     */
    private boolean enabled = Boolean.TRUE;

    /**
     * Nested JPA properties for OSF PostgreSQL database.
     */
    private int order;
}
