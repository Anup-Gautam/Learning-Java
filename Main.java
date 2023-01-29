import javax.swing.JOptionPane;
// Simple GUI  using JOptionPane
public class Main{
    public static void main(String[] args){
      // JOPtionPane.showInputDialog(string) Takes in the input
        String name = JOptionPane.showInputDialog("Enter your name");
      //JOptionPane.showMessageDialog(parentType, message) displays output
        JOptionPane.showMessageDialog(null,"Hello" + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old" );

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height in foot"));
        JOptionPane.showMessageDialog(null, "You are " + height +" feet tall" );


    }
}
