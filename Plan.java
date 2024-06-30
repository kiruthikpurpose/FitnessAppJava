import java.util.ArrayList;
import java.util.List;

public class Plan {
    private String name;
    private List<Workout> workouts;
    
    public Plan(String name) {
        this.name = name;
        this.workouts = new ArrayList<>();
    }
    
    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }
    
    public List<Workout> getWorkouts() {
        return workouts;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Plan: ").append(name).append("\n");
        for (Workout workout : workouts) {
            sb.append(workout).append("\n");
        }
        return sb.toString();
    }
}
