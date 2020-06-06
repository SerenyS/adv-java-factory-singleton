package factory.abstractfactory.meals;


import factory.abstractfactory.meals.german.GermanMealFactory;
import factory.abstractfactory.meals.mexican.MexicanMealFactory;

public class MealDriver {

    public static void main(String[] args) {
        MexicanMealFactory mealFactory = new MexicanMealFactory();
        Hotel hotel = new Hotel(mealFactory);
        hotel.serveMeals();
    }
}
