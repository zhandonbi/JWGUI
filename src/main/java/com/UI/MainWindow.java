package com.UI;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.core.Account;
import com.core.Message;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import javafx.scene.control.ComboBox;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Objects;
import java.util.Vector;

public class MainWindow {
    private JPanel MainPanel;
    private JComboBox<String> GroupList;
    private JComboBox<String> FieldList;
    private JList<Object> ListMessage;
    private JComboBox<String> ObjectList;
    private JTable tableMessage;
    private JMenuBar menuBar;
    private JLabel selectLable;
    private JTextField allSearchText;
    private JButton ButtonSearch;
    private JTextField allMessage;
    private JTextArea OutPutText;
    private Account acc;
    private Message message;
    private JFrame frame;
    private Login login;

    private JSONObject GroupCN;
    private String[] FieldCN;
    private String[] FieldEN;

    public MainWindow(Account acc, Login login) {
        this.acc = acc;
        this.login = login;
        message = new Message(this.acc);
        this.ControlsInit();
        $$$setupUI$$$();
    }

    private void ControlsInit() {
        MainPanel = new JPanel();
        GroupList = new JComboBox<String>();
        FieldList = new JComboBox<String>();
        ObjectList = new JComboBox<String>();
        tableMessage = new JTable();
        tableMessage.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        menuBar = new JMenuBar();
        selectLable = new JLabel();
        allSearchText = new JTextField();
        ButtonSearch = new JButton();
        OutPutText = new JTextArea();
        allMessage = new JTextField();
        creatMenu();
    }


