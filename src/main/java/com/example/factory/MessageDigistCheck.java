package com.example.factory;

import java.security.MessageDigest;

/**
 * Created by krishna_hotha on 4/16/15.
 */
public class MessageDigistCheck {

	private MessageDigest digest1;
	private MessageDigest digest2;

	public MessageDigest getDigest1() {
		return digest1;
	}

	public void setDigest1(MessageDigest digest1) {
		this.digest1 = digest1;
	}

	public MessageDigest getDigest2() {
		return digest2;
	}

	public void setDigest2(MessageDigest digest2) {
		this.digest2 = digest2;
	}

	public void digest(String msg) {
		System.out.println("Using digest1");
		digest(msg, digest1);

		System.out.println("Using digest2");
		digest(msg, digest2);

		System.out.println("Checking equality" + (digest1 == digest2));
	}

	private void digest(String msg, MessageDigest digest) {
		System.out.println("Using alogrithm: " + digest.getAlgorithm());
		digest.reset();
		byte[] bytes = msg.getBytes();
		byte[] out = digest.digest(bytes);
		System.out.println(out);
	}

}
