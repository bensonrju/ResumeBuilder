import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.io.IOException;


public class Resume {
    private JPanel mainPanel;
    private JPanel startPanel;
    private JPanel personalPanel;
    private JPanel educationPanel;
    private JPanel Work;
    private JButton startButton;
    private JTextField nameField;
    private JTextField addressField;
    private JTextField phoneField;
    private JTextField emailField;
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
    private JTabbedPane certPane;
    private JEditorPane editorPane1;
    private JTabbedPane personalPane;
    private JTabbedPane educationPane;
    private JTabbedPane workPane;
    private JTabbedPane skillsPane;
    private JEditorPane personal_prev;
    private JEditorPane cert_prev;
    private JEditorPane education_prev;
    private JEditorPane work_prev;
    private JEditorPane skil_prev;
    private JEditorPane editorPane2;
    private JEditorPane editorPane3;
    private JLabel Skills;
    private JLabel titleLabel;
    private JPanel pers_prevPanel;
    private JPanel edu_prevPanel;
    private JPanel work_prevPanel;
    private JPanel skills_prevPanel;
    private JPanel cert_prevPanel;
    private JLabel genMsgLabel;
    private JScrollPane resOutPane;

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
                startPanel.setVisible(false);
                personalPane.setVisible(true);
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startPanel.setVisible(true);
                personalPane.setVisible(false);
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personalPane.setVisible(false);
                educationPane.setVisible(true);
            }
        });
        backButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personalPane.setVisible(true);
                educationPane.setVisible(false);
            }
        });
        nextButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                educationPane.setVisible(false);
                workPane.setVisible(true);
            }
        });
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                educationPane.setVisible(true);
                workPane.setVisible(false);
            }
        });
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                workPane.setVisible(false);
                skillsPane.setVisible(true);
            }
        });
        backButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                workPane.setVisible(true);
                skillsPane.setVisible(false);
            }
        });
        nextButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                certPane.setVisible(true);
                skillsPane.setVisible(false);
            }
        });
        backButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                skillsPane.setVisible(true);
                certPane.setVisible(false);
            }
        });
        finishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                certPane.setVisible(false);
                finalPanel.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Resume Builder");
        frame.setContentPane((new Resume().mainPanel));
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
