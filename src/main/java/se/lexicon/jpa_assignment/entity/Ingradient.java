package se.lexicon.jpa_assignment.entity;

import java.util.Objects;

public class Ingradient {
    private int id;
    private String ingradientName;

    public Ingradient() {
    }

    public Ingradient(String ingradient) {
        this.ingradientName = ingradient;
    }

    public Ingradient(int id, String ingradient) {
        this.id = id;
        this.ingradientName = ingradient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIngradient() {
        return ingradientName;
    }

    public void setIngradient(String ingradient) {
        this.ingradientName = ingradient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingradient that = (Ingradient) o;
        return id == that.id && Objects.equals(ingradientName, that.ingradientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ingradientName);
    }
}
