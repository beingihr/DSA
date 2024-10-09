import java.util.Scanner;
class lab5Ex3{
    char firstSingleLetter(char text[], int n){
        int arr[] = new int[26];
       
        for(int i=0; i<n; i++){
            arr[((int)text[i])-97]++;
        }

        for(int i=0; i<n; i++){
            if(arr[(text[i]-97)] == 1){
                return text[i];
            }
        }
        return '0';
    }
    public static void main(String[] args){
        lab5Ex3  lab = new lab5Ex3();
        Scanner inp  = new Scanner(System.in);
        String txt;
        char text[] = new char[10];

        System.out.println("Enter the text: ");
        txt = inp.next();

        for(int i=0; i<txt.length(); i++){
            text[i] = txt.charAt(i);
        }
        System.out.println("the letter thar does not repeat is \'" + lab.firstSingleLetter(text, txt.length())+ "\'");

    }
}