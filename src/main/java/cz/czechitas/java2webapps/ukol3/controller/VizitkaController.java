package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import cz.czechitas.java2webapps.ukol3.service.VizitkaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
  private final VizitkaService service;

  public VizitkaController(VizitkaService service) {
    this.service = service;
  }

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView result = new ModelAndView("seznam");
    result.addObject("seznam", service.getAll());
    result.addObject("userDidntProvideParameterMessage", service.getUserDidntProvideParameterMessage());
    return result;
  }

  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView result = new ModelAndView("detail");
    result.addObject("vizitka", service.getById(id));
    result.addObject("userDidntProvideParameterMessage", service.getUserDidntProvideParameterMessage());
    result.addObject("vizitkaId", id);
    return result;
  }

  @PostMapping("/detail/{id}")
  public String edit(@PathVariable int id, Vizitka vizitka) {
    service.edit(id, vizitka);
    return "redirect:/";
  }


  @GetMapping("/nova")
  public ModelAndView displayNewBusinessCardPage() {
    return new ModelAndView("nova");
  }


  @PostMapping("/nova")
  public String addNewBusinessCard(Vizitka vizitka) {
    service.addNewBusinessCard(vizitka);
    return "redirect:/";
  }

  @PostMapping("/delete")
  public String deleteByID(int id) {
    service.deleteById(id);
    return "redirect:/";
  }

}
