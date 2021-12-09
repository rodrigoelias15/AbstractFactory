public class FolhaPagamentoEnfermeiro implements FolhaPagamento{

    @Override
    public String emitir(String nome, String cargo, float salario) {
        return "Nome: "+nome+ ", Cargo: "+cargo+ ", Salario: "+salario;
    }

}
