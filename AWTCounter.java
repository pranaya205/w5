//<applet code="AWTCounter.class"width=300 height=300>
//</applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class AWTCounter extends Applet implements ActionListener
{
Label l;TextField tf;Button b;
public void init( )
{
l=new Label("Counter");
tf=new TextField( );
b=new Button("Count");
b.addActionListener(this);
tf.addActionListener(this);
add(l);add(tf);add(b);
}
int count=0;
public void actionPerformed(ActionEvent ae)
{
String s=ae.getActionCommand ( );
if(s.equals("count"))
{
count++;
tf.setText(Integer.toString(count));
}
}
}


