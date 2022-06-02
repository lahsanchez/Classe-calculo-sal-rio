import java.util.Scanner;
            
public class AppPagamentoSalario {
                
    public static void main (String[] args) {
        CalculaPagamento calculaPagamento = new CalculaPagamento();
        Funcionario funcionarios = new Funcionario();
                    
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite a quantidade de horas trabalhadas: ");
        funcionarios.horasTrabalhadas = sc.nextDouble();
        System.out.println();
        System.out.printf("Digite o valor da hora trabalhada: ");
        funcionarios.salarioHora = sc.nextDouble();
        System.out.println();
        System.out.printf("Digite a quantidade de dependetes: ");
        funcionarios.dependentes = sc.nextInt();
        System.out.println();
                    
        System.out.printf("Digite 1 para Salario Bruto, 2 para Desconto INSS, 3 para Desconto IR, 4 para Salario Liquido: "); 
        switch(sc.nextInt()){
            case 1:
                System.out.println(calculaPagamento.calculaSalarioBruto(funcionarios));
                break;
            case 2:              
                System.out.println(calculaPagamento.descontoINSS(funcionarios));
                break;
            case 3:
                System.out.println(calculaPagamento.descontoIR(funcionarios));
                break;
            case 4:
                System.out.println(calculaPagamento.calculaSalarioLiquido(funcionarios));
                break;
        }
    }
}
