/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.dao;

import com.classicmodels7b.model.OfficesModel;
import java.util.ArrayList;

/**
 *
 * @israel ramos
 */
public interface OfficesDao {
   //recive un objeto de tipo OfficeModel y crea una neuva oficina en la base de datos
    public String createOffice(OfficesModel newOffice);
    
    //devuelve un listado de las oficinas almacenadas en la tabla offices
    public ArrayList<OfficesModel> readOffices();
    //recibe un objeto de tipo OfficeModel y actualiza una oficna
    public String updateOffice(OfficesModel auxOffice);
    // borra una oficina de la tabla offices deacuerdo al id recibido
    public String deleteOffice(String OfficeCode);
}
