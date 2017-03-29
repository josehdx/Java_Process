
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int tmax =22, tmin =3, ttrans=1, i=1,  tTotal;
		
		System.out.println("Iniciar con los procesos");

		do{
			 tTotal = ((ttrans+tmin)*i++);
			 
			 if (tTotal<tmax){
			 
			System.out.println("Minutos usados despues de la entrega...."  +tTotal);
			System.out.println("Siguiente proceso");
			 }
			else {
				System.out.println("Ir al proceso A");	
			}
			
		}while(tTotal<tmax); 
	
		
	}

}
