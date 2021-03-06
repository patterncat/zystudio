package com.zy.userservice.domain.cmdmodel.identity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * @author by zy.
 */
@Embeddable
public class EmailAddress implements Serializable {
    private static final long serialVersionUID = 1L;

    private String address;

    protected EmailAddress() {
        super();
    }

    public EmailAddress(String anAddress) {
        super();

        this.setAddress(anAddress);
    }

    public EmailAddress(EmailAddress anEmailAddress) {
        this(anEmailAddress.address());
    }

    public String address() {
        return this.address;
    }

    @Override
    public boolean equals(Object anObject) {
        boolean equalObjects = false;

        if (anObject != null && this.getClass() == anObject.getClass()) {
            EmailAddress typedObject = (EmailAddress) anObject;
            equalObjects = this.address().equals(typedObject.address());
        }

        return equalObjects;
    }

    @Override
    public int hashCode() {
        int hashCodeValue =
            + (17861 * 179)
            + this.address().hashCode();

        return hashCodeValue;
    }

    @Override
    public String toString() {
        return "EmailAddress [address=" + address + "]";
    }



    private void setAddress(String anAddress) {
        Objects.requireNonNull(anAddress, "The email address is required.");
        //Objects.requireNonNull(anAddress, 1, 100, "Email address must be 100 characters or less.");
        Objects.requireNonNull(
                Pattern.matches("\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*", anAddress),
                "Email address format is invalid.");

        this.address = anAddress;
    }
}
