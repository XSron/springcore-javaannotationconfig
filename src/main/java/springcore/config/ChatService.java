package springcore.config;

import org.springframework.stereotype.Component;

@Component
public class ChatService {
	public void sendText(String text, String to) {
		System.out.println("Send " + text + " to " + to);
	}
}
