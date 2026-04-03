
        import java.util.ArrayList;
import java.util.ArrayList;
        import java.util.Scanner;

        public class GerenciamentoProdutos{
    ArrayList<String> produtos = new ArrayList<>();

    public void CadastrarProdutos(Scanner nome){
        System.out.println("Digete o produto");
        produtos.add(nome.next());
        System.out.println(produtos + "Produto cadastrado com sucesso");
    }

    public void listarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("Sem produtos cadastrados");
        }
            for(int i=0; i<produtos.size(); i++){
                System.out.println("====lista de produtos====");
                System.out.println(i +" - "+ produtos.get(i));
            }
    }

    public void atualizarProdutos(Scanner sc){
                listarProdutos();
                System.out.println("Digete o numero do produtos que pretendes atualizar");
                int num = sc.nextInt();
                if(num > 0 && num <= produtos.size()){
                    System.out.println("digite o novo nome que ira substituir o produto -->"+ produtos);
                    produtos.set(num-1, sc.next());
                    System.out.println(produtos + "editado com sucesso");
                }else {
                    System.out.println("Indice invalido");
                }
            }
    public void excluirProdutos(Scanner sc){
                listarProdutos();
                System.out.println("Digete o numero que pretendes apagar");
                int num = sc.nextInt();
                if(num>=0 && num < produtos.size()){
                    produtos.remove(num);
                    System.out.println("Nome apagado com sucesso");
                }else {
                    System.out.println("numero invalido!");
                }
            }

}
