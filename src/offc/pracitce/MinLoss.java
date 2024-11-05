package offc.pracitce;

public class MinLoss {
    public static int minloss(int[] actualSale){
        int minLoss=Integer.MAX_VALUE;
        for(int i=0;i<actualSale.length;i++){
            for(int j=i+1;j<actualSale.length;j++){
                if(actualSale[i]>actualSale[j]){
                    int loss=actualSale[i]-actualSale[j];
                    if(loss<minLoss){
                        minLoss=loss;
                    }
                }

            }
        }
        return minLoss;
    }
    public static void main(String[] args){
        int[] actualSale1={20,7,8,2,5};
        int[] actualSale2={5,10,3};
        System.out.println("Minimum Loss actualSale1: "+minloss(actualSale1));
        System.out.println("Minimum Loss actualSale2: "+minloss(actualSale2));
    }


}
