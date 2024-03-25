import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
    private JEditorPane finished_prev;
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
    private JButton updateButton;
    private JButton updateButton1;
    private JButton updateButton2;
    private JButton updateButton3;
    private JButton updateButton4;
    private JTextField gradDateField;
    private JTextArea job1desc;
    private JTextArea job2desc;
    private JTextArea job3desc;
    private JTextArea skills_textarea;
    private JTextArea cert_textarea;
    private JTextField job1start;
    private JTextField job1end;
    private JTextField job2start;
    private JTextField job2end;
    private JTextField job3start;
    private JTextField job3end;

    String html_text;
    String job1descparsed;

    String job2descparsed;
    String job3descparsed;
    String skillsparsed;
    String certparsed;



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
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateHTML();
            }
        });
        updateButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateHTML();
            }
        });
        updateButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateHTML();
            }
        });
        updateButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateHTML();
            }
        });
        updateButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateHTML();
            }
        });
    }

    Resume() {

        //editorPane1.setContentType("text/html");
        //editorPane1.setContentType("text/html");

        personal_prev.setContentType("text/html");
        education_prev.setContentType("text/html");
        work_prev.setContentType("text/html");
        skil_prev.setContentType("text/html");
        cert_prev.setContentType("text/html");
        finished_prev.setContentType("text/html");
        updateHTML();

        InitNavButtons();


    }
    public void updateHTML()
    {
//Check all JtextAreas that need to be parsed to format data correctly
parseTextArea();
//String Variables that need to format parsed data
        String Job1 =   "            <h3>"+job1Field.getText()+"</h3>\n" +
        "            <p>"+job1start.getText() +"-"+job1end.getText()+"</p>\n" +
        "            <ul>\n" +
                            job1descparsed +
        "            </ul>\n";

        String Job2 =  "            <h3>"+job2Field.getText()+"</h3>\n" +
                "            <p>"+job2start.getText() +"-"+job2end.getText()+"</p>\n" +
                "            <ul>\n" +
                                job2descparsed +
                "            </ul>\n";
        String Job3 = "      <h3>"+job3Field.getText()+ "</h3>\n" +
                "            <p>"+job3start.getText() +"-"+job3end.getText()+"</p>\n" +
         "            <ul>\n" +
                            job3descparsed +
         "            </ul>\n";
        String skill_html = "        <h2>Skills</h2>\n" + "\n" +
                "                        <ul>\n" +"\n" +
                skillsparsed +
                "                        </ul> ";
        String cert_html = "        <h2>Certifications</h2>\n" +
                "        <ul>\n" +
                certparsed +
                "        </ul>\n";
        if(certparsed.isEmpty())
            cert_html = "";
        if(skillsparsed.isEmpty())
            skill_html = "";
        if(job2Field.getText().isEmpty())
            Job2 = "";
        if(job3Field.getText().isEmpty())
            Job3 = "";
        //Html Format
        String html_text = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Resume</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "      <h1><center>"+nameField.getText()+"</center></h1>\n" +
                "      <p><center>Email: "+emailField.getText()+" | Phone: "+phoneField.getText()+" | Address: "+addressField.getText()+"</center></p>\n" +

                "    \n" +
                "    <hr>\n" +
                "    \n" +

                "    \n" +
                "        <h2>Education</h2>\n" +
                "        <ul>\n" +
                "            <li>"+degreeField.getText()+", "+uniField.getText()+", "+gradDateField.getText()+"</li>\n" +
                "            <li>GPA: "+gpaField.getText()+" </li>\n" +
                "        </ul>\n" +
                "    \n" +
                "        <h2>Work Experience</h2>\n" +
                Job1 +
                Job2 +
                Job3 +
                "    \n" +
                skill_html +
                "    \n" +
                cert_html +
                "    \n" +
                "        <p>References available upon request</p>\n" +
                "</body>\n" +
                "</html>";
        //editorPane1.setText(html_text);

        //Assign new html preview to all preview windows
        personal_prev.setText(html_text);
        education_prev.setText(html_text);
        work_prev.setText(html_text);
        skil_prev.setText(html_text);
        cert_prev.setText(html_text);
        finished_prev.setText(html_text);


    }
    public void parseTextArea()
    {
        String[] job1lines = job1desc.getText().split("\\r?\\n");

        // You can now process each line as needed
        for (String line : job1lines) {
            System.out.println(line); // For demonstration, we're just printing each line
        }
        String temp = "";
        for(String line: job1lines)
        {
         temp = temp + "<li>" + line + "</li>\n";
        }
        job1descparsed = temp;

        //Parse job2-------------------------------
        String[] job2lines = job2desc.getText().split("\\r?\\n");

        // You can now process each line as needed
        for (String line : job2lines) {
            System.out.println(line); // For demonstration, we're just printing each line
        }
        String temp2 = "";
        for(String line: job2lines)
        {
            temp2 = temp2 + "<li>" + line + "</li>\n";
        }
        job2descparsed = temp2;

        //Parse job 3-----------------------------
        String[] job3lines = job3desc.getText().split("\\r?\\n");

        // You can now process each line as needed
        for (String line : job3lines) {
            System.out.println(line); // For demonstration, we're just printing each line
        }
        String temp3 = "";
        for(String line: job3lines)
        {
            temp3 = temp3 + "<li>" + line + "</li>\n";
        }
        job3descparsed = temp3;
        //SKILLS ----------------------------
        String[] skillines = skills_textarea.getText().split("\\r?\\n");

        // You can now process each line as needed
        for (String line : skillines) {
            System.out.println(line); // For demonstration, we're just printing each line
        }
        String temp4 = "";
        for(String line: skillines)
        {
            temp4 = temp4 + "<li>" + line + "</li>\n";
        }
        skillsparsed = temp4;
        //Certifications
        String[] certlines = cert_textarea.getText().split("\\r?\\n");

        // You can now process each line as needed
        for (String line : certlines) {
            System.out.println(line); // For demonstration, we're just printing each line
        }
        String temp5 = "";
        for(String line: certlines)
        {
            temp5 = temp5 + "<li>" + line + "</li>\n";
        }
        certparsed = temp5;
        System.out.println(certparsed);
        //Disable the skills and cert sections if there is no information
        if(skillsparsed.equals("<li></li>\n"))
            skillsparsed = "";
        if(certparsed.equals("<li></li>\n"))
            certparsed = "";
        if(job1descparsed.equals("<li></li>\n"))
            job1descparsed = "";
        if(job2descparsed.equals("<li></li>\n"))
            job2descparsed = "";
        if(job3descparsed.equals("<li></li>\n"))
            job3descparsed = "";



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
        mf.setSize(575,700);
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
