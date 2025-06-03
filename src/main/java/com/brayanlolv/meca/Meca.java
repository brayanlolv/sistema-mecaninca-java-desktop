/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.brayanlolv.meca;
import com.brayanlolv.meca.telas.MultiPage;
import com.brayanlolv.meca.dao.ClienteDAO;
import com.brayanlolv.meca.model.Cliente;
import com.brayanlolv.meca.controller.ClienteController;
import java.util.List;

import javax.persistence.EntityManager;
import com.brayanlolv.meca.dao.EntityManagerUtil;
public class Meca {
    

    
 
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
            Exemplo.setar();
            MultiPage.main();
        }
}