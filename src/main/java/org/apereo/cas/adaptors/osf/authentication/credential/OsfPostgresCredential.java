package org.apereo.cas.adaptors.osf.authentication.credential;

import org.apereo.cas.authentication.credential.RememberMeUsernamePasswordCredential;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * This is {@link OsfPostgresCredential}.
 *
 * @author Longze Chen
 * @since 6.2.1
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Slf4j
public class OsfPostgresCredential extends RememberMeUsernamePasswordCredential {

    private static final long serialVersionUID = 4705325561237083442L;

    /**
     * The one-time and ephemeral OSF verification key.
     */
    private String verificationKey;

    @Override
    public String getId() {
        return this.getUsername();
    }
}
