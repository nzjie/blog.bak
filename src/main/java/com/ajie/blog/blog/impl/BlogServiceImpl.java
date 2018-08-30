package com.ajie.blog.blog.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ajie.blog.blog.Blog;
import com.ajie.blog.blog.BlogService;
import com.ajie.blog.blog.simple.SimpleBlog;
import com.ajie.res.user.User;
import com.ajie.res.user.exception.UserException;
import com.ajie.res.user.simple.SimpleUser;

public class BlogServiceImpl implements BlogService {
	private static final Map<Integer, User> users = new HashMap<Integer, User>();
	private static final Map<Integer, Blog> blogs = new HashMap<Integer, Blog>();

	public BlogServiceImpl() throws UserException {
		User u = new SimpleUser("ajie", "1149023676@qq.com", "123321");
		u.setNickName("独孤怎会求败");
		u.setPhone("13450198590");
		u.setSynopsis("hello 大家好");

		User u2 = new SimpleUser("ajie2", "1149023676@qq.com", "123321");
		u2.setNickName("独孤怎会求败2");
		u2.setPhone("13450198590");
		u2.setSynopsis("hello 大家好2222");
		User u3 = new SimpleUser("ajie3", "1149023676@qq.com", "123321");
		u3.setNickName("独孤怎会求败3");
		u3.setPhone("13450198590");
		u3.setSynopsis("hello 大家好3333");
		users.put(1, u);
		users.put(2, u2);
		users.put(3, u3);

		Blog blog = new SimpleBlog();
		blog.setId(1);
		blog.setTitie("这是一篇好文章");
		blog.setContent("hahahahahahaha");
		blog.setUser(u);

		Blog blog2 = new SimpleBlog();
		blog2.setId(2);
		blog2.setTitie("这是一篇好文章22222222222222");
		blog2.setContent("hahahahahahaha2222222222222222222");
		blog2.setUser(u2);

		Blog blog3 = new SimpleBlog();
		blog3.setId(3);
		blog3.setTitie("这是一篇好文章33333333333333333");
		blog3.setContent("hahahahahahaha33333333333333");
		blog3.setUser(u3);

		blogs.put(1, blog);
		blogs.put(2, blog2);
		blogs.put(3, blog3);
	}

	public List<Blog> getBlogs() {
		Blog blog = blogs.get(1);
		Blog blog2 = blogs.get(2);
		Blog blog3 = blogs.get(3);
		List<Blog> list = new ArrayList<Blog>(3);
		list.add(blog);
		list.add(blog2);
		list.add(blog3);
		return list;
	}
}
