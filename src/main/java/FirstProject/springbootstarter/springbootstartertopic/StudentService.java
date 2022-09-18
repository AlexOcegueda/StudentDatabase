package FirstProject.springbootstarter.springbootstartertopic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
singleton
 */
@Service
public class StudentService {

    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("spring", "Spring Framework", "Spring Framework Description"),
            new Student("java", "Core Java", "Core Java Description"),
            new Student("javascript", "JavaScript", "JavaScript Description")
    ));

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudent(String id) {
        /*
            This is using the stream function to filter by id.
            it uses lambda expression to compare id of topic to the id that is passed in
         */
        return students.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addStudent(Student student) {

        students.add(student);
    }

    public void updateStudent(String id, Student student) {
        for(int i = 0; i < students.size(); i++) {
            Student t = students.get(i);
            if(t.getId().equals(id)) {
                students.set(i, student);
                return;
            }
        }
    }

    public void deleteStudent(String id) {
        students.removeIf(t -> t.getId().equals(id));
    }
}
