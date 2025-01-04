import java.util.List;
import java.util.Scanner;

interface NutritionStrategy{
    void display();
}

class NutritionPlan{
    private int id;
    private List<String> meals;
    private String dietType;
    private int Calories;

    // Constructors
    public NutritionPlan(int id, String dietType, int Calories){
        this.id = id;
        this.dietType = dietType;
        this.Calories = Calories;
    }

    // setter & getter
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public List<String> getMeals(){
        return meals;
    }

    public String getDietType(){
        return dietType;
    }

    public void setDietType(String dietType){
        this.dietType = dietType;
    }

    public int getCalories(){
        return Calories;
    }

    public void setCalories(int Calories) {
        this.Calories = Calories;
    }

}
class KetoDietPlan implements NutritionStrategy{
    public void display(){
        System.out.println("Keto Diet Plan. ");
        System.out.println("1. Breakfast: Toast with Scrambled eggs and bacons");
        System.out.println("2. Lunch: Chicken burger with jalapeno");
        System.out.println("3. Dinner: Meatballs with Cheese");
        System.out.println("3. Snacks: Cheese Sticks, Boiled Eggs, Mixed Nuts");

    }
}

class VegetarianDietPlan implements NutritionStrategy{
    public void display(){
        System.out.println("Vegetarian Diet Plan. ");
        System.out.println("1. Breakfast: Toast with avocado and tomatoes.");
        System.out.println("2. Lunch: Stir-Fry Tofu wrap with lettuce");
        System.out.println("3. Dinner: Lentils soup with Beans");
        System.out.println("3. Snacks: Fruit Salad, Chickpeas");

    }
}

class BalancedDietPlan implements NutritionStrategy{
    public void display(){
        System.out.println("Balanced Diet Plan. ");
        System.out.println("1. Breakfast: Oatmeal with fruits and juices");
        System.out.println("2. Lunch: Quinoa salad with mixed veggies");
        System.out.println("3. Dinner: Chicken with brown rice and veggies");
        System.out.println("3. Snacks: Greek Yogurt, Fresh Fruits");

    }
}

class WeightLossDietPlan implements NutritionStrategy{
    public void display(){
        System.out.println("Weight Loss Diet Plan. ");
        System.out.println("1. Breakfast: Green smoothie with spinach and chia seeds.");
        System.out.println("2. Lunch: Grilled Chicken salad with Olive oil dressing.");
        System.out.println("3. Dinner: Baked fish with steamed vegetables.");
        System.out.println("3. Snacks: Rice Cakes, Peanut Butter, low-calorie bars");

    }
}

// context class
class NutritionContext{
    NutritionStrategy nutritionStrategy;

    public void setNutritionStrategy(NutritionStrategy nutritionStrategy){
        this.nutritionStrategy = nutritionStrategy;
    }

    public void displayPlan(){
        nutritionStrategy.display();
    }

}

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        NutritionContext Context = new NutritionContext();

        System.out.println("Choose a Nutrition Plan.");
        System.out.println("1. Keto Diet Plan (non-veg).");
        System.out.println("2. Vegetarian Diet Plan.");
        System.out.println("3. Balanced Diet Plan.");
        System.out.println("4. Weight Loss Diet Plan.");

        int choice = scanner.nextInt();
        switch(choice){
            case 1:
            Context.setNutritionStrategy(new KetoDietPlan());
            break;
            case 2:
            Context.setNutritionStrategy(new VegetarianDietPlan());
            break;
            case 3:
            Context.setNutritionStrategy(new BalancedDietPlan());
            break;
            case 4:
            Context.setNutritionStrategy(new WeightLossDietPlan());
            break;
            default:
            System.out.println("Invalid Input.");
            break;
        }
        Context.displayPlan();
        scanner.close();
    }
}