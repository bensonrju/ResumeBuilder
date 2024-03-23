import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.io.IOException;


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
    private JButton nextButton3;
    private JButton backButton3;
    private JPanel cert;
    private JButton finishButton;
    private JButton backButton4;
    private JPanel finalPanel;
    private JTabbedPane certifications;
    private JEditorPane editorPane1;
    private JTabbedPane personal;
    private JTabbedPane education;
    private JTabbedPane work;
    private JTabbedPane skill;
    private JEditorPane personal_prev;
    private JEditorPane cert_prev;
    private JEditorPane education_prev;
    private JEditorPane work_prev;
    private JEditorPane skil_prev;
    private JEditorPane editorPane2;
    private JEditorPane editorPane3;
    private JLabel Skills;

    Resume()
    {
        editorPane1.setEditable(false);
        URL url= Resume.class.getResource("test.htm");

            try {
                editorPane1.setPage(url);
            } catch(IOException e) {
                editorPane1.setContentType("text/html");
                editorPane1.setText("<html>Page not found.</html>");
            }

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Start.setVisible(false);
                personal.setVisible(true);
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Start.setVisible(true);
                personal.setVisible(false);
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personal.setVisible(false);
                education.setVisible(true);
            }
        });
        backButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personal.setVisible(true);
                education.setVisible(false);
            }
        });
        nextButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                education.setVisible(false);
                work.setVisible(true);
            }
        });
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                education.setVisible(true);
                work.setVisible(false);
            }
        });
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                work.setVisible(false);
                skill.setVisible(true);
            }
        });
        backButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                work.setVisible(true);
                skill.setVisible(false);
            }
        });
        nextButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                certifications.setVisible(true);
                skill.setVisible(false);
            }
        });
        backButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                skill.setVisible(true);
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
        // menu Bar code
        JMenuBar JMenuBar =new JMenuBar();
// 1- Menu File
        JMenu menu1 = new JMenu("File");
// Menu Item
        JMenuItem open =new JMenuItem( "Open");
        JMenuItem save =new JMenuItem( "Save");
// add items into menu File
        menu1.add(open);
        menu1.add(save) ;
// add Menu into menu Bar
        JMenuBar.add(menu1) ;
// Menu Edit
        JMenu menu2 =new JMenu( "Edit");
// Menu Item
        JMenuItem cut =new JMenuItem( "Cut");
        JMenuItem copy =new JMenuItem( "Copy");
        JMenuItem paste =new JMenuItem( "Paste");
// add items into menu Edit
        menu2.add (cut) ;
        menu2.add (copy) ;
        menu2.add (paste) ;
// add Menu into menu Bar
        JMenuBar.add (menu2) ;
        JMenu menu3 =new JMenu( "View");

// Menu Item
        JMenuItem param =new JMenuItem( "parameters info");
        JMenuItem type =new JMenuItem( "Types Info");
// add items into menu Edit
        menu3.add (param) ;
        menu3.add (type) ;
// add Menu into menu Bar
        JMenuBar.add (menu3) ;
        JMenu menu4 =new JMenu( "Help");
// Menu Item
        JMenuItem register =new JMenuItem( "Register");
        JMenuItem about =new JMenuItem( "About");

        JMenuItem info =new JMenuItem( "Info");
// add items into menu Edit
        menu4.add (register) ;
        menu4.add (about) ;
        menu4.add (info) ;
// add Menu into menu Bar
        JMenuBar.add (menu4) ;
// Setting into frame
        frame.setJMenuBar (JMenuBar) ;
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
