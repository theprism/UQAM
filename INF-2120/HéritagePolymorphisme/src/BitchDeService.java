/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thomas
 */
public class BitchDeService {
    public static void main(String[] args) {
        Employe employe;
        EmployeSalarie employeSalarie;
        EmployeHoraire employeHoraire;
        Administrateur administrateur;
        employe = new Employe("Dude1", new Date());
        employeHoraire = new EmployeHoraire("Dude", new Date(), 15.67, 25.5);
        employeSalarie = new EmployeSalarie("Dude2", new Date(), 67.45);
        administrateur = new Administrateur("Boss", null, 158.75, "CEO", "BAWS", "No one");
        
        Employe[] table = new Employe[5];
        table[0] = employe;
        table[1] = employeHoraire;
        table[2] = employeSalarie;
        table[3] = administrateur;
        
    }
}
