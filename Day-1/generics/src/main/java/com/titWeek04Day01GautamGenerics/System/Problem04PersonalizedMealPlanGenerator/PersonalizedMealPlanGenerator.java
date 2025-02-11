package com.titWeek04Day01GautamGenerics.System.Problem04PersonalizedMealPlanGenerator;



import java.util.ArrayList;
import java.util.List;

// MealPlan interface
interface MealPlan {
    String getMealPlan();
}

// Subtypes of MealPlan
class VegetarianMeal implements MealPlan {
    @Override
    public String getMealPlan() {
        return "Vegetarian Meal Plan: Grilled veggies, Lentil soup, Quinoa salad";
    }
}

class VeganMeal implements MealPlan {
    @Override
    public String getMealPlan() {
        return "Vegan Meal Plan: Avocado toast, Vegan burger, Chickpea salad";
    }
}

class KetoMeal implements MealPlan {
    @Override
    public String getMealPlan() {
        return "Keto Meal Plan: Grilled chicken, Cauliflower rice, Bulletproof coffee";
    }
}

class HighProteinMeal implements MealPlan {
    @Override
    public String getMealPlan() {
        return "High Protein Meal Plan: Chicken breast, Boiled eggs, Protein shake";
    }
}

// Generic class for Meal Plan
class Meal<T extends MealPlan> {
    private List<T> mealList = new ArrayList<>();

    public void addMeal(T meal) {
        mealList.add(meal);
    }

    public List<T> getMealList() {
        return mealList;
    }
}

// Validator for personalized meal plans
class MealPlanGenerator {

    public static <T extends MealPlan> void generateMealPlan(Meal<T> meal) {
        for (T m : meal.getMealList()) {
            System.out.println(m.getMealPlan());
        }
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {

        // Vegetarian Meal Plan
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>();
        vegetarianMeal.addMeal(new VegetarianMeal());

        // Vegan Meal Plan
        Meal<VeganMeal> veganMeal = new Meal<>();
        veganMeal.addMeal(new VeganMeal());

        // Keto Meal Plan
        Meal<KetoMeal> ketoMeal = new Meal<>();
        ketoMeal.addMeal(new KetoMeal());

        // High Protein Meal Plan
        Meal<HighProteinMeal> highProteinMeal = new Meal<>();
        highProteinMeal.addMeal(new HighProteinMeal());

        System.out.println("Generating Personalized Meal Plans:");
        MealPlanGenerator.generateMealPlan(vegetarianMeal);
        MealPlanGenerator.generateMealPlan(veganMeal);
        MealPlanGenerator.generateMealPlan(ketoMeal);
        MealPlanGenerator.generateMealPlan(highProteinMeal);
    }
}
