package bridge.view;

import bridge.resource.GameConstant;
import bridge.resource.GameMessage;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {
    public void start() {
        System.out.println(GameMessage.START_MSG);
    }

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(String topMap, String bottomMap) {
        System.out.println(GameConstant.OPEN + topMap + GameConstant.CLOSE);
        System.out.println(GameConstant.OPEN + bottomMap + GameConstant.CLOSE + "\n");
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult(String successOrNot, int count) {
        System.out.printf(GameMessage.GAME_CLEAR_WHETHER, successOrNot);
        System.out.printf(GameMessage.TOTAL_TRY_COUNT, count);
    }

    public static void printError(String msg) {
        System.out.println(msg);
    }
}
