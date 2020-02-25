class Animal {
    String name;
    int legs;

    public Animal (String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public String toString() {
        return name;
    }

    public int getLegs() {
        return legs;
    }
}