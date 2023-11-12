package aula1;

public class PersonagemMain {
    public static void main(String[] args) {

     // instaciar o obj
        ConfigPerson config = new ConfigPerson();
        config.nome = "Tauz";
        config.dinheiro = 2000;
        config.classe = "Mago";

        // métodos
        config.personagem(3000);
        config.dead();
        System.out.format("%s, %d, %s", config.nome, config.dinheiro, config.classe);


    }
}
