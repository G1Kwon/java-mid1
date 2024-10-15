package enumeration.test.auth;

public enum AuthGrade {

    GUEST(1, "GUEST"),
    LOGIN(2, "LIGIN"),
    ADMIN(3, "ADMIN");

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}
