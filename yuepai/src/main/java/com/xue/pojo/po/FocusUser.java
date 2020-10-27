package com.xue.pojo.po;

import java.io.Serializable;

public class FocusUser implements Serializable {
    private String account;

    private String focusAccount;

    private static final long serialVersionUID = 1L;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getFocusAccount() {
        return focusAccount;
    }

    public void setFocusAccount(String focusAccount) {
        this.focusAccount = focusAccount == null ? null : focusAccount.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", account=").append(account);
        sb.append(", focusAccount=").append(focusAccount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}