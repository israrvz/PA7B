/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.dao;

import com.classicmodels7b.model.OfficesModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @israel ramos
 */
public class OfficesDaoImpl implements OfficesDao{
Conexion con = new Conexion();
    @Override
    public String createOffice(OfficesModel newOffice) {
        String serverAnswer  = null;
        try {
            PreparedStatement prepareStatement = con.getConnection().prepareStatement("INSERT INTO offices (officeCode, city, phone, addressLine1, addressLine2, state, country, postalCode, territory)VALUES(?,?,?,?,?,?,?,?,?)");
            prepareStatement.setString(1, newOffice.getOfficeCode());
            prepareStatement.setString(2, newOffice.getCity());
            prepareStatement.setString(3, newOffice.getPhone());
            prepareStatement.setString(4, newOffice.getAddressLine1());
            prepareStatement.setString(5, newOffice.getAddressLine2());
            prepareStatement.setString(6, newOffice.getState());
            prepareStatement.setString(7, newOffice.getCountry());
            prepareStatement.setString(8, newOffice.getPostalCode());
            prepareStatement.setString(9, newOffice.getTerritory());

           int numAffectedRows = prepareStatement.executeUpdate();
           
           if (numAffectedRows > 0){
               serverAnswer="The Office was inserted";
           }
        } catch (Exception e) {
            System.out.println("ERROR" + e.getMessage() );
            serverAnswer="There was an error";
        }
        return serverAnswer;
    }

    @Override
    public ArrayList<OfficesModel> readOffices() {
        ArrayList<OfficesModel> officesList = new ArrayList();
        OfficesModel auxOffice;
        try{
            PreparedStatement preparedStatement = con.getConnection().prepareStatement("SELECT * FROM offices");
            ResultSet resultSet =  preparedStatement.executeQuery();
            while (resultSet.next()){
                auxOffice= new OfficesModel();
                auxOffice.setOfficeCode(resultSet.getString(1));
                auxOffice.setCity(resultSet.getString(2));
                auxOffice.setPhone(resultSet.getString(3));
                auxOffice.setAddressLine1(resultSet.getString(4));
                auxOffice.setAddressLine2(resultSet.getString(5));
                auxOffice.setState(resultSet.getString(6));
                auxOffice.setCountry(resultSet.getString(7));
                auxOffice.setPostalCode(resultSet.getString(8));
                auxOffice.setTerritory(resultSet.getString(9));
                
                officesList.add(auxOffice);
                
            }
        } catch(SQLException e){
            System.out.println("ERROR " + e.getMessage());
        }
        return officesList;
    }
    

    @Override
    public String updateOffice(OfficesModel auxOffice) {
        
     String serverAnswer  = null;
        try {
            PreparedStatement prepareStatement = con.getConnection().prepareStatement("UPDATE offices SET city=?,phone=?,addressLine1=?,addressLine2=?,state=?,country=?,postalCode=?,territory=? WHERE officeCode=?");
                   
            prepareStatement.setString(1, auxOffice.getCity());
            prepareStatement.setString(2, auxOffice.getPhone());
            prepareStatement.setString(3, auxOffice.getAddressLine1());
            prepareStatement.setString(4, auxOffice.getAddressLine2());
            prepareStatement.setString(5, auxOffice.getState());
            prepareStatement.setString(6, auxOffice.getCountry());
            prepareStatement.setString(7, auxOffice.getPostalCode());
            prepareStatement.setString(8, auxOffice.getTerritory());
            prepareStatement.setString(9, auxOffice.getOfficeCode());
            
            

           int numAffectedRows = prepareStatement.executeUpdate();
           
           if (numAffectedRows > 0){
               serverAnswer="The Office was Modifiqued";
           }
        } catch (Exception e) {
            System.out.println("ERROR" + e.getMessage() );
            serverAnswer="There was an error";
        }
        return serverAnswer;
    }

    public String deleteOffice(String OfficeCode){
      String serverAnswer  = null;
      try{
            PreparedStatement prepareStatement = con.getConnection().prepareStatement("DELETE from offices where OfficeCode = "+ OfficeCode); 
            
            int numAffectedRows = prepareStatement.executeUpdate();
           
           if (numAffectedRows > 0){
               serverAnswer="The Office was deleted";
           }
        } catch(SQLException e){
             System.out.println("ERROR" + e.getMessage() );
            serverAnswer="There was an error";
        }
      return serverAnswer;
    }
    
    
}
