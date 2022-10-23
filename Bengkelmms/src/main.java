package pendaftaran;

import menu.Login;

public class Pendaftaran {
    public static void main(String[] args) {
        Login lg = new Login();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }   
}
