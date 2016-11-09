public class Client extends Thread {
	

	Client(){
	}
	
	public void commande(Cuisine c){
		while(true){
			for(Pizzaiolo p : c.getPizzaiolo()){
				p.getPizza();
				System.out.println("Le client mange une pizza");
				return;
			}
		}
	}
}
