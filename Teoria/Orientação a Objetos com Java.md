 Uma das principais vantagens da orientação a objetos é a reutilização de código. A programação orientada a objetos não é em si uma linguagem de programação. É mais uma maneira de se pensar, um paradigma de programação, um conjunto de ideias suportado por várias linguagens de programação.

1. **Análise** - O que precisa ser feito? Qual o problema a ser resolvido?
2. **Design** - Como fazer o que precisa ser feito? Como resolver o problema?
3. **Programação** - Fazer o que precisa ser feito. Implementar a solução do problema.

## Princípios de Orientação a Objetos

- Abstração
- Encapsulamento
- Herança
- Polimorfismo

### Abstração

Entendimento e análise das necessidades do sistema, abstraindo do mundo real. Ao abstrair um objeto você deve ocultar detalhe e incluir somente os atributos ou propriedades necessários para o contexto do seu sistema ou aplicativo.

Na abstração expomos certos métodos que desejamos que as outras classes acessem.

````
interface Conta {

	public void consultarSaldo();
	public void fazerPix();
}
````

e obrigamos que elas sigam aquele comportamento em específico.

````
class ContaCorrente implements Conta {

	@Override
	public void consultarSaldo() {

		System.out.println("seu saldo é 1234");
	}

	@Override
	public void fazerPix() {

		System.out.println("digite o valor que voce deseja transferir");
	}
}
````

### Encapsulamento

É uma maneira de restringir o acesso ao comportamento interno de um objeto. 

O encapsulamento garante a segurança para a estrutura de atibutos dos objetos. A proteção oferecida pelo encapsulamento é baseada na utilização de modificadores de acesso.

**Modificadores JAVA**

- Public - qualquer um pode acessar um atributo ou método definido como público.
- Private -  atributos e métodos privados só podem ser acessados dentro da própria classe.
- Protegido - somente classes derivadas da original tem total acesso aos atributos e métodos.

### Herança

A herança permite a reutilização de estados (atibutos) e comportamentos (métodos) de uma classe mais genérica para elementos mais específicos. A grande vantagem de utilizar a herança é o reaproveitamento de código, quando identificado que um atributo ou um método devem ser iguais nas classes.

Porém, no Java e em outras linguagens modernas que seguem os princípios de Orientação a Objetos, a herança só pode ser estabelecida a partir de uma única Classe.

![[classe e subclasses.png]]

No Java, a herança é realizada através da palavra-chave **extends**. A classe que herda é chamada de **subclasse**, e a classe que é herdada é chamada de **superclasse**. A subclasse pode acessar todos os atributos e métodos públicos e protegidos da superclasse, além de poder sobrescrever os métodos da superclasse para criar comportamentos específicos.

Criando uma classe:
```
public class Producao { 
	public int id; 
	public String nome;
	public String classificacao; 
	public String diretor; 
	public String estudio; 
	public Date dataLancamento; 
}
```

fazendo uma subclasse herdar da superclasse *Producao*

```
public class Serie extends Producao { 
	public int temporadas; 
	public Date dataEncerramento; 
}
```

### Polimorfismo

É a habilidade de classes diferentes responderem à mesma mensagem de uma classe de maneiras diferentes. Por meio da implementação desse conceito, podemos fazer um **objeto** de uma determinada classe executar um **comportamento** diferente de acordo com algum **parâmetro** passado.

**Dynamic ou Run-time** (Dinâmico ou tempo de execução)
- Métodos com nomes iguais, implementações distintas

**Static ou Compile-time** (Estático ou tempo de compilação)
- Sobrecarga de método: permite implementar vários métodos dentro de uma classe que tem o mesmo nome, mas um conjunto diferente de parâmetros de entrada.

**Overloading** (Sobrecarga de método)

## Classe

É um conjunto abstrato de objetos com as mesmas características (atributos) e comportamentos (métodos). Em tempo de excução, as classes são utilizadas na fabricação dos objetos, cada um com suas informações. Caso uma atualização seja necessária, a Classe é alterada e a mudança é refletida para todos os sistemas que utilizam esse molde (Classe) e, consequentemente, a todos os objetos gerados.

Toda classe tem:

- Nome - TIpo (type)
- Atributos - Propriedades (properties) / Dados (data)
- Comportamentos - Operação (operation) / Métodos (methods)

Exemplo:
- conta - é um objeto real de um sistema bancário
- agência, saldo, número da conta - atributos (características) da classe conta
- saque, transferência, pagamento - métodos (comportamentos) da classe conta

```
public class Conta {

	//atributos
	String agencia;
	String saldo;

	//métodos
	void consultarSaldo() {
	}
	void realizarPagamento() {
	}
}
```

Três principais tipos de classes:

- *Entity* ou entidade: serve para armazenar informações
- *Boundary* ou fronteira: classe que está perto da interface do usuário ou de um outro sistema
- *Control* ou controle: intermedia as classes de fronteira com as classes de entidade ou persistência

### Visibilidades

As visibilidades são representadas pelos símbolos `-, +, # e ~` antes de um atributo ou uma operação.

- `+` visibilidade pública - o atributo/método é visível por outras classes e pode ser acessado livremente.
- `-` visibilidade privada - é visível somente pela própria classe.
- `#` visibilidade protegida - é visível para as classes derivadas.
- `~` visibilidade pacote - é visível pelas classes envolvidas no mesmo pacote.

```
package br.com.brmartin.carmach.modelos;

public class Carro {  
	private String marca;  
	private String modelo;	
}
	public void locomover() {  
	}
```

![[notacao de classe.png]]

## Tipos de Classes

### Entidade

Representa o conceito do domínio do negócio, as informações e regras de negócio que direcionam a manipulação dessas informações.

### Fronteira

Trata da comunicação so sistema com os atores (telas, sensores, interface de impressão). Muitas vezes necessita interagir com outra classe do tipo "Controle".

### Controle

É o meio de comunicação entre objetos de fronteira e objetos de entidade. Interpretam os eventos ocorridos sobre os objetos da classe **fronteira** (movimentos de mouse, pressionamento de botões, etc) e os retransmitem aos objetos de classes entidades que compõe o sistema.

## Objetos

São as **instâncias** das classes, construídos com base nos atributos e métodos definidos por elas. Um objeto seria uma coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio de suas características, comportamentos e estado atual.

Podem ser **tangíveis ou intangíveis**.

```
public class AlunoTeste {

	public statisc void main (String [] args) {

		//instanciando o objeto
		Aluno aluno1 = new Aluno();

		//declarando valores aos atributos
		aluno1.nome = "Paulo Silva";
		aluno1.idade = 25;
		aluno1.curso = "Ciência da Computação";

		//chamando os métodos
		aluno1.assistirAula();
		aluno1.fazerProva();
		aluno1.calcularMedia()
	}
}
```

#### Identidade

Objetos são independentes uns dos outros.

#### Estado dos Objetos

É representado pelos atributos do objeto. Representam as características do objeto em um determinado instante.

#### Comportamento dos Objetos

É representado pelos métodos que determinam como o objeto age ou reage a uma requisição (chamada) de outro objeto. Definem as operações que o objeto pode realizar.


__

**Referências:**

Graduação Análise e Desenvolvimento de Sistemas - [FIAP](https://www.fiap.com.br/)
Entendendo a Orientação a Objetos - [Alura](https://www.alura.com.br/)
Orientação a Objetos com Java - ITA via [Coursera](https://www.coursera.org/learn/orientacao-a-objetos-com-java?)
Fundamentos de Programação: Design Orientado a Objetos - LinkedIn Learning
