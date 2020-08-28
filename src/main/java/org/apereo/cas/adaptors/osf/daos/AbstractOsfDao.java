package org.apereo.cas.adaptors.osf.daos;

import lombok.NoArgsConstructor;
import org.apereo.cas.adaptors.osf.models.OsfEmail;
import org.apereo.cas.adaptors.osf.models.OsfGuid;
import org.apereo.cas.adaptors.osf.models.OsfUser;

import lombok.extern.slf4j.Slf4j;
/**
 * This is {@link AbstractOsfDao}.
 *
 * @author Longze Chen
 * @since 6.2.1
 */
@NoArgsConstructor
@Slf4j
public abstract class AbstractOsfDao {

    public OsfUser findOneUserByEmail(final String address) {

        final OsfUser osfUser = findOneUserByUsername(address);
        if (osfUser != null) {
            return osfUser;
        }

        final OsfEmail osfEmail = findOneEmailByAddress(address);
        return osfEmail != null ? osfEmail.getUser() : null;
    }

    public abstract OsfGuid findGuidByUser(OsfUser user);

    protected abstract OsfUser findOneUserByUsername(String username);

    protected abstract OsfEmail findOneEmailByAddress(String emailAddress);
}
