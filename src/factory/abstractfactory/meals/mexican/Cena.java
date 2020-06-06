package factory.abstractfactory.meals.mexican;

import factory.abstractfactory.meals.Meal;

public class Cena implements Meal {

    private String descripcion;
    private boolean hasMeat;

    public Cena(){
        descripcion="Pozole";
        hasMeat=true;
    }

    @Override
    public void dispayMeal() {
        System.out.println(descripcion + " it's " + (hasMeat? "not vegetarian" : "vegetarian"));

    }
}
