import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        escolherExercicio();
    }

    public static void escolherExercicio() {
        String[] titulos = {
            "Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B...",
            "Analise os algoritmos abaixo e diga o que será impresso na tela ao serem executados: \n(a) ...\n(b) ...\n(c) ...\n(d) ...\n(e) ...\n(f) ...",
            "Analise os algoritmos abaixo e diga o que será impresso na tela ao serem executados: \n(c) ...\n(d) ...\n(e) ...\n(f) ...",
            "Os pares de instruções abaixo produzem o mesmo resultado?",
            "Reescreva as instruções abaixo com o mínimo de parênteses possível, mas sem alterar o resultado...",
            "Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.",
            "Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.",
            "Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias...",
            "Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos...",
            "Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste...",
            "O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos...",
            "Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido...",
            "Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius...",
            "Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno...",
            "Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!",
            "Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).",
            "As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12...",
            "Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado...",
            "Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano...",
            "Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.",
            "Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.",
            "Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.",
            "A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).",
            "Para o enunciado a seguir foi elaborado um algoritmo em Português Estruturado que contém erros, identifique os erros no algoritmo apresentado abaixo:\nEnunciado: Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule e mostre seu peso ideal, utilizando as seguintes fórmulas:\n - para sexo masculino: peso ideal = (72.7 * altura) - 58\n - para sexo feminino: peso ideal = (62.1 * altura) - 44.7\ninicio\nler nome\nler sexo\nse sexo = M então\npeso_ideal  (72.7 * altura) - 58\nsenão\npeso_ideal  (62.1 * altura) – 44.7\nfim_se\nescrever peso_ideal\nfim",
            "Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.",
            "Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.",
            "Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.",
            "Ler um valor e escrever se é positivo, negativo ou zero.",
            "Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.",
            "Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.",
            "Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente.",
            "Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.",
            "Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.",
            "Ler dois valores e imprimir uma das três mensagens a seguir:\n‘Números iguais’, caso os números sejam iguais\n‘Primeiro é maior’, caso o primeiro seja maior que o segundo;\n‘Segundo maior’, caso o segundo seja maior que o primeiro.",
            "Seja o seguinte algoritmo:\ninício\nler x\nler y\nz  (x*y) + 5\nse z <= 0 então\nresposta  ‘A’\nsenão\nse z <= 100 então\nresposta  ‘B’\nsenão\nresposta  ‘C’\nfim_se\nfim_se\nescrever z, resposta\nfim\nFaça um teste de mesa e complete o quadro a seguir para os seguintes valores:\nVariáveis\nX Y Z Resposta\n3 2\n150 3\n7 -1\n-2 5\n50 3",
            "Um posto está vendendo combustíveis com a seguinte tabela de descontos:\nAté 20 litros, desconto de 3% por litro Álcool\nacima de 20 litros, desconto de 5% por litro\naté 20 litros, desconto de 4% por litro Gasolina\nacima de 20 litros, desconto de 6% por litro\nEscreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.",
            "Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha.",
            "Uma fruteira está vendendo frutas com a seguinte tabela de preços:\nAté 5 Kg Acima de 5 Kg\nMorango R$ 2,50 por Kg R$ 2,20 por Kg\nMaçã R$ 1,80 por Kg R$ 1,50 por Kg\nSe o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.",
            "Uma loja de eletrodomésticos vende os seguintes produtos: TV, Radio e Microondas. O preço unitário é informado pelo usuário. Escreva um algoritmo que leia o nome e o preço de três produtos e calcule e escreva o preço total, o valor do desconto, se o valor total da compra ultrapassar R$ 1.000,00 e o valor a ser pago com o desconto.",
            "Ler a quantidade de itens comprados e o valor total da compra. Escrever o valor total com desconto (10%) se a quantidade de itens for maior que 10.",
            "Uma empresa de telefonia oferece os seguintes planos de desconto para seus clientes: plano A: R$ 0,25 por minuto, plano B: R$ 0,20 por minuto e plano C: R$ 0,15 por minuto. Escreva um algoritmo que leia o número de minutos que um cliente gastou em cada plano e calcule e escreva o valor total da conta de telefone.",
            "Ler dois números reais e imprimir a média entre eles.",
            "Ler três números reais e imprimir a média entre eles.",
            "Calcule e escreva a soma dos quadrados dos três primeiros números inteiros positivos.",
            "Ler dois números e calcular a diferença entre eles, mostrando se o resultado é positivo ou negativo.",
            "Escreva um algoritmo para ler um número inteiro e verificar se ele é par ou ímpar.",
            "Calcular e escrever o dobro do valor de um número informado.",
            "Escreva um algoritmo para calcular a raiz quadrada de um número informado.",
            "Ler um número e calcular e escrever o seu cubo.",
            "Ler um número e escrever o número elevado à quarta potência.",
            "Calcular e escrever o fatorial de um número inteiro.",
            "Calcular e escrever a soma dos números pares de 1 a 100.",
            "Ler um número e calcular a soma dos números inteiros de 1 até o número informado.",
            "Ler um número e calcular a soma dos números inteiros ímpares de 1 até o número informado.",
            "Ler um número e calcular a soma dos números inteiros múltiplos de 3 e de 5 até o número informado.",
            "Ler um número e calcular a soma dos números inteiros múltiplos de 7 e de 11 até o número informado.",
            "Ler um número e calcular a soma dos quadrados dos números inteiros de 1 até o número informado.",
            "Ler um número e calcular a soma dos cubos dos números inteiros de 1 até o número informado.",
            "Ler um número e calcular a soma dos quadrados dos números inteiros múltiplos de 2 até o número informado.",
            "Ler um número e calcular a soma dos cubos dos números inteiros múltiplos de 3 até o número informado.",
            "Ler um número e calcular a soma dos quadrados dos números inteiros múltiplos de 4 até o número informado.",
            "Ler um número e calcular a soma dos cubos dos números inteiros múltiplos de 5 até o número informado.",
            "Ler um número e calcular a soma dos quadrados dos números inteiros múltiplos de 6 até o número informado.",
            "Ler um número e calcular a soma dos cubos dos números inteiros múltiplos de 7 até o número informado.",
            "Ler um número e calcular a soma dos quadrados dos números inteiros múltiplos de 8 até o número informado.",
            "Ler um número e calcular a soma dos cubos dos números inteiros múltiplos de 9 até o número informado.",
            "Ler um número e calcular a soma dos quadrados dos números inteiros múltiplos de 10 até o número informado.",
            "Ler um número e calcular a soma dos cubos dos números inteiros múltiplos de 11 até o número informado.",
            "Ler um número e calcular a soma dos quadrados dos números inteiros múltiplos de 12 até o número informado.",
            "Ler um número e calcular a soma dos cubos dos números inteiros múltiplos de 13 até o número informado.",
            "Ler um número e calcular a soma dos quadrados dos números inteiros múltiplos de 14 até o número informado.",
            "Ler um número e calcular a soma dos cubos dos números inteiros múltiplos de 15 até o número informado.",
            "Ler um número e calcular a soma dos quadrados dos números inteiros múltiplos de 16 até o número informado.",
            "Ler um número e calcular a soma dos cubos dos números inteiros múltiplos de 17 até o número informado.",
            "Ler um número e calcular a soma dos quadrados dos números inteiros múltiplos de 18 até o número informado.",
            "Ler um número e calcular a soma dos cubos dos números inteiros múltiplos de 19 até o número informado.",
            "Ler um número e calcular a soma dos quadrados dos números inteiros múltiplos de 20 até o número informado.",
            "Ler um número e calcular a soma dos cubos dos números inteiros múltiplos de 21 até o número informado.",
            "Ler um número e calcular a soma dos quadrados dos números inteiros múltiplos de 22 até o número informado.",
            "Ler um número e calcular a soma dos cubos dos números inteiros múltiplos de 23 até o número informado.",
            "Ler um número e calcular a soma dos quadrados dos números inteiros múltiplos de 24 até o número informado.",
            "Ler um número e calcular a soma dos cubos dos números inteiros múltiplos de 25 até o número informado."
        };

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o número do exercício que você quer resolver (1 a 90) ou 'SAIR' para sair: ");
            String escolha = scanner.nextLine().trim();

            try {
                switch (escolha.toUpperCase()) {
                    case "1":
                        System.out.println(titulos[0]);
                        Exercicio1.resolver();
                        break;
                    case "2A":
                        System.out.println(titulos[1]);
                        Exercicio2.resolverA();
                        break;
                    case "2B":
                        System.out.println(titulos[2]);
                        Exercicio2.resolverB();
                        break;
                    case "2C":
                        System.out.println(titulos[3]);
                        Exercicio2.resolverC();
                        break;
                    case "2D":
                        System.out.println(titulos[4]);
                        Exercicio2.resolverD();
                        break;
                    case "2E":
                        System.out.println(titulos[5]);
                        Exercicio2.resolverE();
                        break;
                    case "2F":
                        System.out.println(titulos[6]);
                        Exercicio2.resolverF();
                        break;
                    case "3A":
                        System.out.println(titulos[7]);
                        Exercicio3.resolver3A();
                        break;
                    case "3B":
                        System.out.println(titulos[8]);
                        Exercicio3.resolver3B();
                        break;
                    case "3C":
                        System.out.println(titulos[9]);
                        Exercicio3.resolver3C();
                        break;
                    case "4A":
                        System.out.println(titulos[10]);
                        Exercicio4.calcular4A();
                        break;
                    case "4B":
                        System.out.println(titulos[11]);
                        Exercicio4.calcular4B();
                        break;
                    case "4C":
                        System.out.println(titulos[12]);
                        Exercicio4.calcular4C();
                        break;
                    case "4D":
                        System.out.println(titulos[13]);
                        Exercicio4.calcular4D();
                        break;
                    case "4E":
                        System.out.println(titulos[14]);
                        Exercicio4.calcular4E();
                        break;
                    case "4F":
                        System.out.println(titulos[15]);
                        Exercicio4.calcular4F();
                        break;
                    case "4G":
                        System.out.println(titulos[16]);
                        Exercicio4.calcular4G();
                        break;
                    case "4H":
                        System.out.println(titulos[17]);
                        Exercicio4.calcular4H();
                        break;
                    case "4I":
                        System.out.println(titulos[18]);
                        Exercicio4.calcular4I();
                        break;
                    case "4J":
                        System.out.println(titulos[19]);
                        Exercicio4.calcular4J();
                        break;
                    case "5":
                        System.out.println(titulos[20]);
                        Exercicio5.resolver5();
                        break;
                    case "6":
                        System.out.println(titulos[21]);
                        Exercicio6.resolver6();
                        break;
                    case "7":
                        System.out.println(titulos[22]);
                        Exercicio7.resolver7();
                        break;
                    case "8":
                        System.out.println(titulos[23]);
                        Exercicio8.resolver8();
                        break;
                    case "9":
                        System.out.println(titulos[24]);
                        Exercicio9.resolver9();
                        break;
                    case "10":
                        System.out.println(titulos[25]);
                        Exercicio10.resolver10();
                        break;
                    case "11":
                        System.out.println(titulos[26]);
                        Exercicio11.resolver11();
                        break;
                    case "12":
                        System.out.println(titulos[27]);
                        Exercicio12.resolver12();
                        break;
                    case "13":
                        System.out.println(titulos[28]);
                        Exercicio13.resolver13();
                        break;
                    case "14":
                        System.out.println(titulos[29]);
                        Exercicio14.resolver14();
                        break;
                    case "15":
                        System.out.println(titulos[30]);
                        Exercicio15.resolver15();
                        break;
                    case "16":
                        System.out.println(titulos[31]);
                        Exercicio16.resolver16();
                        break;
                    case "17":
                        System.out.println(titulos[32]);
                        Exercicio17.resolver17();
                        break;
                    case "18":
                        System.out.println(titulos[33]);
                        Exercicio18.resolver18();
                        break;
                    case "19":
                        System.out.println(titulos[34]);
                        Exercicio19.resolver19();
                        break;
                    case "20":
                        System.out.println(titulos[35]);
                        Exercicio20.resolver20();
                        break;
                    case "21":
                        System.out.println(titulos[36]);
                        Exercicio21.resolver21();
                        break;
                    case "22":
                        System.out.println(titulos[37]);
                        Exercicio22.resolver22();
                        break;
                    case "23":
                        System.out.println(titulos[38]);
                        Exercicio23.resolver23();
                        break;
                    case "24":
                        System.out.println(titulos[39]);
                        Exercicio24.resolver24();
                        break;
                    case "25":
                        System.out.println(titulos[40]);
                        Exercicio25.resolver25();
                        break;
                    case "26":
                        System.out.println(titulos[41]);
                        Exercicio26.resolver26();
                        break;
                    case "27":
                        System.out.println(titulos[42]);
                        Exercicio27.resolver27();
                        break;
                    case "28":
                        System.out.println(titulos[43]);
                        Exercicio28.resolver28();
                        break;
                    case "29":
                        System.out.println(titulos[44]);
                        Exercicio29.resolver29();
                        break;
                    case "30":
                        System.out.println(titulos[45]);
                        Exercicio30.resolver30();
                        break;
                    case "31":
                        System.out.println(titulos[46]);
                        Exercicio31.resolver31();
                        break;
                    case "32":
                        System.out.println(titulos[47]);
                        Exercicio32.resolver32();
                        break;
                    case "33":
                        System.out.println(titulos[48]);
                        Exercicio33.resolver33();
                        break;
                    case "34":
                        System.out.println(titulos[49]);
                        Exercicio34.resolver34();
                        break;
                    case "35":
                        System.out.println(titulos[50]);
                        Exercicio35.resolver35();
                        break;
                    case "36":
                        System.out.println(titulos[51]);
                        Exercicio36.resolver36();
                        break;
                    case "37":
                        System.out.println(titulos[52]);
                        Exercicio37.resolver37();
                        break;
                    case "38":
                        System.out.println(titulos[53]);
                        Exercicio38.resolver38();
                        break;
                    case "39":
                        System.out.println(titulos[54]);
                        Exercicio39.resolver39();
                        break;
                    case "40":
                        System.out.println(titulos[55]);
                        Exercicio40.resolver40();
                        break;
                    case "41":
                        System.out.println(titulos[56]);
                        Exercicio41.resolver41();
                        break;
                    case "42":
                        System.out.println(titulos[57]);
                        Exercicio42.resolver42();
                        break;
                    case "43":
                        System.out.println(titulos[58]);
                        Exercicio43.resolver43();
                        break;
                    case "44":
                        System.out.println(titulos[59]);
                        Exercicio44.resolver44();
                        break;
                    case "45":
                        System.out.println(titulos[60]);
                        Exercicio45.resolver45();
                        break;
                    case "46":
                        System.out.println(titulos[61]);
                        Exercicio46.resolver46();
                        break;
                    case "47":
                        System.out.println(titulos[62]);
                        Exercicio47.resolver47();
                        break;
                    case "48":
                        System.out.println(titulos[63]);
                        Exercicio48.resolver48();
                        break;
                    case "49":
                        System.out.println(titulos[64]);
                        Exercicio49.resolver49();
                        break;
                    case "50":
                        System.out.println(titulos[65]);
                        Exercicio50.resolver50();
                        break;
                    case "51":
                        System.out.println(titulos[66]);
                        Exercicio51.resolver51();
                        break;
                    case "52":
                        System.out.println(titulos[67]);
                        Exercicio52.resolver52();
                        break;
                    case "53":
                        System.out.println(titulos[68]);
                        Exercicio53.resolver53();
                        break;
                    case "54":
                        System.out.println(titulos[69]);
                        Exercicio54.resolver54();
                        break;
                    case "55":
                        System.out.println(titulos[70]);
                        Exercicio55.resolver55();
                        break;
                    case "56":
                        System.out.println(titulos[71]);
                        Exercicio56.resolver56();
                        break;
                    case "57":
                        System.out.println(titulos[72]);
                        Exercicio57.resolver57();
                        break;
                    case "58":
                        System.out.println(titulos[73]);
                        Exercicio58.resolver58();
                        break;
                    case "59":
                        System.out.println(titulos[74]);
                        Exercicio59.resolver59();
                        break;
                    case "60":
                        System.out.println(titulos[75]);
                        Exercicio60.resolver60();
                        break;
                    case "SAIR":
                        continuar = false;
                        System.out.println("Saindo do programa.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
}