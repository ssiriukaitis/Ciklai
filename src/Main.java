public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        //==============1 uzd =======================
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " Labas");
        }


        //================== 2 uzd ===================
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //================== 3 uzd ===================
        System.out.println(" ");


        String[] plants = {"Braškė ","Pomidoras ", "Agurkas ", "Poras ", "Špinatas ", "Ridikėlis ", "Bananas ", "Obuolys ", "Paprika ", "Avokadas "};

        for (int i = 0; i < plants.length; i++) {

            System.out.print(plants[i]);
        }

        //============== 4 uzd ======================
        System.out.println(" ");


        String[] plants1 = {"Braškė ","Pomidoras ", "Agurkas ", "Poras ", "Špinatas ", "Ridikėlis ", "Bananas ", "Obuolys ", "Paprika ", "Avokadas "};

        for (int i = 0; i < plants.length; i++) {

            System.out.println(plants1[i]);
        }

        //============= 5 uzd ========================
        System.out.println(" ");


        String[] plants2 = {"Braškė ","Pomidoras ", "Agurkas ", "Poras ", "Špinatas ", "Ridikėlis ", "Bananas ", "Obuolys ", "Paprika ", "Avokadas "};

        for (int i = plants2.length - 1; i >= 0; i--) {

            System.out.println(plants2[i]);
        }

        //============ 6 uzd ===============
        System.out.println(" ");

        for (int i = 10; i <= 50; i++) {
            if (i%2==0)
                System.out.println(i);

        }

        //============ 7 uzd ==================
        System.out.println(" ");
        for (int i = 10; i <= 50; i++) {
            if (i % 10 == 0){
                continue;
            }
            if (i % 2 == 0) {
                System.out.println(i);


            }
        }

        //=========== 8 uzd ============

















































    }

}