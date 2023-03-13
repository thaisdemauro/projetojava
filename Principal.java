
public class Principal {

	public static void main(String[] args) {

		String nome = "Kiss";
		String sobreNome = "Helena";
		String nomeCompleto = nome + sobreNome;
		String nomeComBuffer;
		
		
		
		StringBuilder buffer = new StringBuilder();
		
		buffer.append(nome);
		buffer.append(sobreNome);
		
		nomeComBuffer = buffer.toString();
		
		System.out.println(nomeComBuffer);

		
		
		
		
	}

}
