# Introdução

A primeira versão da linguagem Java surgiu em 1995, criada por um time de desenvolvedores da empresa Sun Microsystem, liderado por James Gosling.

A plataforma Java entrega um ambiente completo para o desenvolvimento e execução de programas, sendo composta por:

- Uma linguagem de programação de alto nível orientada a objetos;
- Máquina Virtual (Java Virtual Machine ou JVM), que garante independência de plataforma, pois o código executa na máquina virtual e essa pode ser portada para outras plataformas como Windows ou Linux;
- Java Runtime Environment ou JRE, que agrega a máquina virtual e alguns recursos para a execução de aplicações Java; e
- Java Development Kit ou JDK, que é um conjunto de utilitários que oferece suporte ao desenvolvimento de aplicações.

Algumas características fizeram com que Java alcançasse tanto sucesso no mercado de desenvolvimento de sistemas:

- Sintaxe simples;
- Verificação preliminar de possíveis problemas;
- Segurança;
- Alto desempenho;
- Portabilidade;
- Orientada a objetos.

## Portabilidade

É a capacidade de ser utilizado em qualquer sistema operacional e hardware. Ou seja, Java pode ser utilizada independentemente da plataforma, sem nenhuma alteração no código.

A linguagem Java é compilada e interpretada. Primeiramente, os arquivos de código-fonte Java com extensão `.java` são compilados para bytecodes (arquivos de extensão `.class`). Após esse processo, são interpretados pela JVM, iniciando a execução do software.

![[java.png]]

**JRE** (_Java Runtime Environment_)-> é o **ambiente para executar** uma aplicação JAVA.
**JDK** (_Java Development Kits_) -> compilador mais as ferramentas para desenvolvimento de aplicação JAVA.

``JDK = JRE + ferramentas de desenvolvimento``

**JVM** (_Java Virtual Machine_) -> traduz ou instrui o sistema operacional acerca dos comandos a serem enviados e recebidos. A JVM lê e executa o Bytecode.

``JRE = JVM + bibliotecas``

## Compilando através da linha de comando

Para compilar um código Java deve-se utilizar o comando ``javac Programa.java`` 

javac -> chamar o compilador
Programa -> nome do arquivo
.java -> extensão do arquivo

Para executar o código Java compilado deve-se utilizar o comando ``java Programa``

java -> chama a JVM

## Orientação a Objetos

O Java é uma linguagem orientada a objetos. A programação orientada a objetos é um padrão de desenvolvimento que focaliza a construção e interação entre objetos. 

## Sintaxe

Para criarmos um programa, podemos dividir o nosso código fonte em diversos arquivos com extensão `.java`, também conhecidos como _unidades de compilação_.

Uma aplicação básica Java deve ter o método ``main``, que serve como uma porta de entrada para a execução da aplicação, e é a partir dela que será criado o processo a ser executado pelo processador.

```
class Hello { public static void main(String[] args) {
	System.out.println("Olá, Mundo! Sou o Java.");
	}
}
```

A entrada de uma aplicação é sempre a função (ou método) **main**. E para imprimir algo no console usamos a instrução System.out.println()

```
class Programa {

    public static void main(String[] args){
        System.out.println("Você está aprendendo Java");
    }
}
```

![[Sintaxe.png]]

## Utilizando uma IDE

Um IDE é um ambiente integrado de desenvolvimento que centraliza em um único lugar o compilador da linguagem utilizada, editor de texto, documentação e tudo que gira em torno da criação de aplicações.

Alguns IDEs muito utilizados para desenvolvimento em Java: NetBeans, Intellij e Eclipse. 

## Convenções de código

A convenção de código é um conjunto de regras recomendadas para escrever código em determinada linguagem. que torne fácil de ler, entender e manter.

Aqui estão algumas das principais convenções de código do Java:

- Nomes de **classes** devem começar com letra **maiúscula** e usar a convenção PascalCase (também conhecida como Upper CamelCase). 
	- Exemplo: `MinhaClasse`.
- Nomes de **métodos** devem começar com letra **minúscula** e usar a convenção camelCase.
	- Exemplo: `meuMetodo()`.
- Nomes de constantes devem ser totalmente em letras maiúsculas, separadas por underline.
	- Exemplo: `MINHA_CONSTANTE`.
- Nomes de variáveis devem começar com letra minúscula e usar a convenção camelCase.
	- Exemplo: `minhaVariavel`.
- Todas as linhas de código devem ter no máximo 80 caracteres de largura para facilitar a leitura.
- Recomenda-se usar espaços em branco para separar operadores, palavras-chave e elementos de controle de fluxo.    
	- Exemplo: `if (condicao) {`
- Use comentários para documentar seu código, explicando o que ele faz e por que ele faz isso. Comentários devem ser claros e concisos.

É importante lembrar que as convenções de código são apenas ***recomendações***, e não regras obrigatórias.

## Pacotes (Package)

Em Java, pacotes são usados para agrupar classes que estão relacionadas a alguma funcionalidade. Eles ajudam a organizar o código, facilitando o seu gerenciamento e evitando que centenas de classes distintas fiquem todas misturadas num único diretório.

``package br.com.brmartin.meuprojeto;``




**Referências:**

- Alura
- FIAP