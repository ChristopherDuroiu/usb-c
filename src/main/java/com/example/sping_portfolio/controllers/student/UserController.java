package com.example.sping_portfolio.controllers.student;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Controller
public class UserController {
    @Autowired
    private UserJpaRespository userJpaRespository;
    private UserSqlRespository userSqlRespository;
/*
    @GetMapping("/student/login")
    public String louisMethod(Model model){
        model.addAttribute("message", "Hello World");
        model.addAttribute("user", new User());
        return "/login/login";
    }

 */
    @GetMapping("/student/login")
    public String grace(Model model) {
        model.addAttribute("message", "Hello World");
/*
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://trivia-by-api-ninjas.p.rapidapi.com/v1/trivia?category=sportsleisure&limit=30"))
                .header("x-rapidapi-host", "trivia-by-api-ninjas.p.rapidapi.com")
                .header("x-rapidapi-key", "215a0875bcmsh7b230e4f9ab5a5dp1b2cf9jsn0b45c55a9a92")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        Object object = new JSONParser().parse(response.body());
        JSONArray trivia = (JSONArray) object;

        model.addAttribute("trivia", trivia);

        //model.addAttribute("trivia", trivia); */
        {return "/login/test";}
    }

    @PostMapping("/student/load")
    public String  load(@Valid User user, Model model){
        model.addAttribute("message", "Hello World");
        model.addAttribute("user", user);
        //userSqlRespository.save(user);
        //System.out.println(userJpaRespository.findAll());
        return  "/login/result";
        //userJpaRespository.save(users);
        //return userJpaRespository.findByName(users.getName());
    }




    //public List<User> findAll(){
    //    return userJpaRespository.findAll();
    //}


    @GetMapping(value ="/student/{name}")
    public User findByName(@PathVariable final String name){
        return userJpaRespository.findByName(name);
    }


}


//    @GetMapping("/database/scrum_create")
//    public String scrumTeamCreate(Model model) {
//        model.addAttribute("scrum", new Scrum());
//        model.addAttribute("listPersons", personSqlRepository.listAll());
//        return "database/scrum_form";
//    }

