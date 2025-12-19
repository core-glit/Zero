public class R_string {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        if(s1.length() != s2.length()){
            System.out.println(false);
        }

        boolean flag = false;
        int count = 0;
        char[] s1_1 = s1.toCharArray();
        char[] s2_1 = s2.toCharArray();
        for(int i = 0; i < s1_1.length; i++){
            for(int j = 0; j < s2_1.length; j++){
                if(s1_1[i] == s2_1[j]){
                    count++;
                }
            }
            for(int k = 0; k < s1_1.length-1; k++){
                if(s1_1[k] == s2_1[k+1]){
                    count++;
                }
            }
            if(count == s1_1.length){
                flag = true;
            }
        }
        System.out.println(flag);
    }
}
