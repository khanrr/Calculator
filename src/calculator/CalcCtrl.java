package calculator;

public class CalcCtrl {
    private final CalcMdl model;

    public CalcCtrl() {
        model = new CalcMdl();
        CalcView view = new CalcView();
    }

    public void setOne(){
        model.setOne();
    }
}
