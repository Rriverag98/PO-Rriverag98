/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

/**
 *
 * @author Rodrigo
 */
public class CuentaBancaria {
     private String nombreDeDueño; 
     private String direccionDeDueño;
     private String sexoDeDueño;
     private String numeroDeCuenta;
     private int edadDeDueño;
     private int saldo;
     private int ingresos;
     private int egresos;
     
     
     
public CuentaBancaria() {
        nombreDeDueño = "Rodrigo";
        direccionDeDueño = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque quis #1.";
        sexoDeDueño = "H";
        edadDeDueño = 18;
        saldo = 4784;
        numeroDeCuenta = "654934984";
        ingresos = 1725;
        egresos = 2385;
    }     
    public CuentaBancaria(String nombreDeDueño,String direccionDeDueño,String sexoDeDueño, int edadDeDueño, int saldo, float numeroDeCuenta, int ingresos, int egresos) {
        this.nombreDeDueño = nombreDeDueño;
        this.direccionDeDueño = direccionDeDueño;
        this.sexoDeDueño = sexoDeDueño;
        this.edadDeDueño = edadDeDueño;
        this.saldo = saldo;
        this.ingresos = ingresos;
        this.egresos = egresos;
    }
    
    // color Getter and Setter
    public String getNombreDeDueño() {
        return nombreDeDueño;
    }
    
    public void setNombreDeDueño(String nombreDeDueño) {
        /* Si el usuario envia una cadena vacia o null, la propiedad 
        tendra el valor "Sin contenido definido"; de lo contrario, tomara 
        el valor enviado en el mensaje */
        if ((nombreDeDueño == null) || (nombreDeDueño == "")){
             this.nombreDeDueño = "sin valor definido";
          }else {
             this.nombreDeDueño = nombreDeDueño;
        }
    }
    public String getDireccionDeDueño() {
        return direccionDeDueño;
    }
    public void setDireccionDeDueño(String direccionDeDueño) {
        /* Si el usuario envia una cadena vacia o null, la propiedad 
        tendra el valor "Sin contenido definido"; de lo contrario, tomara 
        el valor enviado en el mensaje */
        if ((direccionDeDueño == null) || (direccionDeDueño == "")){
             this.direccionDeDueño = "sin valor definido";
          }else {
             this.direccionDeDueño = direccionDeDueño;
        }
    }
    public String getSexoDeDueño() {
        return sexoDeDueño;
    }
    public void setSexoDeDueño(String sexoDeDueño) {
        /* Si el usuario envia una cadena vacia o null, la propiedad 
        tendra el valor "Sin contenido definido"; de lo contrario, tomara 
        el valor enviado en el mensaje */
        if ((sexoDeDueño == null) || (sexoDeDueño == "")){
             this.sexoDeDueño = "sin valor definido";
          }else {
             this.sexoDeDueño = sexoDeDueño;
        }
    }
     public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    public void setNumeroDeCuenta(String numeroDeCuenta) {
        /* Si el usuario envia una cadena vacia o null, la propiedad 
        tendra el valor "Sin contenido definido"; de lo contrario, tomara 
        el valor enviado en el mensaje */
        if ((numeroDeCuenta == null) || (numeroDeCuenta == "")){
             this.numeroDeCuenta = "sin valor definido";
          }else {
             this.numeroDeCuenta = numeroDeCuenta;
        }
    }
    public int getEdadDeDueño(){
        return this.edadDeDueño;
    }
    public boolean setEdadDeDueño(int EdadDeDueño){
        /* En teoria el dueño no deberia ser menor de edad(18) por lo que si
        envia un valor menor a este, la cuenta no deberia aceptarlo */ 
        if(EdadDeDueño <18){
            return false;
        }else{
            this.edadDeDueño=EdadDeDueño;
            return true;
        }
    }
    public int getSaldo(){
        return this.saldo;
    }
    public boolean setSaldo(int saldo){
        /* La cuenta no puede tener un saldo negativo por lo que un valor menor a 0 no es aceptable */ 
        if(saldo <0){
            return false;
        }else{
            this.saldo=saldo;
            return true;
        }
    }
    public int getIngresos(){
        return this.ingresos;
    }
    public boolean setIngresos(int ingresos){
        /* La cuenta no puede tener un ingreso negativo por lo que un valor menor a 0 no es aceptable */ 
        if(ingresos <0){
            return false;
        }else{
            this.ingresos=ingresos;
            return true;
        }
    }
    public int getEgresos(){
        return this.egresos;
    }
    public boolean setEgresos(int egresos, int saldo){
        /* La cuenta no puede tener un egreso mayor a su saldo */ 
        if(egresos > saldo){
            return false;
        }else{
            this.egresos=egresos;
            return true;
        }
    }
}
