package baseball.controller;

import baseball.model.GameStatusModel;
import baseball.service.NumberGeneratorService;
import baseball.service.ResultCheckService;
import baseball.view.InputView;
import baseball.view.OutputView;
import baseball.view.ReGameView;

public class BaseballController {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final ReGameView reGameView = new ReGameView();
    private final NumberGeneratorService numberGeneratorService = new NumberGeneratorService();
    private final ResultCheckService resultCheckService = new ResultCheckService();


    public void run() {

        while (true) {
            String answer = numberGeneratorService.generateNumbers();
            while (true) {
                String user = inputView.getUserInput();
                GameStatusModel result = resultCheckService.judgeResult(user, answer);
                outputView.resultOutput(result);

                if (result.isWin()) {
                    break;
                }
            }

            int userInput = reGameView.reGame();
            if (userInput == 2) {
                break;
            }
        }



    }
}
