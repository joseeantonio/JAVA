package Actividad_11;

public class Cliente_main {

    public static void main(String[] args) throws EdadException {
        Cliente cliente1 ;
        try {
            cliente1 = new Cliente("123456789B", "Jose Antonio", 19);
            Cuenta cuenta1 =new Cuenta(1234,20);
            cliente1.agregarCuenta(cuenta1);

            Cuenta cuenta2 =new Cuenta(4321,128);
            cliente1.agregarCuenta(cuenta2);


            System.out.println(cliente1);
        }catch (Exception e){
            System.out.println("Debes de ser mayor de 18, lo siento.");
        }


    }

}
