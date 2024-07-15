package Semiar7_1_hw.View;

import Semiar7_1_hw.Operations.Model;
import Semiar7_1_hw.Presentation.Presenter;

public class program {
    public static void main(String[] args) {

        Presenter presenter = new Presenter(new UI(), new Model());

        presenter.runOperation();

    }
}
