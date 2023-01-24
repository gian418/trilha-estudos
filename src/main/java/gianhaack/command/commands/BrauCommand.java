package gianhaack.command.commands;

import gianhaack.command.Command;

public class BrauCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Brau, faz lá um café pro time.");
    }
}
