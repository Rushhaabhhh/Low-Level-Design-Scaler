public final class SubwaySandwich {
    private final String breadType;
    private final int tomatoes;
    private final int jalapenos;
    private final int cucumbers;
    private final int paneer;
    private final int chicken;

    // Private constructor to enforce object creation via Builder
    private SubwaySandwich(Builder builder) {
        this.breadType = builder.breadType;
        this.tomatoes = builder.tomatoes;
        this.jalapenos = builder.jalapenos;
        this.cucumbers = builder.cucumbers;
        this.paneer = builder.paneer;
        this.chicken = builder.chicken;
    }

    // Getters for all fields
    public String getBreadType() { return breadType; }
    public int getTomatoes() { return tomatoes; }
    public int getJalapenos() { return jalapenos; }
    public int getCucumbers() { return cucumbers; }
    public int getPaneer() { return paneer; }
    public int getChicken() { return chicken; }

    // Static nested Builder class for setting parameters
    public static class Builder {
        private String breadType;
        private int tomatoes;
        private int jalapenos;
        private int cucumbers;
        private int paneer;
        private int chicken;

        public Builder setBreadType(String breadType) {
            this.breadType = breadType;
            return this;
        }

        public Builder setTomatoes(int tomatoes) {
            this.tomatoes = tomatoes;
            return this;
        }

        public Builder setJalapenos(int jalapenos) {
            this.jalapenos = jalapenos;
            return this;
        }

        public Builder setCucumbers(int cucumbers) {
            this.cucumbers = cucumbers;
            return this;
        }

        public Builder setPaneer(int paneer) {
            this.paneer = paneer;
            return this;
        }

        public Builder setChicken(int chicken) {
            this.chicken = chicken;
            return this;
        }

        public SubwaySandwich build() {
            if (breadType == null || breadType.isEmpty()) {
                throw new IllegalStateException("Bread type must be specified.");
            }
            return new SubwaySandwich(this);
        }
    }
}
