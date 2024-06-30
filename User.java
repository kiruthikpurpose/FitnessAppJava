public class User {
    private String username;
    private int age;
    private double weight;
    private double height;
    private Plan plan;
    
    public User(String username, int age, double weight, double height) {
        this.username = username;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    
    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    
    public void trackExercise(Exercise exercise) {
        // Simulate tracking exercise, could include logging to a file or database
        System.out.println(username + " tracked exercise: " + exercise.getName());
    }
    
    public void monitorProgress() {
        if (plan != null) {
            System.out.println(username + "'s Progress:");
            System.out.println(plan);
        } else {
            System.out.println(username + " does not have a workout plan yet.");
        }
    }
}
