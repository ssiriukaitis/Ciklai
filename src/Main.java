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


        String[] plants = {"Braškė ", "Pomidoras ", "Agurkas ", "Poras ", "Špinatas ", "Ridikėlis ", "Bananas ", "Obuolys ", "Paprika ", "Avokadas "};

        for (int i = 0; i < plants.length; i++) {

            System.out.print(plants[i]);
        }

        //============== 4 uzd ======================
        System.out.println(" ");


        String[] plants1 = {"Braškė ", "Pomidoras ", "Agurkas ", "Poras ", "Špinatas ", "Ridikėlis ", "Bananas ", "Obuolys ", "Paprika ", "Avokadas "};

        for (int i = 0; i < plants.length; i++) {

            System.out.println(plants1[i]);
        }

        //============= 5 uzd ========================
        System.out.println(" ");


        String[] plants2 = {"Braškė ", "Pomidoras ", "Agurkas ", "Poras ", "Špinatas ", "Ridikėlis ", "Bananas ", "Obuolys ", "Paprika ", "Avokadas "};

        for (int i = plants2.length - 1; i >= 0; i--) {

            System.out.println(plants2[i]);
        }

        //============ 6 uzd ===============
        System.out.println(" ");

        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0)
                System.out.println(i);

        }

        //============ 7 uzd ==================
        System.out.println(" ");
        for (int i = 10; i <= 50; i++) {
            if (i % 10 == 0) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.println(i);


            }
        }

        //=========== 8 uzd ============
        System.out.println(" ");

        int even = 0;
            for (int i = 0; i <= 20; i++) {
                if (i % 2 == 0) {
                    even++;
                }
            }
        System.out.println(even + "poriniai");

        //=========== 9 uzd ===============

        System.out.println(" ");

        String[] augalai = {"Braškė ", "Pomidoras ", "Agurkas ", "Poras ", "Špinatas ", "Ridikėlis ", "Bananas ", "Obuolys ", "Paprika ", "Avokadas "};

        int count5 = 0;
        int count7 = 0;
        for (int i = 0; i < augalai.length; i++) {
            if (augalai[i].length() < 5){
                count5++;
            }
            if (augalai[i].length() > 7) {
                count7++;
            }
        }
        System.out.println(count5 + " trumpesni zodziai nei penkios raides");
        System.out.println(count7 + " ilgesni zodziai nei septynios raides");


        //================= 10 uzd =====================

        System.out.println(" ");

        String[] visiaugalai = {"Braškė ", "Pomidoras ", "Agurkas ", "Poras ", "Špinatas ", "Ridikėlis ", "Bananas ", "Obuolys ", "Paprika ", "Avokadas "};

        int finalcount = 0;

        for (int i = 0; i < visiaugalai.length; i++) {
            if (visiaugalai[i].length() > 5 && visiaugalai[i].length() < 10) {
                finalcount++;
            }
        }
        System.out.println(finalcount);

        //==================== sunkesni=======================================================
        //==========1 uzd =================






























































    }

}