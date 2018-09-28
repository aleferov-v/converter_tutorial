import java.util.Random;

public class demoArray01 {
        public static void main (String args[]) {
            int sampArray [] = new int[20];
            int i;
            Random r = new Random();
            int rMin;
            int rMax;
            int iMin = 0;
            int iMax = 0;
            String s;
            boolean b3;
            boolean b6;

            rMin = 4;
            rMax = 45;

            for (i = 0; i < 20; i = i+1) {
                sampArray[i] = rMin + r.nextInt(rMax - rMin);
                s = "";

                if (i == 0) {
                    iMin = sampArray[i];
                    iMax = sampArray[i];
                }
                else
                {
                    if (iMin > sampArray[i]) { iMin = sampArray[i];};
                    if (iMax < sampArray[i]) { iMax = sampArray[i];};
                }

                if (sampArray[i] > 0) {
                  b3 = sampArray[i] % 3 == 0;
                  b6 = sampArray[i] % 6 == 0;
                  if ( b3 | b6 ) {
                      s = "Элемент массива [" + i + "] " + sampArray[i] + " делится на ";
                      if ( b3 ) { s = s + 3; }
                      if ( b3 & b6 ) { s = s + " и "; }
                      if ( b6 ) { s = s + 6; }
                      System.out.println(s);
                  }
                }
            }
            System.out.println("Минимальный элемент массива  : " + iMin );
            System.out.println("Максимальный элемент массива : " + iMax );
        }

}
