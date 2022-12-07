import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class dz4 {
    public static void main(String[] args) {
        ArrayList<String> list_fname = new ArrayList<>();
        list_fname.add("eva");
        list_fname.add("den");
        list_fname.add("nik");

        ArrayList<String> list_lname = new ArrayList<>();
        list_lname.add("lan");
        list_lname.add("kim");
        list_lname.add("son");

        ArrayList<String> list_tname = new ArrayList<>();
        list_tname.add("git");
        list_tname.add("chit");
        list_tname.add("sit");

        ArrayList<Integer> list_age = new ArrayList<>();
        list_age.add(13);
        list_age.add(23);
        list_age.add(6);

        ArrayList<String> list_sex = new ArrayList<>();
        list_sex.add("M");
        list_sex.add("M");
        list_sex.add("M");

        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(0);
        linkedlist.add(1);
        linkedlist.add(2);




        int cnt = list_age.size()-1;
        while (cnt > -1) {
            int max_age = list_age.get(linkedlist.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++){
                if (max_age < list_age.get(linkedlist.get(i))){
                    max_age = list_age.get(linkedlist.get(i));
                    index = i;
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index, tmp);

            cnt--;
        }

        int count = linkedlist.size();

        ArrayList<String> list_fname_sort = new ArrayList<>(count);
        ArrayList<String> list_lname_sort = new ArrayList<>(count);
        ArrayList<String> list_tname_sort = new ArrayList<>(count);
        ArrayList<Integer> list_age_sort = new ArrayList<>(count);
        ArrayList<String> list_sex_sort = new ArrayList<>(count);


        for (int i : linkedlist){
            list_fname_sort.add(list_fname.get(i));
            list_lname_sort.add(list_lname.get(i));
            list_tname_sort.add(list_tname.get(i));
            list_age_sort.add(list_age.get(i));
            list_sex_sort.add(list_sex.get(i));
        }

        for (int i = 0; i < 3; i++){
            System.out.println(list_fname_sort.get(i)+list_lname_sort.get(i)+list_tname_sort.get(i)+list_age_sort.get(i)+list_sex_sort.get(i));
        }
        System.out.println(list_fname_sort);
        System.out.println(list_lname_sort);
        System.out.println(list_tname_sort);
        System.out.println(list_age_sort);
        System.out.println(list_sex_sort);
    }
    }

