package com.example.designs.command;

/**
 * Created by krishna_hotha on 5/8/15 2015.
 */
public class RemoteControlTest {

	public static void main(String[] args) {

		SimpleRemote simpleRemote = new SimpleRemote();// This is invoker

		Light light = new Light(); // this is receiver

		GarageDoor garageDoor = new GarageDoor();

		simpleRemote.setCommand(light::on);// invoker will get the command
		simpleRemote.pressButton();

		simpleRemote.setCommand(() -> {
			garageDoor.open();
		});// invoker will get the command
		simpleRemote.pressButton();

	}
}
