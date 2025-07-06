package baseball;
import baseball.controller.BaseballController;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
public class Application {
    public static void main(String[] args) {

        //TODO: 숫자 야구 게임 구현
        BaseballController baseballController = new BaseballController();
        baseballController.run();
    }
}
