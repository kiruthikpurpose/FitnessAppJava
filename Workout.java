import java.util.ArrayList;
import java.util.List;

public class Workout {
    private String name;
    private List<Exercise> exercises;
    
    public Workout(String name) {
        this.name = name;
        this.exercises = new ArrayList<>();
    }
    
    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }
    
    public List<Exercise> getExercises() {
        return exercises;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Workout: ").append(name).append("\n");
        for (Exercise exercise : exercises) {
            sb.append("- ").append(exercise).append("\n");
        }
        return sb.toString();
    }
}
