public class FolhaPagamentoTecnicoEnfermagem implements FolhaPagamento{

    @Override
    public String emitir(String nome, String cargo, float salario) {
        return "Nome: "+nome+ ", Matricula: "+cargo+ ", Salario: "+salario;
    }

}
