package FirstProject.springbootstarter.springbootstartertopic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    // this marks it as something which need dependency inject
    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getAllStudents() {

        return studentService.getAllStudents();
    }

    // using variable for the mapping
    @RequestMapping("/students/{id}")
    public Student getTopic(@PathVariable String id) { // path variable tells spring this is a var in the map

        return studentService.getStudent(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public void addTopic(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
    public void updateTopic(@RequestBody Student student, @PathVariable String id) {
        studentService.updateStudent(id, student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
    public void deleteTopic(@PathVariable String id) {
        studentService.deleteStudent(id);
    }

}
