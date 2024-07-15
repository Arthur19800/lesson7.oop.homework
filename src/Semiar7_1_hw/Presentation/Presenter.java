package Semiar7_1_hw.Presentation;


import Semiar7_1_hw.Operations.Model;
import Semiar7_1_hw.Operations.Divide;
import Semiar7_1_hw.Operations.Multiply;
import Semiar7_1_hw.Operations.Subtract;
import Semiar7_1_hw.Operations.Summarize;
import Semiar7_1_hw.View.UI;
import Semiar7_1_hw.Logging.Log;
import Semiar7_1_hw.Logging.Logtxt;

public class Presenter <T extends Model>{
    UI v;
    T model;


    public Presenter(UI v, T model) {
        this.model = model;
        this.v = v;
    }


    public void runOperation() {
        Log log = new Logtxt();
        String txt = "";
        Double x = v.inputDouble.apply("Введите первое число: ");
        Double y = v.inputDouble.apply("Введите второе число: ");
        int choice = v.getChoice();
        switch (choice) {
            case 1: {
                Summarize model = new Summarize();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 2: {
                Subtract model = new Subtract();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 3: {
                Multiply model = new Multiply();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 4: {
                Divide model = new Divide();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
        }
        log.writeFile(txt, "Saving.txt");
    }

}
