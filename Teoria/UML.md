# UML  - Unified Modeling Language

A Linguagem de Modelagem Unificada propõe a construção de diagramas para o desenvolvimento de sistemas orientados a objetos para facilitar através de notação visual uma representação comum em determinado momento do desenvolvimento de software.

Alan Kay imaginou a construção de um software a partir de agentes autônomos que interagem entre si, estabelecendo os seguintes princípios:

Qualquer coisa é um objeto **>>** Objetos realizam tarefas através da requisição de serviços a outros objetos **>>** Cada objeto pertence a uma determinada classe, que agrupa objetos similares **>>** A classe é um repositório para comportamento associado ao objeto **>>** Classes são organizadas em hierarquias

Cada objeto é responsável por executar tarefas específicas, e é pela interação entre eles que uma tarefa computacional é realizada.

## Diagramas da UML

Os diagramas da UML têm propósitos específicos. Cada um representa o sistema a ser desenvolvido de um determinado ponto de vista. Sendo assim, os diagramas devem ser modelados conforme a necessidade.

### Diagrama de Classes

Antes de escrever a primeira linha de código para implementar as classes, é preciso analisar e planejar. Um diagrama de classes mostra a estrutura estática do modelo, onde os elementos são representados por classes, com sua estrutura interna e seus relacionamentos.

> Uma classe é representada por uma "caixa" com no máximo três compartimentos exibidos. No primeiro compartimento é exibido o nome da classe. Por convenção, esse nome é apresentado no singular e com as palavras componentes começando por maiúsculas. No segundo compartimento, são declarados os atributos, que correspondem às informações que um objeto armazena. Finalmente, no terceiro compartimento, são declaradas as operações, que correspondem às ações que um objeto sabe realizar.
> Bezerra (2007, p.112)

![[diagrama de classes.png]]

As classes se relacionam entre si (associações), pela troca de mensagens. Um relacionamento descreve como as classes interagem umas com as outras, sendo o relacionamento necessário para a implementação de um comportamento. O diagrama de classes é composto por um conjunto bem extenso de tipos de relacionamento e para cada um existe uma notação específica.

Características importantes:

- Multiplicidade: é a indicação de quantos objetos podem participar de um relacionamento.
- Navegabilidade: demonstra a direção em que os objetos são transmitidos entre as classes envolvidas.
- Papéis: indicam qual é a funçao da classe no contexto do relacionamento.
- Nome da associação: utilizado quando não for de fácil interpretação a leitura do relacionamento, principalmente quando ocorrem associações múltiplas. 

![[relacionamentos.png]]

## Diagrama de Sequência

Representa a ordem lógica da troca de mensagens entre os objetos de um caso de uso, ou seja, demonstra o processamento a partir de solicitações e de execuções dos métodos entre os objetos.

## Diagrama de Interação

Demosntra o comportamento interno do sistema, auxiliando no esclarecimento dos casos de uso pela representação do funcionamento do processo por meio da troca de mensagens entre objetos.
