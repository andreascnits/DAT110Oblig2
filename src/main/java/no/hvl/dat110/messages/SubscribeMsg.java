package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 

    public SubscribeMsg(String user, String topic) {
		super(MessageType.SUBSCRIBE, user);
		this.topic = topic;
    }

	// TODO:
	// Implement object variables - a topic is required
	private String topic;
	
	
	public String getTopic(){
		return topic;
	}
	public void setTopic(String topic){
		this.topic = topic;
	}
	
	


	@Override
	public String toString() {
		return "Message [type=" + super.getType() + ", user=" + super.getUser() + ", topic=" + topic + "]";
	};
	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
		
}
