//clase bombero
public class Ejercicios
{
    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private boolean especialista;

    //contructor y parametros asignados
    public Bombero (String nombreRecibido, String apellidoRecibido, int edadRecibida, boolean casadoRecibido, boolean especialistaRecibido)
    {
        nombre = nombreRecibido;
        apellido = apellidoRecibido;
        edad = edadRecibida;
        casado = casadoRecibido;
        especialista = especialistaRecibido;

    }//cierre del constructor

    //Metodos setter
    public void setNombre(String valorNombre)
    {
        nombre= valorNombre;   
    }

    public void setApellido (String valorApellido)
    {
        apellido= valorApellido;
    }

    public void setEdad(int valorEdad)
    {
        edad= valorEdad;
    }

    public void setCasado (boolean valorCasado)
    {
        casado= valorCasado;
    }

    public void setEspecialista (boolean valorEspecialista)
    {
        especialista= valorEspecialista;
    }

    //Metodos getter
    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public int getEdad()
    {
        return edad;
    }

    public boolean getCasado()
    {
        return casado;
    }

    public boolean getEspecialista()
    {
        return especialista;
    }

}//cierre de la clase
   