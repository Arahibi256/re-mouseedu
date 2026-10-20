package hanjogovernment.mouseedu.re_mouseedu.controller;

import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import hanjogovernment.mouseedu.re_mouseedu.model.Chamber;
import hanjogovernment.mouseedu.re_mouseedu.model.ChamberMapper;

@Controller
@RequestMapping("/sample4")
public class Sample41Controller {

  @Autowired
  private ChamberMapper chamberMapper;

  @GetMapping("/step1")
  public String step1(Principal prin, ModelMap model) {
    model.addAttribute("loginUser", prin.getName());
    return "sample41.html";
  }

  @GetMapping("step2/{id}")
  public String sample42(@PathVariable Integer id, ModelMap model) {
    Chamber chamber2 = chamberMapper.selectById(id);
    model.addAttribute("chamber2", chamber2);

    return "sample41.html";
  }
}
