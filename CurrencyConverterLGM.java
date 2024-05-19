//Task -1 of Currency Converter for LetsGrowMore internship

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverterLGM implements ActionListener 
{
    JFrame frame;
	JLabel lheader, lfrom, lto, lAmount, lResult, lResultAmount;
    JTextField tfAmount, tfResult;
    JComboBox cb1, cb2;
    JButton btnResult;

	//constroctor initialization
    CurrencyConverterLGM()
	{

        frame = new JFrame("Currency Converter");
        frame.setSize(600, 650);
        frame.setLocation(700, 100);
		frame.setLayout(null);

		//header labeling 
        lheader = new JLabel("Currency Converter");
        lheader.setBounds(120,20,380,80);
        lheader.setFont(new Font("Dialog BOLD", Font.PLAIN, 36));
        frame.add(lheader);

		//from labeling and position
        lfrom = new JLabel("FROM");
        lfrom.setBounds(30,100,120,30);
        lfrom.setFont(new Font("Verdana", Font.PLAIN, 26));
        frame.add(lfrom);

		
		//array initialization of 'from' money
        String[] From = {"Indian Rupee",
				"Canadian Dollar",
                "Egyptian Pound",
                "Euro",
                "Hong Kong Dollar",
                "Japanese Yen",
                "Nepalese Rupee",
                "Pakistani Rupee",
                "Russian Ruble",
                "South Africa Rand",
                "South Korean won",
                "UAE Dirham",
                "USD"
        };
		
		//JcomboBox initialization and position of FROM currency
        cb1 = new JComboBox(From);
        cb1.setBounds(30,140,480,30);
        cb1.setFont(new Font("Arial", Font.PLAIN, 15));
        frame.add(cb1);

		//To labeling and position
        lto = new JLabel("TO");
        lto.setBounds(30,210,120,30);
        lto.setFont(new Font("Verdana", Font.PLAIN, 26));
        frame.add(lto);

		//To value initialization by country currency
        String[] To = {"Indian Rupee",
				"Canadian Dollar",
                "Egyptian Pound",
                "Euro",
                "Hong Kong Dollar",
                "Japanese Yen",
                "Nepalese Rupee",
                "Pakistani Rupee",
                "Russian Ruble",
                "South Africa Rand",
                "South Korean won",
                "UAE Dirham",
                "USD"
        };
		
		
		//To JComboBox of Country Currency
        cb2 = new JComboBox(To);
        cb2.setBounds(30,260,480,30);
        cb2.setFont(new Font("Arial", Font.PLAIN, 15));
        frame.add(cb2);

		
		//Amount which will conver from one currency to another naming.
        lAmount = new JLabel("ENTER AMOUNT ");
        lAmount.setFont(new Font("Dialog BOLD", Font.PLAIN, 26));
        lAmount.setBounds(30,315,250,30);
        frame.add(lAmount);

		//TextField of Amount which value will convert.
        tfAmount = new JTextField();
        tfAmount.setBounds(30,355,480,30);
        frame.add(tfAmount);

		//Converter button
        btnResult = new JButton("Convert");
        btnResult.setBounds(30,430,480,40);
        btnResult.setFont(new Font("Arial", Font.PLAIN, 26));
        frame.add(btnResult);
		btnResult.addActionListener(this);//event action button initialization

		//converted amount value of currency labeling and position
        lResult = new JLabel("Converted Amount: ");
        lResult.setFont(new Font("BOLD", Font.PLAIN, 26));
        lResult.setBounds(30,500,250,30);
        frame.add(lResult);
		
		
		//result 
        lResultAmount = new JLabel("");
        lResultAmount.setBounds(270,500,290,30);
        lResultAmount.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(lResultAmount);
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

	//Candian dollar
    public static double CadToDollar(double n)
	{
        double div = 1.36;
        return (n/div);
    }
	
    public static double EpToDollar(double n)
	{
        double div = 46.91;
        return (n/div);
    }
    
	public static double EuroToDollar(double n)
	{
        double div = 0.92;
        return (n/div);
    }
    
	public static double HdToDollar(double n)
	{
        double div = 7.0;
        return (n/div);
    }
    
	public static double yenToDollar(double n)
	{
        double div = 155.82;
        return (n/div);
    }
    public static double NrupeeToDollar(double n)
	{
        double div = 133.71;
        return (n/div);
    }
    public static double rupeeToDollar(double n)
	{
        double div = 83.55;
        return (n/div);
    } 
    public static double pakRupeeToDollar(double n)
	{
        double div = 278.98;
        return (n/div);
    }
    public static double rubbleToDollar(double n)
	{
        double div = 90.75;
        return (n/div);
    }
    public static double randToDollar(double n)
	{
        double div = 18.20;
        return (n/div);
    }
    
	public static double wonToDollar(double n)
	{
        double div = 1357.80;
        return (n/div);
    }
    public static double DirhamToDollar(double n)
	{
        double div = 3.67;
        return (n/div);
    
    }

    // Dollar to ....
    public static double dollarToRupee(double n)
	{
        return (83.49*n); 
    }

    public static double dollarToCAD(double n)
	{
    
    return (1.36*n); 
    }
    
	public static double dollarToEP(double n)
	{
        return (46.91*n); 
    }
    
	public static double dollarToEuro(double n)
	{
        return (0.92*n); 
    }
    
	public static double dollarToHd(double n)
	{
        return (7.0*n); 
    }
    
	public static double dollarToJYen(double n)
	{
        return (155.82*n); 
    }
    
	public static double dollarToNrupee(double n)
	{
        return (133.71*n); 
    }
    
	public static double dollarToPakRupee(double n)
	{
        return (278.98*n); 
    }
    
	public static double dollarToRubble(double n)
	{
        return (90.75*n); 
    }
    
	public static double dollarToRand(double n)
	{
        return (18.20*n); 
    }
    
	public static double dollarToWon(double n)
	{
        return (1354.77*n); 
    }
    
	public static double dollarToDirham(double n)
	{
        return (3.67*n); 
    }
    
	public static double dollarToDollar(double n)
	{
        return n; 
    }
    
	@Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnResult)){

            String from = (String)cb1.getSelectedItem();
            String to = (String)cb2.getSelectedItem();

            double inputMoney = Double.parseDouble(tfAmount.getText());

            double fromMoney= 0;
            double toMoney = 0;

            switch (from) 
			{
                case "Canadian Dollar":
					fromMoney = CadToDollar(inputMoney);
					break;

                case "Egyptian Pound":
					fromMoney = EpToDollar(inputMoney);
					break;

                case "Euro":
					fromMoney = EuroToDollar(inputMoney);
					break;

                case "Hong Kong Dollar":
					fromMoney = HdToDollar(inputMoney);
					break;

                case "Indian Rupee":
					fromMoney = rupeeToDollar(inputMoney);
					break;

                case "Japanese Yen":
					fromMoney = yenToDollar(inputMoney);
					break;

                case "Nepalese Rupee":
					fromMoney = NrupeeToDollar(inputMoney);
					break;

                case "Pakistani Rupee":
					fromMoney = pakRupeeToDollar(inputMoney);
					break;

                case "Russian Ruble":
					fromMoney = rubbleToDollar(inputMoney);
					break;

                case "South Africa Rand":
					fromMoney = randToDollar(inputMoney);
					break;

                case "South Korean won":
					fromMoney = wonToDollar(inputMoney);
					break;

                case "UAE Dirham":
					fromMoney = DirhamToDollar(inputMoney);
					break;

                case "USD":
					fromMoney = dollarToDollar(inputMoney);
					break;
            }

            switch (to) 
			{
                
                case "Canadian Dollar":
					toMoney = dollarToCAD(fromMoney);
					break;

                case "Egyptian Pound":
					toMoney = dollarToEP(fromMoney);
					break;

                case "Euro":
					toMoney = dollarToEuro(fromMoney);
					break;

                case "Hong Kong Dollar":
					toMoney = dollarToHd(fromMoney);
					break;

                case "Indian Rupee":
					toMoney = dollarToRupee(fromMoney);
					break;

                case "Japanese Yen":
					toMoney = dollarToJYen(fromMoney);
					break;

                case "Nepalese Rupee":
					toMoney = dollarToNrupee(fromMoney);
					break;

                case "Pakistani Rupee":
					toMoney = dollarToPakRupee(fromMoney);
					break;

                case "Russian Ruble":
					toMoney = dollarToRubble(fromMoney);
					break;

                case "South Africa Rand":
					toMoney = dollarToRand(fromMoney);
					break;

                case "South Korean won":
					toMoney = dollarToWon(fromMoney);
					break;

                case "UAE Dirham":
					toMoney = dollarToDirham(fromMoney);
					break;

                case "USD":
					toMoney = dollarToDollar(fromMoney);
					break;
            }

            lResultAmount.setText(String.format("%.2f", toMoney));
        }
    }

    
    public static void main(String[] args) 
	{
        CurrencyConverterLGM cc = new CurrencyConverterLGM() ; 
		
    }
}