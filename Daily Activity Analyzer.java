import java.util.Scanner;
public class DailyActivityAnalyzer {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("          DAILY ACTIVITY ANALYZER       ");
        System.out.println("=============================================");
        System.out.println("Enter  number of days");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        int study=0,exercise=0,phone=0,sleep=0,other=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Each Day Activity:" + (i+1));
            arr[i] = sc.nextLine();
            String act=arr[i].toLowerCase();
            if(act.equals("study")){
                study++;
            } else if (act.equals("exercise")) {
                exercise++;
            } else if (act.equals("phone")) {
                phone++;
            } else if (act.equals("sleep")) {
                sleep++;
            }
            else{
                other++;
            }
        }
        System.out.println("=========================================");
        System.out.println("         FINAL REPORT         ");
        System.out.println("=========================================");
        System.out.println("study : " + study);
        System.out.println("exercise : " + exercise);
        System.out.println("phone : " + phone);
        System.out.println("sleep : " + sleep);
        System.out.println("other : " + other);
        int productive =study+exercise;
        int unproductive = phone;
        System.out.println("productive days  :" + productive);
        System.out.println("un productive days : " + unproductive);
        double percent = ((double)productive/n*100);
        System.out.println("---------------------------------------");
        System.out.println("productivity % : "+ percent);
        System.out.println("---------------------------------------");
        if(percent>=70){
            System.out.println("performance : Excellent");
        } else if (percent>=50) {
            System.out.println("performance : Good ");
        }
        else{
            System.out.println("Performance : Needs Improvement");
        }
        System.out.println("===========================================");

    }
}
