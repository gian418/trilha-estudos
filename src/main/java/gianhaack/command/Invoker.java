package gianhaack.command;

import gianhaack.command.commands.AnrriCommand;
import gianhaack.command.commands.BrauCommand;
import gianhaack.command.commands.LuhCommand;

import java.util.HashMap;
import java.util.Map;

public class Invoker {

    private static Map<String, Command> comandos = new HashMap<String, Command>();

    static {
        comandos.put("Brau", new BrauCommand());
        comandos.put("Luh", new LuhCommand());
        comandos.put("Anrri", new AnrriCommand());
    }

    public static void invoke(String comando) {
        try {
            comandos.get(comando).execute();
        } catch (Exception ex) {
            System.out.println("Poxa, não conheço esse comando =(");
        }
    }
}
