import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JPanel mainPanel;
    private JLabel secondLabel;
    private JLabel firstLabel;
    private JTextField firstValue;
    private JTextField secondValue;
    private JButton Calculate;
    private JCheckBox addCheckbox;
    private JCheckBox subtractCheckBox;
    private JCheckBox multiplyCheckBox;
    private JTextField Result;
    private JCheckBox divideCheckBox;

    public Calculator(String name){
        super(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double first = Double.parseDouble(firstValue.getText());
                double second = Double.parseDouble(secondValue.getText());
                if (addCheckbox.isSelected()){
                    Result.setText(String.valueOf(first+second));
                }
                else if (multiplyCheckBox.isSelected()){
                    Result.setText(String.valueOf(first*second));
                }
                else if(subtractCheckBox.isSelected()){
                    Result.setText(String.valueOf(first-second));
                }
                else if(divideCheckBox.isSelected()){
                    Result.setText(String.valueOf(first/second));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame newFrame = new Calculator("Calculator");
        newFrame.setVisible(true);
    }
}
