package cn.wj.demo4;

/**
 * User: WJ
 * Date: 2017/11/27
 */
public class BooleanTestBean {
    private boolean success;
    public void setSuccess(boolean success){
        this.success = success;
    }
    public boolean isSuccess(){
        return success;
    }

    public void saySuccess(){
        System.out.println(success);
    }
}
