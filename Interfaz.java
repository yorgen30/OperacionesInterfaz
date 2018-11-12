import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Interfaz extends JFrame implements ActionListener
{
    private JLabel s,b,suma,multiplicacion;
    private JTextField numa,numb;
    private JButton opera;
    Interfaz(){
        setTitle("Operaciones");
        setSize(400,200);
        getContentPane().setLayout(new GridLayout(2,1));
        JPanel ji=new JPanel();
        add(ji);
        ji.setLayout(new GridLayout(2,2));
        s=new JLabel("Numero a");
        b=new JLabel("Numero b");
        numa=new JTextField("");
        numb=new JTextField("");
        ji.add(s);
        ji.add(numa);
        ji.add(b);
        ji.add(numb);
        
        JPanel resultados=new JPanel(new GridLayout(3,1));
        add(resultados);
        opera=new JButton("Hacer Operaciones");
        opera.addActionListener(this);
        suma=new JLabel();
        multiplicacion=new JLabel();
        resultados.add(opera);
        resultados.add(suma);
        resultados.add(multiplicacion);
        show();
    }
    public void actionPerformed(ActionEvent e){
        String comando=e.getActionCommand();
        if(comando.equals("Hacer Operaciones")){
            Numeros num=new Numeros(Integer.parseInt(numa.getText()),Integer.parseInt(numb.getText()));
            suma.setText("Suma: "+num.Suma().toString());
            multiplicacion.setText("Multiplicacion: "+num.Multiplicacion().toString());
        }
    }
}
