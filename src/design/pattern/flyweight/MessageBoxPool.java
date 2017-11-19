package design.pattern.flyweight;

import java.util.HashMap;

public class MessageBoxPool {
	private static final HashMap<String, MessageBox> messageBoxMap = new HashMap<>();
	
	public static MessageBox getMessageBox(String type){
		MessageBox messageBox = messageBoxMap.get(type);
		if(messageBox == null){
			messageBox = new MessageBox(type);
			messageBoxMap.put(type, messageBox);
			System.out.println("Create message box: " + type);
		} else {
			System.out.println("Get message box: " + type + " from pool");
		}
		
		return messageBox;
	}
}
