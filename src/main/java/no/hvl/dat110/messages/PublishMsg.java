package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message = message;
	}

	// TODO:
	// Implement object variables - a topic and a message is required
	private String topic;
	private String message;
	
	public String getTopic(){
		return topic;
	}
	public void setTopic(String topic){
		this.topic = topic;
	}
	

	


	@Override
	public String toString() {
		return "Message [type=" + super.getType() + ", user=" + super.getUser() + ", topic=" + topic + ", message=" + message + "]";
	};
	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
	
	public String getMessage() {
		return message;
		//throw new UnsupportedOperationException(TODO.method());
	}
	public void setMessage(String message){
		this.message = message;
	}
}
