package calcolatrice;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Mauro on 20/04/2015.
 */
public class CalcolatriceFinestra extends JFrame {
    private JTextField display;
    private CalcolatricePannello  bottoniera;
    private double  operandoCorrente  = 0.0;
    private char    operatoreCorrente = '?';
    private boolean resetDisplay = true;
    public CalcolatriceFinestra(String titolo) {
        super(titolo);
        display = new JTextField();
        bottoniera = new CalcolatricePannello(this);

        add(display, BorderLayout.NORTH);
        add(bottoniera,BorderLayout.CENTER);

        display.setEditable(false);
        display.setFont(new Font("SansSerif",Font.ITALIC,22));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBackground(Color.LIGHT_GRAY);
    }
    public void inseritaCifra( char c ) {
        if (resetDisplay) {
            display.setText("");
            resetDisplay = false;
        }
        display.setText(display.getText() + c);
    }
    public void inseritoPunto() {
        if (resetDisplay) {
            display.setText("");
            resetDisplay = false;
        }
        display.setText(display.getText() + ".");
    }
    public void inseritoOperatore( char c ) {
        if (c == '=') {
            if (operatoreCorrente != '?') {
                double operando = Double.parseDouble(display.getText());
                double risultato =
                        calcolaRisultato(operandoCorrente, operando, operatoreCorrente);
                display.setText(String.valueOf(risultato));
                operatoreCorrente = '?';
                resetDisplay = true;
            }
        } else {
            // Gestire l'operatore
            if (operatoreCorrente == '?') {
                operandoCorrente = Double.parseDouble(display.getText());
            } else {
                double operando = Double.parseDouble(display.getText());
                operandoCorrente =
                        calcolaRisultato(operandoCorrente, operando, operatoreCorrente);
                display.setText(String.valueOf(operandoCorrente));

            }
            operatoreCorrente = c;
            resetDisplay = true;
        }
    }
    private double calcolaRisultato(double op1, double op2, char oper) {
        switch (oper) {
            case '+' : return (op1 + op2);
            case '-' : return (op1 - op2);
            case '*' : return (op1 * op2);
            case '/' : return (op1 / op2);
            default : return 0.0;
        }
    }

}
