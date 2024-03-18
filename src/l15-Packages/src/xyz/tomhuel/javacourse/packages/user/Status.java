package xyz.tomhuel.javacourse.packages.user;

public enum Status {
    PENDING("Pending"),
    READY("Ready"),
    REJECTED("Rejected"),
    RESOLVED("Resolved");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
