package com.waracle.cakemgr.Controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.waracle.cakemgr.model.CakeEntity;
import com.waracle.cakemgr.service.CakeService;
import com.waracle.cakemgr.utils.DBUtils;

@Controller
public class CakeManagerController {

	@Autowired
	CakeService service;
	
	@PostConstruct
	public void init() {
		DBUtils.initDB(service);
	}
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(@ModelAttribute("model") ModelMap model) {
    	model.addAttribute("cakes", service.findAllCakes());
        return "cakes";
    }
 
    @RequestMapping(value = "/cakes", produces = "application/json")
    public @ResponseBody List<CakeEntity> cakesJson() {
    	return service.findAllCakes();
    }

    @RequestMapping(value = "/cakes", produces = "text/html")
    public String cakes(@ModelAttribute("model") ModelMap model) {
    	model.addAttribute("cakes", service.findAllCakes());
        return "cakes";    	
    }
}