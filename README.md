# CompressorDecompressorApp

* The Java application that allow user to compress and decompress file using GZIP algorithm.        
* The app provides easy-to-use Graphical User Interface using Java Swing that allows user to select file for compression & decompression and display the progress of operation.

## FEATURES
* Compresses files using the GZIP compression algorithm.
* Decompresses GZIP-compressed files.

## OUTPUT
* It contain both Compression and Decompression options.
    * ### **Compressor**:
        * Reduce the size of file or data.
        * Maintain the quality as much as possible.
        * Remove redundancies from file and make it smaller without loosing any information.   
        
     * ### **Decompressor**
        * Restore compressed file to their original size and format.
        * Restore compressed file without loosing any important information.
        * Provide to users with easy access to the original file.


## HOW TO USE APP
1. Select the "Compress File" button to compress a file. You will be prompted to select a file to compress.
2. Once you have selected a file, the app will compress it and save the compressed file in the same directory as the original file with the "Compressed.gz" extension.
3. Select the "Decompress File" button to decompress a file. You will be prompted to select a file to decompress.
4. Once you have selected a compressed file, the app will decompress it and save the decompressed file in the same directory as the original file without the ".gz" extension.
5. You can repeat these steps for any other files you wish to compress or decompress using the app.

## CODE STRUCTURE
* The main components of the code are: 

   * GUI: The main class that provides the user interface and handles user input.
   * Comp: The helper class that implements the compression algorithm uses GZIP O/P Stream.
   * Decomp: The helper class that implements the decompression algorithm uses GZIP I/P Stream.

## CONTRIBUTION
I used some external resources for guidance :
* [javaTpoint Java Swing](https://www.javatpoint.com/java-swing).
* [Oracle Java Swing](https://docs.oracle.com/javase/tutorial/uiswing/index.html).



    ### ***Contributions are welcome! Feel free to submit pull requests or open issues!!***

