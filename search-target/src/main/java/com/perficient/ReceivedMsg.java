package com.perficient;

public class ReceivedMsg {

	private String metadata;
	private String body;

	public ReceivedMsg() {
	}

	public ReceivedMsg(String metadata, String body) {
		this.metadata = metadata;
		this.body = body;
	}

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return String.format("ReceivedMsg{metadata=%s, body=%s}", getMetadata(), getBody());
	}

}
