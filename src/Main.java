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
            if (augalai[i].length() < 5) {
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


        int more150 = 0;

        for (int i = 0; i <= 300; i++) {
            if (i <= 275)
                System.out.print(i + " ");
            if (i > 275)
                System.out.print("[" + i + "] ");
            if (i > 150)
                more150++;
        }
        System.out.println();
        System.out.println(more150 + " skaiciu didesniu uz 150");

        //=====================2 uzd ============================
        System.out.println(" ");


        String text = " ";
        for (int i = 77; i <= 3000; i += 77) {
            text += i + ",";
        }
        text = text.substring(0, text.length() - 1);
        System.out.print(text);

//        String nums = "0123456789rdtyujoiuytdftghujikj";
//        System.out.println(nums);
//        System.out.println(nums.substring(3,nums.length() -1));

        //================ 3 uzd ==============================


        System.out.println(" ");

        for (int m = 0; m < 10; m++) {
            for (int k = 0; k < 10; k++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        //====================== 5 uzd ==========================
        System.out.println();

        int herb = 0;
        int skai = 1;
        int bandymai = 0;
        int threerow = 0;
        int threerowA =0;
        while(true) {
            int rezultatas = (int) (Math.random() * 2);
            System.out.println(rezultatas);
            if (rezultatas == 1) {
                System.out.println("S");
            } else {
                System.out.println("H");
                break;
            }
        }

//========================= 5 uzd b =====================
        System.out.println();


        while(true) {

            if (Math.random() > 0.5) {
                System.out.println("S");
            } else {
                System.out.println("H");
                bandymai++;
                if (bandymai >= 3)
                    break;
            }

        }

        //======================== 5 uzd c ======================

        System.out.println();

        while(true) {

            if (Math.random() > 0.5) {
                System.out.println("S");
                threerow = 0;
            } else {
                System.out.println("H");
                threerow++;
                if (threerow == 3) {
                    break;
                }
            }
        }












































































    }

}