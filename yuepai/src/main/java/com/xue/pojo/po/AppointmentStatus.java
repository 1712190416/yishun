package com.xue.pojo.po;

import java.io.Serializable;

public class AppointmentStatus implements Serializable {
    private Integer id;

    private String inviteAccount;

    private String invitedAccount;

    private Integer appointmentId;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInviteAccount() {
        return inviteAccount;
    }

    public void setInviteAccount(String inviteAccount) {
        this.inviteAccount = inviteAccount == null ? null : inviteAccount.trim();
    }

    public String getInvitedAccount() {
        return invitedAccount;
    }

    public void setInvitedAccount(String invitedAccount) {
        this.invitedAccount = invitedAccount == null ? null : invitedAccount.trim();
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", inviteAccount=").append(inviteAccount);
        sb.append(", invitedAccount=").append(invitedAccount);
        sb.append(", appointmentId=").append(appointmentId);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}