package cn.wj.demo4;

/**
 * User: WJ
 * Date: 2017/12/2
 */
public class CircleB {
    private CircleC circleC;

    public CircleB() {
    }

    public CircleB(CircleC circleC) {
        this.circleC = circleC;
    }

    public void b(){
        circleC.c();
    }
}
