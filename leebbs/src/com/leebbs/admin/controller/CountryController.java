package com.leebbs.admin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.leebbs.admin.entity.search.SearchCountry;
import com.leebbs.admin.service.CountryService;
import com.leebbs.core.utils.Pageable;

/**
 * @pez1420 pez1420(pez1420@163.com)
 * @date 2015-08-15
 */

@Controller("adminCountryController")
@RequestMapping({ "/admin/country" })
public class CountryController extends BaseAdminController {

	@Resource
	private CountryService countryService;
	
	@RequestMapping(value = { "/list" }, method = { RequestMethod.GET })
	public String list(Pageable pageable, SearchCountry searchCountry,
			ModelMap model) {
		model.addAttribute("page", countryService.findPage(pageable, searchCountry));
		model.addAttribute("search", searchCountry);
		return "/admin/basis/country/country_view";
	}

	@RequestMapping(value = { "/add" }, method = { RequestMethod.GET })
	public String add(ModelMap model) {
		return "/admin/basis/country/country_add";
	}
	
	@RequestMapping(value = { "/save" }, method = { RequestMethod.POST })
	public String save(RedirectAttributes redirectAttributes) {
		
		addFlashAttribute(redirectAttributes, success);
		// 从一个controller跳转到另一个controller
		return "redirect:list.jhtml";
	}
}