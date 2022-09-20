package Carrinho;

public class Produto {
    private int possicao;
    private int qtsAdquirida;
    private double valorProduto;
    private String nome;
    private String descricao;

    public Produto(int possicao, int qtsAdquirida, double valorProduto, String nome, String descricao) {
        this.possicao = possicao;
        this.qtsAdquirida = qtsAdquirida;
        this.valorProduto = valorProduto;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getPossicao() {
        return possicao;
    }

    public void setPossicao(int possicao) {
        this.possicao = possicao;
    }

    public Produto(int possicao) {
        this.possicao = possicao;
    }
    
    public int getQtsAdquirida() {
        return qtsAdquirida;
    }

    public void setQtsAdquirida(int qtsAdquirida) {
        this.qtsAdquirida = qtsAdquirida;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
//    Métodos;
//    public void FLVazia(Produto produtos, int tamanho) {
//        
//    }
    public void Imprime() {
        System.out.println("============" + this.nome + "=============");
        System.out.println("Nome: " +this.nome);
        System.out.println("Descrição: " + this.descricao); 
        System.out.println("Quantidade no carrinho: " + this.qtsAdquirida); 
        System.out.println("Valor do produto: " + this.valorProduto); 
    }
    
    public void Vazia(int prosicao) {
        if (prosicao == 3) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
            
    }
    
//    public void Inserir(Produto produtos) {
//        if (produtos == null){
//            System.out.println("A lista de compras está cheia");
//        } else {
//            System.out.println("Adicionado com sucesso!");
//        }
//    }


}