    public void reset(Account acc) {
        this.acc = acc;
        message = new Message(this.acc);
        this.ControlsInit();
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        MainPanel = new JPanel();
        MainPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 3, new Insets(0, 0, 0, 0), -1, -1));
        MainPanel.add(panel1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(panel2, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridBagLayout());
        panel3.setAutoscrolls(false);
        panel1.add(panel3, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel4.setMaximumSize(new Dimension(50, 2147483647));
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel3.add(panel4, gbc);
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel4.add(panel5, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel5.add(panel6, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        GroupList.setModel(defaultComboBoxModel1);
        panel6.add(GroupList, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel6.add(FieldList, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("信息组");
        panel5.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("条目");
        panel5.add(label2, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        panel4.add(scrollPane1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        ListMessage = new JList();
        scrollPane1.setViewportView(ListMessage);
        final JPanel panel7 = new JPanel();
        panel7.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 4, new Insets(0, 0, 0, 0), -1, -1));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel3.add(panel7, gbc);
        final JPanel panel8 = new JPanel();
        panel8.setLayout(new GridBagLayout());
        panel7.add(panel8, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel8.setBorder(BorderFactory.createTitledBorder(null, "信息输出", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JScrollPane scrollPane2 = new JScrollPane();
        scrollPane2.setEnabled(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel8.add(scrollPane2, gbc);
        tableMessage.setBackground(new Color(-4207361));
        tableMessage.setEnabled(false);
        scrollPane2.setViewportView(tableMessage);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel8.add(spacer1, gbc);
        final JPanel panel9 = new JPanel();
        panel9.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 5, new Insets(0, 0, 0, 0), -1, -1));
        panel9.setBackground(new Color(-5));
        panel7.add(panel9, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("全局搜索");
        panel9.add(label3, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panel9.add(allSearchText, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        panel9.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer3 = new com.intellij.uiDesigner.core.Spacer();
        panel9.add(spacer3, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        ButtonSearch.setText("搜索");
        panel9.add(ButtonSearch, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer4 = new com.intellij.uiDesigner.core.Spacer();
        panel7.add(spacer4, new com.intellij.uiDesigner.core.GridConstraints(1, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JPanel spacer5 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(spacer5, gbc);
        final JPanel spacer6 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel3.add(spacer6, gbc);
        final com.intellij.uiDesigner.core.Spacer spacer7 = new com.intellij.uiDesigner.core.Spacer();
        panel1.add(spacer7, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer8 = new com.intellij.uiDesigner.core.Spacer();
        panel1.add(spacer8, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JPanel panel10 = new JPanel();
        panel10.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel10.setBackground(new Color(-1281));
        MainPanel.add(panel10, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, new Dimension(-1, 20), 0, false));
        menuBar.setBackground(new Color(-6));
        panel10.add(menuBar, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer9 = new com.intellij.uiDesigner.core.Spacer();
        MainPanel.add(spacer9, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JToolBar toolBar1 = new JToolBar();
        MainPanel.add(toolBar1, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 20), null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("选择情况：");
        toolBar1.add(label4);
        selectLable.setText(" ");
        toolBar1.add(selectLable);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return MainPanel;
    }

    public void show() {
        frame = new JFrame("江科大教务处教研成果检索统计系统");
        frame.setContentPane(MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(900, 600);
        this.freshGroupCombobox();
        tableMessage.setEnabled(true);
        Event();
    }

    private void globalSearch() {
        allSearchText.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String value = allSearchText.getText().toString();
                    JSONObject result = message.globalSearch(value);
                    if (result.getBoolean("status")) {
                        JSONObject items = result.getJSONObject("result");

                    } else {
                        linkError(result.getString("message"));
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    private void freshGroupCombobox() {
        JSONObject result = message.getGroup();
        if (result.getBoolean("status")) {
            JSONObject Group = result.getJSONObject("Group");
            GroupCN = new JSONObject();
            for (String key : Group.keySet()) {
                GroupCN.put(Group.getString(key), key);
                GroupList.addItem(Group.getString(key));
            }
            freshFieldCombobox();
        } else {
            this.linkError(result.getString("message4"));
        }
    }

    private void freshFieldCombobox() {
        if (GroupList.getSelectedItem().toString() != null) {
            String GroupName = Objects.requireNonNull(GroupList.getSelectedItem()).toString();
            JSONObject result = message.getField(GroupCN.getString(GroupName), true);
            if (result.getBoolean("status")) {
                JSONObject Group = result.getJSONObject("Field");
                removeItems(FieldList);
                FieldList.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        if (arg0.getActionCommand().equals("comboBoxChanged")) {
                            freshList();
                        }
                    }
                });
                this.FieldEN = Group.getString("EN").split(";");
                this.FieldCN = Group.getString("CN").split(";");
                for (int i = 0; i < FieldCN.length; i++) {
                    FieldList.addItem(FieldCN[i]);
                }
            } else {
                this.linkError(result.getString("message"));
            }
        }

    }

    private void linkError(String message) {
        JOptionPane.showMessageDialog(MainPanel, message, "ERROR", JOptionPane.WARNING_MESSAGE);
    }

    private void freshList() {
        if (GroupList.getSelectedItem().toString() != null && FieldList.getSelectedItem().toString() != null) {
            String Group = GroupCN.getString(GroupList.getSelectedItem().toString());
            String Field = FieldEN[FieldList.getSelectedIndex()];
            JSONObject res = message.getList(Group, Field, "", "");
            if (res.getBoolean("status")) {
                ListSelectionListener[] act = ListMessage.getListSelectionListeners();
                for (int i = 0; i < act.length; i++) {
                    ListMessage.removeListSelectionListener(act[i]);
                }
                JSONArray list = res.getJSONArray("result");
                ListMessage.setListData(readList(list).toArray());
                ListMessageEvent();
            } else {
                this.linkError(res.getString("message"));
            }
        }
    }

    private void Event() {
        GroupList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                freshFieldCombobox();
            }
        });
        FieldList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                freshList();
            }
        });
        ListMessageEvent();
        ButtonSearch.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String text = allSearchText.getText();
                if (text.equals("")) {
                    JOptionPane.showConfirmDialog(frame, "搜索值不可为空", "参数错误", JOptionPane.OK_CANCEL_OPTION);
                } else {
                    JSONObject result = message.globalSearch(text);
                    GSTable(result.getJSONObject("result"));
                    selectLable.setText("全局搜索模式");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        allSearchText.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String text = allSearchText.getText();
                    if (text.equals("")) {
                        JOptionPane.showConfirmDialog(frame, "搜索值不可为空", "参数错误", JOptionPane.OK_CANCEL_OPTION);
                    } else {
                        JSONObject result = message.globalSearch(text);
                        GSTable(result.getJSONObject("result"));
                        selectLable.setText("全局搜索模式");
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        tableMessage.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int c = tableMessage.getSelectedColumn();
                    int h = tableMessage.getSelectedRow();
                    String[] text = tableMessage.getValueAt(h, 0).toString().split("#");
                    JSONObject result = message.getLine(text[0], "ID", text[1]);
                    if (result.getBoolean("status")) {
                        showMessage(result.getJSONObject("lines").getJSONObject("0"));
                    } else {
                        linkError(result.getString("message"));
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }


    private void GSTable(JSONObject result) {
        Vector<String> columnNames = new Vector<String>();
        String[] headName = {"ID", "信息组", "项目名"};
        columnNames.addAll(Arrays.asList(headName));
        Vector<Vector<String>> data = new Vector<>();
        String[] listName = result.getString("listName").split(";");
        for (int i = 0; i < listName.length; i++) {
            String key = listName[i];
            Vector<String> line;
            try {
                JSONObject Son = result.getJSONObject(key);
                for (String objectKey : Son.keySet()) {
                    line = new Vector<>();
                    line.add("");
                    line.add("");
                    line.add(objectKey);
                    data.add(line);
                    JSONObject item = Son.getJSONObject(objectKey);
                    String enGroup = GroupCN.getString(objectKey.split("<")[0]) + "#";
                    for (String itemkey : item.keySet()) {
                        if (!item.getString(itemkey).equals("")) {
                            line = new Vector<>();
                            line.add(enGroup + itemkey);
                            line.add(item.getString(itemkey));
                            data.add(line);
                        }
                    }
                }


            } catch (Exception e) {
                line = new Vector<>();
                line.add(key);
                line.add(result.getString(key));
                data.add(line);
            }

        }
        DefaultTableModel dtm = new DefaultTableModel(data, columnNames);
        tableMessage.setModel(dtm);
        FitTableColumns(tableMessage, 450);
    }

    private void ListMessageEvent() {
        ListMessage.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String Group = GroupCN.getString(GroupList.getSelectedItem().toString());
                String Key = FieldEN[FieldList.getSelectedIndex()];
                String value = ListMessage.getSelectedValue().toString();
                JSONObject res = message.getLine(Group, Key, value);
                freshSelectLable();
                if (res.getBoolean("status")) {
                    OutTable(res.getJSONObject("lines"), FieldCN);
                } else {
                    linkError(res.getString("message"));
                }
            }
        });
    }

    private void creatMenu() {
        JMenu fileMenu = new JMenu("文件");
        JMenu accountMenu = new JMenu("账户");
        menuBar.add(fileMenu);
        menuBar.add(accountMenu);

        JMenuItem fileGetModel = new JMenuItem("获取模板EXCEL");
        JMenuItem fileOutPut = new JMenuItem("导出当前表格内容");
        fileMenu.add(fileGetModel);
        fileMenu.add(fileOutPut);

        JMenuItem accountSignOut = new JMenuItem("登出");
        System.out.println(acc.getIdentity());
        if (acc.getIdentity() == 0) {
            JMenuItem accountGiveIdentity = new JMenuItem("提升指定账户权限");
            accountMenu.add(accountGiveIdentity);
        }
        accountMenu.add(accountSignOut);
        accountSignOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int res = JOptionPane.showConfirmDialog(frame, "是否登出", "请确认", JOptionPane.OK_CANCEL_OPTION);
                if (res == 0) {
                    frame.dispose();
                    login.show();
                }
            }
        });
    }

    private void showMessage(JSONObject item) {
        StringBuilder text = new StringBuilder();
        for (String key : item.keySet()) {
            String now = " \n " + key + ":" + item.getString(key);
            text.append(now);
        }
        JOptionPane.showMessageDialog(frame, text, "详细信息", JOptionPane.WARNING_MESSAGE);
    }

    private void OutTable(JSONObject js, String[] headName) {
        Vector<String> columnNames = new Vector<String>();
        columnNames.addAll(Arrays.asList(headName));
        Vector<Vector<String>> data = new Vector<>();
        String enFroup = GroupCN.getString(GroupList.getSelectedItem().toString());
        for (String key : js.keySet()) {
            Vector<String> line = new Vector<>();
            JSONObject Son = js.getJSONObject(key);
            for (int i = 0; i < headName.length; i++) {
                String behind = "";
                if (i == 0) {
                    behind = enFroup + "#";
                }
                line.add(behind + Son.getString(headName[i]));
            }
            data.add(line);
        }
        DefaultTableModel dtm = new DefaultTableModel(data, columnNames);
        tableMessage.setModel(dtm);
        FitTableColumns(tableMessage, 200);

    }

    public void FitTableColumns(JTable myTable, int lengthMax) {
        JTableHeader header = myTable.getTableHeader();
        int rowCount = myTable.getRowCount();
        Enumeration columns = myTable.getColumnModel().getColumns();
        while (columns.hasMoreElements()) {
            TableColumn column = (TableColumn) columns.nextElement();
            int col = header.getColumnModel().getColumnIndex(column.getIdentifier());
            int width = (int) myTable.getTableHeader().getDefaultRenderer()
                    .getTableCellRendererComponent(myTable, column.getIdentifier(), false, false, -1, col)
                    .getPreferredSize().getWidth();
            for (int row = 0; row < rowCount; row++) {
                int preferedWidth = (int) myTable.getCellRenderer(row, col)
                        .getTableCellRendererComponent(myTable, myTable.getValueAt(row, col), false, false, row, col)
                        .getPreferredSize().getWidth();
                width = Math.max(width, preferedWidth);
            }
            header.setResizingColumn(column);
            int newWidth = width + myTable.getIntercellSpacing().width + 10;
            if (newWidth > lengthMax) {
                newWidth = lengthMax;
            }
            column.setWidth(newWidth);
        }
    }

    public void freshSelectLable() {
        String text = "选择" + Objects.requireNonNull(GroupList.getSelectedItem()).toString() + "组<限定:" + Objects.requireNonNull(FieldList.getSelectedItem()).toString() + "为" + ListMessage.getSelectedValue().toString() + ">";
        selectLable.setText(text);
    }

    private JSONArray readList(JSONArray ja) {
        JSONArray result = new JSONArray();
        for (int i = 0; i < ja.size(); i++) {
            try {
                JSONArray now = ja.getJSONArray(i);
                for (int j = 0; j < now.size(); j++) {
                    if (!result.contains(now.getString(j))) {
                        result.add(now.getString(j));
                    }
                }
            } catch (Exception e) {
                String now = ja.getString(i);
                if (!result.contains(now)) {
                    result.add(now);
                }
            }
        }
        return result;
    }

    private void removeItems(JComboBox jcb) {
        ActionListener[] actions = jcb.getActionListeners();
        for (int i = 0; i < actions.length; i++) {
            jcb.removeActionListener(actions[i]);
        }
        jcb.removeAllItems();

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}