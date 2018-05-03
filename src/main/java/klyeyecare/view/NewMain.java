/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klyeyecare.view;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import klyeyecare.controller.FrameController;
import klyeyecare.model.Frame;

/**
 *
 * @author Yourainne
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//
//        FrameController ctrl = new FrameController();
//
//        ctrl.findManufacture().forEach((s) -> {
//            
//           System.out.println(s); 
//           
//            ctrl.findCollectionByManufacturerName(s).forEach((s2) -> {
//
//                ctrl.findManufactureByCollectionName(s2).forEach((s3) -> {
//                    System.out.println("\t" + s2 + " - " + s3);
//                });
//
//                ctrl.findFrameByCollectionName(s2).forEach((f) -> {
//                    System.out.println("\t\t" + f.getFramename() + ":UPC " + f.getUpccode());
//                });
//            });
//        });
//
//    }
}
