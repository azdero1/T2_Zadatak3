package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.util.Arrays;
import java.util.Comparator;

public class Controller {
    public TextField unos;
    public TextField ipis;


    public void prepravi(ActionEvent actionEvent) {
        String recenica = unos.getText();
        String najduzaRijec, novaRijec, novaRecenica;

        najduzaRijec = (Arrays.stream(recenica.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));

        novaRijec = najduzaRijec.toUpperCase();
        novaRecenica = recenica.replace(najduzaRijec, novaRijec);

        ipis.setText(novaRecenica);


    }

}
