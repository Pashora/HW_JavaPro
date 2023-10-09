class Bicycle {
    String type;
    String color;
    int wheelSize;
    int gearCount;
    boolean hasBell;

    public Bicycle(String type, String color, int wheelSize, int gearCount, boolean hasBell) {
        this.type = type;
        this.color = color;
        this.wheelSize = wheelSize;
        this.gearCount = gearCount;
        this.hasBell = hasBell;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", wheelSize=" + wheelSize +
                ", gearCount=" + gearCount +
                ", hasBell=" + hasBell +
                '}';
    }
}