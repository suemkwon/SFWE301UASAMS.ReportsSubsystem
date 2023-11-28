import java.io.BufferedReader;  
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
import java.util.Date;


public class MatchingReport {
    public static void main(String[] args) throws IOException { 
        String file = "Report Formatting - Matching Report.csv";
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        br.readLine();
        br.readLine();
        String data;
        String[] matchInfo;
        List<Match> dataList = new ArrayList<>();
        try{
        while ((data = br.readLine()) != null) {
            matchInfo = data.split(",");
            dataList.add(new Match(matchInfo));
        }
    }
catch (IOException e) {   
         e.printStackTrace();
      }
      finally {
        // Close the BufferedReader in the finally block to ensure it gets closed
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
      br.close();
    }
}

public void setDataList(List<Match> newList){
    this.dataList = newList;
}

public List<Match> getDataList(){
    return dataList;
}
/**
 * @param matches
 * @throws IOException
 */
public void GenerateReport(List<Match> matches) throws IOException{
    FileWriter fw = new FileWriter("Matching Report.csv");
    PrintWriter pw = new PrintWriter(fw);

    try{
    Date currentDate = new Date();
    pw.println(currentDate);
    pw.println();
    for (Match match : matches) {
        // Modify this section based on the desired format
        pw.println(match.getScholarship() + "," +
                match.getAmount() + "," +
                match.getDate() + "," +
                match.getStatus() + "," +
                match.getApplicant());
    }

    System.out.println("Report generated successfully.");
}
finally {
    // Close the BufferedReader in the finally block to ensure it gets closed
    if (pw != null) {
        pw.close();
    }
}
}




/**
 * @return
 * @throws IOException
 */
public void CustomizedReport(List<Match> matches) throws IOException{
    try (FileWriter fw = new FileWriter("Customized Matching Report.csv");
    PrintWriter pw = new PrintWriter(fw)) {

    Scanner scnr = new Scanner(System.in);
    
    System.out.println("Enter the numbers to generate a customized report:");
    System.out.println();
    System.out.println("0: Print All");
    System.out.println("1: Scholarship Name");
    System.out.println("2: Total Amount");
    System.out.println("3: Close Date");
    System.out.println("4: Status");
    System.out.println("5: Applicant Name");
    System.out.println("6: Graduation Date");
    System.out.println("7: Academic Standing");
    System.out.println("8: GPA");
    System.out.println("9: Major");
    System.out.println("10: Minor");
    System.out.println("11: Field of Interest");
    System.out.println("12: Units");
    System.out.println("13: Gender");
    System.out.println("14: Race");
    System.out.println("15: Ethincity");
    System.out.println("16: Sexual Orientation");
    System.out.println("17: Transfered Student");
    System.out.println("18: First-Generation Student");
    System.out.println("19: Military");
    System.out.println("20: Disability");
    System.out.println("21: Citizenship");
    System.out.println();
    
    

    try{
        String line = scnr.nextLine();
        String[] numLine = line.split("\\s+");

    for (String num : numLine) {
        int numChoice = Integer.parseInt(num);
        if (numChoice < 0 || numChoice > 21) {
            System.out.println("Invalid choice. Please select a number between 0 and 21.");
        }

    Date currentDate = new Date();
    pw.println(currentDate);
    pw.println();
    pw.println("Customized Matching Report");
    pw.println();

        for (Match match : matches) {
           if (numChoice == 0){
            //Print All
                    pw.println(match.getScholarship() + "," + match.getAmount() + "," + match.getDate() + "," +  match.getStatus() + "," +  match.getApplicant() + "," +
                            match.getGraduationDate() + "," + match.getAdvancedStanding() + "," + match.getGPA() + "," + match.getMajor() + "," + match.getMinor() + "," +
                            match.getField() + "," + match.getUnits() + "," + match.getGender() + "," + match.getRace() + "," + match.getEthnicity() + "," + match.getSex() + "," +
                            match.getTransferedStudent() + "," + match.getFirstGen() + "," +  match.getMilitary() + "," + match.getDisability() + "," +  match.getCitizenship());
                          } 
            if (numChoice == 1){ //Scholarship
                    pw.print(match.getScholarship());
            }
            if (numChoice == 2){ //Amount
                    pw.print(match.getAmount());
            }
            if (numChoice == 3){ // Print Close Date
                    pw.print(match.getDate());
            if (numChoice == 4){
                    pw.print(match.getStatus());
            }
            if (numChoice == 5){
                pw.print(match.getApplicant());
            }
            if (numChoice == 6){
                pw.print(match.getGraduationDate());
            }
             if (numChoice == 7){
                pw.print(match.getAdvancedStanding());
            }
             if (numChoice == 8){
                pw.print(match.getGPA());
            }
             if (numChoice == 9){
                pw.print(match.getMajor());
            }
             if (numChoice == 10){
                pw.print(match.getMinor());
            }
             if (numChoice == 11){
                pw.print(match.getField());
            }
             if (numChoice == 12){
                pw.print(match.getUnits());
            }
             if (numChoice == 13){
                pw.print(match.getGender());
            }
             if (numChoice == 14){
                pw.print(match.getRace());
            }
             if (numChoice == 15){
                pw.print(match.getEthnicity());
            }
             if (numChoice == 16){
                pw.print(match.getSex());
            }
             if (numChoice == 17){
                pw.print(match.getTransferedStudent());
            }
             if (numChoice == 18){
                pw.print(match.getFirstGen());
            }
             if (numChoice == 19){
                pw.print(match.getMilitary());
            }
            if (numChoice == 20){
                pw.print(match.getDisability());
            }
            if (numChoice == 21){
                pw.print(match.getCitizenship());
            }
            else{
                System.out.println("Invalid choice. Please select a valid option.");
            }
            }
        }
    } 
}
    finally {
        // Close the BufferedReader in the finally block to ensure it gets closed
        if (pw != null) {
            pw.close();

        }
    }
    scnr.close();
}
}
}
            
