class Conta{
    private String titular;
    private double saldo;

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

}
Conta conta = new Conta();
conta.setTitular("Fábio")
conta.setSaldo(100.0);

Conta conta = new Conta();
conta.setTitular("Fábio")
conta.setSaldo(100.0);

double valorSaque = 50.0

if(conta.getSaldo() >= valorSaque){
    double novoSaldo = conta.getSaldo() - valorSaque;
    conta.setSaldo(novoSaldo)
}

Conta conta = new Conta();
conta.setTitular("Fábio");
conta.setSaldo(100.0);

double valorSaque = 50.0;

if(conta.getSaldo() + 1000.0 >= valorSaque){
    double novoSaldo = conta.getSaldo() - valorSaque;
    conta.setSaldo(novoSaldo)
}

class Conta{
    private String titular;
    private double saldo;

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public void saca(double valor){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
        }
    }

    public void deposita(double valor){
        if(valor>0){
            saldo += valor;
        }
    }

    public double getSaldo(){
        return saldo;
    }

}
Conta conta = new Conta();
conta.setTitular("Fábio");
conta.deposita(100.0);

double valorSaque = 50.0;
conta.saca(valorSaque);

double valorDeposito = 70.0;
conta.deposita(valorDeposito)
