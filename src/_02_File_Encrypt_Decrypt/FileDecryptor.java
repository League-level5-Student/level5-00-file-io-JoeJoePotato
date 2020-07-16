package _02_File_Encrypt_Decrypt;

import javax.swing.JOptionPane;

public class FileDecryptor {
	/*
	 * Decryption is the process of taking encoded or encrypted text or other data
	 * and converting it back into text that you or the computer can read and understand.
	 *
	 * The shift cipher is decrypted by using using the key and shifting back up,
	 * at the end of our encryption example we had our alphabet as:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 *
	 * If we shift it back up by 4 based on the key we used the alphabet is decrypted:
	 *
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 *
	 * "Lipps Asvph" returns to "Hello World"
	 * 
	 * Create a program that opens the file created by FileEncryptor and decrypts
	 * the message, then display it to the user in a JOptionPane.
	 */
	public static void main(String[] args) {
		String e=JOptionPane.showInputDialog("What is the coded message");
		int i=Integer.parseInt(JOptionPane.showInputDialog("what is the key"));
		String neu=new String();
		for (int j = 0; j < e.length(); j++) {
		int p=e.charAt(j)-i;
		if(p<64) {
			p=123-(64-p);
		}
		char c=(char) p;
		neu+=c;
	}
		System.out.println(e);
		System.out.println(neu);
	}
	}



