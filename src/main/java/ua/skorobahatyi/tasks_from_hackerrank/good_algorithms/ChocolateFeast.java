package ua.skorobahatyi.tasks_from_hackerrank.good_algorithms;

/**
 * Chocolate Feast
 * https://www.hackerrank.com/challenges/chocolate-feast/problem?isFullScreen=true&utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * */
public class ChocolateFeast {

    public static void main(String[] args) {

        chocolateFeast(15,3,2);
    }


    private static int chocolateFeast(int n, int c, int m) {

        int count=0,s=0,l=0;
        while(n>0|| s>=m) {
            if (n>0){
                s=n/c;
                n=0;
                count+=s;
            }
            l=s/m;
            count+=l;
            s=l+(s%m);

        }
        System.out.println("Numbers chocolate: "+count);
        return count;
    }
}
