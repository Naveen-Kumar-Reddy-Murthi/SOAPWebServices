package org.mnr.ws;

import javax.xml.ws.Endpoint;

public class S5_PublishingWSOnStandaloneJavaClass {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9292/MartCatelog", new S4_StandardWebServiceWriting());

	}

}
