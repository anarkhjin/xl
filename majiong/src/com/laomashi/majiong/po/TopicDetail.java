package com.laomashi.majiong.po;

import java.util.List;

public class TopicDetail {
TbTopic topic;
List<TbContent> contents;
public TbTopic getTopic() {
	return topic;
}
public void setTopic(TbTopic topic) {
	this.topic = topic;
}
public List<TbContent> getContents() {
	return contents;
}
public void setContents(List<TbContent> contents) {
	this.contents = contents;
}

}
