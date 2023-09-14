package CT3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class UserInterface {
	private JFrame frame;
    private JTextArea textBox;
    public  UserInterface () {
    	frame = new JFrame("User Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem displayDateTime = new JMenuItem("Date and Time");
        JMenuItem saveToFileItem = new JMenuItem("Save to File");
        JMenuItem changeBackgroundColorItem = new JMenuItem("Change Background Color");
        JMenuItem exitItem = new JMenuItem("Exit");

        displayDateTime.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showDateTime();
            }
        });
        saveToFileItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveToFile();
    }
        });
        changeBackgroundColorItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeBackgroundColor();
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(displayDateTime);
        fileMenu.add(saveToFileItem);
        fileMenu.add(changeBackgroundColorItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        textBox = new JTextArea();
        frame.add(new JScrollPane(textBox), BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private void showDateTime() {
        String dateTime = new java.util.Date().toString();
        textBox.append(dateTime + "\n");
    }

    private void saveToFile() {
        String content = textBox.getText();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void changeBackgroundColor() {
        float hue = (float) Math.random();
        Color color = Color.getHSBColor(hue, 1.0f, 1.0f);
        frame.getContentPane().setBackground(color);
    }

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new UserInterface();
                
            }
        });
	}


}

