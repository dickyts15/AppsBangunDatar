/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Lenovo
 */
public class Segitiga extends BangunDatar{
    private double tinggi;
    private double alas;

    public Segitiga() {
    }

    public Segitiga(double tinggi, double alas) {
        this.tinggi = tinggi;
        this.alas = alas;
    }

    @Override
    public void setNamaBangunDatar(String namaBangunDatar) {
        super.setNamaBangunDatar(namaBangunDatar); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNamaBangunDatar() {
        return super.getNamaBangunDatar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    double keliling() {
        return alas * 3;
    }

}
