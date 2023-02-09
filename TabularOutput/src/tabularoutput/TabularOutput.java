package tabularoutput;


public class TabularOutput {
        public static void main(String[] args) {
            
             System.out.printf("N\t10*N\t100*N\t1000*N\n");
            int n = 1;
            while(n < 6){
            System.out.printf(n + "\t" + n*10 + "\t" + n*100 + "\t" + n*1000 + "\n");
            n++;
            }
        }
}
