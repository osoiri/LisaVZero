package model;

public enum TaskStatus {
    UPCOMING("UPCOMING"),
    DONE("DONE"),
    ARCHIVED("ARCHIVED"),
    EXPIRED("EXPIRED");

    private final String code;
    TaskStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
