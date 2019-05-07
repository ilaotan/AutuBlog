package com.autu.common.model.entity;

import java.util.List;

import com.autu.common.model.entity.base.BaseArticle;
import com.jfinal.kit.PropKit;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Article extends BaseArticle<Article> {

	public static Integer STATE_DRAFT=0;
	public static Integer STATE_PUBLISH=1;
	public static Integer STATE_DISCARD=2;

	private List<Meta> metas;

	public List<Meta> getMetas() {
		return metas;
	}

	public void setMetas(List<Meta> metas) {
		this.metas = metas;
	}
	
	public String getUrl() {
		String projectPath=PropKit.get("projectPath");
		if(!projectPath.endsWith("/")) {
			projectPath+="/";
		}
		return projectPath+"article/"+getIdentify();
	}
	
	public Meta getFirstMeta() {
		if( getMetas()==null|| getMetas().isEmpty()) {
			return new Meta();
		}
		return getMetas().get(0);
	}
	
}
