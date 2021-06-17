package src.peliculas;

public class Pelicula {
    private String nombre;
    private String categoria;
    private int id;
    private int ano;
    private boolean estaDisponible;

    public Pelicula(int id,String nombre,String categoria,int año,boolean estaDisponible){
        this.id=id;
        this.nombre=nombre;
        this.categoria=categoria;
        this.ano=año;
        this.estaDisponible=estaDisponible;
    }

    //Inicio getter y setters
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    public int getAño(){
        return ano;
    }   
    public void setAño(int año){
        this.ano=año;
    }
    public boolean getEstaDisponible(){
        return estaDisponible;
    }
    public void setEstaDisponible(boolean estaDisponible){
        this.estaDisponible=estaDisponible;
    }
    //fin getters y setters

    //Metodo obtener informacion
    public String getInformacion(){
        String resultado = "Id: "+id+". Nombre de Pelicula: " + nombre+". Categoria: "+categoria+". Año: "+ano+". Disponible: "+estaDisponible;
        return resultado;
    }
}
