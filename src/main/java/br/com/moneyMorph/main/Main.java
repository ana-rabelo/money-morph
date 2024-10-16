package br.com.moneyMorph.main;

import br.com.moneyMorph.model.CurrencyConversionData;
import br.com.moneyMorph.service.APIConsumption;
import br.com.moneyMorph.service.DataConversion;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        APIConsumption apiConsumption = new APIConsumption();
        DataConversion dataConversion = new DataConversion();

        final String URL = "https://v6.exchangerate-api.com/v6/";
        final String APIKEY = "21864e72103f17bdb2a27fbb";

        Map<Integer, String> currencyMap = new HashMap<>();
        currencyMap.put(1, "BRL-USD");
        currencyMap.put(2, "USD-BRL");
        currencyMap.put(3, "BRL-EUR");
        currencyMap.put(4, "EUR-BRL");
        currencyMap.put(5, "USD-EUR");
        currencyMap.put(6, "EUR-USD");

        do {
            Integer option = showMainMenu();

            if (option == 7) {
                break;
            }

            currencyMap.keySet().forEach(key -> {
                if (key.equals(option)) {
                    String currency = currencyMap.getOrDefault(option, "Moeda inválida");
                    String[] currencies = currency.split("-");

                    String fromCurrency = currencies[0];
                    String toCurrency = currencies[1];

                    System.out.println("Digite o valor que deseja converter:");
                    Scanner scanner = new Scanner(System.in);
                    Double amount = scanner.nextDouble();

                    String json = apiConsumption.getData(URL + APIKEY + "/pair/" + fromCurrency + "/" + toCurrency + "/" + amount);

                    CurrencyConversionData conversion = dataConversion.convert(json, CurrencyConversionData.class);
                    System.out.printf("%s: %.2f -> %s: %.2f%n", conversion.fromCurrency(),
                                                                amount,
                                                                conversion.toCurrency(),
                                                                conversion.amount());

                    scanner.close();
                }
            });

        } while (true);
    }

    public static Integer showMainMenu() {
        System.out.println("\nBem-vindo ao MoneyMorph! " +
                "Escolha uma opção para realizar a conversão de moedas:");

        System.out.println("1 - BRL para USD");
        System.out.println("2 - USD para BRL");
        System.out.println("3 - BRL para EUR");
        System.out.println("4 - EUR para BRL");
        System.out.println("5 - USD para EUR");
        System.out.println("6 - EUR para USD");
        System.out.println("7 - Sair");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}