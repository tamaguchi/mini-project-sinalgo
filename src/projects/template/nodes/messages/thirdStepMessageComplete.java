package projects.template.nodes.messages;

import sinalgo.nodes.messages.Message;

public class thirdStepMessageComplete extends sinalgo.nodes.messages.Message{

	private int _data;
	
	public thirdStepMessageComplete(int data) {
		_data = data;
		this.setMessageId(1);
	}

	@Override
	public Message clone() {
		// TODO Auto-generated method stub
		return this;
		
	}
	
	public int get_data() {
		return _data;
	}

}
