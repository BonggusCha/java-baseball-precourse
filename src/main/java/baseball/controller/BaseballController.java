package baseball.controller;

import baseball.model.GameStatusModel;
import baseball.service.NumberGeneratorService;
import baseball.service.ResultCheckService;
import baseball.view.InputView;
import baseball.view.OutputView;
import baseball.view.ReGameView;
import enums.GameCommand;

public class BaseballController {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final ReGameView reGameView = new ReGameView();
    private final NumberGeneratorService numberGeneratorService = new NumberGeneratorService();
    private final ResultCheckService resultCheckService = new ResultCheckService();


    public void run() {


        do {
            playSingleGame();
        } while (shouldRestart());
        }


        private void playSingleGame() {
            String answer = numberGeneratorService.generateNumbers();

            while (true) {
                String userInput = inputView.getUserInput();
                GameStatusModel result = resultCheckService.judgeResult(userInput, answer);
                outputView.resultOutput(result);

                if (result.isWin()) {
                    break;
                }
            }
        }

        private boolean shouldRestart() {
            int input = reGameView.reGame();
            GameCommand command = GameCommand.fromCode(input);
            return command == GameCommand.RESTART;
        }



    }
