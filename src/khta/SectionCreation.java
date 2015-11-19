/*
 * Copyright (C) 2015 Software&System Lab. Kangwon National University.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package khta;

import infra.Infra;
import infra.Section;
import infra.infraobject.Corridor;
import infra.infraobject.Detector;
import infra.infraobject.RNode;
import infra.infraobject.Station;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.KHTAParam;

/**
 *
 * @author soobin Jeon <j.soobin@gmail.com>, chungsan Lee <dj.zlee@gmail.com>,
 * youngtak Han <gksdudxkr@gmail.com>
 */
public class SectionCreation extends javax.swing.JPanel {

    private final Infra infra;
    /**
     * Creates new form SectionCreation
     * @param _infra
     */
    public SectionCreation(Infra _infra){
        initComponents();
        infra = _infra;
        
        initCorridorList();
        loadSection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbxCorridorList = new javax.swing.JComboBox();
        cbxStartStation = new javax.swing.JComboBox();
        cbxEndStation = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCreateSection = new javax.swing.JButton();
        tbxSectionNane = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSection = new javax.swing.JList();
        btnDeleteSection = new javax.swing.JButton();
        cbxSectionInfo = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbxSectionInfo = new javax.swing.JTextArea();

        setName("Section Creation"); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Section", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Corridor Lists");

