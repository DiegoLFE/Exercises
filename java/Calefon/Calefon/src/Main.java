public class Main {

    public static void main(String[] args) {

        //Instancio un balde
        Balde unBalde = new Balde();
        //Lleno el balde
        unBalde.setCantidad(50);

        //Instancio un calefon
        Calefon unCalefon = new Calefon();
        //Le digo cual va a ser su capacidad máxima
        unCalefon.setCapacidad(25);
        //Le asigno una cantidad de agua ya cargada
        unCalefon.setNivel(10);

        //Lleno unCalefon con unBalde y guardo la cantidad que cargó en mi variable cuantoCarga
        Integer cuantoCarga = unCalefon.llenarCalefon(unBalde);

        //Imprimo por pantalla la cantidad de litros que se cargaron
        System.out.println("Se cargaron " + cuantoCarga + " litros");
    }
}
