package factory.abstractfactory.meals.mexican;

import factory.abstractfactory.meals.Meal;

public class Almuerzo implements Meal {

    private String descripcion;
    private boolean healthy;

    public Almuerzo(){
        descripcion = "Torta";
        healthy = false;
    }

    @Override
    public void dispayMeal() {
        System.out.println(descripcion+ " is " + (healthy ? "healthy" : "not the best option"));

    }
}
