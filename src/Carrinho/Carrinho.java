package Carrinho;

public class Carrinho {

	public static void main(String[] args) {
        // Nome: Mateus Gonçalves de souza | RA: 119122458
        String aux;
        Produto[] produtos = new Produto[10];
        produtos[0] = new Produto(0,10,100,"Leite", "Leite em pó");
        produtos[1] = new Produto(1,10,100,"Coca Cola", "Refrigerante");
        produtos[2] = new Produto(2,10,100,"Orion", "Biscoito");
        produtos[3] = new Produto(3,10,100,"Três corações", "Café");
        produtos[4] = new Produto(4,10,100,"Leite Desnatado", "Leite em pó");
        produtos[5] = new Produto(5,10,100,"Guarana", "Refrigerante");
        produtos[6] = new Produto(6,10,100,"Trento", "Chocolate");
        produtos[7] = new Produto(7,10,100,"Delta", "Café");
        produtos[8] = new Produto(8,10,100,"Tubaina", "Refrigerante");
        produtos[9] = new Produto(9,10,100,"Trento Amargo", "Chocolate");
        
        produtos[0].Imprime();
        produtos[produtos.length - 1].Vazia(produtos[produtos.length - 1].getPossicao());



	}

}
