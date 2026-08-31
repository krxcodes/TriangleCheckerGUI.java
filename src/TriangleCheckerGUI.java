import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TriangleCheckerGUI extends JFrame {

    private JTextField txtA, txtB, txtC;
    private JLabel resultLabel;

    public TriangleCheckerGUI() {

        setTitle("Triangle Validity Checker");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(245, 247, 250));

        JLabel heading = new JLabel("TRIANGLE VALIDITY CHECKER");
        heading.setFont(new Font("Arial", Font.BOLD, 22));
        heading.setBounds(120, 20, 400, 30);
        panel.add(heading);

        JLabel sideA = new JLabel("Side A:");
        sideA.setBounds(100, 80, 100, 30);
        panel.add(sideA);

        txtA = new JTextField();
        txtA.setBounds(200, 80, 200, 30);
        panel.add(txtA);

        JLabel sideB = new JLabel("Side B:");
        sideB.setBounds(100, 130, 100, 30);
        panel.add(sideB);

        txtB = new JTextField();
        txtB.setBounds(200, 130, 200, 30);
        panel.add(txtB);

        JLabel sideC = new JLabel("Side C:");
        sideC.setBounds(100, 180, 100, 30);
        panel.add(sideC);

        txtC = new JTextField();
        txtC.setBounds(200, 180, 200, 30);
        panel.add(txtC);

        JButton checkBtn = new JButton("Check Triangle");
        checkBtn.setBounds(150, 240, 140, 40);
        panel.add(checkBtn);

        JButton resetBtn = new JButton("Reset");
        resetBtn.setBounds(310, 240, 90, 40);
        panel.add(resetBtn);

        resultLabel = new JLabel("Result: ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        resultLabel.setBounds(180, 310, 300, 30);
        panel.add(resultLabel);

        checkBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    int a = Integer.parseInt(txtA.getText());
                    int b = Integer.parseInt(txtB.getText());
                    int c = Integer.parseInt(txtC.getText());

                    if (a + b > c && b + c > a && c + a > b) {
                        resultLabel.setText("Result: Valid Triangle ✅");
                    } else {
                        resultLabel.setText("Result: Not a Valid Triangle ❌");
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            "Please enter valid numbers!");
                }
            }
        });

        resetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtA.setText("");
                txtB.setText("");
                txtC.setText("");
                resultLabel.setText("Result: ");
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TriangleCheckerGUI();
    }
}