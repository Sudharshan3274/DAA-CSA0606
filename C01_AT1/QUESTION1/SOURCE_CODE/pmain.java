import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println(" Distributed Database Query Processor");
        System.out.println("==========================================");

        System.out.print("Enter total number of records : ");
        int records = sc.nextInt();

        Query query = new Query("SELECT * FROM CUSTOMER", records);

        QueryProcessor processor = new QueryProcessor();

        Result result = processor.processQuery(query);

        System.out.println("\n========== FINAL RESULT ==========");
        System.out.println(result);

        processor.displayMasterTheorem(records);

        sc.close();
    }
}