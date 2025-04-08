import java.util.Scanner;

public class challenge {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        DataCurrentUser ud = new DataCurrentUser();

        sb.append("***************************************" + "\n");
        sb.append("Nome:" + ud.nameUser + "\n");
        sb.append("Tipo de conta:" + ud.currentAccount + "\n");
        sb.append("Saldo inicial:" + ud.initialBalance + "\n");
        sb.append("***************************************");

        System.out.print(sb.toString());

        StringBuilder menuoption = new StringBuilder();

        menuoption.append("*******************************" + "\n");
        menuoption.append("1 - Consultar valores" +  "\n");
        menuoption.append("2 - Valores recebidos" + "\n");
        menuoption.append("3 - Transferir valor" + "\n");
        menuoption.append("4 - Sair");

        System.out.println(menuoption.toString());

        Scanner optionUser = new Scanner(System.in);
        System.out.println("Digite a opção desejada");
         int option = optionUser.nextInt();


        switch(option) {
            case 1:
                System.out.println("Valor atualizado" + ud.initialBalance );
                break;

            case 2:
                ValuesReceived valueReceived = new ValuesReceived();

                System.out.println("*****************************************************************************************"
                                        + "\n" + "Valores recebidos"
                                        + "\n" + "Nome:" + valueReceived.nameorigin
                                        + "\n" + "Conta:" + valueReceived.countorigin + "\n" + "Agência:" + valueReceived.agencyOrigin
                                        + "\n" + "Valor Recebido:" + valueReceived.valueReceived + "\n"
                                        +
                                  "******************************************************************************************");
                break;

                case 3:



                    Scanner recipient = new Scanner(System.in);

                    System.out.println( "*****************************************" + "\n"
                                + "Informe conta corrente:" + "\n"
                                + "Informe a agência:" + "\n"
                                + "Valor para a transfência:" + "\n"

                     + "*****************************************" + "\n");
                    int currentRecipient = recipient.nextInt();
                    int agency = recipient.nextInt();
                    Double transferValue = recipient.nextDouble();

                    String msg = "****************************************************"
                                     +"\n" + "Conta corrente:" + currentRecipient + "\n"
                                     +"Agência:" + agency + "\n"
                                     +"Valor da transferido:" + "R$" + transferValue + "\n"
                                     +"Favorecido: Luiz Antônio Nascimento" + "\n"
                                  +"**************************************************";

                    System.out.println(msg);



                    break;

            case 4:
                System.out.println("Obrigado por usar nossos serviços.");


            break;

            default:
                System.out.println("Obrigado!");
        }







    }

}
