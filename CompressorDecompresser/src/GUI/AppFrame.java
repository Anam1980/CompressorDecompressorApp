package GUI;

import comp.decomp.compressor;
import comp.decomp.decompressor;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AppFrame extends JFrame implements ActionListener {
     JButton compressButton;
     JButton decompressButton;
     JPanel panel;
     JLabel title;

    public AppFrame(){
        // Set frame properties
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Compressor/Decompressor App");
        this.setSize(800, 400);
        this.setLocationRelativeTo(null);

        this.setBackground(Color.black);
        // Create panel and set background color
        panel = new JPanel();
        panel.setBackground(new Color(224, 255, 255));
        panel.setLayout(null);
        this.add(panel, BorderLayout.CENTER);

        // Create title label and set font and color
        title = new JLabel("Compressor/Decompressor");
        title.setFont(new Font("Arial", Font.BOLD, 36));
        title.setForeground(new Color(25, 25, 112));
        title.setBounds(200, 50, 400, 50);
        panel.add(title);

        // Create compress button, set font and color, and add action listener
        compressButton = new JButton("Select new file to compress");
        compressButton.setFont(new Font("Arial", Font.BOLD, 16));
        compressButton.setBackground(new Color(0, 128, 128));
        compressButton.setBorder(BorderFactory.createLineBorder( Color.white,6));
        //set font color
        compressButton.setForeground(new Color(255, 255, 255));
        compressButton.setBounds(150, 150, 250, 40);
        compressButton.addActionListener(this);

        //add to the panel
        panel.add(compressButton);

        // Create decompress button, set font and color, and add action listener
        decompressButton = new JButton("Select file to decompress");
        decompressButton.setFont(new Font("Arial", Font.BOLD, 16));
        decompressButton.setBackground(new Color(0, 128, 128));
        decompressButton.setBorder(BorderFactory.createLineBorder(Color.white, 6));
        decompressButton.setForeground(new Color(255, 255, 255));
        decompressButton.setBounds(400, 150, 250, 40);
        decompressButton.addActionListener(this);

        //add to the panel
        panel.add(decompressButton);

        // Make the frame visible
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==compressButton){
            JFileChooser fileChooser=new JFileChooser();

            int response=fileChooser.showSaveDialog(null);

            if(response==JFileChooser.APPROVE_OPTION){
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);

                try{
                    compressor.method(file);
                }
                catch (Exception ee){
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }

        if(e.getSource()==decompressButton){
            JFileChooser fileChooser=new JFileChooser();

            int response=fileChooser.showSaveDialog(null);

            if(response==JFileChooser.APPROVE_OPTION){
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);

                try{
                    decompressor.method(file);
                }
                catch (Exception ee){
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }
    }
}
