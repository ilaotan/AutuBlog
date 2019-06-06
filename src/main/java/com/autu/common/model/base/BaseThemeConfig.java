package com.autu.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseThemeConfig<M extends BaseThemeConfig<M>> extends Model<M> implements IBean {

	public M setPkId(java.lang.Integer pkId) {
		set("pkId", pkId);
		return (M)this;
	}
	
	public java.lang.Integer getPkId() {
		return getInt("pkId");
	}

	public M setThemeName(java.lang.String themeName) {
		set("themeName", themeName);
		return (M)this;
	}
	
	public java.lang.String getThemeName() {
		return getStr("themeName");
	}

	public M setPath(java.lang.String path) {
		set("path", path);
		return (M)this;
	}
	
	public java.lang.String getPath() {
		return getStr("path");
	}

	public M setPattern(java.lang.String pattern) {
		set("pattern", pattern);
		return (M)this;
	}
	
	public java.lang.String getPattern() {
		return getStr("pattern");
	}

	public M setIsUsing(java.lang.Boolean isUsing) {
		set("isUsing", isUsing);
		return (M)this;
	}
	
	public java.lang.Boolean getIsUsing() {
		return get("isUsing");
	}

	public M setIsDefault(java.lang.Boolean isDefault) {
		set("isDefault", isDefault);
		return (M)this;
	}
	
	public java.lang.Boolean getIsDefault() {
		return get("isDefault");
	}

}