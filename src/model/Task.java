package model;

import java.time.OffsetDateTime;

public class Task {
    private String name;
    private String description;
    private final OffsetDateTime createdDate;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
    private final Reward reward;
    private TaskStatus status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }

    public OffsetDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
    }

    public Reward getReward() {
        return reward;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public Task(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.createdDate = OffsetDateTime.now();
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.reward = createReward();
        this.status = TaskStatus.UPCOMING;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String description;
        private OffsetDateTime startDate;
        private OffsetDateTime endDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdDate=" + createdDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", reward=" + reward +
                ", status=" + status +
                '}';
    }

    private Reward createReward() {
        return Reward.getBuilder()
                .setCoin(2)
                .setExp(10)
                .setMultiplier(1.1f)
                .build();
    }
}
