
package ejemplo_interfaz_1;

 public class Fontanero extends Persona implements IEmpleado
{
    public Fontanero() {
    }
    // -------------------------
     @Override
     public void trabajar() {
        System.out.println( this.getNombreCompleto() + " realizá trabajos de fontanería");
    }
}
