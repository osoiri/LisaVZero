package model;

import java.util.List;

public class Profile {
    private String profileName;
    private String profileJob;
    private String description;
    private Integer totalExp;
    private List<Task> tasks;
    private ProfileStatus status;

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileJob() {
        return profileJob;
    }

    public void setProfileJob(String profileJob) {
        this.profileJob = profileJob;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTotalExp() {
        return totalExp;
    }

    public void setTotalExp(Integer totalExp) {
        this.totalExp = totalExp;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public ProfileStatus getStatus() {
        return status;
    }

    public void setStatus(ProfileStatus status) {
        this.status = status;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public Profile(Builder builder) {
        this.profileName = builder.profileName;
        this.profileJob = builder.profileJob;
        this.description = builder.description;
        this.totalExp = 0;
        this.status = ProfileStatus.ACTIVE;
    }

    public static class Builder {
        private String profileName;
        private String profileJob;
        private String description;

        public Profile build() {
            return new Profile(this);
        }

        public Builder setProfileName(String profileName) {
            this.profileName = profileName;
            return this;
        }

        public Builder setProfileJob(String profileJob) {
            this.profileJob = profileJob;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Profile{" +
                "profileName='" + profileName + '\'' +
                ", profileJob='" + profileJob + '\'' +
                ", description='" + description + '\'' +
                ", totalExp=" + totalExp +
                ", tasks=" + tasks +
                ", status=" + status +
                '}';
    }
}
