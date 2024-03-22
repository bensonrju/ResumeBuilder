import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Resume {
    private JPanel main;
    private JPanel Start;
    private JPanel Personal;
    private JPanel Education;
    private JPanel Work;
    private JButton startButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton nextButton;
    private JButton backButton;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JButton nextButton2;
    private JButton backButton2;
    private JButton nextButton1;
    private JButton backButton1;
    private JPanel skills;
    private JTextArea textArea1;
    private JButton nextButton3;
    private JButton backButton3;
    private JPanel certifications;
    private JTextArea textArea2;
    private JButton finishButton;
    private JButton backButton4;
    private JPanel finalPanel;

    Resume()
    {

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Start.setVisible(false);
                Personal.setVisible(true);
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Start.setVisible(true);
                Personal.setVisible(false);
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Personal.setVisible(false);
                Education.setVisible(true);
            }
        });
        backButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Personal.setVisible(true);
                Education.setVisible(false);
            }
        });
        nextButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Education.setVisible(false);
                Work.setVisible(true);
            }
        });
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Education.setVisible(true);
                Work.setVisible(false);
            }
        });
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Work.setVisible(false);
                skills.setVisible(true);
            }
        });
        backButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Work.setVisible(true);
                skills.setVisible(false);
            }
        });
        nextButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                certifications.setVisible(true);
                skills.setVisible(false);
            }
        });
        backButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                skills.setVisible(true);
                certifications.setVisible(false);
            }
        });
        finishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                certifications.setVisible(false);
                finalPanel.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Resume Builder");
        frame.setContentPane((new Resume().main));
        frame.setBounds(200,200,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
