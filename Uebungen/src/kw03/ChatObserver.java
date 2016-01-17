package kw03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import layout.*;

public class ChatObserver extends JFrame implements Observer {
	private static ArrayList<ChatFenster> memberList;
	private String text = "";
	private JButton button = new JButton("Login");
	private JTextField userName = new JTextField();
	private JLabel label = new JLabel("LoginName: ");
	private double size[][] = { {10, 80, 5, 250, 5, 75,  TableLayoutConstants.FILL }, {10, 25, 25, TableLayoutConstants.FILL } };

	public ChatObserver() {
		super("Der beste Chatraum ever");
		this.setSize(450, 100);
		this.setLayout(new TableLayout(size));
		this.add(button, "5,1");
		this.add(userName, "3,1");
		this.add(label, "1,1");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.getRootPane().setDefaultButton(button);
		ChatObserver o = this;
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(userName.getText());
				memberList.add(new ChatFenster(userName.getText(), o));
			}
		});
	}

	@Override
	public void update(Observable o, Object arg) {
		// System.out.println((String) arg);
		text += o.toString() + ": " + (String) arg + "\n";
		for (ChatFenster chatFenster : memberList) {
			chatFenster.sync(text);
		}
	}

	public static void main(String[] args) {
		memberList = new ArrayList<ChatFenster>();
		ChatObserver a = new ChatObserver();
		// memberList.add(new Chat("PU55YD35TR0Y3R", a));
		// memberList.add(new Chat("Person 2", a));
		// memberList.get(0).send("LOL");
		// memberList.get(0).send("LOL");
		// memberList.get(1).send("LOL");
		// memberList.get(0).send("LOL");
		// memberList.get(1).ausgabeText();
	}
}
