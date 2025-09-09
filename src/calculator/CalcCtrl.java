package calculator;

public class CalcCtrl {
    private final CalcMdl model;

    public CalcCtrl() {
        model = new CalcMdl();

    }

    public void setN1Zero(){
        model.setN1Zero();
    }

    public void setN2Zero(){
        model.setN2Zero();
    }

    public void setN1One(){
        model.setN1One();
    }

    public void setN2One(){
        model.setN2One();
    }

    public void setN1Two(){
        model.setN1Two();
    }

    public void setN2Two(){
        model.setN2Two();
    }

    public void setN1Three(){
        model.setN1Three();
    }

    public void setN2Three(){
        model.setN2Three();
    }

    public void setN1Four(){
        model.setN1Four();
    }

    public void setN2Four(){
        model.setN2Four();
    }

    public void setN1Five(){
        model.setN1Five();
    }

    public void setN2Five(){
        model.setN2Five();
    }

    public void setN1Six(){
        model.setN1Six();
    }

    public void setN2Six(){
        model.setN2Six();
    }

    public void setN1Seven(){
        model.setN1Seven();
    }

    public void setN2Seven(){
        model.setN2Seven();
    }

    public void setN1Eight(){
        model.setN1Eight();
    }

    public void setN2Eight(){
        model.setN2Eight();
    }

    public void setN1Nine(){
        model.setN1Nine();
    }

    public void setN2Nine(){
        model.setN2Nine();
    }

    public void clearNumbers(){
        model.clearNumbers();
    }

    public void setPlus(){
        model.setPlus();
    }

    public void setMinus(){
        model.setMinus();
    }

    public void setTimes(){
        model.setTimes();
    }

    public void setDivide(){
        model.setDivide();
    }

    public String getResult(){
        return model.getResult();
    }
}