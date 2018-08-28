package com.ajie.blog.blog;

import java.util.Date;

/**
 * @author niezhenjie
 */
public class Content {

	/**
	 * 创建时间
	 */
	protected Date createTime;

	/**
	 * 标题
	 */
	protected String title;

	/**
	 * 内容
	 */
	protected String content;

	/**
	 * 状态
	 */
	protected int state;

	public Content() {
	};

	public Content(String title, String content) {
		this.title = title;
		this.content = content;
		this.createTime = new Date();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
