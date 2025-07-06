package baseball.view;

import baseball.model.GameStatusModel;

public class OutputView {

    public void resultOutput(GameStatusModel gameStatusModel) {
        int strike = gameStatusModel.getStrike();
        int ball = gameStatusModel.getBall();

        if(strike == 3) {
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        } else if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else if (strike != 0 && ball == 0) {
            System.out.println(strike+ "스트라이크");
        } else if (strike == 0 && ball != 0) {
            System.out.println(ball + "볼");
        } else if (strike != 0 && ball != 0) {
            System.out.println(ball + "볼 " + strike + "스트라이크");
        }
    }
}
