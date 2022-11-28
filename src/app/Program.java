package app;

import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();
        System.out.print("Quantos contribuintes você vai digitar: ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++){
            System.out.printf("Digite os dados do %dº contribuinte: %n", (i+1));
            System.out.print("Renda anual com salário: ");
            Double salaryIncome = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviços: ");
            Double servicesIncome = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            Double capitalIncome = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            Double healthSpendig = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            Double educationSpendig = sc.nextDouble();
            list.add(new TaxPayer(salaryIncome, servicesIncome,capitalIncome,healthSpendig,educationSpendig));
            System.out.println();
        }
        int i = 0;
        for (TaxPayer obj : list) {
            System.out.printf("Resumo do %dº contribuinte: %n", (i + 1));
            System.out.println(obj);
            i++;
        }

        sc.close();
    }
}
