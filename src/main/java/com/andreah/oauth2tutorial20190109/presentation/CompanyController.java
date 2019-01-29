package com.andreah.oauth2tutorial20190109.presentation;

import com.andreah.oauth2tutorial20190109.service.Company;
import com.andreah.oauth2tutorial20190109.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
@RequestMapping("/secured/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

   @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
   @ResponseStatus(value = HttpStatus.OK)
   public @ResponseBody
   List<Company> getAll() {
       return companyService.getAll();
   }

   //alternative get controller
  //  @GetMapping
  //  public List<Company> getAll(){
  //      return companyService.getAll();
  //  }
}
















