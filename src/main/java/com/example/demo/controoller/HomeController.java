package com.example.demo.controoller;

import com.example.demo.domain.Information;
import com.example.demo.domain.Replies;
import com.example.demo.service.InformationService;
import com.example.demo.service.RepliesService;
import com.example.demo.service.SaveReplies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//Controller
//@Target

@Controller
public class HomeController {
    @Autowired
    InformationService informationService;

    @Autowired
    RepliesService repliesService;

    @Autowired
    SaveReplies saveReplies;

    @RequestMapping("/")//用来指定处理URL请求
    public String main(Model model){
        List<Information> informationList = informationService.INFORMATIONfindAll();
        model.addAttribute("inf",informationList);
        return "index";
    }

    @RequestMapping("/findByid")
    public String findByid(Integer id,Model model){
        Information informationid=informationService.INFORMATIONfindById(id);
        model.addAttribute("inid",informationid);//addAttribute往前台传数据，对象，集合
        model.addAttribute("reid",repliesService.findAll(id));
        System.out.println(repliesService.findAll(id).toString());
        return "repliesinsert";
    }

    @RequestMapping("/add")
    public String add(Integer id,Replies replies){
        replies.setInformation(new Information(id));
        saveReplies.save(replies);
        return "redirect:/findByid?id="+id;
    }

}
