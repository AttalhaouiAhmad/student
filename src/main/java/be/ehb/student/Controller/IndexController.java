package be.ehb.student.Controller;

import be.ehb.student.model.Studenten;
import be.ehb.student.model.StudentenDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class IndexController {

    private StudentenDao StudentenDao;

    @Autowired

    public IndexController(StudentenDao studentenDao) {
        StudentenDao = studentenDao;
    }

    @ModelAttribute("all")
    public Iterable<Studenten>findAll(){
        return StudentenDao.findAll();
    }

    @GetMapping(value = {"/" , "/index"})
    public String showIndex(Model map){
        return "index";
    }
}
