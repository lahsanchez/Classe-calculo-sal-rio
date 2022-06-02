
public class CalculaPagamento {
	
	public double calculaSalarioBruto(Funcionario funcionario) {
		return funcionario.horasTrabalhadas * funcionario.salarioHora + (50 * funcionario.dependentes);
	}
	
	public double descontoINSS(Funcionario funcionario) {
		if(calculaSalarioBruto(funcionario) <= 1000) {
			return (calculaSalarioBruto(funcionario) * 8.5)/100;
		} else {
			return (calculaSalarioBruto(funcionario) * 9)/100;
		}
		
	}
	
	public double descontoIR(Funcionario funcionario) {
		if(calculaSalarioBruto(funcionario) <= 500) {
			return 0;
		} else if(calculaSalarioBruto(funcionario) > 500 && calculaSalarioBruto(funcionario) <= 1000) {
			return (calculaSalarioBruto(funcionario) * 5)/100;
		} else {
			return (calculaSalarioBruto(funcionario) * 7)/100;
		}
		
	}
	
	public double calculaSalarioLiquido(Funcionario funcionario) {
		return (calculaSalarioBruto(funcionario) - descontoINSS(funcionario) - descontoIR(funcionario));
	}
}

