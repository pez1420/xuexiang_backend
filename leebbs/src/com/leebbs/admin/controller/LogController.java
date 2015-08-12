package com.leebbs.admin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.leebbs.admin.entity.search.SearchLog;
import com.leebbs.admin.service.LogService;
import com.leebbs.core.utils.Pageable;


@Controller("adminLogController")
@RequestMapping({"/admin/log"})
public class LogController extends BaseAdminController{
	  @Resource
	  private LogService logService;
	  
	  @RequestMapping(value={"/list"}, method={RequestMethod.GET})
	  public String list(Pageable pageable, SearchLog searchLog, ModelMap model)
	  {
		  model.addAttribute("page", this.logService.findPage(pageable, searchLog));
		  return "/admin/system_set/log/log_view";
	  }
}