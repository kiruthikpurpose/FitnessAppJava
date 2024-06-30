public class FitnessApp {
    public static void main(String[] args) {
        // Create exercises
        Exercise pushups = new Exercise("Push-ups", "Do 3 sets of 15 repetitions");
        Exercise squats = new Exercise("Squats", "Do 3 sets of 20 repetitions");
        
        // Create workouts
        Workout workout1 = new Workout("Full Body Workout");
        workout1.addExercise(pushups);
        workout1.addExercise(squats);
        
        // Create a plan
        Plan plan1 = new Plan("Beginner Plan");
        plan1.addWorkout(workout1);
        
        // Create a user
        User user1 = new User("JohnDoe", 30, 75.0, 180.0);
        user1.setPlan(plan1);
        
        // Track exercises
        user1.trackExercise(pushups);
        user1.trackExercise(squats);
        
        // Monitor progress
        user1.monitorProgress();
    }
}
