package baseball.model;

public class GameStatusModel {

    private int strike;
    private int ball;

    public GameStatusModel(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }
    public int getStrike() {
        return strike;
    }
    public int getBall() {
        return ball;
    }

    public boolean isWin() {
        if (strike == 3) {
            return true;
        }
        return false;
    }

}
