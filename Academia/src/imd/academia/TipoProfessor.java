package imd.academia;

public enum TipoProfessor {
	
	NATACAO("Natacao"),
	MUSCULACAO("Musculacao");
	
	private String info;
	
	TipoProfessor(String info) {
		this.info = info;
	}
	
	public String getInfo() {
		return this.info;
	}
}

