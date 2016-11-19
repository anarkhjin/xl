package com.laomashi.majiong.po;

import java.util.List;

public class SubBean {
	 private Long sid;//主板块id
	 private String sname;//主板块名称
	 private List<TbTopic> topics;
	 private  TbSubsection subsection;
	 
	public TbSubsection getSubsection() {
		return subsection;
	}
	public void setSubsection(TbSubsection subsection) {
		this.subsection = subsection;
	}
	public List<TbTopic> getTopics() {
		return topics;
	}
	public void setTopics(List<TbTopic> topics) {
		this.topics = topics;
	}
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

}
