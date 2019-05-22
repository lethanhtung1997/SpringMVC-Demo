package com.msita.controller;

import com.msita.form.StudentForm;
import com.msita.javabean.Major;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;

@Controller
public class StudentController {

    @RequestMapping(value = "/editStudent", method = RequestMethod.GET)
    public String editStudent(final Model model) {
        StudentForm student = new StudentForm("Nguyen Van A", 10,
                "Information and Technology", "Male",
                Arrays.asList("EN", "VI"), Arrays.asList("Game"));
        model.addAttribute("student", student);
        return "edit_student";
    }

    @RequestMapping(value = "/editStudent", method = RequestMethod.POST)
    public String editStudent(final Model model, @ModelAttribute("student") final StudentForm student) {
        model.addAttribute("username", student.getName());
        return "/welcome";
    }

    @ModelAttribute("majors")
    public List<Major> getMajors() {
        return Arrays.asList(new Major("Mathematics", "Toan hoc"),
                new Major("Information and Technology", "Cong nghe thong tin"));
    }

    @ModelAttribute("genders")
    public List<String> getGenders() {
        return Arrays.asList("Male", "Female");
    }

    @ModelAttribute("languages")
    public Map<String, String> getLanguages() {
        return new HashMap<String, String>() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
                put("EN", "English");
                put("VI", "Viet Nam");
            }
        };
    }

    @ModelAttribute("hobbies")
    public List<String> getHobbies() {
        return Arrays.asList("Football", "Music", "Game");
    }
}
