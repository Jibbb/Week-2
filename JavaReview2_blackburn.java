import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
 
public class JavaReview2_blackburn
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = null;
        String fileName = "SLCDecember2020Temperatures.csv";
        String line = "";
        try
            
        {
            
            
            File dataFile = new File(fileName);
            br = new BufferedReader(new FileReader(dataFile));
            line = br.readLine();
            
            
                    
            while((line =  br.readLine()) != null)
            {
            String [] values = line.split(",");
            System.out.println(values[0]+" "+values[1]+" "+values[2]);
            }
            
            
            
            
        }
           
        
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(JavaReview2_blackburn.class.getName()).log(Level.SEVERE, null, ex);
        } finally
        {
            try
            {
                br.close();
            } catch (IOException ex)
            {
                Logger.getLogger(JavaReview2_blackburn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
}

