public class Main {

	public static void main(String[] args) {
		int maxValue = 60;
		Counter c = new Counter(maxValue);
		
		for (int i = 0; i < maxValue+1; i++) {
			c.inc();
			if (!c.isError()) {
				System.out.println("--------------------------------");
				System.out.println("Valore attuale: " + c.getValue());
				System.out.println("Stato interno in errore: " + c.isError());
				System.out.println("--------------------------------");
			}else{
				break;
				//nino ciaone sinistra
			}
		}
	}
}


