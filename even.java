import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="even" width=500 height=500> </applet> */
public class even extends JApplet
{
JLabel jl;
JLabel l1;
public void init()
{
try
{
SwingUtilities.invokeLater(new Runnable()
{
public void run()
{
makeGUI();
}
});
}
catch(Exception e)

{
System.out.println(e);
}
}
public void makeGUI()
{
setLayout(new FlowLayout());
l1=new JLabel("Enter value for n");
JTextField jt=new JTextField(10);
add(l1);
add(jt);
jl=new JLabel("");
add(jl);
JButton jb=new JButton("calculate");
jb.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
          int n=Integer.parseInt(jt.getText());
          
if(n%2==0){
          
          jl.setText("even");
}
else
{
          jl.setText("odd");
}

}
 
});
add(jb);
}
}