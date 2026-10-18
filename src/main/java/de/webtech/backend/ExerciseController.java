
package de.webtech.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ExerciseController {

    @GetMapping("/api/exercises")
    public List<Exercise> getExercises() {

        return List.of(
            new Exercise(1L, "Bankdrücken", "Kraft"),
            new Exercise(2L, "Joggen", "Cardio"),
            new Exercise(3L, "Plank", "Isometric Hold")
        );
    }
}
