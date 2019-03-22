package lesson2;

public class LoopNonArray {

    public static void main(String[] args) {

        // კენტი რიცხვები
        for (int i = 1; i <= 10; i += 2){
            System.out.println("ახლა I იმყოფება:"+i);
        }

        System.out.println("[---------------]");

        // ლუწი რიცხვები
        for (int i = 0; i <= 10; i += 2){
            if(i == 0){
                continue; // ციკლში კონკრეტულ პოზიციაზე გადახტომა
            }
            System.out.println("ახლა I იმყოფება:"+i);
        }


        System.out.println("[---------------]");

        // მასივში მერვე ელემენტს რომ ვიპოვი მეტი აღარ მაინტერესებს
        for (int i = 0; i <= 10; i++){
            if(i == 8){
                break; // ციკლიდან გამოსვლა
            }
            System.out.println("ახლა I იმყოფება:"+i);
        }

        System.out.println("[---------------]");

        int k = 10;
        while (k > 0){ // მუშაობს ბულის ლოგიკა
            System.out.println("ახლა K იმყოფება:"+k);
            k--;
        }

        System.out.println("[---------------]");

        // ორგანზომილებიანი ციკლი
        for(int j = 0; j < 8; j++){
            for(int l = 0; l < 8; l++){
                 System.out.print("[J,K]:["+j+":"+l+"] ");
            }
            System.out.println();
        }

    }
}
