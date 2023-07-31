import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class main extends JPanel implements ActionListener {
    JButton credit = new JButton("Credit");
    JButton debit = new JButton("Debit");
    JButton exit = new JButton("Exit");
    TextField t1, t2, output;
    Label creditAccount, debitAccount, balanceAmount;
    double accountBalance = 0.0;
    public main(JFrame frame) {
        /* creating labels, set boundaries and add to frame */
        creditAccount = new Label("Credit Amount:");
        creditAccount.setBounds(50, 100, 100, 50);
        frame.add(creditAccount);
        /* create text box and set boundaries, add to frame */
        t1 = new TextField("");
        t1.setBounds(150, 110, 100, 50);
        frame.add(t1);

        debitAccount = new Label("Debit Amount:");
        debitAccount.setBounds(50, 180, 100, 50);
        frame.add(debitAccount);
        t2 = new TextField("");
        t2.setBounds (150, 180, 100, 50);
        frame.add(t2);

        credit.addActionListener(this);
        credit.setBounds(150, 250, 150, 30);
        frame.add(credit);

        debit.addActionListener(this);
        debit.setBounds(300, 250, 150, 30);
        frame.add(debit);

        balanceAmount = new Label("Balance Amount:");
        balanceAmount.setBounds(300, 180, 100, 50);
        frame.add(balanceAmount);

        output = new TextField("");
        output.setBounds(400, 180, 100, 50);
        frame.add(output);
        exit.addActionListener(this);
        exit.setBounds(450, 250, 150, 30);
        frame.add(exit);
    }

public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new main(frame));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setVisible(true);
    }
public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Credit")){
        System.out.println("Credit has been picked");
        String balanceAmount=t1.getText();
        double creditAmount=Double.parseDouble(balanceAmount);
        accountBalance=accountBalance-creditAmount;
        output.setText(String.valueOf(accountBalance));
        t1.setText("");
        }else if(e.getActionCommand().equals("Debit")){
        System.out.println("Debit has been picked");
        String balanceAmount=t2.getText();
        double debitAmount=Double.parseDouble(balanceAmount);
        accountBalance=accountBalance+debitAmount;
        output.setText(String.valueOf(accountBalance));
        t2.setText("");
        }else if(e.getActionCommand().equals("Exit")){
        System.out.println("Exit Complete");
        System.exit(0);
        }
        }
        }