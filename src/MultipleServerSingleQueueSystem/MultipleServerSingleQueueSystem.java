/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleServerSingleQueueSystem;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Calvin Low
 */
public class MultipleServerSingleQueueSystem extends javax.swing.JFrame {

    static int second = 360;
    static PriorityQueue<Job> jobQueue = new PriorityQueue<>();
    static int jobCounter = 0;
    static int waitingTime = 0;

    /**
     * Creates new form UI
     */
    public MultipleServerSingleQueueSystem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        time = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        queue = new java.awt.TextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Multiple Server Single Queue System");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        time.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("Time");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Job Queue");

        table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Server", "Job ID", "Remaining Time (s)", "Serviced Job"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(100);
            table.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(queue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(queue, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(888, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MultipleServerSingleQueueSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultipleServerSingleQueueSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultipleServerSingleQueueSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultipleServerSingleQueueSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultipleServerSingleQueueSystem().setVisible(true);
                queue.setEditable(false);
                for (int i = 0; i < 5; i++) {
                    table.getModel().setValueAt("Server " + (i + 1), i, 0);
                    if (i != 4) {
                        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                        table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                    }
                }
                DefaultTableCellRenderer centerHeader = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
                centerHeader.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            }
        });

        Task.initServer();
        Task.randArrival();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                Iterator<Job> it = jobQueue.iterator();

                if (Task.check(second)) {
                    boolean duplicate = false;
                    Job job;
                    do {
                        job = new Job(Task.randID(), Task.randomNumber(5, 18));
                        while (it.hasNext()) {
                            if (it.next().equals(job)) {
                                duplicate = true;
                                break;
                            }
                        }
                    } while (duplicate);
                    jobQueue.add(job);
                    jobCounter++;
                    switch (job.getDuration() / 8) {
                        case 0:
                            ++Task.counter[0];
                            break;
                        case 1:
                            ++Task.counter[1];
                            break;
                        case 2:
                            ++Task.counter[2];
                            break;
                    }
                }

                time.setText("Time remaining - " + second / 60 + ":" + ((second % 60 / 10 == 0) ? ("0" + second % 60) : second % 60));

                for (int i = 0; i < 5; i++) {
                    Job tempJob = Task.server[i].getJob();
                    if (!Task.server[i].isFree()) {
                        if (tempJob.getChangingDuration() > 1) {
                            if (tempJob.check()) {
                                jobQueue.add(tempJob);
                                Task.server[i].setFree(true);
                                Task.server[i].setJob(null);
                            } else {
                                Task.server[i].decreaseTime();
                            }
                        } else if (tempJob.getChangingDuration() == 1) {
                            Task.server[i].setFree(true);
                            Task.server[i].setJob(null);
                        }
                    } else if (!jobQueue.isEmpty()) {
                        tempJob = jobQueue.poll();
                        Task.server[i].setJob(tempJob);
                        Task.server[i].setFree(false);
                        Task.server[i].increaseCounter();
                    }

                    String id = Task.server[i].isFree() ? "" : tempJob.getId();
                    String rem = Task.server[i].isFree() ? "" : String.valueOf(tempJob.getChangingDuration());

                    table.getModel().setValueAt(id, i, 1);
                    table.getModel().setValueAt(rem, i, 2);
                    table.getModel().setValueAt(Task.server[i].getCounter(), i, 3);
                }

                StringBuilder sb = new StringBuilder();

                for (Job j : jobQueue) {
                    sb.append(j.getId()).append(" - ").append(j.getChangingDuration()).append("s").append("\n");
                }

                queue.setText(sb.toString());

                waitingTime += jobQueue.size();
                /*System.out.print("(");
                for(Job j : jobQueue) {
                    System.out.print( j.getId() + "   ");
                }*/// Test for waiting time

                if (second == 0) {
                    this.cancel();
                    int message = JOptionPane.showOptionDialog(null, "The total number of jobs processed : " + jobCounter + " jobs\n"
                            + "Average number of jobs processed per minute : " + "\n"
                            + "     Server 1 = " + String.format("%.2f", Task.server[0].getCounter() / 6.0) + " jobs per minute\n"
                            + "     Server 2 = " + String.format("%.2f", Task.server[1].getCounter() / 6.0) + " jobs per minute\n"
                            + "     Server 3 = " + String.format("%.2f", Task.server[2].getCounter() / 6.0) + " jobs per minute\n"
                            + "     Server 4 = " + String.format("%.2f", Task.server[3].getCounter() / 6.0) + " jobs per minute\n"
                            + "     Server 5 = " + String.format("%.2f", Task.server[4].getCounter() / 6.0) + " jobs per minute\n"
                            + "The average arrival rate per minute : " + String.format("%.2f", Task.arrivalRate()) + " jobs arrived per minute\n"
                            + "Total waiting time : " + waitingTime + " seconds\n"
                            + "The average waiting time per job : " + String.format("%.2f", ((float)waitingTime / jobCounter)) + " seconds per job\n"
                            + "The number of jobs processed on the first attempt : " + Task.counter[0] + " jobs\n"
                            + "The number of jobs had to be requeued once : " + Task.counter[1] + " jobs\n"
                            + "The number of jobs had to be requeued twice : " + Task.counter[2] + " jobs", "Report for Multiple Server Single Queue System",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                    if (message == 0) {
                        System.exit(0);
                    }

                }
                --second;
            }
        }, 1000, 1000);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private static java.awt.TextArea queue;
    private static javax.swing.JTable table;
    private java.awt.TextArea textArea1;
    private static javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
