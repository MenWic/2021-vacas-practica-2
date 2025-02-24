package src.tienda;

import src.clientes.VectorClientes;
import src.peliculas.*;

public class Reportes {
    VectorPeliculas p=new VectorPeliculas();
    private int mayorVecesPrestado;
    private int menorVecesPrestada;

    public Reportes(){
        mayorVecesPrestado=0;
        menorVecesPrestada=1000;
    }

    public void reportesCompletos(){
        System.out.println("\nAccion: ");
        categoria("Accion");
        System.out.println("\nDrama: ");
        categoria("Drama");
        System.out.println("\nComedia: ");
        categoria("Comedia");
        System.out.println("\nTerror: ");
        categoria("Terror");
        System.out.println("\nCiencia Ficcion: ");
        categoria("Ciencia Ficcion");
        System.out.println("\nAventuras: ");
        categoria("\nAventuras\n");
    }

    public void categoriEspecifica(){
        int categoria=IngresoDatos.getEntero(p.categoria(),false);
        categoria(p.elegirCategorias(categoria));
    }

    public void categoria(String categoria){
        for(int i=0;i<VectorPeliculas.getContador();i++){
            if(VectorPeliculas.getPeliculas()[i].getCategoria().equals(categoria)){
                System.out.println(VectorPeliculas.getPeliculas()[i].getInformacion());
            }
        }
        System.out.println("\n");
    }

    public void cantidadVecesQueAlquila(){
        for(int i=0;i<VectorPeliculas.getContador();i++){
            System.out.print(VectorPeliculas.getPeliculas()[i].getInformacion());
            System.out.print("        ");
            System.out.print("Cant. alquileres: "+PrestamoPeliculas.getVecesPrestadas()[i]+"\n");
            System.out.println("\n");
        }
    }

    public void mayorVecesPrestado(){
        for(int i=0;i<VectorPeliculas.getContador();i++){
            if(PrestamoPeliculas.getVecesPrestadas()[i]>mayorVecesPrestado){
                mayorVecesPrestado=PrestamoPeliculas.getVecesPrestadas()[i];
            }
        }
        for(int i=0;i<VectorPeliculas.getContador();i++){
            if(PrestamoPeliculas.getVecesPrestadas()[i]==mayorVecesPrestado){
                System.out.print(VectorPeliculas.getPeliculas()[i].getInformacion());
                System.out.print("    ");
                System.out.print("Cant. alquileres: "+PrestamoPeliculas.getVecesPrestadas()[i]+"\n");
                System.out.println("\n");
            }
        }
    }

    public void menorVecesPrestada(){
        for(int i=0;i<VectorPeliculas.getContador();i++){
            if(PrestamoPeliculas.getVecesPrestadas()[i]<menorVecesPrestada){
                menorVecesPrestada=PrestamoPeliculas.getVecesPrestadas()[i];
            }
        }
        for(int i=0;i<VectorPeliculas.getContador();i++){
            if(PrestamoPeliculas.getVecesPrestadas()[i]==menorVecesPrestada){
                System.out.print(VectorPeliculas.getPeliculas()[i].getInformacion());
                System.out.print("    ");
                System.out.print("Cant. alquileres: "+PrestamoPeliculas.getVecesPrestadas()[i]+"\n");
                System.out.println("\n");
            }
        }
    }
}
