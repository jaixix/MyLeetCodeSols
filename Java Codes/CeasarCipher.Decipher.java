import java.util.*;
import java.io.*;
public class CaesarCipherNQT {
	String CustomCaesarCipher(int key, String message) {
		String cipher="";
		for(int i=0;i<message.length();i++) {
			if(message.charAt(i) != ' ') {
				cipher += (char)(((int)message.charAt(i))+key);
			}
			else
				cipher += message.charAt(i);
		}
//		System.out.println(cipher);
		return cipher;
	}
	
	String decryptCipher(int key, String cipher) {
		String message="";
		for(int i=0;i<cipher.length();i++) {
			if(cipher.charAt(i) != ' ') {
				message += (char)(((int)cipher.charAt(i))-key);
			}
			else
				message += cipher.charAt(i);
		}
//		System.out.println(message);
		return message;
	}
	public static void main(String[] args) {
		CaesarCipherNQT obj = new CaesarCipherNQT();
		System.out.println("Ciphered Text : "+obj.CustomCaesarCipher(1, "All the best : 01"));
		System.out.println("Deciphered Text :"+obj.decryptCipher(1, obj.CustomCaesarCipher(1, "All the best : 01")));
	}
}
