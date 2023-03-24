# CompressorDecompressorApp

* The Java application that allow user to compress file and decompress file .
* It contain both Compression and Decompression function.
    *###**Compressor**:
        * Reduce the size of file or data.
        * Maintain the quality as much as possible.
        * Remove redundancies from file and make it smaller without loosing any information.
        * Uses lossy compression algorithm.
        
     *###**Decompressor**
        * Restore compressed file to their original size and format.
        * Restore compressed file without losing any important information.
        * Provide users with easy access to the original file.
        
* The app provides Graphical User Interface using Java Swing for visualizing the maze and the solution.

## USAGE
Simply, open the project in your preffered IDE.
Launch the app by running the AppFrame class.

## ALGORITHM
The app uses Depth-First Search algorithm to find the solution path in the maze.
The algorithm works by exploring each possible path from the starting position until it reaches the destination.
If it encounters a dead end, it backtracks to the previous position and tries a different path.

## CODE STRUCTURE
The main components of the code are:

AppFrame: The main class that provides the user interface and handles user input.
DFS: A helper class that implements the Depth-First Search algorithm.
Maze: A data structure that represents the maze and provides methods for manipulating it.

## CONTRIBUTION
I used some external resources for guidance :
javaTpoint Java Swing
Oracle Java Swing
