public class Calculator {

    public double sum(double numb1, double numb2i, double numb3, double numb4i ){
        double[] result = new double[2];
        result[0] = numb1 + numb3;
        result[1] = numb2i + numb4i;
         System.out.println(result[0] + ", " + result[1] + "i");
        return result[0];



    }

    public double dividing(double numb1, double numb2i, double numb3, double numb4i){
        double[] result = new double[3];
        double result1 = numb1 * numb3; // числитель
        double result2i = numb1 * numb4i; // второй числитель
        double result3i = numb2i * numb3; // трейтий числитель
        double result4i2 =  numb2i * numb4i; // четвёртый числитель

        double result5i = (numb3 * numb3) + (numb4i * numb4i * -1); // знаменатель

        double result6 = result1 * (result4i2 * -1 ); // числитель
        double result7 = result2i + result3i; // числитель i

        for (int i = 1; i < result6; i++){
            if (result6 / i == 0 && result7 / i == 0 && result5i / i == 0){
                double result8  = result6 / i;
                double result9 = result7 / i;
                double result10 = result5i / i;
                result[0] = result8;
                result[1] = result9;
                result[2] = result10;
                System.out.println(result[0]  + result[1] + result[2] + "i");
                return result[0];
            }
        }
        result[0] = result6;
        result[1] = result7;
        result[2] = result5i;
        System.out.println(result[0]  + result[1] + result[2] + "i");
        return result[0];


    }

    public double substraction(double numb1, double numb2i, double numb3, double numb4i ){
        double[] result = new double[2];
        result[0] = numb1 - numb3;
        result[1] = numb2i - numb4i;
        System.out.println(result[0] + ", " + result[1] + "i") ;
        return result[0];

    }

    public double multiplication(double numb1, double numb2i, double numb3, double numb4i){
        double[] result = new double[2];
        double result1 = (numb1 * numb3);
        result[1] = (numb1 * numb4i) + (numb2i * numb3);
        double resulti2 = (numb2i * numb4i);
        result[0] = result1 + (resulti2 * -1);

        System.out.println(result[0] + ", " + result[1] + "i");

        return result[0];

    } // можно ли прописать методо гет и сет для каждого метода, если каждый из них находится в одном классе?????
}
