package kr.swu.spring_basic.di.no_di;

public class NoDiMain {
    public static void main(String[] args) {
        Singer singer = new Singer();
        // stage 생성 시 singer가 필요하다 : stage는 singer에 의존한다.
        Stage stage = new Stage(singer);
        stage.showStage();
        BroadcastSystem broadcastSystem = new BroadcastSystem(stage);
        broadcastSystem.broadcast();
    }
}
