abstract class Exercise
{
    protected int id;
    protected String name;
    protected String type;
    protected double caloriesBurnedPerMinute;
    protected boolean equipmentRequired;

    //Constructor
    public Exercise(int id, String name, String type, double caloriesBurnedPerMinute, boolean equipmentRequired) 
    {
        this.id = id;
        this.name = name;
        this.type = type;
        this.caloriesBurnedPerMinute = caloriesBurnedPerMinute;
        this.equipmentRequired = equipmentRequired;
    }

    public abstract void performExercise();

    public String getExerciseDetails() 
    {
        return "Exercise: " + name + ", Type: " + type + ", Calories Burned/Minute: " + caloriesBurnedPerMinute + ", Equipment Required: " + equipmentRequired;
    }

}
class cardioExercise extends Exercise
{
    public cardioExercise(String type,int id, String name, double caloriesBurnedPerMinute, boolean equipmentRequired)
    {
        super( id,name,type,caloriesBurnedPerMinute,equipmentRequired);
    }
    @Override
    public void performExercise()
    {
        System.out.println("Performing Cardio exercise: "+ name);
    }
}
class StrengthExercise extends Exercise
{
    public StrengthExercise(int id, String name, String type, double caloriesBurnedPerMinute, boolean equipmentRequired)
    {
        super( id,name,type,caloriesBurnedPerMinute,equipmentRequired);
    }
    @Override
    public void performExercise()
    {
        System.out.println("Performing Strength exercise: "+ name);
    } 
}
class FlexibilityExercise extends Exercise
{
    public FlexibilityExercise(int id, String name, String type, double caloriesBurnedPerMinute, boolean equipmentRequired)
    {
        super( id,name,type,caloriesBurnedPerMinute,equipmentRequired);
    }
    @Override
    public void performExercise()
    {
        System.out.println("Performing Flexilibility exercise: "+ name);
    } 
}
class ExerciseMethod {
    public static Exercise createExercise(String type,int id, String name, double caloriesBurnedPerMinute, boolean equipmentRequired) 
    {
        switch (type) {
            case "Cardio":
                return new cardioExercise(type,id, name, caloriesBurnedPerMinute, equipmentRequired);
            case "Strength":
                return new StrengthExercise(id, name,type, caloriesBurnedPerMinute, equipmentRequired);
            case "Flexibility":
                return new FlexibilityExercise(id, name,type, caloriesBurnedPerMinute, equipmentRequired);
            default:
                throw new IllegalArgumentException("Unknown exercise type: " + type);
        }
    }
}
class ExerciseFactory
{
    public static void main(String[] args) {
        //object create

        Exercise cardio = ExerciseMethod.createExercise("Cardio", 1, "Running", 10.0, false);
        Exercise strength = ExerciseMethod.createExercise("Strength", 2, "Weight Lifting", 8.0, true);

        //Function calling

        cardio.performExercise();
        System.out.println(cardio.getExerciseDetails());

        strength.performExercise();
        System.out.println(strength.getExerciseDetails());
    }
}
