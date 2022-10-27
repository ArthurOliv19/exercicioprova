import java.util.Scanner;

public class exercicioprova {
    public static void main(String[] args) {
        String nome;
        double peso;
        double qtdingeridanodia;
        double qtdAingerir;
        double qtdidealpordia;

        Scanner teclado = new Scanner(System.in);
        // Solicitar nome do funcionário
        System.out.println(" Nome do funcionário ");
        nome = teclado.next();
        // Solicitar peso do funcionário
        System.out.println(" Seu peso ");
        peso = teclado.nextDouble();
        // Solicitar a quantidade de agua ingerida no dia
        System.out.println(" Quantidade de água ingerida ");
        qtdingeridanodia = teclado.nextDouble();

        teclado.close();
        // Calcular a quantidade ideal de água a ingerir por dia em litros
        // Fórmula: (Peso X 35ml) / 1.000
        // Arredondar com zero casas decimais para cima.
        qtdidealpordia = Math.round(peso * 35) / 1000;

        // Calcular a quantidade a ingerir no dia.
        // Fórmula: Quantidade ideal a Ingerir – Quantidade Ingerida
        qtdAingerir = qtdidealpordia - qtdingeridanodia;
        // Imprimir o nome do funcionário
        System.out.println(" Nome: " + nome);
        // Imprimir o peso do funcionário
        System.out.println(" Peso: " + peso + " KG ");
        // A quantidade de água ingerida
        System.out.println(" Quantidade de água ingerida   " + qtdingeridanodia + " litros ");
        // A quantidade ideal de água a ingerir
        System.out.println(" Quantidade ideal de água a ingerir   " + qtdidealpordia + " litros ");
        // Se a quantidade a ingerir seja negativa,
        // imprimir a mensagem “Parabéns, você atingiu a meta de hidratação diária”;
        if (qtdAingerir < 0) {
            System.out.println("Parabéns, você atingiu a meta de hidratação diária ! ");
            // se quantidade a ingerir seja zero ou positiva, imprimir a mensagem
            // “Continue focado em se hidratar por hoje, ainda faltam [x] litros! Você
            // consegue!”;
        }
        if (qtdAingerir >= 0) {
            System.out.println("Continue focado em se hidratar por hoje, ainda faltam " + qtdidealpordia
                    + " litros. Você consegue!");
        }
    }
}
