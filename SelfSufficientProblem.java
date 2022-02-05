import java.util.*;

class SelfSufficientProblem {
    public static void main(String[] args){
        //Input
        Scanner s = new Scanner(System.in);
        int noOfBooks = s.nextInt();
        int[] earnings = new int[noOfBooks];
        int[] cost = new int[noOfBooks];
        int borrow = 0;
        for(int i=0;i<noOfBooks;i++){
            earnings[i] = s.nextInt();
        } 
        for(int i=0;i<noOfBooks;i++){
            cost[i] = s.nextInt();
        }
    
    //Output
    int extra = 0;
    int temp = 0;
    for(int i=0;i<noOfBooks;i++){
        if(earnings[i]>=cost[i]){
            extra += earnings[i] - cost[i];
        }
        else if(earnings[i]<cost[i]){
            temp = cost[i] - earnings[i];
            if(extra>0){
                if(temp>=extra){
                    temp-=extra;
                    extra = 0;
                }
                else{
                    temp=0;
                    extra -= temp;
                }
            }
            borrow += temp;
        }
    }
    System.out.println(borrow);
    }
}
