public class rotate_string {
    public static void main(String[] args) {
        String input = "abcd";
        String output = input.substring(2) + input.substring(0, 2);
        System.out.println("Output: " + output);

        if(output.length() != input.length()){
            System.out.println("false");
        }

        for(int i = 0; i < input.length(); i++){
            String output1 = input.substring(i) + input.substring(0, i);
            System.out.println(output1);

            if(output1.length() == input.length()){
                System.out.println("true");
            }
        }
        
    }
}
