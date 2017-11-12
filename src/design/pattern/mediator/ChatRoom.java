package design.pattern.mediator;

import java.util.Date;

public class ChatRoom {
	public static void showMessage(User user, String message) {
		System.out.println(user.getName() + " [ " + new Date().toString() + " ] : " + message);
	}
}
