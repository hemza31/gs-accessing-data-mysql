package com.laribi.easycots.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Message {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer messageId;
	private String messageDate;
	private String messageFrom;
	private String messageTitle;
	private String messageContent;

	public Message(Integer messageId, String messageDate, String messageFrom, String messageTitle, String messageContent) {
		this.messageId = messageId;
		this.messageDate = messageDate;
		this.messageFrom = messageFrom;
		this.messageTitle = messageTitle;
		this.messageContent = messageContent;
	}

	public Message() {
	}

	public Integer getMessageId() {
		return messageId;
	}

	public String getMessageDate() {
		return messageDate;
	}

	public void setMessageDate(String messageDate) {
		this.messageDate = messageDate;
	}

	public String getMessageFrom() {
		return messageFrom;
	}

	public void setMessageFrom(String messageFrom) {
		this.messageFrom = messageFrom;
	}

	public String getMessageTitle() {
		return messageTitle;
	}

	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	@Override
	public String toString() {
		return "Message{" +
				"messageId=" + messageId +
				", messageDate='" + messageDate + '\'' +
				", messageFrom='" + messageFrom + '\'' +
				", messageTitle='" + messageTitle + '\'' +
				", messageContent='" + messageContent + '\'' +
				'}';
	}
}
