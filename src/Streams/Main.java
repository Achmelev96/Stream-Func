package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Shop shop1 = new Shop("Центральный", 4200000, 2500);  // 1680 руб/м²
        Shop shop2 = new Shop("Микро", 650000, 350);          // 1857 руб/м²
        Shop shop3 = new Shop("Северный", 1900000, 2200);     // 863 руб/м²
        Shop shop4 = new Shop("Южный", 2300000, 1800);        // 1278 руб/м²
        Shop shop5 = new Shop("Универсам", 1100000, 1400);    // 785 руб/м²
        Shop shop6 = new Shop("Премиум", 5100000, 3000);      // 1700 руб/м²

        List<Shop> shopsNetwork = List.of(shop1, shop2, shop3, shop4, shop5, shop6);

        //a
        int totalIncome = shopsNetwork.stream()
                .mapToInt(Shop::getIncome)
                .sum();
        System.out.println("\nОбщий доход сети: " + totalIncome + " рублей");

        //b
        long shopsCounter = shopsNetwork.stream()
                .count();
        System.out.println("\nВсего магазинов в сети:"  + (int)shopsCounter);

        //c

        //d
        System.out.println();
        List<Shop> incomeDesc = shopsNetwork.stream()
                .sorted(Comparator.comparingInt(Shop::getIncome).reversed())
                .toList();
        incomeDesc.forEach(System.out::println);

        //e Вывод от меньшего к большему
        System.out.println();
        List<Shop> incomePer1m = shopsNetwork.stream()
                .sorted(Comparator.comparingInt(shop -> shop.getIncome()/shop.getArea()))
                .toList();
        incomePer1m.forEach(System.out::println);

        //f
        // 2 лучших
        System.out.println();
        shopsNetwork.stream()
                .sorted(Comparator.comparingInt(Shop::getIncome).reversed())
                .limit(2)
                .forEach(System.out::println);

        // 2 худших
        System.out.println();
        shopsNetwork.stream()
                .sorted(Comparator.comparingInt(Shop::getIncome))
                .limit(2)
                .forEach(System.out::println);

        //g
        System.out.println();
        shopsNetwork.stream()
                .filter(shop -> shop.getIncome()/shop.getArea() > 1000)
                .forEach(System.out::println);
    }
}
