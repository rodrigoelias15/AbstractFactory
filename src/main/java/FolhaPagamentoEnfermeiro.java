public class FolhaPagamentoEnfermeiro implements FolhaPagamento{

    @Override
    public String emitir(String nome, String matricula, float salario) {
        return "Nome: "+nome+ ", Matricula: "+matricula+ ", Salario: "+salario;
    }

}
