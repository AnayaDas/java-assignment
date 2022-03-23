package com.training.cg1;

	import java.util.Scanner;

		public class Movie {
			public static void main(String args[]) {
				Scanner sc=new Scanner(System.in);
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("-----------1. List of movies and their prices-----------");
				System.out.println("-----------2. Access and book tickets through theater-----------");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("Enter your choice");
                int choice1 = sc.nextInt();
                if(choice1==1)
                {
                	System.out.println("Pushpa  ---------- 400/-");
                	System.out.println("Gangubai  ---------- 400/-");
                	System.out.println("Avengers Endgame  ---------- 480/-");
                	System.out.println("Spyderman  ---------- 450/-");
              	
                }
                else {
					System.out.println("*********** The  available theaters are ***********");
					System.out.println("1.Inox");
					System.out.println("2.PVR");
					System.out.println("Enter your choice ");
					int choice=sc.nextInt();
					if(choice==1) 
					{
						System.out.println("*********** Inox ***********");
						System.out.println("*********** Select a movie ***********");
						System.out.println("Movies available are: ");
						System.out.println("1.Avengers Endgame");
						System.out.println("2.Gangubai");
						System.out.println("Enter your choice");
						int choice2=sc.nextInt();
						if(choice2==1) 
						{
							System.out.println("Avengers Endgame @ Inox");
							System.out.println("Enter the no. of tickets to be booked: ");
							int n=sc.nextInt();					
							System.out.println("To continue press 1");
							int c = sc.nextInt();
							if(c==1)
							{
								System.out.println("************************************");
								System.out.println("Theater --------------- Inox");
								System.out.println("Movie --------------- Avengers Endgame");
								System.out.println("Cost --------------- "+n*480+"/-");
								System.out.println("************************************");

							}

						}
						else if(choice2==2) 
						{
							System.out.println("Gangubai @ Inox");
							System.out.println("Enter the no. of tickets to be booked: ");
							int n1=sc.nextInt();							
							System.out.println("To continue press 1");
							int c1 = sc.nextInt();
							if(c1==1)
							{
								System.out.println("************************************");
								System.out.println("Theater --------------- PVR");
								System.out.println("Movie --------------- Gangubai");
								System.out.println("Cost --------------- "+n1*400+"/-");
								System.out.println("************************************");
						}
						}
						else
							System.out.println("Wrong Choice");
						
						
					}
					
					else if(choice==2)
					{
						System.out.println("*********** PVR ***********");
						System.out.println("*********** Select a movie ***********");
						System.out.println("Movies available are: ");
						System.out.println("1.Pushpa");
						System.out.println("2.Spyderman");
						System.out.println("Enter your choice");
						int choice3=sc.nextInt();
						if(choice3==1) 
						{
							System.out.println("Pushpa @ PVR");
							System.out.println("Enter the no. of tickets to be booked: ");
							int n2=sc.nextInt();
							System.out.println("To continue press 1");
							int c2 = sc.nextInt();
							if(c2==1)
							{
								System.out.println("************************************");
								System.out.println("Theater --------------- PVR");
								System.out.println("Movie --------------- Pushpa");
								System.out.println("Cost --------------- "+n2*400+"/-");
								System.out.println("************************************");


						}
						}
						else if(choice3==2) 
						{
							System.out.println("Spyderman @ PVR");
							System.out.println("Enter the no. of tickets to be booked: ");						
							int n3=sc.nextInt();
							System.out.println("To continue press 1");
							int c3 = sc.nextInt();
							if(c3==1)
							{
								System.out.println("************************************");
								System.out.println("Theater --------------- PVR");
								System.out.println("Movie --------------- Spyderman");
								System.out.println("Cost --------------- "+n3*450+"/-");
								System.out.println("************************************");


						}
						}
								
				}
					
					}
			
               
              
		}
					}
                
                
			
		



		




