package com.ajie.blog.blog;

import java.util.Date;
import java.util.List;

import com.ajie.blog.blog.simple.Label;
import com.ajie.res.user.User;

/**
 * 博文接口
 * 
 * @author niezhenjie
 */
public interface Blog {

	/** 博文状态 -- 正常 */
	static public final int STATE_NORMAL = 1;
	/** 博文状态 -- 已屏蔽 */
	static public final int STATE_SHIELD = 1 << 1;
	/** 博文状态 -- 已删除 */
	static public final int STATE_DELETE = 1 << 2;

	/**
	 * 内部id
	 * 
	 * @return
	 */
	int getId();
	
	void setId(int id);

	/**
	 * 外部id
	 * 
	 * @return
	 */
	String getOuterId();

	/**
	 * 文章title
	 * 
	 * @return
	 */
	String getTitie();

	/**
	 * 设置title
	 * 
	 * @param title
	 */
	void setTitie(String title);

	/**
	 * 文章内容
	 * 
	 * @return
	 */
	String getContent();

	/**
	 * 设置内容
	 * 
	 * @param content
	 */
	void setContent(String content);

	/**
	 * 创建时间
	 * 
	 * @return
	 */
	Date getCreateTime();

	/**
	 * 获取用户
	 * 
	 * @return
	 */
	User getUser();
	
	void setUser(User user);

	/**
	 * 标签集
	 * 
	 * @return
	 */
	List<Label> getLabels();

	/**
	 * 设置标签集
	 * 
	 * @param labels
	 */
	void setLabels(List<Label> labels);

	/**
	 * 添加标签
	 * 
	 * @param label
	 */
	void addLabel(Label label);

	/**
	 * 移除标签
	 * 
	 * @param label
	 */
	void removeLabel(Label label);

	/**
	 * 评论数
	 * 
	 * @return
	 */
	int getCommonNum();

	/**
	 * 评论数+1
	 */
	void addCommonNum();

	/**
	 * 评论数+step
	 */
	void addCommonNum(int step);

	/**
	 * 点赞数
	 * 
	 * @return
	 */
	int getPraiseNum();

	/**
	 * 点赞数+1
	 */
	void addPraiseNum();

	/**
	 * 点赞数+step
	 */
	void addPraiseNum(int step);

	/**
	 * 阅读次数
	 * 
	 * @return
	 */
	int getReadNum();

	/**
	 * 阅读数+1
	 */
	void addReadNum();

	/**
	 * 阅读数+step
	 */
	void addReadNum(int step);

	/**
	 * 状态
	 * 
	 * @return
	 */
	int getState();

}
