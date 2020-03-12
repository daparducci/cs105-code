package edu.sbcc.cs105.Composition;

public class ApplicationDecision {

    private final ApplicationReviewDecision decision;
    private final String accountNumber;
    private final String denyReason;
    private final Application app;

    public ApplicationDecision(final ApplicationReviewDecision decision, final String accountNumber) {
        this.decision = decision;
        this.accountNumber = accountNumber;
        app = null;
        denyReason = "";
    }

    public Application getApp() {
        return app;
    }

    public String getDenyReason() {
        return denyReason;
    }

    public ApplicationDecision(final ApplicationReviewDecision decision, final String denyReason, final Application app) {
        this.decision = decision;
        this.denyReason = denyReason;
        this.app = app;
        this.accountNumber = null;
	}

    public String getAccountNumber() {
        return accountNumber;
    }

    public ApplicationReviewDecision getDecision() {
        return decision;
    }

    

    

}
