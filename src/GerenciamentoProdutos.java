import java.util.ArrayList;
import java.util.ArrayList;

public class GerenciamentoProdutos {

    ArrayList<String>produtos= new ArrayList<>();


    public void CadastrarProdutos(String nome){
        produtos.add(nome);
        System.out.println("Produto cadastrado com sucesso");
    }

    public void listarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("Sem produtos cadastrados");
        }
        else {
            System.out.println(produtos);
        }
    }
    public void atualizarProdutos(String atualizarNome){

    }
}
