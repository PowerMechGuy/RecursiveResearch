
// This program will use recursion, arrays, and a gui
// I'll be using a recursive function to sort through an array.
// I'll use the gui to make a nice little graphic of what's happening.

//here I am importing the necessary files for the gui.
//and for using the various tools of gui like input...
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;
//import 
public class invert {

	//array dimension size variable
	static int s = 2;
	
	//playing with constructors
	//making an int
	int number = 0;
	//constructor stuff
	public invert(int number)
	{
		this.number = number;
	}
	
	//declaring constructor array
	
	static int[][][][][][] hypercube = new int[s][s][s][s][s][s];
	
	//making constuctor edtion of hypercube
	/*public invert(int[][][][][][] hypercube)
	{
		this.hypercube = hypercube;
	}*/
	
	//first I'll declare an 6 dimensional instance of hypercube
			//2*2*2*2*2*2=64
			//Now I'll make the array...
			//static
	//static invert values = new invert(hypercube);
			
	//and now some variables to be
	//used in the recursive action of the 
	//matrix methods
			static int da = 0;
			static int db = 0;
			static int dc = 0;
			static int dd = 0;
			static int de = 0;
			static int df = 0;
			
	//this is the main function
	public static void main(String[] args) {
		
		startprogram();
		
			
		
	}
	public static void startprogram()
	{
		//Now I'm gonna declare a scanner to get some input.
				Scanner input = new Scanner(System.in);
				
				System.out.println("Input a number to fill the array with: ");
				
				invert num = new invert(input.nextInt());
				
				//num.number = input.nextInt();
				
				//We are gonna ask how many ones the user wants to 
				//put in the array from 1 to 512
				
				
				/* //I'm gonna create a Jframe.
				JFrame frame = new JFrame("Recursive Array");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//Now I'm gonna size it up:
				frame.setBounds(100, 100, 200, 200);
				
				//Now I'm labeling it
				JLabel label = new JLabel("Recursive Array");
				frame.getContentPane().add(label);
				
				//Gonna give the frame a button here
				JButton ready = new JButton("Ready?");
				ready.setBounds(10,80,80,25);
				//ready.setSize(50, 30);
				//now I'll give the button an action...
				ready.addActionListener(new ActionListener()
						{
							
							public void actionPerformed(ActionEvent event)
							{
								//here we are telling it to make the frame invisible
								frame.setVisible(false);
								dostuff();
								//valuearray();
								//dimensiona(0);
								//printarray();
							}
						});
				frame.add(ready);
				
				
				//Not I'm putting this frame on the screen!
				//FRAME IS INVISIBLE
				//frame.setVisible(false);
				frame.setVisible(true);
				//valuearray();
				//dimensiona(0);
				//printarray();*/
				
				dostuff(num.number);
				
				
	}
	public static void dostuff(int thenum)
	{
		
		valuearray();
		dimensiona(0,thenum);
		printarray();
	}
	
	public static void valuearray()
	{
		System.out.println("Initializing array...");
		//This will be the function that initializes the array.
		//now I'll fill every value with 0
				//starting with the biggest dimension...
				for (int a = 0; a < s; a++){
					for (int b = 0; b < s; b++){
						for (int c = 0; c < s; c++){
							for (int d = 0; d < s; d++){
								for (int e = 0; e < s; e++){
									for (int f = 0; f < s; f++){
										
									//I had to add an equals operator here to
										//make sure the loop does not exceed the
									//limits of the array
									hypercube[a][b][c][d][e][f] = 0;
										
									}
								}
							}
						}
					}
				}
				System.out.println("Done!");
				System.out.println(hypercube[1][1][1][1][1][1]);
				//return;
	}
	//This function will play with the array and is supposed to be recursive.
	public static void dimensiona(int dima, int passa){
		if (dima == 2)
		{
			dima = 0;
			da = 0;
			//return;
		}
		else
		{
			System.out.println("Processing...");
			dima++;
			
			dimensionb(0,passa);
		}
	}
	public static void dimensionb(int dimb, int passb)
	{
		if (dimb == 2)
		{
			dimb = 0;
			db = 0;
			da++;
			dimensiona(da, passb);
			//return;
		}
		else
		{
			System.out.println("Processing...");
			dimb++;
			
			dimensionc(0, passb);
		}
	}
	public static void dimensionc(int dimc, int passc)
	{
		if (dimc == 2)
		{
			dimc = 0;
			dc = 0;
			db++;
			dimensionb(db, passc);
			//return;
		}
		else
		{
			System.out.println("Processing...");
			dimc++;
			
			dimensiond(0, passc);
		}
	}
	public static void dimensiond(int dimd, int passd)
	{
		if (dimd == 2)
		{
			dimd = 0;
			dd = 0;
			dc++;
			dimensionc(dc, passd);
			//return;
		}
		else
		{
			System.out.println("Processing...");
			dimd++;
			
			dimensione(0, passd);
		}
	}
	public static void dimensione (int dime, int passe)
	{
		if (dime == 2)
		{
			
			dime = 0;
			de = 0;
			dd++;
			dimensiond(dd, passe);
			//return;
		}
		else
		{
			System.out.println("Processing...");
			dime++;
			
			dimensionf(0, passe);
		}
	}
	public static void dimensionf(int dimf, int passf)
	{
		if (dimf == 2)
		{
			
			dimf = 0;
			df = 0;
			de++;
			dimensione(de, passf);
			//de++;
			//return;
		}
		else
		{
			System.out.println("Processing...");
			dimf++;
			hypercube[da][db][dc][dd][de][df] = passf;
			df++;
			dimensionf(dimf, passf);
		}
	}
	public static void printarray()
	{
		System.out.println("Now printing...");
		for (int a = 0; a < 2; a++){
			for (int b = 0; b < 2; b++){
				for (int c = 0; c < 2; c++){
					for (int d = 0; d < 2; d++){
						for (int e = 0; e < 2; e++){
							for (int f = 0; f < 2; f++){
								
							//I had to add an equals operator here to
							//make sure the loop does not exceed the
							//limits of the array
							System.out.println(hypercube[a][b][c][d][e][f]);
								
							}
						}
					}
				}
			}
		}
	}
	
}
