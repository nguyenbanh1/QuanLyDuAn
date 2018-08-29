package Utils;

import org.springframework.util.Base64Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.codec.binary.Base64;

public class Convert {
    public static String encodeImpagetoData(String positionImage){

        File file = new File(positionImage);
        byte imageData[] = new byte[(int) file.length()];
        FileInputStream fileInputStream = null;
        try{

            fileInputStream = new FileInputStream(file);

            fileInputStream.read(imageData);

        }catch(Exception ex){
            System.out.println("error in encode Image : " + ex.getMessage());
        }
        finally {
            try {
                fileInputStream.close();
            }catch (Exception ex){
                System.out.println("error : " + ex.getMessage());
            }

        }
        return Base64Utils.encodeToString(imageData);
    }

    public static void decodeDataToImage(String imageDataString,String positionImage){

        File file = new File(positionImage);
        FileOutputStream fileOutputStream = null;

        try{

            fileOutputStream = new FileOutputStream(file);

            fileOutputStream.write(Base64.decodeBase64(imageDataString));

        }catch(Exception ex){
            System.out.println("Error :" + ex.getMessage());
        }

    }
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd hh:mm:ss");
        Calendar calendar = new GregorianCalendar(2018,7,29,10,31,31);
        int year = calendar.get(Calendar.AUGUST);
        System.out.println("year : " + year);




    }


}

















