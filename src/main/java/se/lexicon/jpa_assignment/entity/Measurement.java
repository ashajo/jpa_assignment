package se.lexicon.jpa_assignment.entity;

public enum Measurement {
    KG(1), G(2), HG(3), CL(4), ML(5), DL(6), TSP(7), TBSP(8);
    private int value;

    Measurement() {
    }


    Measurement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
