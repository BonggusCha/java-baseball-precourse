package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class ReGameView {


    public int reGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        int userInput = Integer.parseInt(Console.readLine());
        return userInput;
    }
}
