package baseball.service;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.Set;

public class NumberGeneratorService {

    public String generateNumbers() {

        Set<Integer> checkNum = new HashSet<>();
        StringBuilder numbers = new StringBuilder();
        while (checkNum.size() != 3) {
            int tempValue = Randoms.pickNumberInRange(1,9);
            if (!checkNum.contains(tempValue)) {
                numbers.append(tempValue);
                checkNum.add(tempValue);
            }
        }

        String answer = numbers.toString();

        return answer;
    }

}