        cbxCorridorList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxCorridorList.setPreferredSize(new java.awt.Dimension(200, 30));
        cbxCorridorList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCorridorListActionPerformed(evt);
            }
        });

        cbxStartStation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxStartStation.setPreferredSize(new java.awt.Dimension(200, 30));
        cbxStartStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxStartStationActionPerformed(evt);
            }
        });

        cbxEndStation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxEndStation.setPreferredSize(new java.awt.Dimension(200, 30));
        cbxEndStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEndStationActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Start Station");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("End Station");

        btnCreateSection.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCreateSection.setLabel("Create Section");
        btnCreateSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateSectionActionPerformed(evt);
            }
        });

        tbxSectionNane.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbxSectionNane.setPreferredSize(new java.awt.Dimension(300, 21));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Section Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxCorridorList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxStartStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cbxEndStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCreateSection)
                    .addComponent(tbxSectionNane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCorridorList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxStartStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxEndStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbxSectionNane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreateSection)
                .addGap(16, 16, 16))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Section List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        listSection.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listSection.setPreferredSize(new java.awt.Dimension(190, 30));
        listSection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listSectionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listSection);

        btnDeleteSection.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeleteSection.setText("Delete Section");
        btnDeleteSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSectionActionPerformed(evt);
            }
        });

        cbxSectionInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxSectionInfo.setPreferredSize(new java.awt.Dimension(200, 30));
        cbxSectionInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSectionInfoActionPerformed(evt);
            }
        });

        tbxSectionInfo.setColumns(20);
        tbxSectionInfo.setRows(5);
        jScrollPane2.setViewportView(tbxSectionInfo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDeleteSection)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbxSectionInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDeleteSection)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSectionInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxCorridorListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCorridorListActionPerformed
        // TODO add your handling code here:
        setStation((Corridor)cbxCorridorList.getSelectedItem());
    }//GEN-LAST:event_cbxCorridorListActionPerformed

    private void btnCreateSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateSectionActionPerformed
        // TODO add your handling code here:
        saveSectionBtn();
    }//GEN-LAST:event_btnCreateSectionActionPerformed

    private void cbxStartStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxStartStationActionPerformed
        // TODO add your handling code here:
        int cidx = this.cbxStartStation.getSelectedIndex();
        int eidx = this.cbxEndStation.getSelectedIndex();
        int lidx = this.cbxEndStation.getItemCount()-1;
        int nidx = (cidx+1) > lidx ? lidx : cidx+1;
        
        if(cidx > eidx)
            this.cbxEndStation.setSelectedIndex(nidx);
    }//GEN-LAST:event_cbxStartStationActionPerformed

    private void cbxEndStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEndStationActionPerformed
        // TODO add your handling code here:
        int cidx = this.cbxEndStation.getSelectedIndex();
        int sidx = this.cbxStartStation.getSelectedIndex();
        int pidx = (cidx-1) < 0 ? 0 : cidx-1;
        
        if(cidx < sidx)
            this.cbxStartStation.setSelectedIndex(pidx);
    }//GEN-LAST:event_cbxEndStationActionPerformed

    private void btnDeleteSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSectionActionPerformed
        // TODO add your handling code here:
        deleteSection();
    }//GEN-LAST:event_btnDeleteSectionActionPerformed

    private void cbxSectionInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSectionInfoActionPerformed
        // TODO add your handling code here:
        selectSectionInfo((RNode)cbxSectionInfo.getSelectedItem());
    }//GEN-LAST:event_cbxSectionInfoActionPerformed

    private void listSectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSectionMouseClicked
        // TODO add your handling code here:
        ListenSectionInfo();
    }//GEN-LAST:event_listSectionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateSection;
    private javax.swing.JButton btnDeleteSection;
    private javax.swing.JComboBox cbxCorridorList;
    private javax.swing.JComboBox cbxEndStation;
    private javax.swing.JComboBox cbxSectionInfo;
    private javax.swing.JComboBox cbxStartStation;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listSection;
    private javax.swing.JTextArea tbxSectionInfo;
    private javax.swing.JTextField tbxSectionNane;
    // End of variables declaration//GEN-END:variables

    private void initCorridorList() {
        for(Corridor c : infra.getCorridors())
            this.cbxCorridorList.addItem(c);
    }

    private void setStation(Corridor corridor) {
//        System.out.println("Changed Corridors to : "+corridor.getName());
        if(this.cbxStartStation.getItemCount() != 0)
            this.cbxStartStation.removeAllItems();
        if(this.cbxEndStation.getItemCount() != 0)
            this.cbxEndStation.removeAllItems();
        
        for(Station s : corridor.getStations()){
            this.cbxStartStation.addItem(s);
            this.cbxEndStation.addItem(s);
        }
    }

    private void saveSectionBtn() {
        if(this.tbxSectionNane.getText().equals(""))
            return;
        // timer for splash window
        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                saveSection();
            }
        }, 10);
    }
    
    private void saveSection() {
        this.btnCreateSection.setText(KHTAParam.SECTION_LOADING);
        this.btnCreateSection.setEnabled(false);
        
        String corid = ((Corridor)cbxCorridorList.getSelectedItem()).getID();
        String snid = ((RNode)cbxStartStation.getSelectedItem()).getID();
        String enid = ((RNode)cbxEndStation.getSelectedItem()).getID();
        String sname = tbxSectionNane.getText();
        
        try {
            infra.CreateSection(sname,corid, snid, enid);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        this.btnCreateSection.setText(KHTAParam.SECTION_SAVE);
        this.btnCreateSection.setEnabled(true);
        
        loadSection();
    }

    private void loadSection() {
        listSection.removeAll();
        listSection.setListData(infra.getSections());
    }

    private void deleteSection() {
        if(listSection == null) return;
        int res = JOptionPane.showConfirmDialog(this, "Delete this section?", "Confirm", JOptionPane.YES_NO_OPTION);
        Section ss = (Section)listSection.getSelectedValue();
        if(res == JOptionPane.YES_OPTION){
            File cache = new File(KHTAParam.SECTION_DIR + File.separator + Section.getCacheFileName(ss.getName()));
            cache.delete();
            int idx = this.listSection.getSelectedIndex();
            //this.listSection.remove(idx);
            infra.deleteSection(ss);
            loadSection();
        }
    }

    private void ListenSectionInfo() {
        Section ss = (Section)listSection.getSelectedValue();
        cbxSectionInfo.removeAllItems();
        for(RNode r : ss.getRNodes()){
            cbxSectionInfo.addItem(r);
        }
        
        
    }

    private void selectSectionInfo(RNode rNode) {
        this.tbxSectionInfo.setText("");
        String str = "RNode Info\n";
        str += "RNode ID : "+rNode.getID() + "\n";
        str += "RNode Name : "+rNode.getName()+ "\n";
        str += "RNode Type : "+rNode.getNodeType().toString()+ "\n";
        str += "Direction : "+rNode.getDirection().toString()+ "\n";
        
        if(!rNode.getDetectors().isEmpty()){
            str += "\nDetector Info\n";
            for(Detector d : rNode.getDetectors().values()){
                str += "Did : "+d.getID()+ ", ";
                str += "Dtype : "+d.getLaneType().toString()+ "\n";
            }
        }
        this.tbxSectionInfo.setText(str);
    }
}
