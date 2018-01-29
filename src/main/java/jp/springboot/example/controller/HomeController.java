package jp.springboot.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jp.springboot.example.repositories.LoginRepository;
import jp.springboot.example.to.User;

@RestController
public class HomeController {

	@Autowired
	private LoginRepository repository;

	/*
	@RequestMapping(method = RequestMethod.GET)
	@Transactional
	public List<User> get() {
		return ldao.findAll();
	}
	*/
	
	// INDEX
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("title", "Login");
		mav.addObject("msg", "ログイン");
		Iterable<User> list = repository.findAll();
		mav.addObject("datalist", list);
		return mav;
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	@Transactional(readOnly=false)
	public ModelAndView form(
			@RequestParam("id") String id,
			@RequestParam("password") String pass,
			ModelAndView mav) {
		
		User user = repository.findById(id);
		String rpass = user.getPassword();
		System.out.println(rpass);
		
		if(pass.equals(rpass)) {
			mav.setViewName("menu");
			mav.addObject("value", user.getUser_name());
			mav.addObject("title", "Menu");
			mav.addObject("msg", "メニューを選択してください");
		} else {
			mav.setViewName("redirect:/");
		}
		return mav;
	}
	
	// FIND 検索
	/*
	@RequestMapping(value="/find", method=RequestMethod.GET)
	public ModelAndView find(ModelAndView mav) {
		mav.setViewName("find");
		mav.addObject("title", "Find Page");
		mav.addObject("msg", "一覧表");
		System.out.println("1");
		Iterable<User> list = repository.findAll();
		System.out.println("2");
		mav.addObject("datalist", list);
		System.out.println("3");
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
			List<User> list = (List<User>) repository.findById(param);
			mav.addObject("datalist", list);
		}
		return mav;
	}
*/


}
