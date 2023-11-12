package aula1;

public class ConfigPerson {

    // atributos
    String nome;
    int forca;
    int dinheiro;
    String classe;

    // métodos
    void personagem(int poder) {
        forca += poder;
        System.out.format("nivel de força: %d\n", forca);
    }

    void dead () {
        System.out.println("morreu");
    }

}
