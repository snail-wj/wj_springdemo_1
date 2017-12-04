package cn.wj.demo4;

/**
 * User: WJ
 * Date: 2017/12/2
 */
public class CircleC {
    private CircleA circleA;

    public CircleC() {
    }

    public CircleC(CircleA circleA) {
        this.circleA = circleA;
    }

    public void c(){
        circleA.a();
    }
}
