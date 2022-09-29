/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioncomercio.productosBL;

/**
 *
 * @author J P Salmeron Dittamo
 */
public class productosBL {
    String codigo, producto, marca, fecha;
    float porMenor, porMayor, deLista;
    int stock, comprados, vendidos, cantidad;
    
   

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPorMenor() {
        return porMenor;
    }

    public void setPorMenor(float porMenor) {
        this.porMenor = porMenor;
    }

    public float getPorMayor() {
        return porMayor;
    }

    public void setPorMayor(float porMayor) {
        this.porMayor = porMayor;
    }

    public float getDeLista() {
        return deLista;
    }

    public void setDeLista(float deLista) {
        this.deLista = deLista;
    }

    public int getStock() {
        return stock = (comprados - vendidos);
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getComprados() {
        return comprados;
    }

    public void setComprados(int comprados) {
        this.comprados = comprados;
    }

    public int getVendidos() {
        return vendidos;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
