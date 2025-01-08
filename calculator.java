
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class calculator extends Frame implements ActionListener {

    Label l1, l2, lr;
    TextField t1, t2, tr;
    Button add, sub, mul, div, clear;

    public calculator() {

        super("Simple Calculator");
        l1 = new Label("Enter first value: ");
        l1.setBounds(10, 20 , 50, 40);
        t1 = new TextField(10);

        l2 = new Label("Enter second value: ");
        t2 = new TextField(10);

        lr = new Label("Result");
        tr = new TextField(10);

        add = new Button("ADD");
        sub = new Button("SUB");
        mul = new Button("MUL");
        div = new Button("DIV");
        clear = new Button("CLEAR");

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        clear.addActionListener(this);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(lr);
        add(tr);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(clear);

        //setSize(400, 400);
        //setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int res = 0;

            if (e.getSource() == add) {
                res = a + b;
            } else if (e.getSource() == sub) {
                res = a - b;
            } else if (e.getSource() == mul) {
                res = a * b;
            } else if (e.getSource() == div) {
                if (b != 0) {
                    res = a / b;
                } else {
                    tr.setText("error");
                    return;
                }
            } else if (e.getSource() == clear) {
                t1.setText("");
                t2.setText("");
                tr.setText("");
            }
            tr.setText(String.valueOf(res));
        } catch (Exception ex) {
            tr.setText("error");
        }
    }

    public static void main(String args[]) {
        calculator c = new calculator();
        c.setSize(400, 400);
        c.setLocation(100, 200);
        c.setVisible(true);
        c.setLayout(new FlowLayout());

    }
}
