package PaqC01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DiseñoContenedores extends JFrame {
    private JLabel NumId;
    private JTextField NumIdtext;
    private JLabel Peso;
    private JTextField Pesotext;
    private JLabel Desc;
    private JTextArea Desctext;
    private JLabel Emp_rem;
    private JLabel Emp_rec;
    private JTextField Emp_rectext;
    private JLabel Pais_proc;
    private JComboBox Pais_procbox;
    private JLabel Prior;
    private JRadioButton a1RadioButton;
    private JRadioButton a2RadioButton;
    private JRadioButton a3RadioButton;
    private JCheckBox Insp_Aduanas;
    private JPanel mainPanel;
    private JTextField Emp_remtext;
    private JLabel Ops;
    private JButton Ap_button;
    private JButton Desap_button;
    private JTextField numCol_text;
    private JButton ContData_button;
    private JTextField ID_text;
    private JButton Cuantos_button;
    private JComboBox cuantosPais_box;
    private JTextField Cant_text;
    private JPanel auxPanel;
    private JLabel Estado;
    private JTextArea Estad_text;
    private JLabel Logo;

    private String var1;
    private String var2;
    private String var3;

    public String getVar1() {
        return var1;
    }

    public DiseñoContenedores() {
        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(1500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        ContData_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DiseñoContenedoresP2 newframe = new DiseñoContenedoresP2();

                newframe.setVisible(true);


            }
        });
            JTextField NumIdText= new JTextField(10);
            NumIdText.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    DiseñoContenedoresP2 aux= new DiseñoContenedoresP2(NumIdText);

                }
            });




    }

    public DiseñoContenedores(JLabel logo) throws HeadlessException {
        Logo = logo;
        Logo.setSize(150, 128);
    }

    public static void main(String[] args) {
        DiseñoContenedores cont = new DiseñoContenedores();

    }
}
