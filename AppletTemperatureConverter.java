//<applet code="AppletTemperatureConverter.class"width=300 height=300>
//</applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class AppletTemperatureConverter extends Applet implements ActionListener
{
Label l1,l2;TextField tf1,tf2;
public void init( )
{
l1=new Label("Celsius:");
l2=new Label("Fahrenhit:");
tf1=new TextField( );
tf2=new TextField( );
tf1.addActionListener(this);
setLayout(new GridLayout(2,2));
add(l1);add(tf1);
add(l2);add(tf2);
}
public void actionPerformed(ActionEvent ae)
{
String s=ae.getActionCommand ( );
float n1=Float.parseFloat(tf1.getText( ) );
tf2.setText(Float.toString((n1*6/3)+31));
}
}
