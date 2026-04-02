import java.util.ArrayList;
import java.util.ArrayList;

public class GerenciamentoProdutos {

    ArrayList<String>produtos= new ArrayList<>();


    public void CadastrarProdutos(String nome){
        System.out.println("Digete o produto");
        produtos.add(nome);
        System.out.println("Produto cadastrado com sucesso");
    }

    public void listarProdutos(){
        System.out.println("========Lista de produtos cadastrados====");
        if(produtos.isEmpty()){
            System.out.println("Sem produtos cadastrados");
        }
        for(int i=0; i<produtos.size(); i++){
            System.out.println(i +1 +" - "+ produtos.get(i));
        }


    }
    public void atualizarProdutos(String atualizarNome, int i){
        System.out.println("Digete o produtos que pretendes atualizar");
        if(i<0 || i>= produtos.size()){
            System.out.println("Indice invalido");
        }

        String listar = produtos.get(i);
        produtos.set(i, atualizarNome);
        System.out.printf(listar, atualizarNome);
    }


    public void excluirProdutos(String nome){
        System.out.println("Digete o nome que pretendes apagar");
        if(produtos.contains(nome)){
        produtos.remove(nome);
            System.out.println("Nome apagado com sucesso");
        }
    }
}
