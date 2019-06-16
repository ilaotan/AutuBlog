package com.autu.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRoute<M extends BaseRoute<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setPattern(java.lang.String pattern) {
		set("pattern", pattern);
		return (M)this;
	}
	
	public java.lang.String getPattern() {
		return getStr("pattern");
	}

	public M setPath(java.lang.String path) {
		set("path", path);
		return (M)this;
	}
	
	public java.lang.String getPath() {
		return getStr("path");
	}

	public M setUserId(java.lang.Integer userId) {
		set("userId", userId);
		return (M)this;
	}
	
	public java.lang.Integer getUserId() {
		return getInt("userId");
	}

	public M setGmtCreate(java.util.Date gmtCreate) {
		set("gmtCreate", gmtCreate);
		return (M)this;
	}
	
	public java.util.Date getGmtCreate() {
		return get("gmtCreate");
	}

	public M setIsDeleted(java.lang.Boolean isDeleted) {
		set("isDeleted", isDeleted);
		return (M)this;
	}
	
	public java.lang.Boolean getIsDeleted() {
		return get("isDeleted");
	}

	public M setGmtModified(java.util.Date gmtModified) {
		set("gmtModified", gmtModified);
		return (M)this;
	}
	
	public java.util.Date getGmtModified() {
		return get("gmtModified");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public M setCommentId(java.lang.Integer commentId) {
		set("commentId", commentId);
		return (M)this;
	}
	
	public java.lang.Integer getCommentId() {
		return getInt("commentId");
	}

	public M setIsUsing(java.lang.Boolean isUsing) {
		set("isUsing", isUsing);
		return (M)this;
	}
	
	public java.lang.Boolean getIsUsing() {
		return get("isUsing");
	}

	public M setPv(java.lang.Integer pv) {
		set("pv", pv);
		return (M)this;
	}
	
	public java.lang.Integer getPv() {
		return getInt("pv");
	}

}
