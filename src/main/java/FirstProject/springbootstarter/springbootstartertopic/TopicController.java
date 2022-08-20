package FirstProject.springbootstarter.springbootstartertopic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    // this marks it as something which need dependency inject
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    // using variable for the mapping
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) { // path variable tells spring this is a var in the map
        return topicService.getTopic(id);
    }
}
