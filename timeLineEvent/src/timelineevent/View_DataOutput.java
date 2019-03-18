package timelineevent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.MatteBorder;

public class View_DataOutput {

    public boolean submitControl = false;
    public boolean choiseControl = false;

    public void displayAll(Controller c, Model m) throws Exception {

        TimelineEvent[] teArray = c.getTimelineEventArray(m);

        JFrame outputJFrame = getJFrame("TIMELINE DISPLAY");

        JPanel detailJPanel = getDisplayDetailJPanel();

        JPanel timelineJPanel = getTimelineJPanel();

        JScrollPane scroll = getJScrollPane();

        JPanel scrollJPanel = getScrollJPanel();

        JPanel searchJPanel = getSearchJPanel();

        

        JTextField searchJText = getSearchText();
        JButton searchJButton = getSearchButton("Enter Title");

        for (int x = 0; x < teArray.length; x++) {
            timelineJPanel.add(getTimelJLabel(teArray[x].title));
        }

        scroll.setViewportView(timelineJPanel);
        scrollJPanel.add(scroll);

        searchJPanel.add(searchJText);
        searchJPanel.add(searchJButton);
        

        outputJFrame.add(detailJPanel);
        outputJFrame.add(searchJPanel);
        outputJFrame.add(scrollJPanel);
        outputJFrame.setVisible(true);

        ActionListener submitListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int m = 0; m < teArray.length; m++) {
                    if (searchJText.getText().equals(teArray[m].title)) {

                        if ("ComputerSystem".equals(teArray[m].type)) {
                            detailJPanel.removeAll();
                            ComputerSystem cs = (ComputerSystem)teArray[m];
                            detailJPanel.add(getComponentLabel("TPYE:"));
                            detailJPanel.add(getTextArea(cs.type));
                            detailJPanel.add(getComponentLabel("TITLE:"));
                            detailJPanel.add(getTextArea(cs.title));
                            detailJPanel.add(getComponentLabel("YEAR:"));
                            detailJPanel.add(getTextArea(String.valueOf(cs.year)));
                            detailJPanel.add(getComponentLabel("MODEL NUMBER:"));
                            detailJPanel.add(getTextArea(String.valueOf(cs.modelNumber)));
                            detailJPanel.add(getComponentLabel("RELEASE YEAR:"));
                            detailJPanel.add(getTextArea(String.valueOf(cs.releaseYear)));
                            detailJPanel.add(getComponentLabel("RETAIL PRICE IN 2018:"));
                            detailJPanel.add(getTextArea(String.valueOf(cs.retailPriceIn2018)));
                            detailJPanel.add(getComponentLabel("MAUFACTUREER:"));
                            detailJPanel.add(getTextArea(cs.manufacturer));
                            detailJPanel.add(getComponentLabel("REASON OF CHOOSING:"));
                            detailJPanel.add(getTextArea(cs.reasonOfChoosing));
                            detailJPanel.add(getComponentLabel("DESCRIPTION:"));
                            JTextArea ds = getTextArea(cs.description);
                            ds.setPreferredSize(new Dimension(300, 110));
                            detailJPanel.add(ds);
                            outputJFrame.setVisible(true);

                        } else if ("ComputerHardware".equals(teArray[m].type)) {
                            ComputerHardware ch = (ComputerHardware)teArray[m];
                            
                            detailJPanel.removeAll();
                            detailJPanel.add(getComponentLabel("TPYE:"));
                            detailJPanel.add(getTextArea(ch.type));
                            detailJPanel.add(getComponentLabel("TITLE:"));
                            detailJPanel.add(getTextArea(ch.title));
                            detailJPanel.add(getComponentLabel("YEAR:"));
                            detailJPanel.add(getTextArea(String.valueOf(ch.year)));
                            detailJPanel.add(getComponentLabel("MODEL NUMBER:"));
                            detailJPanel.add(getTextArea(String.valueOf(ch.modelNumber)));
                            detailJPanel.add(getComponentLabel("RELEASE YEAR:"));
                            detailJPanel.add(getTextArea(String.valueOf(ch.releaseYear)));
                            detailJPanel.add(getComponentLabel("RETAIL PRICE IN 2018:"));
                            detailJPanel.add(getTextArea(String.valueOf(ch.retailPriceIn2018)));
                            detailJPanel.add(getComponentLabel("MAUFACTUREER:"));
                            detailJPanel.add(getTextArea(ch.manufacturer));
                            detailJPanel.add(getComponentLabel("MOST IMPORTANT SPECIFICATIONS:"));
                            detailJPanel.add(getTextArea(ch.mostImportantSpecifications));
                            detailJPanel.add(getComponentLabel("DESCRIPTION:"));
                            JTextArea ds = getTextArea(ch.description);
                            ds.setPreferredSize(new Dimension(300, 110));
                            detailJPanel.add(ds);
                            outputJFrame.setVisible(true);

                        } else if ("HumanInterest".equals(teArray[m].type)) {
                            
                            HumanInterest hi = (HumanInterest)teArray[m];
                            detailJPanel.removeAll();
                            detailJPanel.add(getComponentLabel("TPYE:"));
                            detailJPanel.add(getTextArea(hi.type));
                            detailJPanel.add(getComponentLabel("TITLE:"));
                            detailJPanel.add(getTextArea(hi.title));
                            detailJPanel.add(getComponentLabel("YEAR:"));
                            detailJPanel.add(getTextArea(String.valueOf(hi.year)));
                            detailJPanel.add(getComponentLabel("MODEL NUMBER:"));
                           
                            detailJPanel.add(getComponentLabel("DESCRIPTION:"));
                            JTextArea ds = getTextArea(hi.description);
                            ds.setPreferredSize(new Dimension(300, 110));
                            detailJPanel.add(ds);
                            outputJFrame.setVisible(true);

                        }

                    }
                }
            }

        };

        searchJButton.addActionListener(submitListener);
    }

    public JFrame getJFrame(String name) {

        JFrame frame = new JFrame(name);
        frame = new JFrame("TimeLine");
        frame.setSize(600, 800);
        frame.getContentPane().setBackground(new Color(230, 230, 230));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

        return frame;
    }

    public JTextArea getTextArea(String s) {

        JTextArea ta = new JTextArea();
        ta.setPreferredSize(new Dimension(300, 20));
        ta.setOpaque(true);
        ta.setBackground( new Color(250, 140, 130));
        ta.setFont(new Font("Dialog", 1, 14));
        ta.setForeground(new Color(230, 230, 230));
        ta.setLineWrap(true);
        ta.setText(s);

        MatteBorder border = new MatteBorder(1, 0, 1, 0, new Color(230, 230, 230));

        ta.setBorder(border);
        return ta;

    }

    public JPanel getDisplayDetailJPanel() {

        JPanel p = new JPanel();

        p.setOpaque(true);
        p.setPreferredSize(new Dimension(300, 400));
        p.setBackground(new Color(250, 140, 130));
        p.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));

        return p;

    }

    public JPanel getSearchJPanel() {

        JPanel p = new JPanel();

        p.setOpaque(true);
        p.setPreferredSize(new Dimension(300, 30));
        p.setBackground(new Color(250, 140, 130));
        p.setLayout(new GridLayout(1, 2));

        return p;

    }

    public JPanel getTimelineJPanel() {

        JPanel p = new JPanel();
        p.setOpaque(false);
        p.setBackground(new Color(250, 140, 130));
        p.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));

        MatteBorder border = new MatteBorder(3, 0, 0, 0, new Color(250, 140, 130));
        p.setBorder(border);
        return p;

    }

    public JPanel getScrollJPanel() {
        JPanel p = new JPanel();
        p.setOpaque(false);
        p.setPreferredSize(new Dimension(500, 100));
        p.setLayout(new GridLayout(1, 1));

        return p;
    }

    public JScrollPane getJScrollPane() {
        JScrollPane sp = new JScrollPane();
        sp.setBorder(BorderFactory.createEmptyBorder());
        sp.getViewport().setBackground(new Color(230, 230, 230));
        return sp;
    }

    public JLabel getTimelJLabel(String Name) {

        JLabel l = new JLabel(Name, JLabel.CENTER);
        l.setOpaque(true);
        l.setBackground(new Color(250, 140, 130));
        l.setPreferredSize(new Dimension(50, 50));

        l.setForeground(Color.WHITE);
        MatteBorder border = new MatteBorder(1, 1, 1, 1, Color.WHITE);

        l.setBorder(border);
        return l;
    }

    public JButton getSearchButton(String Name) {

        JButton b = new JButton(Name);

        b.setBackground(new Color(250, 140, 130));
        b.setPreferredSize(new Dimension(50, 30));

        b.setForeground(Color.WHITE);
        MatteBorder border = new MatteBorder(1, 1, 1, 1, new Color(250, 140, 130));

        b.setBorder(border);
        return b;
    }

    public JTextField getSearchText() {

        JTextField t = new JTextField();
        t.setPreferredSize(new Dimension(200, 30));
        t.setOpaque(true);
        t.setBackground(new Color(220, 220, 220));
        t.setFont(new Font("Dialog", 1, 14));
        t.setForeground(new Color(255, 255, 255));

        MatteBorder border = new MatteBorder(1, 1, 1, 1, new Color(250, 140, 130));

        t.setBorder(border);

        return t;

    }
    
    public JLabel getComponentLabel(String labelName) {

        JLabel lb = new JLabel(labelName, JLabel.LEFT);
        lb.setPreferredSize(new Dimension(300, 15));
        lb.setOpaque(false);
        lb.setFont(new Font("Dialog", 1, 12));
        lb.setForeground(new Color(230, 230, 230));
        
        

        return lb;

    }

}
