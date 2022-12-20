/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Windi Laudi
 */
public class PersegiPanjang extends BangunDatar {

    private double panjang;
    private double lebar;

    public PersegiPanjang() {
    }

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
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
        return panjang * lebar;
    }

    @Override
    double keliling() {
        return 2 * (panjang + lebar);
    }

}
