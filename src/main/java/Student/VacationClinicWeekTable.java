package Student;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.util.ArrayList;


public class VacationClinicWeekTable extends JFrame {

    VacationClinicWeekTable() {
        setTitle("클리닉 주간관리표 GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // font
        Font title_font = new Font("Dialog",Font.PLAIN, 15);
        Font font1 = new Font("Dialog",Font.BOLD, 13);
        Font font2 = new Font("Dialog", Font.BOLD, 15);
        Font font3 = new Font("Dialog", Font.PLAIN, 15);
        Font plainFont = new Font("Dialog", Font.PLAIN, 11);
        Font bigFont = new Font("Dialog",Font.BOLD, 40);

        // Color
        Color light_yellow_color = new Color(255, 255, 204);
        Color light_red_color = new Color(255, 204, 204);
        Color light_blue_color = new Color(204, 229, 255);
        Color light_green_color = new Color(204, 255, 229);
        Color light_gray_color = new Color(240, 240, 240);
        Color green_color = new Color(102, 204, 0);

        // Border

        LineBorder border1 = new LineBorder(Color.white, 1);
        LineBorder border2 = new LineBorder(Color.white, 2);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());


        // title - NORTH
        JPanel title = new JPanel(); // NORTH
        title.setPreferredSize(new Dimension(this.getWidth(), 30));
        title.setBackground(Color.white);


        JLabel title_label = new JLabel("<"+sName+" 학생 "+userMonth+"월 "+userWeek+"주차"+" 클리닉 보고서>");
        title_label.setFont(title_font);
        title_label.setHorizontalAlignment(JLabel.CENTER);
        title.add(title_label);


        JPanel center = new JPanel();
        center.setLayout(null);
        center.setBackground(Color.red); // 확인차 레드레드




        //------------------------------------------------------------
        // <진도 & 과제 란>
        JPanel progress_and_homework = new JPanel();
        progress_and_homework.setLayout(null);
        progress_and_homework.setBounds(0, 150, 1300, 290); // center의 0,150위치에 1300X200 삽입
        progress_and_homework.setBorder(border2);
        progress_and_homework.setBackground(Color.red);


        JPanel pro_and_hwk_panel1 = new JPanel(new BorderLayout()); // default : FlowLayout -> 맨 위에 가운데에 설정
        pro_and_hwk_panel1.setBounds(0, 0, 50, 290);
        pro_and_hwk_panel1.setBorder(border1);
        pro_and_hwk_panel1.setBackground(light_red_color);


        JLabel pah_label1 = new JLabel("<html>진도<br>&nbsp;&nbsp;&<br>과제</html>");
        pah_label1.setFont(font1);
        pah_label1.setHorizontalAlignment(JLabel.CENTER);
        pah_label1.setVerticalAlignment(JLabel.CENTER);
        pro_and_hwk_panel1.add(pah_label1, BorderLayout.CENTER);



        JPanel pro_and_hwk_panel2 = new JPanel();
        pro_and_hwk_panel2.setLayout(null);
        pro_and_hwk_panel2.setBounds(50, 0, 100, 290); // progress의 50, 0 위치에 100X290 삽입
        pro_and_hwk_panel2.setBorder(border1);

        JLabel pah_date_label = new JLabel("날짜"); // att_date_label이랑 겹쳐주자
        pah_date_label.setFont(font2);
        pah_date_label.setHorizontalAlignment(JLabel.CENTER);
        pah_date_label.setVerticalAlignment(JLabel.CENTER);

        JPanel pah_panel2_1 = new JPanel(new BorderLayout());
        pah_panel2_1.setBounds(0, 0, 100, 25); // pro_panel2의 (0, 0)위치에 100X25 삽입
        pah_panel2_1.setBorder(border1);
        pah_panel2_1.setBackground(light_red_color);
        pah_panel2_1.add(pah_date_label, BorderLayout.CENTER);


        JPanel pah_panel2_grid = new JPanel(new GridLayout(5, 1)); // 진도 날짜 밑 5개의 grid칸
        pah_panel2_grid.setBounds(0, 25, 100, 265); // pro_panel2의 0, 25위치에 100X265 삽입
        pah_panel2_grid.setBorder(border1);

        for(int i=0;i<5;i++){
            JPanel pah_panel2_2 = new JPanel();
            pah_panel2_2.setBorder(border1);
            pah_panel2_2.setBackground(light_gray_color);
            JLabel pahDateLabel = new JLabel(printList.get(i).getDate());
            pahDateLabel.setFont(plainFont);
            pah_panel2_2.add(pahDateLabel); //정보 저장

            pah_panel2_grid.add(pah_panel2_2);
        }


        pro_and_hwk_panel2.add(pah_panel2_1);
        pro_and_hwk_panel2.add(pah_panel2_grid);



        JPanel pro_and_hwk_panel3 = new JPanel();
        pro_and_hwk_panel3.setLayout(null);
        pro_and_hwk_panel3.setBounds(150, 0, 100, 290); // progress의 (150, 0)위치에 100X290 삽입
        pro_and_hwk_panel3.setBorder(border1);

        JPanel pah_panel3_grid = new JPanel(new GridLayout(5, 1)); // 진도 날짜 밑 5개의 grid칸
        pah_panel3_grid.setBounds(0, 25, 100, 265); // pro_panel3의 0, 25위치에 100X265 삽입
        pah_panel3_grid.setBorder(border1);

        JLabel pah_book_label = new JLabel("교재");
        pah_book_label.setFont(font2);
        pah_book_label.setHorizontalAlignment(JLabel.CENTER);
        pah_book_label.setVerticalAlignment(JLabel.CENTER);

        JPanel pah_panel3_1 = new JPanel(new BorderLayout());
        pah_panel3_1.setBounds(0, 0, 100, 25);
        pah_panel3_1.setBorder(border1);
        pah_panel3_1.setBackground(light_red_color);
        pah_panel3_1.add(pah_book_label);

        for(int i=0;i<5;i++){
            JPanel pah_panel3_2 = new JPanel();
            pah_panel3_2.setBorder(border1);
            pah_panel3_2.setBackground(light_gray_color);
            JLabel pahBookLabel = new JLabel(printList.get(i).getTextbook());
            pahBookLabel.setFont(plainFont);
            pah_panel3_2.add(pahBookLabel); //정보 저장

            pah_panel3_grid.add(pah_panel3_2);
        }

        pro_and_hwk_panel3.add(pah_panel3_1);
        pro_and_hwk_panel3.add(pah_panel3_grid);


        JPanel pro_and_hwk_panel4 = new JPanel();
        pro_and_hwk_panel4.setLayout(null);
        pro_and_hwk_panel4.setBounds(250, 0, 525, 290); // progress의 (250, 0)위치에 1050X290 삽입
        pro_and_hwk_panel4.setBorder(border1);

        JPanel pah_panel4_grid = new JPanel(new GridLayout(5, 1));
        pah_panel4_grid.setBounds(0, 25, 525, 265);
        pah_panel4_grid.setBorder(border1);

        JLabel pah_pro_label = new JLabel("진도");
        pah_pro_label.setFont(font2);
        pah_pro_label.setHorizontalAlignment(JLabel.CENTER);
        pah_pro_label.setVerticalAlignment(JLabel.CENTER);

        JPanel pah_panel4_1 = new JPanel(new BorderLayout());
        pah_panel4_1.setBounds(0, 0, 525, 25);
        pah_panel4_1.setBorder(border1);
        pah_panel4_1.setBackground(light_red_color);
        pah_panel4_1.add(pah_pro_label, BorderLayout.CENTER);

        for(int i=0;i<5;i++){
            JPanel pah_panel4_2 = new JPanel();
            pah_panel4_2.setBorder(border1);
            pah_panel4_2.setBackground(light_gray_color);

            JLabel proLabel = new JLabel("<html>"+printList.get(i).getProgress().replace("\n","<br>")+"</html>");
            proLabel.setHorizontalAlignment(JLabel.CENTER);
            proLabel.setFont(plainFont);
            pah_panel4_2.add(proLabel);

            pah_panel4_grid.add(pah_panel4_2);

        }


        pro_and_hwk_panel4.add(pah_panel4_1);
        pro_and_hwk_panel4.add(pah_panel4_grid);



        JPanel pro_and_hwk_panel5 = new JPanel();
        pro_and_hwk_panel5.setLayout(null);
        pro_and_hwk_panel5.setBounds(775, 0, 525, 290); // progress의 (250, 0)위치에 1050X290 삽입
        pro_and_hwk_panel5.setBorder(border1);

        JPanel pah_panel5_grid = new JPanel(new GridLayout(5, 1));
        pah_panel5_grid.setBounds(0, 25, 525, 265);
        pah_panel5_grid.setBorder(border1);

        JLabel pah_hwk_label = new JLabel("과제");
        pah_hwk_label.setFont(font2);
        pah_hwk_label.setHorizontalAlignment(JLabel.CENTER);
        pah_hwk_label.setVerticalAlignment(JLabel.CENTER);

        JPanel pah_panel5_1 = new JPanel(new BorderLayout());
        pah_panel5_1.setBounds(0, 0, 525, 25);
        pah_panel5_1.setBorder(border1);
        pah_panel5_1.setBackground(light_red_color);
        pah_panel5_1.add(pah_hwk_label, BorderLayout.CENTER);

        for(int i=0;i<5;i++){
            JPanel pah_panel5_2 = new JPanel();
            pah_panel5_2.setBorder(border1);
            pah_panel5_2.setBackground(light_gray_color);

            //과제 란이 작기 때문에 자동 줄바꿈 처리가 되는 JTextPane사용
            JTextPane tpName = new JTextPane();
            tpName.setEditable(false);
            tpName.setBackground(light_gray_color);
            tpName.setText(printList.get(i).getAssignment_comment());

            //tpName의 styleDocument를 가져와 가운데 정렬 설정
            StyledDocument doc = tpName.getStyledDocument();
            SimpleAttributeSet ce = new SimpleAttributeSet();
            StyleConstants.setAlignment(ce, StyleConstants.ALIGN_CENTER);
            doc.setParagraphAttributes(0, doc.getLength(), ce, false);

            pah_panel5_2.add(tpName);
            pah_panel5_grid.add(pah_panel5_2);

        }




        pro_and_hwk_panel5.add(pah_panel5_1);
        pro_and_hwk_panel5.add(pah_panel5_grid);


        progress_and_homework.add(pro_and_hwk_panel1);
        progress_and_homework.add(pro_and_hwk_panel2);
        progress_and_homework.add(pro_and_hwk_panel3);
        progress_and_homework.add(pro_and_hwk_panel4);
        progress_and_homework.add(pro_and_hwk_panel5);




        // <여백>
        JPanel west_panel = new JPanel();
        west_panel.setPreferredSize(new Dimension(20, this.getHeight()));
        west_panel.setBackground(Color.white);

        JPanel east_panel = new JPanel();
        east_panel.setPreferredSize(new Dimension(20, this.getHeight()));
        east_panel.setBackground(Color.white);







        // 각 패널들 추가
        c.add(title, BorderLayout.NORTH);
        c.add(center, BorderLayout.CENTER);
        c.add(east_panel, BorderLayout.EAST);
        c.add(west_panel, BorderLayout.WEST);
        center.add(panel1);
        center.add(panel2);



        setSize(1300, 860);
        setVisible(true);
//        dispose();

    }

}
