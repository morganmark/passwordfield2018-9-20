import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame(){
        init();
    }

    private Container cp;
    private JPasswordField jpf=new JPasswordField();
    private JPanel jpl=new JPanel(new GridLayout(3,4));
    private JButton jbn1=new JButton("1");
    private JButton jbn2=new JButton("2");
    private JButton jbn3=new JButton("3");
    private JButton jbn4=new JButton("4");
    private JButton jbn5=new JButton("5");
    private JButton jbn6=new JButton("6");
    private JButton jbn7=new JButton("7");
    private JButton jbn8=new JButton("8");
    private JButton jbn9=new JButton("9");
    private JButton jbn0=new JButton("0");
    private JButton jbnRun=new JButton("Run");
    private JButton jbnExit=new JButton("Exit");
    private JLabel jlb=new JLabel("結果");

    private void init(){
        this.setBounds(300,50,800,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));

        jpf.setFont(new Font(null,Font.BOLD,23));
        jpf.setEchoChar('*');
        jbn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                jbn1.setText("1");
                if (jpf.equals("")){
                    jpf.setText(jbn1.getText());
                }
                else {
                    jpf.setText(jpf.getText()+tmp.getText());
                }

            }
        });
        jbn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                jbn1.setText("2");
                if (jpf.equals("")){
                    jpf.setText(jbn1.getText());
                }
                else {
                    jpf.setText(jpf.getText()+tmp.getText());
                }

            }
        });
        jbn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                jbn1.setText("3");
                if (jpf.equals("")){
                    jpf.setText(jbn1.getText());
                }
                else {
                    jpf.setText(jpf.getText()+tmp.getText());
                }

            }
        });
        jbn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                jbn1.setText("4");
                if (jpf.equals("")){
                    jpf.setText(jbn1.getText());
                }
                else {
                    jpf.setText(jpf.getText()+tmp.getText());
                }

            }
        });
        jbn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                jbn1.setText("5");
                if (jpf.equals("")){
                    jpf.setText(jbn1.getText());
                }
                else {
                    jpf.setText(jpf.getText()+tmp.getText());
                }

            }
        });
        jbn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                jbn1.setText("6");
                if (jpf.equals("")){
                    jpf.setText(jbn1.getText());
                }
                else {
                    jpf.setText(jpf.getText()+tmp.getText());
                }

            }
        });
        jbn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                jbn1.setText("7");
                if (jpf.equals("")){
                    jpf.setText(jbn1.getText());
                }
                else {
                    jpf.setText(jpf.getText()+tmp.getText());
                }

            }
        });
        jbn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                jbn1.setText("8");
                if (jpf.equals("")){
                    jpf.setText(jbn1.getText());
                }
                else {
                    jpf.setText(jpf.getText()+tmp.getText());
                }

            }
        });
        jbn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                jbn1.setText("9");
                if (jpf.equals("")){
                    jpf.setText(jbn1.getText());
                }
                else {
                    jpf.setText(jpf.getText()+tmp.getText());
                }

            }
        });
        jbn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp=(JButton)e.getSource();
                jbn1.setText("0");
                if (jpf.equals("")){
                    jpf.setText(jbn1.getText());
                }
                else {
                    jpf.setText(jpf.getText()+tmp.getText());
                }

            }
        });
        jbnRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jpf.getText().equals("23323456")){
                    jlb.setText("成功!");
                }
                else {
                    jlb.setText("錯誤!");
                }
            }
        });
        jbnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jlb.setFont(new Font(null,Font.BOLD,23));


        cp.add(jpf,BorderLayout.NORTH);
        cp.add(jpl,BorderLayout.CENTER);
        jpl.add(jbn1);
        jpl.add(jbn2);
        jpl.add(jbn3);
        jpl.add(jbn4);
        jpl.add(jbn5);
        jpl.add(jbn6);
        jpl.add(jbn7);
        jpl.add(jbn8);
        jpl.add(jbn9);
        jpl.add(jbn0);
        jpl.add(jbnRun);
        jpl.add(jbnExit);
        cp.add(jlb,BorderLayout.SOUTH);
    }
}
