package by.overone.lesson29;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CommandProvider {

    private static CommandProvider instance;
    private Map<Command, ICommand> commandMap = new HashMap<>();

    private CommandProvider() {
        commandMap.put(Command.LOGIN, new LoginCommand());
        commandMap.put(Command.REGISTRATION, new RegistrationCommand());
        commandMap.put(Command.EXIT, new ExitCommand());
    }

    public CommandProvider getInstance() {
        if (instance == null) {
            instance = new CommandProvider();
        }
        return instance;
    }

    public void execute(String command) {
        Command command1 = Command.valueOf(command.toUpperCase(Locale.ROOT));
        ICommand iCommand = commandMap.get(command1);
        iCommand.execute();
    }
}
