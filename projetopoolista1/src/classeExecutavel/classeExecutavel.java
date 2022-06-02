package classeExecutavel;

import model.Conta;
import model.Pessoa;

public class classeExecutavel {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "João";
		p1.idade = 22;
		p1.celular = 999999999;
		p1.nomeMae = "Amanda";
		
		Conta c1 = new Conta();
		c1.codigo = 1;
		c1.correntista = "João";
		c1.saldo = 1200;
		
		System.out.println("Nome: "+p1.nome);
		System.out.println("Idade: "+p1.idade);
		System.out.println("Celular: "+p1.celular);
		System.out.println("nomeMae: "+p1.nomeMae);
		
		System.out.println("Codigo: "+c1.codigo);
		System.out.println("Correntista: "+c1.correntista);
		System.out.println("Saldo: "+c1.saldo);
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Gabriel";
		p2.idade = 18;
		p2.celular = 77777777;
		p2.nomeMae = "Adriana";
		
		Conta c2 = new Conta();
		c2.codigo = 2;
		c2.correntista = "Gabriel";
		c2.saldo = 800;
		
		System.out.println("Nome: "+p2.nome);
		System.out.println("Idade: "+p2.idade);
		System.out.println("Celular: "+p2.celular);
		System.out.println("nomeMae: "+p2.nomeMae);
		
		System.out.println("Codigo: "+c2.codigo);
		System.out.println("Correntista: "+c2.correntista);
		System.out.println("Saldo: "+c2.saldo);
		
		Pessoa p3 = new Pessoa();
		p3.nome = "Douglas";
		p3.idade = 40;
		p3.celular = 88888888;
		p3.nomeMae = "Cláudia";
		
		Conta c3 = new Conta();
		c3.codigo = 3;
		c3.correntista = "Douglas";
		c3.saldo = 2000;
		
		System.out.println("Nome: "+p3.nome);
		System.out.println("Idade: "+p3.idade);
		System.out.println("Celular: "+p3.celular);
		System.out.println("nomeMae: "+p3.nomeMae);
		
		System.out.println("Codigo: "+c3.codigo);
		System.out.println("Correntista: "+c3.correntista);
		System.out.println("Saldo: "+c3.saldo);

	}

}
