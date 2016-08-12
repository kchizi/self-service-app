package org.mifos.selfserviceapp.data.accounts;

import java.util.ArrayList;
import java.util.List;

public class AccountListResponse {
    private List<Account> loanAccounts = new ArrayList<>();

    public List<Account> getAccounts() {
        return loanAccounts;
    }

    public void setAccounts(List<Account> loanAccounts) {
        this.loanAccounts = loanAccounts;
    }
}
