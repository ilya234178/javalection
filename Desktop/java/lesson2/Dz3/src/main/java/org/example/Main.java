package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        CreateColorArray();
        ColorArrayIterator();
        ArrayFirstPosition();
        ArrayExtractElement();
        ArrayUpdateElement();
        ArrayDeleteElement();
        ArrayFindElement();
        ArrayTransferElement();
        ArrayDelete();
    }
//    1.Создать новый список, добавить несколько строк и вывести коллекцию на экран.
    public static void CreateColorArray(){
        ArrayList<String> list_Color = new ArrayList<String>();
        list_Color.add("Фиолетовый");
        list_Color.add("Лазурный");
        list_Color.add("Белый");
        list_Color.add("Красный");
        System.out.println("Задание 1." + list_Color);
    }
//    2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.
    public static void ColorArrayIterator(){
        ArrayList<String> list_Color = new ArrayList<String>();
        list_Color.add("Фиолетовый");
        list_Color.add("Лазурный");
        list_Color.add("Белый");
        list_Color.add("Красный");
        for (String element : list_Color){
            System.out.println("Задание 2." + element + "!");
        }
    }
//    3.Вставить элемент в список в первой позиции.
    public static void ArrayFirstPosition(){
        ArrayList<String> list_Color = new ArrayList<String>();
        list_Color.add("Фиолетовый");
        list_Color.add("Лазурный");
        list_Color.add("Белый");
        list_Color.add("Красный");
        System.out.println("задание 3. Первый список: " +list_Color);
        list_Color.add(0, "Коричневый");
        System.out.println("Второй список: " +list_Color);
    }
//    4.Извлечь элемент (по указанному индексу) из заданного списка.
    public static void ArrayExtractElement(){
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Фиолетовый");
        list_Color.add("Лазурный");
        list_Color.add("Белый");
        list_Color.add("Красный");
        System.out.println ("Задание 4. Изначальный массив: " + list_Color);
        String element = list_Color.get(1);
        System.out.println ("Второй элемента массива: " + element);
    }
//    5.Обновить определенный элемент списка по заданному индексу.
    public static void ArrayUpdateElement(){
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Фиолетовый");
        list_Color.add("Лазурный");
        list_Color.add("Белый");
        list_Color.add("Красный");
        System.out.println("Задание 5. Первый список: " + list_Color);
        list_Color.set(3, "Оранжевый");
        System.out.println("Второй список: " + list_Color);
    }
//    6.Удалить третий элемент из списка.
    public static void ArrayDeleteElement(){
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Фиолетовый");
        list_Color.add("Лазурный");
        list_Color.add("Белый");
        list_Color.add("Красный");
        System.out.println("Задание 6. Первый список: " + list_Color);
        list_Color.remove(2);
        System.out.println("Второй список: " + list_Color);
    }
//    7.Поиска элемента в списке по строке.
    public static void ArrayFindElement() {
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Фиолетовый");
        list_Color.add("Лазурный");
        list_Color.add("Белый");
        list_Color.add("Красный");
        System.out.println("Задание 7. Список: "+ list_Color);
        if (list_Color.contains("Красный")) {
            System.out.println("Элемент найден");
        }
        else System.out.println("Такого элемента нет.");
        }
//       8.Создать новый список и добавить в него несколько елементов первого списка.
    public static void ArrayTransferElement () {
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Фиолетовый");
        list_Color.add("Лазурный");
        list_Color.add("Белый");
        list_Color.add("Красный");
        System.out.println("Задание 8. Первый список: " + list_Color);
        String c = list_Color.remove(3 );
        ArrayList<String> list_Color2 = new ArrayList<>();
        list_Color2.add("Оранжевый");
        list_Color2.add("Коричневый");
        list_Color2.add(c);

        list_Color2.forEach (i -> System.out.println("Второй список: " + list_Color2 ));
    }
    public static void ArrayDelete(){
        ArrayList<String> list_Color = new ArrayList<>();
        list_Color.add("Фиолетовый");
        list_Color.add("Лазурный");
        list_Color.add("Белый");
        list_Color.add("Красный");

        ArrayList<String> list_Color2 = new ArrayList<>();
        list_Color2.add("Фиолетовый");
        list_Color2.add("Красный");

        list_Color.forEach(i -> System.out.println("Первый список: " + i));
        System.out.println();
        list_Color2.forEach(i -> System.out.println("Второй список: "+ i));
        System.out.println("-----------");

        list_Color.retainAll(list_Color2);

        list_Color.forEach(i -> System.out.println("Новый 1 :" + i));
        System.out.println();
        list_Color2.forEach(i -> System.out.println("Новый 2 : " + i));
    }
    }
