/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author ASUS
 */
public class Lingkaran extends BangunDatar{
    private static final double PHI = 3.14;
    private double jarijari;

    public Lingkaran() {
    }

    public Lingkaran(double jarijari, String namaBangunDatar) {
        super(namaBangunDatar);
        this.jarijari = jarijari;
    }
    
    @Override
    double luas() {
        return PHI*jarijari*jarijari;
    }

    @Override
    double keliling() {
        return 2*PHI*jarijari;
    }
    
}
