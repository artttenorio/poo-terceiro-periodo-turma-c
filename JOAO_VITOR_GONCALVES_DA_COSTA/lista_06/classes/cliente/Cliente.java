package lista_06.classes.cliente;

import lista_06.classes.pessoa.Pessoa;

public class Cliente extends Pessoa {

  public Cliente(String nome, int idade, String bairro, String cidade, String rua, String estado, String complemento,
      String numero) {
    super(nome, idade, bairro, cidade, rua, estado, complemento, numero);
  }

}
