package net.DroidFX01.common;

import java.util.Scanner;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setAlgorithm("PBEWithMD5AndDES");

		System.out.println("Enter encryption password to be used:");
		String encryptionPwd = scanner.nextLine();

		encryptor.setPassword(encryptionPwd);

		System.out.println("Enter string to encrypt: ");
		String encryptedString = encryptor.encrypt(scanner.nextLine());

		scanner.close();
		System.out.println("Encrypted string: " + encryptedString
				+ "\nEncrypted with encryption password: " + encryptionPwd);

	}
}
