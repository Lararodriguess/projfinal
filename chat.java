import java.util.Scanner;

class Main {
  public static void Menu() {
    System.out.println("Escolha um número entre 1 a 4 \n1 => Como fazer PRINT \n2 => Como fazer IF \n3 => Como fazer FOR \n4 => Como fazer CASE");
  }
  public static void main(String args[]) {

    System.out.println("=======================");
    System.out.println("=       CHATBOT       =");
    System.out.println("=======================");
    System.out.println("= SUPORTE EDUCACIONAL =");
    System.out.println("=        PARA         =");
    System.out.println("=    PROGRAMADOES     =");
   

    System.out.println("=======================");
    System.out.println("Bem vindo ao nosso site");
    System.out.println("");
    System.out.println("");
    System.out.println("Oferecemos suporte para 3 linguagens e em breve disponibilizaremos para outras. Mande sua sugestão para nosso e-mail: atendimento@cody.com");
    System.out.println("");
    System.out.println("");
    
    Scanner entrada = new Scanner(System.in);
    int para = 1;
    while (para != 0) {
      System.out.println("\nSelecione a linguagem que deseja suporte: [1] JAVA | [2] C | [3] PYTHON");
      int valor = entrada.nextInt();
      System.out.println("");
      System.out.println("");

      if (valor == 1) {
        Menu();
        int op1 = entrada.nextInt();
        switch (op1) {
            
        case 1:
           System.out.println("\nHá três opções de impressão: \n\nSystem.out.print(\"Seu texto aqui\"); \nSystem.out.println(\"Seu texto aqui mais uma vez\"); \nSystem.out.printf(\"%s\", \"Seu texto aqui\");");
          break;
            
         case 2:
        System.out.println("\nOs principais modelos de if: \n\nif (função ou variável) { \n  linha de código \n} else {\n  linha de código\n} \n\nif (função ou variável) { \n  linha de código \n} else if (função ou variável) {\n  linha de código\n}");
          break;
            
        case 3:
          System.out.println("\nfor (inicialização variável; condição para continuar; incremento ou decremento da variável) { \n  linha de código; \n}");
          break;
      
        case 4:
          System.out.println("\nswitch (variável) {\n  case (valor 1variável):\n    linha de código;\n  break;\n  case (valor n variável):\n    linha de código;\n  break;\n  default:\n    linha de código caso nenhum caso se encaixe;\n  break;\n}");
          break;
            
        default:
          System.out.println("Opção não disponível");
          break;
        }
      } else if (valor == 2) {
        Menu();
        int op2 = entrada.nextInt();
        switch (op2) {
            
        case 1:
          System.out.println("\nprintf(\"digite seu texto\");"); 
          break;
            
         case 2:
          System.out.println("\nif (função ou variável) { \n  linha de código \n} else {\n  linha de código\n}");
          break;
            
        case 3:
          System.out.println("\nfor (inicialização variável; condição para continuar; incremento ou decremento da variável){ \nlinha de código; \n}");
          break;
      
        case 4:
        System.out.println("\nswitch (variável) {\n  case (valor 1 variável):\n    linha de código;\n  break;\n  case (valor n variável):\n    linha de código;\n  break;\n  default:\n    linha de código caso nenhum caso se encaixe;\n}");
          break;
                
        default:
          System.out.println("Opção não disponível");
          break;  
        }
      } else if (valor == 3) {
        Menu();
        int op3 = entrada.nextInt();
        switch (op3) {
            
        case 1:
          System.out.println("\nAs principais opções de impressão: \nprintf(\"Seu texto aqui mais uma vez\"); \nprint(\"Seu texto aqui\"); \nprintf('Digite seu texto') \nprint('Digite seu texto') "); 
          break;
            
        case 2:
          System.out.println("\nOs modelos de if são: \nif função ou variável:  \n\tLinha de código \nelse\n\tLinha de código\n \n\nif função ou variável:  \n\tLinha de código \nelif função ou variável: \n\tLinha de código\n");
          break;
            
        case 3:
          System.out.println(
              "\n For variável in range(valor):\n  linha de código");
          break;
      
        case 4:
          System.out.println("\nmatch variável: \n  case valor 1 variável:\n    linha de código \n  case valor n variável:\n    linha de código \n  case _:\n    linha de código caso nenhum caso se encaixe\n");
          break;
            
        default:
          System.out.println("Opção não disponível");
          break;
        }
      } else {
          System.out.println("\nOpção não disponível");
      }
    System.out.println("\nDeseja saber algo mais?");
    System.out.println("Pressione '1' para perguntar novamente ou '0' para sair");
    para = entrada.nextInt();
    }
    
    entrada.close();
  }
}
