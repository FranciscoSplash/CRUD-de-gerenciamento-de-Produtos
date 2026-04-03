import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        GerenciamentoProdutos produtos =new GerenciamentoProdutos();
        int objeto;
        do {
            System.out.println("======menu======");
            System.out.println("1 - adicionar");
            System.out.println("2 - listar");
            System.out.println("3 - atualizar");
            System.out.println("4 - excluir");
            System.out.println("0 - sair");

            System.out.println("escolha uma opção acima:");
            objeto = sc.nextInt();
          switch (objeto){
              case 1: produtos.CadastrarProdutos(sc);
                  break;
              case 2: produtos.listarProdutos();
                  break;

              case 3: produtos.atualizarProdutos(sc);
                  break;
              case 4:produtos.excluirProdutos(sc);
                  break;
              case 0:
                  System.out.println("saindo do sistema.......... (^-^) obrigado por usar o meu gerenciado de produtos.....");
              default:
                  System.out.println("Opção invalida !");
          }

        }while(objeto!=0);
    }
}
