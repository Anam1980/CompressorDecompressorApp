package comp.decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class compressor {

    public static void method(File file) throws IOException {
        //get parent path
        String fileDirectory=file.getParent();
        
        //read textfile
        FileInputStream fis=new FileInputStream(file);
        //create new file to write with .gz extension
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/CompressedFile.gz");
        //to compressed the input file , write into new one
        GZIPOutputStream gzip=new GZIPOutputStream(fos);
        
        //chunks of byte to read the whole file
        byte[] buffer = new byte[1024];
        int len;
        
        while((len=fis.read(buffer))!=-1){
            //write with compression
            gzip.write(buffer, 0, len);
        }

        gzip.close();
        fos.close();
        fis.close();
    }

    public static void main(String[] args) throws IOException{
        File path = new File("C:\\Users\\LENOVO\\OneDrive\\Documents");
        method(path);
    } 
}
