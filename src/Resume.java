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
    private JButton pers_nextButton;
    private JButton pers_backButton;
    private JTextField uniField;
    private JTextField degreeField;
    private JTextField gpaField;
    private JTextField job1Field;
    private JTextField job2Field;
    private JTextField job3Field;
    private JButton work_nextButton;
    private JButton work_backButton;
    private JButton edu_nextButton;
    private JButton edu_backButton;
    private JPanel skills;
    private JButton skills_nextButton;
    private JButton skills_backButton;
    private JPanel cert;
    private JButton finishButton;
    private JButton cert_backButton;
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
    private JScrollPane skillsScrollPane;
    private JScrollPane certScrollPane;

    public void InitNavButtons() {
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startPanel.setVisible(false);
                personalPane.setVisible(true);
            }
        });
        pers_backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startPanel.setVisible(true);
                personalPane.setVisible(false);
            }
        });
        pers_nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personalPane.setVisible(false);
                educationPane.setVisible(true);
            }
        });
        edu_backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personalPane.setVisible(true);
                educationPane.setVisible(false);
            }
        });
        edu_nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                educationPane.setVisible(false);
                workPane.setVisible(true);
            }
        });
        work_backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                educationPane.setVisible(true);
                workPane.setVisible(false);
            }
        });
        work_nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                workPane.setVisible(false);
                skillsPane.setVisible(true);
            }
        });
        skills_backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                workPane.setVisible(true);
                skillsPane.setVisible(false);
            }
        });
        skills_nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                certPane.setVisible(true);
                skillsPane.setVisible(false);
            }
        });
        cert_backButton.addActionListener(new ActionListener() {
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

    Resume() {

        editorPane1.setEditable(false);
        URL url= Resume.class.getResource("test.htm");

            try {
                editorPane1.setPage(url);
            } catch(IOException e) {
                editorPane1.setContentType("text/html");
                editorPane1.setText("<html>Page not found.</html>");
            }

        InitNavButtons();
    }

    public static JMenuBar initMenuBar() {

    // Initialize Menu Bar
        JMenuBar topMenuBar =new JMenuBar();


    // 1- File Sub-Menu
        JMenu fileMenu = new JMenu("File");

        // Initialize File Sub-Menu Items
        JMenuItem open =new JMenuItem("Open");
        JMenuItem save =new JMenuItem("Save");

        // Add Items to File Sub-Menu
        fileMenu.add(open);
        fileMenu.add(save);

        // Add File Sub-Menu into Top Menu Bar
        topMenuBar.add(fileMenu);


    // 2 - Edit Sub-Menu
        JMenu editMenu =new JMenu("Edit");

        // Initialize Edit Sub-Menu Items
        JMenuItem cut =new JMenuItem("Cut");
        JMenuItem copy =new JMenuItem("Copy");
        JMenuItem paste =new JMenuItem("Paste");

        // Add Items to Edit Sub-Menu
        editMenu.add(cut);
        editMenu.add(copy);
        editMenu.add(paste);

        // Add Edit Sub-Menu into Top Menu Bar
        topMenuBar.add(editMenu) ;


    // 3 - View Sub-Menu
        JMenu viewMenu =new JMenu("View");

        // Initialize Sub-View Menu Items
        JMenuItem param =new JMenuItem("Parameters Info");
        JMenuItem type =new JMenuItem("Types Info");

        // Add Items to View Sub-Menu
        viewMenu.add(param);
        viewMenu.add(type);

        // Add View Sub-Menu into Top Menu Bar
        topMenuBar.add(viewMenu);


    // 4 - Help Sub-Menu
        JMenu helpMenu =new JMenu("Help");

        // Initialize Help Sub-Menu Items
        JMenuItem register =new JMenuItem("Register");
        JMenuItem about =new JMenuItem("About");
        JMenuItem info =new JMenuItem("Info");

        // Add Items to Help Sub-Menu
        helpMenu.add(register);
        helpMenu.add(about);
        helpMenu.add(info);

        // Add View Sub-Menu into Top Menu Bar
        topMenuBar.add (helpMenu) ;

        // Return MenuBar object
        return topMenuBar;
    }

    public static JFrame initMainFrame() {
        JFrame mf = new JFrame("Resume Builder");
        mf.setContentPane((new Resume().mainPanel));
        mf.setBounds(200,200,500,500);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mf.setSize(500,500);
        mf.setVisible(true);

        return mf;
    }

    public static void main(String[] args) {
        JFrame mainFrame = initMainFrame();

        JMenuBar topMenuBar = initMenuBar();

        // Adding the topMenuBar to our mainFrame
        mainFrame.setJMenuBar(topMenuBar);

    }
}
