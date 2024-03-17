	class Hayvan{
		private String isim;
		
		public Hayvan(String isim) {
			this.isim=isim;
		}
		
		public String konus() {
			return "Hayvan konuşuyor.";
		}
		public void setİsim(String isim) {
			this.isim=isim;
		}
		public String getİsim() {
			return isim;
		}
	}
	
	class Kedi extends Hayvan{
		public Kedi(String isim) {
			super(isim);
		}
		public String konus() {
			return this.getİsim()+" miyavlıyor.";		}
	}
	
	class Köpek extends Hayvan{
		
		public Köpek(String isim) {
			super(isim);
		}
		public String konus() {
			return this.getİsim()+" havlıyor.";
		}
	}

public class Main {
	
	public static void Konustur(Hayvan hayvan) {
		
		System.out.println(hayvan.konus());
		
	}

	public static void main(String[] args) {
		Hayvan h = new Hayvan("hayvan");
		Hayvan h1 =new Kedi("tekir");
		Hayvan h2 = new Köpek("husky");
		System.out.println(h.konus());
		System.out.println(h1.konus());
		System.out.println(h2.konus());
		
		Konustur(new Kedi("sarı"));
		Konustur(new Köpek("karabaş"));
		
		
		
		

	}

}
