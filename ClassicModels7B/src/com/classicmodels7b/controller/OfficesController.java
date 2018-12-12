/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.controller;

import com.classicmodels7b.dao.OfficesDaoImpl;
import com.classicmodels7b.model.OfficesModel;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @israel ramos
 */
public class OfficesController {
    
       OfficesDaoImpl officesDaoImpl= new OfficesDaoImpl();
       
    public String createOffice(String officeCode, String city, String phone, String addressLine1, String addressLine2, String state, String country, String postalCode, String territory) {
        OfficesModel newOffice;
        newOffice = new OfficesModel(officeCode, city, phone, addressLine1, addressLine2, state, country, postalCode, territory);
        String serverAnswer = officesDaoImpl.createOffice(newOffice);

        return serverAnswer;
    }
  
    public void readOffices(JTable table){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("OFFICE CODE");
        tableModel.addColumn("CITY");
        tableModel.addColumn("PHONE");
        tableModel.addColumn("ADDRESS LINE 1");
        tableModel.addColumn("ADDRESS LINE 2");
        tableModel.addColumn("STATE");
        tableModel.addColumn("COUNTRY");
        tableModel.addColumn("POSTAL CODE");
        tableModel.addColumn("TERRITORY");
        
        int numRegisters = officesDaoImpl.readOffices().size();
        Object[] row = new Object[9];
        for (int i = 0; i < numRegisters; i++) {
            row[0] = officesDaoImpl.readOffices().get(i).getOfficeCode();
            row[1] = officesDaoImpl.readOffices().get(i).getCity();
            row[2] = officesDaoImpl.readOffices().get(i).getPhone();
            row[3] = officesDaoImpl.readOffices().get(i).getAddressLine1();
            row[4] = officesDaoImpl.readOffices().get(i).getAddressLine2();
            row[5] = officesDaoImpl.readOffices().get(i).getState();
            row[6] = officesDaoImpl.readOffices().get(i).getCountry();
            row[7] = officesDaoImpl.readOffices().get(i).getPostalCode();
            row[8] = officesDaoImpl.readOffices().get(i).getTerritory();
            
            tableModel.addRow(row);
            
            
            
        } 
        table.setModel(tableModel);
        
        
    }
    public String updateOffice(String officeCode, String city, String phone, String addressLine1, String addressLine2, String state, String country, String postalCode, String territory) {
        OfficesModel auxOffice;
        auxOffice = new OfficesModel(officeCode, city, phone, addressLine1, addressLine2, state, country, postalCode, territory);
        String serverAnswer = officesDaoImpl.updateOffice(auxOffice);
        return serverAnswer;
    }
    public String deleteOffice(String OfficeCode){
     String serverAnswer= officesDaoImpl.deleteOffice(OfficeCode);
    return serverAnswer;
    } 
}
