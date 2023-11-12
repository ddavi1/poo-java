package aula2;

public class ProdutoTestar {
    public static void main(String[] args) {

        // construtor padrão:
        Produto p1 = new Produto();
        p1.nome = "Caneta preta";
        p1.marca = "BIG-BIG";
        p1.valor = 1.50f;
        p1.Produto(10);


        // construtor de dois parâmetros:
        Produto p2 = new Produto("Caneta azul", "Faber");
        p2.valor = 1.89f;
        p2.Produto(20);

        // construtor de três parâmetros:
        Produto p3 = new Produto("Canela verde", "BigS", 1.89f);
        p2.Produto(30);

        System.out.format("%s %s %.2f\n", p1.nome, p1.marca, p1.valor);
        System.out.format("%s %s %.2f\n", p2.nome, p2.marca, p2.valor);
        System.out.format("%s %s %.2f\n", p3.nome, p3.marca, p3.valor);



    }
}
