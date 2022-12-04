public class program3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("строка");
        isReversRecurs(sb);
    }
    static StringBuilder isReversRecurs(StringBuilder sb){
        if (sb.length() == 1){
            System.out.println(sb.charAt(sb.length() - 1));
            return sb;
        }
        System.out.print(sb.charAt(sb.length() - 1));
        return isReversRecurs(sb.deleteCharAt(sb.length() - 1));
    }
}
