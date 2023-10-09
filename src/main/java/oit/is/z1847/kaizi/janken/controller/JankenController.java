package oit.is.z1847.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JankenController {

  @GetMapping("/janken")
  public String janken() {
    return "janken.html";
  }

  @PostMapping("/janken")
  public String showName(@RequestParam String username, Model model) {
    model.addAttribute("username", username);
    return "janken.html";
  }

  @GetMapping("/jankengame")
  public String playGame(@RequestParam String hand, ModelMap model) {
    model.addAttribute("result", hand);
    return "janken.html";
  }
}
