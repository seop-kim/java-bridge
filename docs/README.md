# 다리 건너기 게임
## 기능 목록

### Business

- [X] player에게 입력 받은 값을 int로 변환한다.
- [X] player에게 입력 받은 다리의 사이즈가 정상 범위의 값인지 확인한다.
- [X] 게임 진행을 위해 player에게 입력 받은 값이 정상인지 확인한다. (진행을 위해서는 U,D,R,Q 만 가능)

- [X] 입력 받은 다리 사이즈만큼 위 아래 두 칸으로 나누어진 다리를 생성한다.
- [X] 다리 생성 시 위 아래 중 통과할 수 있는 칸을 랜덤 값을 통해 구분한다. (U,D로 구분)
- [X] 다리 생성 시 1과 0의 값을 Enum을 사용하여 위, 아래로 구분한다.


- [X] 이동을 위해 player가 U, D 을 입력하여 통과가 되면 이동거리를 1 증가시키고 현재 다리의 상황을 보여준다.
- [X] 통과를 하지 못하면 현재 다리 상황을 보여주고 이동 거리를 0으로 초기화하고 재시작 여부를 받는다.
- [X] 재시작 여부에서 R을 입력하면 다리를 건너는 시작 부분부터 다시 시작한다.
- [X] 재시작 여부에서 Q를 입력하면 게임을 종료하고 최종 결과 화면을 보여준다.
- [X] 다리를 모두 통과하였다면 게임을 종료하고 최종 결과 화면을 보여준다. 

### UI

#### InputView

- [X] player에게 다리 크기를 입력 받는다. (정수)
- [X] player에게 이동할 칸의 위치를 입력 받는다.
- [X] player에게 게임 재시작 여부를 입력 받는다.

#### OutputView

- [X] 현재 다리의 상황을 보여준다.
    - [X] 다리의 상황을 보여줄때는 이동에 성공한 거리만큼만 다리의 상황을 보여준다.
- [X] 게임이 종료되면 최종 결과를 보여준다.
- [X] Error 메세지를 출력한다.


#### Resource
- [X] Game에서 player에게 사용할 메세지 상수 집합
- [X] Game 기능에서 사용할 메세지 상수 집합
- [X] Error 발생 시 사용할 상수 집합



## 기능 요구 사항

- player 입력 요구사항
    - 다리의 길이를 정할 3~20 사이의 정수를 입력한다.
    - 다리를 건너기 위해 U(위) , D(아래) 중 선택하여 입력한다.
    - 다리를 건너는 중 실패하면 재시작 여부를 위해 R(재시작) , Q(종료) 중 선택하여 입력한다.
    - 만약 잘 못 된 값을 입력하면 `[ERROR]`로 시작하는 에러메세지를 통해 문제 사항을 알려준 뒤 에러가 발생된 부분에서 부터 다시 시작한다. (재귀호출)
    - 소문자도 잘 못 입력한 것으로 간주한다.


- 다리 생성 요구 사항
    - 다리 생성은 player가 입력한 길이만큼 생성이 되며 다리는 위 아래 두 칸으로 이루어진다.
    - 다리는 List< String > 로 생성한다.
    - 다리는 위 아래 칸 중 한 개만 건널 수 있는 다리이며 위로 갈 수 있으면 U, 아래이면 D이다.


- 게임 진행 요구 사항
    - player는 다리를 건널 때 실패를 하게 된다면 재시작 여부를 확인할 수 있으며 재시작을 하게 된다면 동일한 다리에서 처음부터 게임을 시작한다.
    - player가 한 칸의 다리를 건넜다면 현재 다리의 형태를 print 한다.
    - player가 모든 다리를 건너는데 성공 혹은 포기 했다면 게임 성공 여부를 띄우고 총 시도한 횟 수를 띄어준다.
    - 총 시도한 횟 수는 시작 횟 수 이다.


- 제공되는 `InputView`, `OutputView`, `BridgeGame`, `BridgeMaker`, `BridgeRandomNumberGenerator` 를 사용해야 한다.
- 사용자 입력 요청은 `InputView`에서만 가능하다.

## 구현 제한 사항

- else 예약어를 사용하지 않는다.
- Business 로직과 UI 로직은 분리 되어야 한다.
- 함수의 길이는 10라인을 넘기지 않는다. (줄 공백 포함)
- 함수의 파라미터는 3개까지만 허용한다.
- `OutputView`,`BridgeGame`의 함수 이름은 변경이 불가능 하다.
- `BridgeMaker`의 필드(인스턴스 변수)를 변경할 수 없으며 함수의 파라미터, 반환 값을 변경할 수 없다.
- `BridgeRandomNumberGenerator`, `BridgeNumberGenerator` 클래스의 코드는 변경이 불가능 하다.

## 특이사항

