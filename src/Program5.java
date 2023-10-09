import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Program5 {

  public static void main(String[] args) throws Exception {
    // make this a binary search tree
    BST tree = new BST();
    // code used to read the csv file and do whatever with it 
    
    try (BufferedReader br = new BufferedReader(new FileReader("src/car_sales_data.csv"))) {
            String line;
            br.readLine(); // Skip the header row

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                // Assuming the order of columns in the CSV matches the constructor parameters
                final SaleRecord saleRecord = new SaleRecord(data[0], data[1], data[2], data[3], data[4],
                        Integer.parseInt(data[5]), Double.parseDouble(data[6]), Double.parseDouble(data[7]),
                        Double.parseDouble(data[8]));
                tree.insert(saleRecord);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(tree.toString());
  }
}
