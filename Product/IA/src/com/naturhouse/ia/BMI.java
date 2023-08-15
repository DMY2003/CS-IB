 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naturhouse.ia;

/**
 *
 * @author Damian
 */
public class BMI {
    public int MaleBMI(int Age, int Weight, int Height, double Activity){
        double calories= (66 + (13.7*Weight) + (5*Height) - (6.8*Age))*Activity;
        int Calories=(int)calories; //calculate calories for male
        return Calories;
    }
    public int FemaleBMI(int Age, int Weight, int Height, double Activity){
        double calories=(655 + (9.6*Weight) + (1.8*Height) - (4.7*Age))*Activity;
        int Calories=(int)calories; //calculate calories for male
        return Calories;
    }
}
