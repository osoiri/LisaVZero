package model;

public class Reward {
    private final Integer coin;
    private final Integer exp;
    private Float multiplier;

    public Integer getCoin() {
        return coin;
    }

    public Integer getExp() {
        return exp;
    }

    public Float getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Float multiplier) {
        this.multiplier = multiplier;
    }

    public Reward(Builder builder) {
        this.coin = builder.coin;
        this.exp = builder.exp;
        this.multiplier = builder.multiplier;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private Integer coin;
        private Integer exp;
        private Float multiplier;

        public Reward build() {
            return new Reward(this);
        }

        public Builder setCoin(Integer coin) {
            this.coin = coin;
            return this;
        }

        public Builder setExp(Integer exp) {
            this.exp = exp;
            return this;
        }

        public Builder setMultiplier(Float multiplier) {
            this.multiplier = multiplier;
            return this;
        }
    }
}
