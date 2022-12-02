package model;

import java.util.ArrayList;

public interface MTP {
    public ArrayList Listar();
    public int add(Object[] o);
    public int actualizar(Object[] o);
    public void eliminar(int id);
    public ArrayList buscar(int nivel);
}
