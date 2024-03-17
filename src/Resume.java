import javax.swing.*;

public class Resume {
    private JPanel main;
    private JPanel main2;
    private JPanel main3;

    Resume()
    {

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane((new Resume().main));
        frame.setBounds(200,200,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
