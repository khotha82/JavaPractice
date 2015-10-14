package com.example.designs.command;

/**
 * Created by krishna_hotha on 5/8/15 2015.
 */
public class SimpleRemote {

	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {

		this.command = command;
        command.execute();
	}

	public void pressButton() {

		command.execute();
	}
}
