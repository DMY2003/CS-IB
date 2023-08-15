/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naturhouse.ia;
import static java.lang.Math.log;

/**
 *
 * @author Damian
 */
public class BodyFat {
    public int MaleBodyFat(int Waist, int Hips, int Neck, int Age, int Height){ 
        double bodyfat=(495/(1.0324-0.19077*(log(Waist-Neck))+0.15456*(log(Height))))-450;
        //calculate body fat percentage for male
        int BodyFat=(int)bodyfat; //convert double to int
        return BodyFat;
    }
    public int FemaleBodyFat(int Waist, int Hips, int Neck, int Age, int Height){
        double bodyfat=(495/(1.29579-0.35004*(log(Waist+Hips-Neck))+0.22100*(log(Height))))-450;
        //calculate body fat percentage for female
        int BodyFat=(int)bodyfat; //convert double to int
        return BodyFat;
    }
}
