package baseball.service;

import baseball.model.GameStatusModel;
import baseball.view.OutputView;

import java.util.HashSet;
import java.util.Set;

public class ResultCheckService {

    private final OutputView outputView = new OutputView();

    public GameStatusModel judgeResult(String user, String answer) {

        Set<Character> checkSet = new HashSet<>();
        char[] userArray = user.toCharArray();
        char[] answerArray = answer.toCharArray();
        for (Character character : answer.toCharArray()) {
            checkSet.add(character);
        }
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < userArray.length; i++) {
            if (checkSet.contains(userArray[i])) {
                if (userArray[i] == answerArray[i]) {
                    strike++;
                } else {
                    ball++;
                }
            }
        }

        return new GameStatusModel(strike, ball);

    }
}
