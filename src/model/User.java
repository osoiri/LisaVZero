package model;

import java.time.LocalDate;
import java.util.Map;

public class User {
    private String userId;
    private String name;
    private LocalDate birthday;
    private Map<String, Profile> profiles;
    private Integer totalCoins;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Map<String, Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(Map<String, Profile> profiles) {
        this.profiles = profiles;
    }

    public Integer getTotalCoins() {
        return totalCoins;
    }

    public void setTotalCoins(Integer totalCoins) {
        this.totalCoins = totalCoins;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public User(Builder builder) {
        this.userId = builder.userId;
        this.name = builder.name;
        this.birthday = builder.birthday;
    }

    public static class Builder {
        private String userId;
        private String name;
        private LocalDate birthday;

        public User build() {
            return new User(this);
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBirthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", profiles=" + profiles +
                ", totalCoins=" + totalCoins +
                '}';
    }
}
