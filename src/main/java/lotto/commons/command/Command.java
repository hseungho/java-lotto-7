package lotto.commons.command;

import camp.nextstep.edu.missionutils.Console;
import lotto.commons.lang.ProgramExitException;

public class Command {

    public static String read() {
        String read = Console.readLine();
        handleCommands(read);
        return read;
    }

    private static void handleCommands(String read) {
        if ("exit".equals(read)) {
            Command.close();
            throw new ProgramExitException();
        }
    }

    public static void close() {
        Console.close();
    }

}