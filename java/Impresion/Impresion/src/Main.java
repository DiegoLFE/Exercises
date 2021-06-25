public class Main {

    public static void main(String[] args) {
        // Creo una foto
        Foto foto = new Foto();
        // Creo un documento
        Documento documento = new Documento();
        // Creo un contrato
        Contrato contrato = new Contrato();
        // Creo una SuperMegaUltraFoto
        SuperMegaUltraFoto unaSuperMegaUltraFoto = new SuperMegaUltraFoto();

        // Creo una impresora
        Impresora impresora = new Impresora();

        // Agrego los imprimibles a la impresora
        impresora.agregarImprimible(foto);
        impresora.agregarImprimible(documento);
        impresora.agregarImprimible(contrato);
        impresora.agregarImprimible(unaSuperMegaUltraFoto);

        // Imprimir todos los imprimibles
        impresora.imprimirTodos();
    }
}
