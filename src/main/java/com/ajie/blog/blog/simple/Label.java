package com.ajie.blog.blog.simple;

import java.util.List;

import com.ajie.blog.persistent.AbstractOuterIdSupport;
import com.ajie.blog.persistent.OuterIdException;

/**
 * 标签
 * 
 * @author niezhenjie
 */
public class Label extends AbstractOuterIdSupport {

	/** 已经屏蔽 */
	public static final int STATE_SHIELD = 1;

	/** 唯一id */
	protected int id;

	/** 对外显示的id */
	protected String outerId;

	/** 标签名 */
	protected String name;

	/** 标签的父标签 */
	protected Label parent;

	/** 标签的子标签 */
	protected List<Label> childs;

	public Label() {
	}

	public Label(String outerId) {
		this.outerId = outerId;
	}

	public Label(String outerId, String name) {
		this(outerId);
		this.name = name;
	}

	public Label(String name, Label parent) {
		this.name = name;
		this.parent = parent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Label getParent() {
		return parent;
	}

	public void setParent(Label parent) {
		this.parent = parent;
	}

	public List<Label> getChilds() {
		return childs;
	}

	public void setChilds(List<Label> childs) {
		this.childs = childs;
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
	protected String getRealId() {
		return String.valueOf(getId());
	}

	public static void main(String[] args) {
			Label label = new Label();
			label.setId(112342342);
			label.setName("测试标签");
			String id = label.getOuterId();
			System.out.println(id);
		Label lab = new Label(id);
		
		String _id;
		try {
			_id = lab.getIdFromOutterId();
			System.out.println(_id);
		} catch (OuterIdException e) {
			e.printStackTrace();
		}
	}

}
