package se.lexicon.jpa_assignment.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

public class RecipeIngradient {
    @Id
    @GeneratedValue(generator ="UUID" )
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id",updatable = false, nullable = false)
    private UUID id;


    private Ingradient ingradient;
    private double amount;
    private Measurement measurement;
    private Recipe receipe;

    public RecipeIngradient(Ingradient ingradient, double amount, Measurement measurement, Recipe receipe) {
        this.ingradient = ingradient;
        this.amount = amount;
        this.measurement = measurement;
        this.receipe = receipe;
    }

    public RecipeIngradient(UUID id, Ingradient ingradient, double amount, Measurement measurement, Recipe receipe) {
        this.id = id;
        this.ingradient = ingradient;
        this.amount = amount;
        this.measurement = measurement;
        this.receipe = receipe;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Ingradient getIngradient() {
        return ingradient;
    }

    public void setIngradient(Ingradient ingradient) {
        this.ingradient = ingradient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public Recipe getReceipe() {
        return receipe;
    }

    public void setReceipe(Recipe receipe) {
        this.receipe = receipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeIngradient that = (RecipeIngradient) o;
        return Double.compare(that.amount, amount) == 0 && Objects.equals(id, that.id) && Objects.equals(ingradient, that.ingradient) && measurement == that.measurement && Objects.equals(receipe, that.receipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ingradient, amount, measurement, receipe);
    }

    public RecipeIngradient() {
    }
}
