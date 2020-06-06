package factory.abstractfactory.meals.mexican;

import factory.abstractfactory.meals.Meal;
import factory.abstractfactory.meals.MealFactory;

public class MexicanMealFactory implements MealFactory {
    @Override
    public Meal getMeal(String mealType) {
        switch (mealType) {
            case "breakfast":
                return new Desayuno();
            case "lunch":
                return new Almuerzo();
            case "dinner":
                return new Cena();
            default:
                return null;
        }
    }
}
