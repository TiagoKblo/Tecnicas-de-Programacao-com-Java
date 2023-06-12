package exception;

public class CaixaException extends Exception{
    private int codigoDoErro;
    private String mensagemDeErro;

    public CaixaException(int codigoDoErro){
        if(codigoDoErro==1){
            mensagemDeErro = "Valor do depósito inválido";
        } else if (codigoDoErro==2) {
            mensagemDeErro = "Saque insuficiente";
        }
    }

    @Override
    public String getMessage() {
        return mensagemDeErro;
    }
}