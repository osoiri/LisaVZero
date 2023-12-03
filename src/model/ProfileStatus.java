package model;

public enum ProfileStatus {
    ACTIVE("ACTIVE"),
    PAUSED("PAUSED"),
    ARCHIVED("ARCHIVED");

    private final String code;
    ProfileStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
