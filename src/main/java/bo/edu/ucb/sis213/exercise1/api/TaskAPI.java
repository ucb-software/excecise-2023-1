package bo.edu.ucb.sis213.exercise1.api;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import bo.edu.ucb.sis213.exercise1.bl.TaskBl;
import bo.edu.ucb.sis213.exercise1.dto.Task;
import java.util.*;

@RestController
class TaskAPI {
    private TaskBl  taskBl;

    public TaskAPI () {
        taskBl = new TaskBl();
    }

    @GetMapping("/api/v1/task")
    public Map create(Task task) {
        taskBl.create(task);
        Map result = new HashMap();
        result.put("code","TASK-0000");
        result.put("result", "Task created succsefylly");
        result.put("errorMessage", "");
        return result;
    }

/* 
    public Map listAll() {
        return taskBl.listAll();
    }

    public Map delete(int taskId) {
        taskBl.delete(taskId);
    } */
}