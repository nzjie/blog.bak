package com.ajie.blog.blog.simple;

import java.util.List;

import com.ajie.blog.blog.Blog;
import com.ajie.blog.blog.Content;
import com.ajie.blog.persistent.OuterIdException;
import com.ajie.res.user.User;

public class SimpleBlog extends Content implements Blog {

	/**
	 * 唯一id
	 */
	protected int id;

	/**
	 * 外部id
	 */
	protected String outerId;

	/**
	 * 用户
	 */
	protected User user;

	/**
	 * 标签集
	 */
	protected List<Label> labels;

	/**
	 * 评论数
	 */
	protected int commonNum;

	/**
	 * 点赞数
	 */
	protected int praiseNum;

	/**
	 * 阅读数
	 */
	protected int readNum;

	@Override
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getOuterId() {
		if (null == outerId) {
			try {
				outerId = genOuterId();
			} catch (OuterIdException e) {
				logger.error(e.getMessage());
				outerId = "";
			}
		}
		return outerId;
	}

	@Override
	public String getTitie() {
		return title;
	}

	@Override
	public void setTitie(String title) {
		this.title = title;
	}

	@Override
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public List<Label> getLabels() {
		return labels;
	}

	@Override
	public void setLabels(List<Label> labels) {
		if (null == labels) {
			return;
		}
		synchronized (labels) {
			this.labels = labels;
		}

	}

	@Override
	public void addLabel(Label label) {
		if (null == label) {
			return;
		}
		synchronized (label) {
			labels.add(label);
		}
	}

	@Override
	public void removeLabel(Label label) {
		if (null == label) {
			return;
		}
		synchronized (label) {
			labels.remove(label);
		}
	}

	@Override
	public int getCommonNum() {
		return commonNum;
	}

	@Override
	public void addCommonNum() {
		int commonNum = this.commonNum;
		commonNum++;
		this.commonNum = commonNum;
	}

	@Override
	public void addCommonNum(int step) {
		int commonNum = this.commonNum;
		commonNum += step;
		this.commonNum = commonNum;

	}

	@Override
	public int getPraiseNum() {
		return praiseNum;
	}

	@Override
	public void addPraiseNum() {
		int praiseNum = this.praiseNum;
		praiseNum++;
		this.praiseNum = praiseNum;
	}

	@Override
	public void addPraiseNum(int step) {
		int praiseNum = this.praiseNum;
		praiseNum += step;
		this.praiseNum = praiseNum;
	}

	@Override
	public int getReadNum() {
		return readNum;
	}

	@Override
	public void addReadNum() {
		int readNum = this.readNum;
		readNum++;
		this.readNum = readNum;
	}

	@Override
	public void addReadNum(int step) {
		int readNum = this.readNum;
		readNum += step;
		this.readNum = readNum;
	}

	@Override
	protected String getRealId() {
		return String.valueOf(this.id);
	}
}
