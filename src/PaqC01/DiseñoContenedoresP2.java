package PaqC01;

import javax.swing.*;
import java.awt.*;

public class DiseñoContenedoresP2 extends  JFrame {
    private JLabel NumID;
    private JLabel Peso;
    private JLabel Descripcion;
    private JLabel EmpRem;
    private JLabel EmpRec;
    private JTextField NumID_text;
    private JTextField Peso_text;
    private JTextArea Descripcion_text;
    private JTextField EmpRem_text;
    private JTextField EmpRec_text;
    private JLabel Pais;
    private JTextField Pais_text;
    private JLabel Prioridad;
    private JRadioButton a1RadioButton;
    private JRadioButton a2RadioButton;
    private JRadioButton a3RadioButton;
    private JCheckBox Inspeccionado;
    private JPanel mainPanel;

    public DiseñoContenedoresP2(JTextField numID_text) throws HeadlessException {
        NumID_text = numID_text;
    }

    public DiseñoContenedoresP2() {
        DiseñoContenedores aux= new DiseñoContenedores();
        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(800, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);



    }

    public static void main(String[] args) {
        DiseñoContenedoresP2 cont2 = new DiseñoContenedoresP2();
    }
}
