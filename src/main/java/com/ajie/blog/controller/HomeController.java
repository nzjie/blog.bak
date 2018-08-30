package com.ajie.blog.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ajie.blog.blog.Blog;
import com.ajie.blog.blog.BlogService;
import com.ajie.res.user.User;

/**
 * @author niezhenjie
 */

@Controller
public class HomeController {

	@Resource
	private BlogService blogService;

	@RequestMapping
	String getBlogs(HttpServletRequest request, HttpServletResponse response) {
		List<Blog> blogs = blogService.getBlogs();
		JSONArray arr = new JSONArray();
		for (Blog b : blogs) {
			String id = b.getOuterId();
			String titie = b.getTitie();
			String content = b.getContent();
			Date createTime = b.getCreateTime();
			User user = b.getUser();
			JSONObject obj = new JSONObject();
			obj.put("id", id+"<br>");
			obj.put("title", content+"<br>");
			obj.put("content", titie+"<br>");
			obj.put("createTime", createTime+"<br>");
			JSONObject o = new JSONObject();
			o.put("name", user.getName());
			o.put("email", user.getEmail()+"<br>");
			o.put("phone", user.getPhone()+"<br>");
			o.put("nickname", user.getNickName()+"<br>");
			o.put("synopsis", user.getSynopsis()+"<br>");
			obj.put("user", o.toString()+"<br>");
			arr.put(obj);

		}

		request.setAttribute("blogs", arr);
		return "blog/index";
	}
}
