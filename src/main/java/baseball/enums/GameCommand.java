package baseball.enums;

public enum GameCommand {
    RESTART(1),
    QUIT(2);

    private final int code;

    GameCommand(int code) {
        this.code = code;
    }

    public static GameCommand fromCode(int code) {
        for (GameCommand gameCommand : GameCommand.values()) {
            if (gameCommand.code == code) {
                return gameCommand;
            }
        }
        throw new IllegalArgumentException();
    }


}
