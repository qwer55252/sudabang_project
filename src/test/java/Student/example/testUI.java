package Student.example;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;



import javax.swing.border.LineBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.util.ArrayList;


public class testUI extends JFrame {

    public testUI() {
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


//        JLabel title_label = new JLabel("<"+sName+" 학생 "+userMonth+"월 "+userWeek+"주차"+" 클리닉 보고서>");
//        title_label.setFont(title_font);
//        title_label.setHorizontalAlignment(JLabel.CENTER);
//        title.add(title_label);


        JPanel center = new JPanel();
        center.setLayout(null);
        center.setBackground(Color.red); // 확인차 레드레드




        //------------------------------------------------------------
        // 위 패널
        // <날짜 패널>
        JPanel topPanel = new JPanel();
        topPanel.setLayout(null);
        topPanel.setBounds(0, 0, 900, 280); // center의 0,0 위치에 900X280 삽입
        topPanel.setBorder(border2);
        topPanel.setBackground(Color.red);


        JPanel topDatePanel = new JPanel();
        topDatePanel.setLayout(null);
        topDatePanel.setBounds(0, 0, 100, 280); // topPanel 0, 0 위치에 100X280 삽입
        topDatePanel.setBorder(border1);

        JLabel topDateLabel = new JLabel("날짜"); // att_date_label이랑 겹쳐주자
        topDateLabel.setFont(font2);
        topDateLabel.setHorizontalAlignment(JLabel.CENTER);
        topDateLabel.setVerticalAlignment(JLabel.CENTER);

        JPanel topDatePanel_1 = new JPanel(new BorderLayout());
        topDatePanel_1.setBounds(0, 0, 100, 30); // topPanel_1의 (0, 0)위치에 100X30 삽입
        topDatePanel_1.setBorder(border1);
        topDatePanel_1.setBackground(light_yellow_color);
        topDatePanel_1.add(topDateLabel, BorderLayout.CENTER);



        JPanel topDatePanel_grid = new JPanel(new GridLayout(5, 1)); // 날짜 밑 5개의 grid칸
        topDatePanel_grid.setBounds(0, 30, 100, 250); // topPanel_1의 0, 30위치에 100X250 삽입
        topDatePanel_grid.setBorder(border1);

        for(int i=0;i<5;i++){
            JPanel topDatePanel_grid_elem = new JPanel();
            topDatePanel_grid_elem.setBorder(border1);
            topDatePanel_grid_elem.setBackground(light_gray_color);
//            JLabel i_th_dateLabel = new JLabel(printList.get(i).getDate());
//            i_th_dateLabel.setFont(plainFont);
//            topDatePanel_grid_elem.add(i_th_dateLabel); //정보 저장
            topDatePanel_grid.add(topDatePanel_grid_elem);
        }

        topDatePanel.add(topDatePanel_1);
        topDatePanel.add(topDatePanel_grid);


        // <출석시간 패널>
        JPanel topAttPanel = new JPanel();
        topAttPanel.setLayout(null);
        topAttPanel.setBounds(100, 0, 100, 280); // center의 (100, 0)위치에 100X280 삽입
        topAttPanel.setBorder(border1);

        JLabel topAttLabel = new JLabel("출석시간");
        topAttLabel.setFont(font2);
        topAttLabel.setHorizontalAlignment(JLabel.CENTER);
        topAttLabel.setVerticalAlignment(JLabel.CENTER);

        JPanel topAttPanel_1 = new JPanel(new BorderLayout());
        topAttPanel_1.setBounds(0, 0, 100, 30);
        topAttPanel_1.setBorder(border1);
        topAttPanel_1.setBackground(light_red_color);
        topAttPanel_1.add(topAttLabel);

        JPanel topAttPanel_grid = new JPanel(new GridLayout(5, 1)); // 출석시간 밑 5개의 grid칸
        topAttPanel_grid.setBounds(0, 30, 100, 250); // topAttPanel의 0, 30위치에 100X250 삽입
        topAttPanel_grid.setBorder(border1);

        for(int i=0;i<5;i++){
            JPanel topAttPanel_grid_elem = new JPanel();
            topAttPanel_grid_elem.setBorder(border1);
            topAttPanel_grid_elem.setBackground(light_yellow_color);
//            JLabel i_th_attLabel = new JLabel(printList.get(i).getTextbook());
//            i_th_attLabel.setFont(plainFont);
//            topAttPanel_grid_elem.add(i_th_attLabel); //정보 저장

            topAttPanel_grid.add(topAttPanel_grid_elem);
        }

        topAttPanel.add(topAttPanel_1);
        topAttPanel.add(topAttPanel_grid);



        // <단원명 패널>
        JPanel topUnitPanel = new JPanel();
        topUnitPanel.setLayout(null);
        topUnitPanel.setBounds(200, 0, 100, 280); // center의 (200, 0)위치에 100X280 삽입
        topUnitPanel.setBorder(border1);

        JLabel topUnitLabel = new JLabel("단원명");
        topUnitLabel.setFont(font2);
        topUnitLabel.setHorizontalAlignment(JLabel.CENTER);
        topUnitLabel.setVerticalAlignment(JLabel.CENTER);

        JPanel topUnitPanel_1 = new JPanel(new BorderLayout());
        topUnitPanel_1.setBounds(0, 0, 100, 30);
        topUnitPanel_1.setBorder(border1);
        topUnitPanel_1.setBackground(light_blue_color);
        topUnitPanel_1.add(topUnitLabel);

        JPanel topUnitPanel_grid = new JPanel(new GridLayout(5, 1)); // 출석시간 밑 5개의 grid칸
        topUnitPanel_grid.setBounds(0, 30, 100, 250); // topAttPanel의 0, 30위치에 100X250 삽입
        topUnitPanel_grid.setBorder(border1);

        for(int i=0;i<5;i++){
            JPanel topUnitPanel_grid_elem = new JPanel();
            topUnitPanel_grid_elem.setBorder(border1);
            topUnitPanel_grid_elem.setBackground(light_yellow_color);
//            JLabel i_th_unitLabel = new JLabel(printList.get(i).getTextbook());
//            i_th_unitLabel.setFont(plainFont);
//            topUnitPanel_grid_elem.add(i_th_unitLabel); //정보 저장

            topUnitPanel_grid.add(topUnitPanel_grid_elem);
        }

        topUnitPanel.add(topUnitPanel_1);
        topUnitPanel.add(topUnitPanel_grid);


        // <취약유형 패널>
        JPanel topWeakPanel = new JPanel();
        topWeakPanel.setLayout(null);
        topWeakPanel.setBounds(300, 0, 500, 280); // center의 (300, 0)위치에 500X280 삽입
        topWeakPanel.setBorder(border1);

        JLabel topWeakLabel = new JLabel("취약유형");
        topWeakLabel.setFont(font2);
        topWeakLabel.setHorizontalAlignment(JLabel.CENTER);
        topWeakLabel.setVerticalAlignment(JLabel.CENTER);

        JPanel topWeakPanel_1 = new JPanel(new BorderLayout());
        topWeakPanel_1.setBounds(0, 0, 100, 30);
        topWeakPanel_1.setBorder(border1);
        topWeakPanel_1.setBackground(light_blue_color);
        topWeakPanel_1.add(topWeakLabel);

        JPanel topWeakPanel_grid = new JPanel(new GridLayout(5, 1)); // 출석시간 밑 5개의 grid칸
        topWeakPanel_grid.setBounds(0, 30, 100, 250); // topAttPanel의 0, 30위치에 100X250 삽입
        topWeakPanel_grid.setBorder(border1);

        for(int i=0;i<5;i++){
            JPanel topWeakPanel_grid_elem = new JPanel();
            topWeakPanel_grid_elem.setBorder(border1);
            topWeakPanel_grid_elem.setBackground(light_yellow_color);
//            JLabel i_th_weakLabel = new JLabel(printList.get(i).getTextbook());
//            i_th_weakLabel.setFont(plainFont);
//            topWeakPanel_grid_elem.add(i_th_weakLabel); //정보 저장

            topWeakPanel_grid.add(topWeakPanel_grid_elem);
        }

        topWeakPanel.add(topWeakPanel_1);
        topWeakPanel.add(topWeakPanel_grid);


        // <성취단계 패널>
        JPanel topAchPanel = new JPanel();
        topAchPanel.setLayout(null);
        topAchPanel.setBounds(800, 0, 100, 280); // center의 (800, 0)위치에 100X280 삽입
        topAchPanel.setBorder(border1);

        JLabel topAchLabel = new JLabel("성취단계");
        topAchLabel.setFont(font2);
        topAchLabel.setHorizontalAlignment(JLabel.CENTER);
        topAchLabel.setVerticalAlignment(JLabel.CENTER);

        JPanel topAchPanel_1 = new JPanel(new BorderLayout());
        topAchPanel_1.setBounds(0, 0, 100, 30);
        topAchPanel_1.setBorder(border1);
        topAchPanel_1.setBackground(light_blue_color);
        topAchPanel_1.add(topAchLabel);

        JPanel topAchPanel_grid = new JPanel(new GridLayout(5, 1)); // 출석시간 밑 5개의 grid칸
        topAchPanel_grid.setBounds(0, 30, 100, 250); // topAttPanel의 0, 30위치에 100X250 삽입
        topAchPanel_grid.setBorder(border1);

        for(int i=0;i<5;i++){
            JPanel topAchPanel_grid_elem = new JPanel();
            topAchPanel_grid_elem.setBorder(border1);
            topAchPanel_grid_elem.setBackground(light_yellow_color);
//            JLabel i_th_achLabel = new JLabel(printList.get(i).getTextbook());
//            i_th_achLabel.setFont(plainFont);
//            topAchPanel_grid_elem.add(i_th_achLabel); //정보 저장

            topAchPanel_grid.add(topAchPanel_grid_elem);
        }

        topAchPanel.add(topAchPanel_1);
        topAchPanel.add(topAchPanel_grid);



        topPanel.add(topDatePanel);
        topPanel.add(topAttPanel);
        topPanel.add(topUnitPanel);
        topPanel.add(topWeakPanel);
        topPanel.add(topAchPanel);
        // <topPanel 작업 끝>


        // <bottomPanel 작업 시작>
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(null);
        bottomPanel.setBounds(0, 280, 900, 280); // center의 0,280 위치에 900X280 삽입
        bottomPanel.setBorder(border2);
        bottomPanel.setBackground(Color.red);


        JPanel bottomDatePanel = new JPanel();
        bottomDatePanel.setLayout(null);
        bottomDatePanel.setBounds(0, 0, 100, 280); // bottomPanel 0, 0 위치에 100X280 삽입
        bottomDatePanel.setBorder(border1);

        JLabel bottomDateLabel = new JLabel("날짜"); // att_date_label이랑 겹쳐주자
        bottomDateLabel.setFont(font2);
        bottomDateLabel.setHorizontalAlignment(JLabel.CENTER);
        bottomDateLabel.setVerticalAlignment(JLabel.CENTER);

        JPanel bottomDatePanel_1 = new JPanel(new BorderLayout());
        bottomDatePanel_1.setBounds(0, 0, 100, 30); // bottomPanel_1의 (0, 0)위치에 100X30 삽입
        bottomDatePanel_1.setBorder(border1);
        bottomDatePanel_1.setBackground(light_red_color);
        bottomDatePanel_1.add(bottomDateLabel, BorderLayout.CENTER);



        JPanel bottomDatePanel_grid = new JPanel(new GridLayout(5, 1)); // 날짜 밑 5개의 grid칸
        bottomDatePanel_grid.setBounds(0, 30, 100, 250); // bottomPanel_1의 0, 30위치에 100X250 삽입
        bottomDatePanel_grid.setBorder(border1);

        for(int i=0;i<5;i++){
            JPanel bottomDatePanel_grid_elem = new JPanel();
            bottomDatePanel_grid_elem.setBorder(border1);
            bottomDatePanel_grid_elem.setBackground(light_gray_color);
            //JLabel i_th_dateLabel = new JLabel(printList.get(i).getDate());
            //i_th_dateLabel.setFont(plainFont);
            //bottomDatePanel_grid_elem.add(i_th_dateLabel); //정보 저장
            bottomDatePanel_grid.add(bottomDatePanel_grid_elem);
        }

        bottomDatePanel.add(bottomDatePanel_1);
        bottomDatePanel.add(bottomDatePanel_grid);








        // <여백>
        JPanel west_panel = new JPanel();
        west_panel.setPreferredSize(new Dimension(20, this.getHeight()));
        west_panel.setBackground(Color.white);

        JPanel east_panel = new JPanel();
        east_panel.setPreferredSize(new Dimension(20, this.getHeight()));
        east_panel.setBackground(Color.white);


        // 각 패널들 추가
        center.add(topPanel);
        center.add(bottomPanel);
        c.add(title, BorderLayout.NORTH);
        c.add(center, BorderLayout.CENTER);
        c.add(east_panel, BorderLayout.EAST);
        c.add(west_panel, BorderLayout.WEST);




        setSize(900, 600);
        setVisible(true);
//        dispose();

    }

    public static void main(String[] args) {
        new testUI();
    }

}
