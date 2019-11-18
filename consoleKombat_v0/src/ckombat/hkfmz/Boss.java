package ckombat.hkfmz;

import java.util.Scanner;

public class Boss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner cl=new Scanner(System.in); 
		
		int vie=5;
		
		System.out.println("        Console Kombat ! \n");
		
		Player p1 = new Player("Bosco",5);
		System.out.println("  vs");
		Player p2 = new Player("Bradley", vie);
		
		System.out.println();
		
		
		System.out.println("[1]-"+p1.getName());
		System.out.println("[2]-"+p2.getName());
		//System.out.println("Quitter le programme [w]"); p e Try catch
		
		System.out.println("choisi ton joueur:");
		int J1=cl.nextInt();
		
		while(J1 <1 || J1 >2) {
			System.out.println("Choisi entre [1] & [2]");
			System.out.println("-->");
			J1=cl.nextInt();
		}
		String nom1;
		
		if(J1==1) {
			System.out.println("    Vous aviez choisi "+ p1.getName());
			nom1=p1.getName();
		}
		else {
			System.out.println("    Vous aviez choisi "+ p2.getName());
			nom1=p2.getName();
		}
		cl.nextLine();
		System.out.println("Les Reactions possible:");
		System.out.println("[1]- Frapper\n[2]- Defense");
		System.out.println();
		
		System.out.println("lorsque vous choisissez frapper, l'adversaire\n"
		+" ou vous perdez 1 pt de vieLa defense vous permet d'amortire "
				+"la frappe\n de l'adversaire en divisant les consequences par 2");
		
		System.out.println();
		System.out.println("Et le combat commence!");
		
		for(int i=5; i>0; i--) {
			System.out.print(i+" seconde -> ");
		}
		System.out.println("\n");
		
		if(nom1==p1.getName()) {
			nom1="Vous";
			
			System.out.print(nom1 + " contre "+ p2.getName());
		
		}else
		{
            nom1="Vous";
			
			System.out.print(nom1 + " contre "+ p1.getName());
		
		}
		System.out.println("\n");
		System.out.println("Commencez !");
///////////////////////////////////////////////////////////////////////////////////////		
		
		
		for(int i=5; i>0; i--) {
		
		
		System.out.println("\nChoisi une Reaction !");
		System.out.println("-->");
		int rea=cl.nextInt();
		int h=(int) (1 + Math.random()*2);
		
		
		switch(rea) {
		case 1:
			System.out.println("\n");
			if(h==1) {
				p1.atack(1);
				p2.reaction();
			}
			if(h!=1) {
				p2.atack(1);
				p1.reaction();
			}
				break;
		case 2: 
			System.out.println("\n");
			if(h==1) {
				p1.defense();
			System.out.println(p2.getName());
			}
			if(h!=1) {
				p2.defense();
				System.out.println(p1.getName());
			}}
		
	
		if(p1.getNumero()>p2.getNumero()) {
			
			
			System.out.println(p1.getName()+" gagne!");
		}
		
		
		if(p2.getNumero()>p1.getNumero()) {
			
			
			System.out.println(p2.getName()+" gagne!");
		}
		}
		
		
		/* {
		
		// frappage ;)
		
		case 1:
			  
			System.out.println("\n");
			
			choi=(int) (1 + Math.random()*2);

			if(choi==1) {
				
				p1.atack();
				p2.reaction();
			}else {
				p2.atack();
				p1.reaction();
			}
			
			
			break;
			
			// defense ;)
		case 2: 
			choi=(int) (1 + Math.random()*2);
               if(choi==1) {
				
				p1.defense();
				System.out.println(p2.getName());
			}else {
				p2.defense();
				System.out.println(p1.getName());
			}
			
			break;	
		}
		*/
	
		
		
		
			
		}	
	
}
