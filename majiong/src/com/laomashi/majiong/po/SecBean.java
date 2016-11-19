package com.laomashi.majiong.po;

import java.util.List;

public class SecBean {
	
	TbSection sec;
   List<TbSubsection> subs;
public TbSection getSec() {
	return sec;
}
public void setSec(TbSection sec) {
	this.sec = sec;
}
public List<TbSubsection> getSubs() {
	return subs;
}
public void setSubs(List<TbSubsection> subs) {
	this.subs = subs;
}
   
}
