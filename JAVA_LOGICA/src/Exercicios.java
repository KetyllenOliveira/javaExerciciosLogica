import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        escolherExercicio();
    }

    public static void escolherExercicio() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o número do exercício que você quer resolver (1 a 90) ou 'Sair' para sair: ");
            String escolha = scanner.nextLine().trim();

            try {
                switch (escolha.toUpperCase()) {
                    case "1":
                        Exercicio1.resolver();
                        break;
                    case "2A":
                        Exercicio2.resolverA();
                        break;
                    case "2B":
                        Exercicio2.resolverB();
                        break;
                    case "2C":
                        Exercicio2.resolverC();
                        break;
                    case "2D":
                        Exercicio2.resolverD();
                        break;
                    case "2E":
                        Exercicio2.resolverE();
                        break;
                    case "2F":
                        Exercicio2.resolverF();
                        break;
                    case "3A":
                        Exercicio3.resolver3A();
                        break;
                    case "3B":
                        Exercicio3.resolver3B();
                        break;
                    case "3C":
                        Exercicio3.resolver3C();
                        break;
                    case "4A":
                        Exercicio4.calcular4A();
                        break;
                    case "4B":
                        Exercicio4.calcular4B();
                        break;
                    case "4C":
                        Exercicio4.calcular4C();
                        break;
                    case "4D":
                        Exercicio4.calcular4D();
                        break;
                    case "4E":
                        Exercicio4.calcular4E();
                        break;
                    case "4F":
                        Exercicio4.calcular4F();
                        break;
                    case "4G":
                        Exercicio4.calcular4G();
                        break;
                    case "4H":
                        Exercicio4.calcular4H();
                        break;
                    case "4I":
                        Exercicio4.calcular4I();
                        break;
                    case "4J":
                        Exercicio4.calcular4J();
                        break;
                    case "5":
                        Exercicio5.resolver5();
                        break;
                    case "6":
                        Exercicio6.resolver6();
                        break;
                    case "7":
                        Exercicio7.resolver7();
                        break;
                    case "8":
                        Exercicio8.resolver8();
                        break;
                    case "9":
                        Exercicio9.resolver9();
                        break;
                    case "10":
                        Exercicio10.resolver10();
                        break;
                    case "11":
                        Exercicio11.resolver11();
                        break;
                    case "12":
                        Exercicio12.resolver12();
                        break;
                    case "13":
                        Exercicio13.resolver13();
                        break;
                    case "14":
                        Exercicio14.resolver14();
                        break;
                    case "15":
                        Exercicio15.resolver15();
                        break;
                    case "16":
                        Exercicio16.resolver16();
                        break;
                    case "17":
                        Exercicio17.resolver17();
                        break;
                    case "18":
                        Exercicio18.resolver18();
                        break;
                    case "19":
                        Exercicio19.resolver19();
                        break;
                    case "20":
                        Exercicio20.resolver20();
                        break;
                    case "21":
                        Exercicio21.resolver21();
                        break;
                    case "22":
                        Exercicio22.resolver22();
                        break;
                    case "23":
                        Exercicio23.resolver23();
                        break;
                    case "24":
                        Exercicio24.resolver24();
                        break;
                    case "25":
                        Exercicio25.resolver25();
                        break;
                    case "26":
                        Exercicio26.resolver26();
                        break;
                    case "27":
                        Exercicio27.resolver27();
                        break;
                    case "28":
                        Exercicio28.resolver28();
                        break;
                    case "29":
                        Exercicio29.resolver29();
                        break;
                    case "30":
                        Exercicio30.resolver30();
                        break;
                    case "31":
                        Exercicio31.resolver31();
                        break;
                    case "32":
                        Exercicio32.resolver32();
                        break;
                    case "33":
                        Exercicio33.resolver33();
                        break;
                    case "34":
                        Exercicio34.resolver34();
                        break;
                    case "35":
                        Exercicio35.resolver35();
                        break;
                    case "36":
                        Exercicio36.resolver36();
                        break;
                    case "37":
                        Exercicio37.resolver37();
                        break;
                    case "38":
                        Exercicio38.resolver38();
                        break;
                    case "39":
                        Exercicio39.resolver39();
                        break;
                    case "40":
                        Exercicio40.resolver40();
                        break;
                    case "41":
                        Exercicio41.resolver41();
                        break;
                    case "42":
                        Exercicio42.resolver42();
                        break;
                    case "43":
                        Exercicio43.resolver43();
                        break;
                    case "44":
                        Exercicio44.resolver44();
                        break;
                    case "45":
                        Exercicio45.resolver45();
                        break;
                    case "46":
                        Exercicio46.resolver46();
                        break;
                    case "47":
                        Exercicio47.resolver47();
                        break;
                    case "48":
                        Exercicio48.resolver48();
                        break;
                    case "49":
                        Exercicio49.resolver49();
                        break;
                    case "50":
                        Exercicio50.resolver50();
                        break;
                    case "51":
                        Exercicio51.resolver51();
                        break;
                    case "52":
                        Exercicio52.resolver52();
                        break;
                    case "53":
                        Exercicio53.resolver53();
                        break;
                    case "54":
                        Exercicio54.resolver54();
                        break;
                    case "55":
                        Exercicio55.resolver55();
                        break;
                    case "56":
                        Exercicio56.resolver56();
                        break;
                    case "57":
                        Exercicio57.resolver57();
                        break;
                    case "58":
                        Exercicio58.resolver58();
                        break;
                    case "59":
                        Exercicio59.resolver59();
                        break;
                    case "60":
                        Exercicio60.resolver60();
                        break;
                    case "61":
                        Exercicio61.resolver61();
                        break;
                    case "62":
                        Exercicio62.resolver62();
                        break;
                    case "63":
                        Exercicio63.resolver63();
                        break;
                    case "64":
                        Exercicio64.resolver64();
                        break;
                    case "65":
                        Exercicio65.resolver65();
                        break;
                    case "66":
                        Exercicio66.resolver66();
                        break;
                    case "67":
                        Exercicio67.resolver67();
                        break;
                    case "68":
                        Exercicio68.resolver68();
                        break;
                    case "69":
                        Exercicio69.resolver69();
                        break;
                    case "70":
                        Exercicio70.resolver70();
                        break;
                    case "71":
                        Exercicio71.resolver71();
                        break;
                    case "72":
                        Exercicio72.resolver72();
                        break;
                    case "73":
                        Exercicio73.resolver73();
                        break;
                    case "74":
                        Exercicio74.resolver74();
                        break;
                    case "75":
                        Exercicio75.resolver75();
                        break;
                    case "76":
                        Exercicio76.resolver76();
                        break;
                    case "77":
                        Exercicio77.resolver77();
                        break;
                    case "78":
                        Exercicio78.resolver78();
                        break;
                    case "79":
                        Exercicio79.resolver79();
                        break;
                    case "80":
                        Exercicio80.resolver80();
                        break;
                    case "81":
                        Exercicio81.resolver81();
                        break;
                    case "82":
                        Exercicio82.resolver82();
                        break;
                    case "83":
                        Exercicio83.resolver83();
                        break;
                    case "84":
                        Exercicio84.resolver84();
                        break;
                    case "85":
                        Exercicio85.resolver85();
                        break;
                    case "86":
                        Exercicio86.resolver86();
                        break;
                    case "87":
                        Exercicio87.resolver87();
                        break;
                    case "88":
                        Exercicio88.resolver88();
                        break;
                    case "89":
                        Exercicio89.resolver89();
                        break;
                    case "90":
                        Exercicio90.resolver90();
                        break;
                    case "Sair":
                        continuar = false;
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro ao executar o exercício: " + e.getMessage());
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}
