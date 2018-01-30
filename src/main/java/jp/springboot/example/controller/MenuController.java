package jp.springboot.example.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jp.springboot.example.dao.SupDaoImpl;
import jp.springboot.example.repositories.SupRepository;
import jp.springboot.example.to.Sup;

@Controller
public class MenuController {

	@Autowired
	SupRepository repository;
	
	@PersistenceContext
	EntityManager entityManager;
	
	SupDaoImpl sdao;
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public ModelAndView find(ModelAndView mav) {
		mav.setViewName("find");
		mav.addObject("title","商品一覧");
		mav.addObject("msg","Supplier");
		Iterable<Sup> list = repository.findAll();
		mav.addObject("datalist", list);
		return mav;
	}
	
	@RequestMapping(value="/find", method=RequestMethod.POST)
	@Transactional(readOnly=false)
	public ModelAndView search(
			@RequestParam("find") String param,
			ModelAndView mav) {
		mav.setViewName("find");
		
		if(param == "") {
			mav = new ModelAndView("redirect:/find");
		} else {
			mav.addObject("title", "Find result");
			mav.addObject("msg", "「" + param + "」の検索結果");
			mav.addObject("value", param);
			List<Sup> list = repository.findBySname(param);
			mav.addObject("datalist", list);
		}
		return mav;
	}

	
	/*
	@PostConstruct
	public void init() {
		sdao = new SupDaoImpl(entityManager);
	}
	*/
}
