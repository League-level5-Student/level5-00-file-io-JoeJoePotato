package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	ArrayList<String> tasks=new ArrayList<String>();
	JButton add=new JButton("add task");
	JButton view=new JButton("view tasks");
	JButton remove=new JButton("remove tasks");
	JButton save=new JButton("save list");
	JButton load=new JButton("load list");
	JFrame frame=new JFrame("To do list interface");
	JPanel pane=new JPanel();
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
public static void main(String[] args) {
	ToDoList td=new ToDoList();
	td.setup();
	
}
	public void setup() {

frame.add(pane);
add.addActionListener(this);
pane.add(add);
view.addActionListener(this);
pane.add(view);
remove.addActionListener(this);
pane.add(remove);
save.addActionListener(this);
pane.add(save);
load.addActionListener(this);
pane.add(load);
	
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton j=(JButton) e.getSource();
		if(j==add) {
			String t=JOptionPane.showInputDialog("What task would you like to add?" );
		tasks.add(t);
		}else if(j==view) {
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println(tasks.get(i));
			}
		}else if(j==remove) {
			String r=JOptionPane.showInputDialog("What task would you like to remove?" );
			for (int i = 0; i < tasks.size(); i++) {
				if(tasks.get(i)==r) {
					tasks.remove(i);
					break;
				}
			}
		}
		
	}
	
}
