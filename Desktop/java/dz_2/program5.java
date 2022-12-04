public class program5 {
    public static void main(String[] args) {
        System.out.println(delIns(appenDStr(3, 30)));
    }
    static String[] appenDStr(int x, int y){
        String[] result = new String[3];
        StringBuilder summ = new StringBuilder();
        summ.append(x);
        summ.append(" + ");
        summ.append(y);
        summ.append(" = ");
        summ.append(x+y);
        StringBuilder minus = new StringBuilder();
        minus.append(x);
        minus.append(" - ");
        minus.append(y);
        minus.append(" = ");
        minus.append(x-y);
        StringBuilder umn = new StringBuilder();
        umn.append(x);
        umn.append(" * ");
        umn.append(y);
        umn.append(" = ");
        umn.append(x*y);

        result[0] = summ.toString();
        result[1] = minus.toString();
        result[2] = umn.toString();

        return result;


    }
    static String[] delIns(String[] arr){
        String[] result = arr;
        for (String each: arr) {
            StringBuilder sb = new StringBuilder(each);
            int serchIndex = sb.indexOf("=");
            sb.deleteCharAt(serchIndex);
            sb.insert(serchIndex, "Равно");
            System.out.println(sb.toString());
        }
        return result;
    }

}
