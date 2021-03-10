package se.lexicon.jpa_assignment.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

public class RecipeCategory {
    private int id;
    private String name;
    private List<Recipe>recipes;

    public RecipeCategory(String name, List<Recipe> recipes) {
        this.name = name;
        this.recipes = recipes;
    }

    public RecipeCategory(int id, String name, List<Recipe> recipes) {
        this.id = id;
        this.name = name;
        this.recipes = recipes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeCategory that = (RecipeCategory) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(recipes, that.recipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, recipes);
    }

    public RecipeCategory() {
    }
}
