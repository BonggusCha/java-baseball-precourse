package baseball.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.HashSet;
import java.util.Set;

public class InputView {

    public String getUserInput() {
        System.out.print("숫자를 입력해주세요: ");

        String userNum = Console.readLine();
        if (!userNum.matches("\\d{3}")) {
            throw new IllegalArgumentException();
        }

        Set<Character> checkSet = new HashSet<>();
        for (char c : userNum.toCharArray()) {
            if (checkSet.contains(c)) {
                throw new IllegalArgumentException();
            }
            if (Integer.parseInt(c + "") >= 1 && Integer.parseInt(c + "") <= 9) {
                checkSet.add(c);
            } else {
                throw new IllegalArgumentException();
            }
        }

        return userNum;
    }



}
