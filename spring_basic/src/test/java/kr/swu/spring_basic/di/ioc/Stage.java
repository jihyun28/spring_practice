package kr.swu.spring_basic.di.ioc;

public class Stage {
    private Singer singer;

    public Stage(Singer singer){
        this.singer = singer;
    }

    public void showStage(){
        System.out.println("무대에서");
        singer.sing();
    }
}
