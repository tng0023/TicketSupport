package com.tommy;

import javax.swing.*;
import javax.swing.text.Element;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.KeyAdapter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Tommy on 4/7/2016.
 */
public class TicketSupport extends JFrame {

    private JPanel rootPanel;
    private JTextField descriptionProblem;
    private JTextField reporterField;
    private JLabel reporter;
    private JComboBox priorityOfTicket;
    private JLabel priorityLabel;
    private JButton submitButton;
    private JList ticketList;
    private JButton deleteButton;
    private JButton quitButton;
    private JButton resolveTicketButton;
    private JList ticketResolved;
    private Date ReportedDate;
    private static int staticTicketIDCounter = 1;

    private DefaultListModel<String> listModel;

    protected TicketSupport() {
        super("Ticket Support");
        setContentPane(rootPanel);
        setPreferredSize(new Dimension(1200, 1000));

        JFrame window = new JFrame();
        window.setLocation(500, 100);
        window.setUndecorated(true);

        listModel = new DefaultListModel<String>();

        ticketList.setModel(listModel);

        configurePriority();

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String problem = descriptionProblem.getText();
                problem = problem.trim();

                String reporter = reporterField.getText();
                reporter = reporter.trim();

                ReportedDate = new Date();

                String priority = (String) priorityOfTicket.getSelectedItem();

                //listModel.addElement("Ticket ID: "  + TicketID + " Ticket problem is: " + problem + "  Reported by: " + reporter + "  Priority level: "
                //+ priority + " " + ReportedDate);
                descriptionProblem.setText("");
                reporterField.setText("");

                //Check to see if the JTextField is empty - if so, ignore.
                if (problem.length() == 0 || reporter.length() == 0) {
                    return;
                } else {
                    int TicketID = staticTicketIDCounter++;
                    listModel.addElement("Ticket ID: " + TicketID + "  |   Ticket problem is: " + problem + "  |  Reported by: " + reporter + "  |  Priority level: "
                            + priority + "  |  Reported date: " + ReportedDate);
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = ticketList.getSelectedIndex();
                String result = (String) ticketList.getSelectedValue();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                    JOptionPane.showMessageDialog(TicketSupport.this, "DELETED " + result);
                }
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        resolveTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = ticketList.getSelectedIndex();
                String result = (String) ticketList.getSelectedValue();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                    JOptionPane.showMessageDialog(TicketSupport.this, "RESOLVED " + result);
                }
            }
        });

    }

    private void configurePriority() {
        for (int x = 1; x <= 5; x++) {
            if (x == 1) {
                priorityOfTicket.addItem(x + " Very Low");
            } else if (x == 2) {
                priorityOfTicket.addItem(x + " Low");
            } else if (x == 3) {
                priorityOfTicket.addItem(x + " Medium");
            } else if (x == 4) {
                priorityOfTicket.addItem(x + " High");
            } else if (x == 5) {
                priorityOfTicket.addItem(x + " Very High");

            }
        }
    }

    public class Writer {
        public void main(String args[]) throws IOException {
            FileWriter writer = new FileWriter("deletedtickets.txt");
            writer.write(listModel.getSize());
            writer.close();
        }

    }
}

