
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class Shutdown{




    public static void main(String[] args) {
        
        // System.loadLibrary("shutdown1.dll");
        // System.loadLibrary("shutdown1");

        try {
            
        JFrame f = new JFrame("My Shutdown Panel");
        JTextField textField = new JTextField();
        JTextField textField1 = new JTextField();
        JTextField result = new JTextField();
        JButton b = new JButton();
        JButton c = new JButton();
        JLabel l = new JLabel();
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        l.setBounds(120, 10, 200, 20);


        textField.setBounds(10, 10, 100, 20);
        textField1.setBounds(10, 40, 100, 20);
        result.setBounds(10, 70, 100, 20);

        b.setBounds(10, 100, 100, 40);
        c.setBounds(10, 180, 100, 40);
        b.setText("add");
        c.setText("clear");
        f.add(b);
        f.add(c);
        f.add(textField);
        f.add(textField1);
        f.add(result);
        f.add(l);

        textField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                l.setText("");
                l.setVisible(false);
                throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
            }
            
        });

        
        b.addActionListener((e) -> {

            try {
                
                int number1 = Integer.valueOf(textField.getText().toString()) != 0 ? Integer.valueOf(textField.getText().toString()) : 0;
                int number2 = Integer.valueOf(textField1.getText().toString()) != 0 ? Integer.valueOf(textField.getText().toString()) : 0;
                
                int resultadd = number1 + number2;
                System.out.println(resultadd);
    
                result.setText(String.valueOf(resultadd));
            } catch (Exception ex) {

                l.setText("Please input number ");
                l.setVisible(true);
                System.out.println(ex.toString());
            }
            


        });


        c.addActionListener((e) -> {
            textField.setText("");
            textField1.setText("");
            result.setText("");

        });

    }

        catch (Exception e) {
            // e.printStackTrace();
            System.err.println("error");
        }


    }


    // public static native void shutdownWindows();
}