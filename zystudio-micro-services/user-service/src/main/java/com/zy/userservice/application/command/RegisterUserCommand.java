package com.zy.userservice.application.command;

import com.zy.userservice.domain.cmdmodel.identity.*;

import java.util.Date;

/**
 * @author by zy.
 */
public class RegisterUserCommand {
    private String tenantId;
    private String invitationIdentifier;
    private String username;
    private String password;
    private String headface;
    private String firstName;
    private String lastName;
    private boolean enabled;
    private Date startDate;
    private Date endDate;
    private String emailAddress;
    private String primaryTelephone;
    private String secondaryTelephone;
    private String addressStreetAddress;
    private String addressCity;
    private String addressStateProvince;
    private String addressPostalCode;
    private String addressCountryCode;

    public RegisterUserCommand(String tenantId, String invitationIdentifier, String username, String password, String firstName,
                               String lastName, boolean enabled, Date startDate, Date endDate, String emailAddress, String primaryTelephone,
                               String secondaryTelephone, String addressStreetAddress, String addressCity, String addressStateProvince,
                               String addressPostalCode, String addressCountryCode) {

        super();

        this.tenantId = tenantId;
        this.invitationIdentifier = invitationIdentifier;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enabled = enabled;
        this.startDate = startDate;
        this.endDate = endDate;
        this.emailAddress = emailAddress;
        this.primaryTelephone = primaryTelephone;
        this.secondaryTelephone = secondaryTelephone;
        this.addressStreetAddress = addressStreetAddress;
        this.addressCity = addressCity;
        this.addressStateProvince = addressStateProvince;
        this.addressPostalCode = addressPostalCode;
        this.addressCountryCode = addressCountryCode;
    }

    public User toUser(){
        UserDetail userDetail = new UserDetail();
        userDetail.setTelephone(new Telephone(primaryTelephone));
        userDetail.setEmailAddress(new EmailAddress(emailAddress));
        userDetail.setAge(11);
        userDetail.setFullName(new FullName(firstName,lastName));
        User user = new User(username,password,headface, userDetail);
        return user;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getInvitationIdentifier() {
        return this.invitationIdentifier;
    }

    public void setInvitationIdentifier(String invitationIdentifier) {
        this.invitationIdentifier = invitationIdentifier;
    }

    public String getHeadface() {
        return headface;
    }

    public void setHeadface(String headface) {
        this.headface = headface;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPrimaryTelephone() {
        return this.primaryTelephone;
    }

    public void setPrimaryTelephone(String primaryTelephone) {
        this.primaryTelephone = primaryTelephone;
    }

    public String getSecondaryTelephone() {
        return this.secondaryTelephone;
    }

    public void setSecondaryTelephone(String secondaryTelephone) {
        this.secondaryTelephone = secondaryTelephone;
    }

    public String getAddressStreetAddress() {
        return this.addressStreetAddress;
    }

    public void setAddressStreetAddress(String addressStreetAddress) {
        this.addressStreetAddress = addressStreetAddress;
    }

    public String getAddressCity() {
        return this.addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressStateProvince() {
        return this.addressStateProvince;
    }

    public void setAddressStateProvince(String addressStateProvince) {
        this.addressStateProvince = addressStateProvince;
    }

    public String getAddressPostalCode() {
        return this.addressPostalCode;
    }

    public void setAddressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode;
    }

    public String getAddressCountryCode() {
        return this.addressCountryCode;
    }

    public void setAddressCountryCode(String addressCountryCode) {
        this.addressCountryCode = addressCountryCode;
    }
}
