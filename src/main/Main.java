/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Models.ModelAgenda;
import Views.ViewAgenda;
import Controllers.ControllerAgenda;



public class Main {

    
    public static void main(String[] args) {
       ModelAgenda modelAgenda = new ModelAgenda();
        ViewAgenda viewAgenda = new ViewAgenda();
        ControllerAgenda controllerAgenda = new ControllerAgenda(modelAgenda, viewAgenda);
    }
    
}
