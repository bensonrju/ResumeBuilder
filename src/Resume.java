import javax.swing.*;

public class Resume {
    private JPanel main;
    private JPanel main2;
    private JPanel main3;
    private JPanel main4;
    private JPanel main5;
    private JButton button2;
    private JButton button1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button3;
    private JButton button4;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JPanel main6;
    private JTextArea textArea1;
    private JButton button9;
    private JButton button10;
    private JPanel main7;
    private JTextArea textArea2;
    private JButton button11;
    private JButton button12;

    Resume()
    {

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
