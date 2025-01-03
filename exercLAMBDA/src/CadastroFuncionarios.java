import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CadastroFuncionarios {
	public static final int TAM = 5;
	private List<Funcionario> lstf;

	public CadastroFuncionarios() {
		lstf = new LinkedList<>();

		Random r = new Random();

		for (int i = 0; i < TAM; i++) {
			int matricula = r.nextInt(300) + 100;
			String nome = "Fulano" + i;
			boolean insalubridade = r.nextBoolean();
			int nroDep = r.nextInt(3);
			double salBase = (r.nextDouble() * 15000) + 500;
			Funcionario f = new Funcionario(matricula, nome, salBase, nroDep, insalubridade);
			lstf.add(f);
		}

		lstf.add(new Funcionario(180,"Zezinho Especial",5000,3,false));
	}

	public List<Funcionario> getFuncionarios() {
		// Retorna um clone da lista
		return new LinkedList<Funcionario>(lstf);
	}

	// 1a - Retornar uma lista com todos os funcionários
	// que recebem insalubridade e tem dependentes. 
	public List<Funcionario> getInsalubridadeDependentes(){
		return lstf
		.stream()
		.filter(f -> f.getInsalubridade())
		.filter(f -> (f.getNroDependentes()>0))
		.toList();
		//.collect(Collectors.toList());
	}

	// 1b Retornar a quantidade de funcionários que tem dependentes.
	/*public long quantidadeFuncionariosComDependentes(){
		return lstf
			.stream()
			.filter(null)

	}
*/
	//1c
	public double somatorioSalarioBruto(){
		return 0;
	}

	//1d
	public void aumentaSalarioInsalubres(){
	}

	//1e
	public List<String> getNomeMatriculaSalarioBrutoMaiorQueBase(){
		return new ArrayList<String>();
	}

	//1f
	public double mediaSalarialDosQueNaoTemInsalubridade(){
		return 0;
	}

	//1g
	public List<String> nomesDosQueTemMatriculaMenorQue500(){
		return new ArrayList<String>();
	}

	//1h
	public double getSalarioLiquido(int matricula){
		return 0;
	}
	
	@Override
	public String toString() {
		final StringBuilder str = new StringBuilder();
		lstf.forEach(f->str.append(f.toString()+"\n"));
		return str.toString();
	}
}
