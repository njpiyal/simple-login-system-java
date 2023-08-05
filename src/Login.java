import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {
    JLabel userName = new JLabel();
    JLabel password = new JLabel();

    JTextField usernameInput = new JTextField();
    JTextField passwordInput = new JPasswordField();

    JButton Login = new JButton();
    JTextArea area = new JTextArea("Welcome to Java");

    Login(){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);


        userName.setBounds(50,50,150,50);
        usernameInput.setBounds(250,50,150,50);
        password.setBounds(50,150,150,50);
        passwordInput.setBounds(250,150,150,50);
        Login.setBounds(200,250,100,50);
        userName.setText("User Name");
        password.setText("Password");
        Login.setText("Login");
        Login.addActionListener(this);

        jFrame.add(area);
        jFrame.add(userName);
        jFrame.add(usernameInput);
        jFrame.add(password);
        jFrame.add(passwordInput);
        jFrame.add(Login);

        jFrame.setLocation(100,100);
        jFrame.setSize(500,600);
        jFrame.setLayout(null);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userName = "Suzushi";
        String userPass = "1234";

        if (!usernameInput.getText().isEmpty() && !passwordInput.getText().isEmpty())
        {
            if (usernameInput.getText().equals(userName) && passwordInput.getText().equals(userPass)){
                messageBox("Login Successful");
            }
            else messageBox("Username or Password is Incorrect");
        } else {
            messageBox("Username or Password is required");
        }
    }

    void messageBox(String message)
    {
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, message);
    }

    public static void main(String[] args) {


    }
}
