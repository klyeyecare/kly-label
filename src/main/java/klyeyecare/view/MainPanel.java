/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klyeyecare.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.table.DefaultTableModel;
import klyeyecare.controller.FrameController;
import klyeyecare.model.Frame;

/**
 *
 * @author omarwerleman
 */
public class MainPanel extends javax.swing.JFrame {

    private final FrameController ctrl;
    private List<Frame> frames;
    private List<Frame> tableData;
    private String[] columnNames;
    private List<Frame> manufactures;
    private List<Frame> collections;

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
        initComponents();
        ctrl = new FrameController();
        frames = ctrl.findFrame();

        //SET TABLE 
        columnNames = new String[]{"Id", "Manufacturer", "Collection", "Frame", "UPC", "Retail"};
        Object[][] data = new Object[frames.size()][columnNames.length];
        for (int i = 0; i < frames.size(); i++) {
            data[i][0] = frames.get(i).getFrameid();
            data[i][1] = frames.get(i).getManufacturername();
            data[i][2] = frames.get(i).getCollectionname();
            data[i][3] = frames.get(i).getFramename();
            data[i][4] = frames.get(i).getUpccode();
            data[i][5] = frames.get(i).getRetailprice();
        }
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        frameTable.setModel(model);

        //SET MANUFACTURE
        manufactures = io.vavr.collection.List.ofAll(frames)
                .distinctBy(Frame::getManufacturername)
                .toJavaList();

        //SET COLLECTION
        collections = io.vavr.collection.List.ofAll(frames)
                .distinctBy(Frame::getCollectionname)
                .toJavaList();

        //SET DROPDOWN
        comboManufacture.removeAllItems();
        comboManufacture.addItem("");
        manufactures.forEach(frame -> {
            comboManufacture.addItem(frame.getManufacturername());
        });

        comboCollection.removeAllItems();
        comboCollection.addItem("");
        collections.forEach(frame -> {
            comboCollection.addItem(frame.getCollectionname());
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboManufacture = new javax.swing.JComboBox<>();
        comboCollection = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        frameTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboManufacture.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboManufacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboManufactureActionPerformed(evt);
            }
        });

        comboCollection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCollection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCollectionActionPerformed(evt);
            }
        });

        frameTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(frameTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(comboManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboCollection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCollection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboManufactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboManufactureActionPerformed
        String manufactureSelected = (String) comboManufacture.getSelectedItem();
        if (manufactureSelected != null) {
            if (manufactureSelected.length() > 0) {
                System.out.println(manufactureSelected + " selected");

                //SET COMBO
                comboCollection.removeAllItems();
                comboCollection.addItem("");
                collections.forEach(frame -> {
                    if (frame.getManufacturername().equals(manufactureSelected)) {
                        comboCollection.addItem(frame.getCollectionname());
                    }
                });

                //SET TABLE
                DefaultTableModel model = (DefaultTableModel) frameTable.getModel();
                model.setRowCount(0);

                List<Frame> framesFromManufacture = new ArrayList<>();
                for (int i = 0; i < frames.size(); i++) {
                    if (frames.get(i).getManufacturername().equals(manufactureSelected)) {
                        framesFromManufacture.add(frames.get(i));
                    }
                }

                Object[][] data = new Object[framesFromManufacture.size()][columnNames.length];
                for (int j = 0; j < framesFromManufacture.size(); j++) {
                    data[j][0] = framesFromManufacture.get(j).getFrameid();
                    data[j][1] = framesFromManufacture.get(j).getManufacturername();
                    data[j][2] = framesFromManufacture.get(j).getCollectionname();
                    data[j][3] = framesFromManufacture.get(j).getFramename();
                    data[j][4] = framesFromManufacture.get(j).getUpccode();
                    data[j][5] = framesFromManufacture.get(j).getRetailprice();
                    model.addRow(data[j]);
                }

            } else {
                System.out.println("no selection made");

                //SET COMBO
                comboCollection.removeAllItems();
                comboCollection.addItem("");
                collections.forEach(frame -> {
                    comboCollection.addItem(frame.getCollectionname());
                });
            }
        }
    }//GEN-LAST:event_comboManufactureActionPerformed

    private void comboCollectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCollectionActionPerformed
        String selectedCollection = (String) comboCollection.getSelectedItem();
        if (selectedCollection != null) {
            if (selectedCollection.length() > 0) {
                System.out.println(selectedCollection + " selected");

                //SET TABLE
                DefaultTableModel model = (DefaultTableModel) frameTable.getModel();
                model.setRowCount(0);

                List<Frame> frameFromCollection = new ArrayList<>();
                frames.forEach(frame -> {
                    if (frame.getCollectionname().equals(selectedCollection)) {
                        frameFromCollection.add(frame);
                    }
                });

                Object[][] data = new Object[frameFromCollection.size()][columnNames.length];
                for (int j = 0; j < frameFromCollection.size(); j++) {
                    data[j][0] = frameFromCollection.get(j).getFrameid();
                    data[j][1] = frameFromCollection.get(j).getManufacturername();
                    data[j][2] = frameFromCollection.get(j).getCollectionname();
                    data[j][3] = frameFromCollection.get(j).getFramename();
                    data[j][4] = frameFromCollection.get(j).getUpccode();
                    data[j][5] = frameFromCollection.get(j).getRetailprice();
                    model.addRow(data[j]);
                }

            } else {
                System.out.println("no selection");

                //CHECK MENUFACTURE SELECTION
                String selectedManufacture = (String) comboManufacture.getSelectedItem();
                if (selectedManufacture != null) {

                    List<Frame> frameFromNoSelection = new ArrayList<>();

                    if (selectedManufacture.length() > 0) {

                        for (int i = 0; i < frames.size(); i++) {
                            if (frames.get(i).getManufacturername().equals(selectedManufacture)) {
                                frameFromNoSelection.add(frames.get(i));
                            }
                        }

                    } else {

                        frameFromNoSelection = frames;

                    }

                    //SET TABLE
                    DefaultTableModel model = (DefaultTableModel) frameTable.getModel();
                    model.setRowCount(0);

                    Object[][] data = new Object[frameFromNoSelection.size()][columnNames.length];
                    for (int j = 0; j < frameFromNoSelection.size(); j++) {
                        data[j][0] = frameFromNoSelection.get(j).getFrameid();
                        data[j][1] = frameFromNoSelection.get(j).getManufacturername();
                        data[j][2] = frameFromNoSelection.get(j).getCollectionname();
                        data[j][3] = frameFromNoSelection.get(j).getFramename();
                        data[j][4] = frameFromNoSelection.get(j).getUpccode();
                        data[j][5] = frameFromNoSelection.get(j).getRetailprice();
                        model.addRow(data[j]);
                    }

                }
            }
        }
    }//GEN-LAST:event_comboCollectionActionPerformed

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
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboCollection;
    private javax.swing.JComboBox<String> comboManufacture;
    private javax.swing.JTable frameTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
