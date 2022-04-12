import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator extends JFrame{
    private JPanel mainPanel;
    private JButton Calculate;
    private JTextField weightTextField;
    private JLabel weightLabel;
    private JTextField heightTextField;
    private JTextField BmiValue;
    private JLabel BMIValue;

    public BMICalculator(String name){
        super(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double height = Double.parseDouble(heightTextField.getText());
                double weight  = Double.parseDouble(weightTextField.getText());
                String BMI = String.valueOf(weight/(height*height));
                BmiValue.setText(BMI);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new BMICalculator("BMI Calculator");
        frame.setVisible(true);
    }
}
