/*
=======
/*S
>>>>>>> feature_persegi
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Windi Laudi
 */
public class Persegi extends BangunDatar {

    private double sisi;

    public Persegi() {
    }

    @Override
    public String getNamaBangunDatar() {
        return super.getNamaBangunDatar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNamaBangunDatar(String namaBangunDatar) {
        super.setNamaBangunDatar(namaBangunDatar); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    double luas() {
        return sisi * sisi;
    }

    @Override
    double keliling() {
        return 4 * sisi;
    }

}
