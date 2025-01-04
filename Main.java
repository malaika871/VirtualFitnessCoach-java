import java.util.Scanner;

interface WorkoutPlan {
    void workout();
}

class WeightLossPlan implements WorkoutPlan{

    public void workout(){
        System.out.println("Weight loss Workout Plan: ");
        System.out.println("1. Warm Up: 10 min walk. ");
        System.out.println("2. 30 seconds sprints, 1 minute rest (repeat 10 times). ");
        System.out.println("3. Strength: Squats adn push ups (3 sets of 15 reps each). ");
        System.out.println("4. Cool Down: Stretch for 5 minutes. ");

    }
}

class MuscleGainPlan implements WorkoutPlan{
    public void workout(){
        System.out.println("Muscle Gain Workout Plan. ");
        System.out.println("1. Warm up: 5-10 minutes treadmill. ");
        System.out.println("2. Chest:Bench Press (4 sets of 8-10 reps). ");
        System.out.println("3. Back: DeadLifts (4 sets of 6-8 reps). ");
        System.out.println("4. Legs: Squats (4 sets of 8-10 reps). ");
        System.out.println("5. Biceps: Barbell Curls (3 sets of 6-8 reps). ");
        System.out.println("6. Triceps: Tricep Dips (3 sets of 6-8 reps). ");
        System.out.println("7. Cool Down: Stretching. ");
    }
}

class CardioPlan implements WorkoutPlan{
    public void workout(){
        System.out.println("Cardio Workout Plan. ");
        System.out.println("1. Warm up: 5 minutes jogging or walking. ");
        System.out.println("2. Running: 30 minutes. ");
        System.out.println("3. Cool Down: Stretching for 5 minutes. ");
    }
}

class StrengthPlan implements WorkoutPlan{
    public void workout(){
        System.out.println("Strengthening Plan. ");
        System.out.println("4. Warm up: Push Ups 10 minutes. ");
        System.out.println("4. Weight Lifting: 3 sets of 10 reps. ");
        System.out.println("4. Planks: 1 minute hold. ");

    }
}

class Yoga implements WorkoutPlan{
    public void workout(){
        System.out.println("Yoga Workout Plan. ");
        System.out.println("1. Breathing Exercise: 5 minutes. ");
        System.out.println("2. Forward Bending: 15 rounds. ");
        System.out.println("4. Sun Salutations: 10 rounds. ");
        System.out.println("3. Meditation: 10 minutes. ");

    }
}

// context class
class WorkoutContext{
    WorkoutPlan WorkOutPlan;

    public  void setWorkoutPlan(WorkoutPlan WorkPlan){
        this.WorkOutPlan = WorkPlan;
    }

    public void performWorkout(){
        WorkOutPlan.workout();
    }
}

// main class
public class Main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        WorkoutContext Context = new WorkoutContext();

        System.out.println("Choose your Work Out Plan. ");
        System.out.println("1. Weight Loss Workout Plan. ");
        System.out.println("2. Muscle Gain Workout Plan. ");
        System.out.println("3. Cardio Workout Plan. ");
        System.out.println("4. Strengthening Workout Plan. ");
        System.out.println("5. Yoga Workout Plan. ");
        System.out.println("Enter your choice (in number)");
        System.out.println();
        int choice = scanner.nextInt();
        switch(choice){ 
        case 1:
        Context.setWorkoutPlan(new WeightLossPlan());
        break;
        case 2:
        Context.setWorkoutPlan(new MuscleGainPlan());
        break;
        case 3: 
        Context.setWorkoutPlan(new CardioPlan());
        break;
        case 4:
        Context.setWorkoutPlan(new StrengthPlan());
        break;
        case 5:
        Context.setWorkoutPlan(new Yoga());
        break;
        }
        Context.performWorkout();
        scanner.close();
    }
}