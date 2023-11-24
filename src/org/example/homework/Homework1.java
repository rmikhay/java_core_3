package org.example.homework;

public class Homework1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        //Дана строка
        String name = "     ПЕтРов Олег Иванович     ";
        name = name.strip().toUpperCase();
        if (name.contains("ОВА ")) {
            System.out.printf("Уважаемая %s\n", name);
        } else if (name.contains("ОВ ")) {
            System.out.printf("Уважаемый %s\n", name);
        } else {
            System.out.printf("Неизвестное лицо %s\n", name);
        }


        //Необходимо
        //1. убрать лишние пробелы,
        //2. перевести текст в верхний регистр
        //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
        // Если содержит "ов " то печатаем на экран: Уважаемый {name}
        // В иных случаях печатаем на экран: Неизвестное лицо {name}
    }

    public static void ex2() {
        //У нас есть машина. В данной машине есть есть перечень проверок, перед запуском
        //Количество топлива
        double fuel = 10;
        //Проверка двигателя
        boolean isEngineWork = true;
        //Проверка отсутствия ошибок (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса все работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (
                !(fuel < 10)
                &&  (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                && !hasErrors
                && isEngineWork
        ) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает");
        }
    }

    public static void ex3() {
        //Работа на самостоятельное изучение методов.
        //Заменить в строке все 'this is' на 'those are', получить индекс (число) второй буквы 'o' в строке
        //Распечатать полученный индекс
        String simply = "this is simply. This is my favorite song.";
        simply = simply.replaceAll("this is", "those are");
        simply = simply.replaceAll("This is", "Those are");
        int indexLetter = simply.indexOf("o", simply.indexOf("o") + 1);
        System.out.println(indexLetter);
        System.out.println(simply);
    }

    public static void ex4() {
        int sausageWeight = 2000;
        int hamWeight = 8511;
        int porkNeckWeight = 6988;
        int sausagePrice = 800;
        int hamPrice = 350;
        int porkNeckPrice = 500;
        int sausageCost, hamCost, porkNeckCost;
        // Расчет себестоимости
        if (sausageWeight < 1000) {
            sausageCost = 412;
        } else if (sausageWeight < 2000) {
            sausageCost = 408;
        } else {
            sausageCost = 404;
        }
        hamCost = 275;
        if (porkNeckWeight < 500) {
            porkNeckCost = 311;
        } else {
            porkNeckCost = 299;
        }
        //Расчет дохода, расчхода и прибыли
        int income = sausagePrice * sausageWeight + hamPrice * hamWeight + porkNeckPrice * porkNeckWeight;
        int consumption = sausageCost * sausageWeight + hamCost * hamWeight + porkNeckCost * porkNeckWeight + 1000000;
        int profitBeforeTaxes = income - consumption;
        double taxes;
        if (profitBeforeTaxes < 1_000_000) {
            taxes = profitBeforeTaxes * 0.08;
        } else if (profitBeforeTaxes < 2_000_000) {
            taxes = (profitBeforeTaxes - 1_000_000) * 0.1 + 1_000_000 * 0.08;
        } else {
            taxes = (profitBeforeTaxes - 2_000_000) * 0.13 + 1_000_000 * 0.1 + 1_000_000 * 0.08;
        }
        double profit = profitBeforeTaxes - taxes;
        System.out.println(profit);
        //Компания Рога и Копыта производит мясные продукты.
        //Перечень производимых товаров :
        //Колбаса - стоимость 800 руб,
        //себестоимость при производстве меньше 1000 кг - 412руб,
        //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
        //себестоимость при производстве от 2000кг - 404 руб

        //Ветчина - стоимость 350 руб
        //себестоимость при производстве - 275 руб

        //Шейка - стоимость 500 руб
        //себестоимость при производстве меньше 500кг - 311 руб
        //себестоимость при производстве больше или равно 500кг - 299 руб

        //Финансовые показатели
        //Доход компании считается как умножение стоимости на количество проданных кг
        //Расход компании считается как умножение себестоимости на количество проданных кг + миллион рублей
        //Прибыль до налогов считается как: доход - расход
        //Налоги считаются так:
        // прибыль до налогов больше 2_000_000, облагается ставкой 13%
        // прибыль до налогов больше 1_000_000 от 2_000_000, облагается ставкой 10%
        // прибыль до налогов меньше 1_000_000, облагается ставкой 8%
        //пример расчета налогов для прибыли до налогов 2_500_000:
        //1_000_000 - налог 80_000 - по ставке 8%
        //1_000_000 - налог 100_000 - по ставке 10%
        //500_000 - 65_000 - по ставке 13%
        //Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
        //Прибыль после налогов: прибыль до налогов - налог.

        //Необходимо создать универсальную систему расчетов прибыли после налогов,
        //Т.е на вход подаются данные по количеству произведенных продуктов
        // и печатается прибыль после налогов компании
        //Узнать прибыль после налогов, при продаже:
        //Колбасы 2000кг
        //Ветчины 8511кг
        //Шейки 6988кг
    }
}
