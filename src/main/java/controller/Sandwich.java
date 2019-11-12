package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class Sandwich {
    private ArrayList<String> list = new ArrayList<>();
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getIndex(Model model){
        ArrayList<String> condimentList = new ArrayList<>();
        condimentList.add("Letture");
        condimentList.add("Tomato");
        condimentList.add("Mustard");
        condimentList.add("Pickle");
        condimentList.add("Eatable Gold");
        model.addAttribute("condiment",condimentList);
        list = condimentList;
        return "index";
    }

    @RequestMapping(value = "/showSandwich", method = RequestMethod.POST)
    public String showSandwich(@RequestParam("condiment") String[] condimentList, Model model){
        String result ="";
        for(String con : condimentList){
            result+=con+", ";
        }
        result=result.substring(0,result.length()-2);
        model.addAttribute("condiment",list);
        model.addAttribute("result",result);
        return  "index";
    }
}
