/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author 505
 */
public class Empleado {

    //ATRIBUTOS = VARIABLES = DATOS
    private int id;
    private String nombre;
    private String cargo;
    private double horaSemanales;
    private int salario;
    
    //METODO=ACCION=FUNCION ESPECIAL=CONSTRUCTOR
    
    public Empleado() {
    }
    
    //METODOS=ACCIONES=FUNCIONES

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getHoraSemanales() {
        return horaSemanales;
    }

    public void setHoraSemanales(double horaSemanales) {
        
        if(horaSemanales<0){
            System.out.println("formato inválido");        
        }
        else{
        
        }
        
        this.horaSemanales = horaSemanales;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    
    public int calcularSalario(double horas, int valor){
        return 0;
    }
}
