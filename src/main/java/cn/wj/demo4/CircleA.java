package cn.wj.demo4;

/**
 * User: WJ
 * Date: 2017/12/2
 */
public class CircleA {
    private CircleB circleB;

    public CircleA() {
    }

    public CircleA(CircleB circleB) {
        this.circleB = circleB;
    }

    public void a(){
        circleB.b();
    }
}
