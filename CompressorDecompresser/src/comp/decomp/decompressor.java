package comp.decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class decompressor {
    public static void method(File file)throws IOException{
        //get parent path of input compressed file
        String fileDirectory= file.getParent();
        //read compressed file
        FileInputStream fis=new FileInputStream(file);
        //read and decompressed it
        GZIPInputStream gzip=new GZIPInputStream(fis);
        //create a new file to write 
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/DecompressedFile");

        byte[] buffer = new byte[1024];

        int len;
        
        //read the  each byte of file 
        while((len=gzip.read(buffer))!=-1){
            //write the decompressed file
            fos.write(buffer,0, len);
        }

        gzip.close();
        fos.close();
        fis.close();
    }

    public static  void main(String[] args){
        File path=new File("C:\\Users\\LENOVO\\OneDrive\\Documents\\CompressedFile.gz");
    }
}
