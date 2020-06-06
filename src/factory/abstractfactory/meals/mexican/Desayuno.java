package factory.abstractfactory.meals.mexican;

import factory.abstractfactory.meals.Meal;

public class Desayuno implements Meal {
    private String descripcion;
    private boolean vegan;

    public Desayuno(){
        descripcion="Huevos Rancheros";
        vegan = true;
    }


    @Override
    public void dispayMeal() {
        System.out.println(descripcion + " is " + (vegan ? "Vegan" : "Not Vegan"));

    }
}
