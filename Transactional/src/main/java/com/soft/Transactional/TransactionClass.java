package com.soft.Transactional;

public class TransactionClass {
	
	private SenderEntity send;
	private ReceiverEntity receive;
	
	public SenderEntity getSend() {
		return send;
	}
	public void setSend(SenderEntity send) {
		this.send = send;
	}
	public ReceiverEntity getReceive() {
		return receive;
	}
	public void setReceive(ReceiverEntity receive) {
		this.receive = receive;
	}
	

}
