package kw03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import layout.TableLayout;
import layout.TableLayoutConstants;

@SuppressWarnings("serial")
public class ChatFenster extends JFrame {
	public Chat chat;
	private JButton button = new JButton("Send");
	private JTextArea textArea = new JTextArea();
	private JTextField message = new JTextField();
	private double size[][] = { { 10, 410, TableLayoutConstants.FILL }, { 10, 335, 5, 25, 5, 50, TableLayoutConstants.FILL } };

	public ChatFenster(String name, Observer o) {
		super("ChatSession Username: " + name);
		this.chat = new Chat(name, o);
		this.setSize(450, 480);
		this.setLayout(new TableLayout(size));
		this.add(button, "1,5");
		this.add(message, "1,3");
		this.add(textArea, "1,1");
		this.setVisible(true);
		textArea.setEditable(false);
		this.getRootPane().setDefaultButton(button);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				chat.send(message.getText());
			}
		});
		chat.send("has logged in");
	}
	
	public void sync(String text){
		text = chat.getText() + text;
		chat.setText(text);
		textArea.setText(text);
	}
}
