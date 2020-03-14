public class Example{
	public static void main(String[] args) {
        String str = "Hello";
        String reverse = "";
        for(int i = str.length();i>0;i--){
            reverse += str.substring(i-1,i);
        }
        System.out.println(reverse);
    }
}