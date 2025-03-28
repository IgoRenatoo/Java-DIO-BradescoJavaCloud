# 📌 Exercícios de POO em Java

## 🎯 Objetivo

Este repositório tem como objetivo fornecer uma série de exercícios práticos para aprimorar a compreensão dos princípios
da Programação Orientada a Objetos (POO) em Java. Os desafios estão organizados por níveis de dificuldade, permitindo
uma progressão gradual no aprendizado.

## 📚 O que será aprendido?

Após a conclusão dos exercícios, serão praticados:

- Criação e manipulação de classes e objetos
- Controle de visibilidade com modificadores de acesso
- Uso de pacotes para organizar código
- Implementação de getters e setters
- Trabalhando com enum
- Introdução à UML para modelagem de classes

## 🏆 Lista de Exercícios

### 🔰 Iniciante
#### *Exercício 1: Criando uma Classe Simples*
Crie uma classe chamada Produto que represente um produto em um sistema de vendas. A classe deve ter:
- Atributos privados nome (String) e preco (double).
- Métodos públicos para definir e obter os valores desses atributos (setNome, getNome, setPreco, getPreco).
- Um método exibirInformacoes() que imprime os dados do produto.

#### ❓ *Perguntas Técnicas*
1. O que acontece se os atributos da classe forem públicos?
2. Por que usamos getter e setter em vez de acessar os atributos diretamente?
3. Como instanciar um objeto Produto e definir seus valores?

#### *Exercício 2: Criando um Pacote e Utilizando-o*
Crie um pacote chamado br.com.empresa.model e coloque dentro dele a classe Funcionario. A classe deve conter:
- Atributos privados nome (String) e salario (double).
- Métodos getters e setters.
- Um construtor que receba nome e salario como parâmetros.
- Um método exibirDados() para imprimir os detalhes do funcionário.

#### ❓ *Perguntas Técnicas*
1. O que é um pacote em Java e por que devemos usá-los?
2. Como podemos importar e utilizar uma classe de outro pacote?
3. Qual é a diferença entre importações absolutas e relativas em Java?

---

### 🚀 Intermediário
#### *Exercício 3: Criando uma Classe com Relacionamento*
Crie duas classes: Pessoa e Endereco.
- A classe Endereco deve ter os atributos rua e cidade.
- A classe Pessoa deve ter os atributos nome e endereco (do tipo Endereco).
- Adicione métodos para definir e obter os valores.
- No método main, instancie um objeto Pessoa e associe um endereço a ele.

#### ❓ *Perguntas Técnicas*
1. Qual é a diferença entre associação e composição em POO?
2. Por que o atributo endereco não pode ser do tipo primitivo?
3. Como a criação de objetos pode influenciar o consumo de memória?

#### *Exercício 4: Controle de Visibilidade*
Crie uma classe Banco com os atributos privados nome e saldo.
- Crie um método público depositar(double valor), que adiciona ao saldo.
- Crie um método público sacar(double valor), que subtrai do saldo apenas se houver saldo suficiente.
- O saldo só pode ser acessado por meio do método getSaldo().

#### ❓ *Perguntas Técnicas*
1. Qual a diferença entre os modificadores public, private e protected?
2. Como garantir que ninguém modifique o saldo diretamente?
3. Se quisermos permitir que classes filhas acessem o saldo, qual modificador usar?

#### *Exercício 5: Criando um Enum*
Crie um enum chamado StatusPedido que tenha os valores PENDENTE, PROCESSANDO, ENVIADO e ENTREGUE.
- Crie uma classe Pedido com os atributos numeroPedido e status (do tipo StatusPedido).
- Crie um método que permita alterar o status do pedido.
- No main, crie um pedido e altere seu status em diferentes etapas.

#### ❓ *Perguntas Técnicas*
1. O que é um enum e por que é útil?
2. Como comparar corretamente valores de um enum em Java?
3. Podemos adicionar métodos dentro de um enum? Como seria útil?

### 🔥 Avançado
#### *Exercício 6: Aplicando UML em um Projeto*
- Crie um diagrama de classes UML para representar um sistema de Veículos.
- As classes devem incluir Carro, Moto e Caminhao, todas herdando da classe Veiculo.
- A classe Veiculo deve ter atributos comuns e métodos abstratos.
- Implemente o código Java baseado no diagrama.

#### ❓ *Perguntas Técnicas*
1. O que é UML e quais são seus principais diagramas?
2. O que significa herança em POO e como aplicamos isso no Java?
3. Qual a importância de utilizar classes abstratas nesse contexto?

#### *Exercício 7: Criando uma Classe Singleton*
Crie uma classe ConfiguracaoSistema que utilize o padrão Singleton.
- A classe deve ter um atributo versao e um método getInstancia() para garantir que só haja uma instância.
- No main, tente instanciar ConfiguracaoSistema mais de uma vez e verifique se todas as instâncias são iguais.

#### ❓ *Perguntas Técnicas*
1. O que é um Singleton e para que ele é utilizado?
2. Quais problemas podem surgir ao implementar um Singleton em aplicações concorrentes?
3. Como podemos modificar o Singleton para torná-lo thread-safe?

#### *Exercício 8: Criando um Sistema Bancário com Interfaces*
- Crie uma interface ContaBancaria com os métodos sacar, depositar e verSaldo.
- Crie as classes ContaCorrente e ContaPoupanca que implementam essa interface.
- No main, instancie contas diferentes e execute operações.

#### ❓ *Perguntas Técnicas*
1. Qual a diferença entre classe abstrata e interface?
2. Quando devemos usar uma interface em vez de uma classe abstrata?
3. É possível que uma classe implemente múltiplas interfaces?

#### *Exercício 9: Aplicando Encapsulamento e Polimorfismo*
Crie uma classe Funcionario e duas subclasses Gerente e Analista.
- A classe Funcionario deve ter atributos nome e salario.
- Gerente e Analista devem sobrescrever um método calcularBonus().
- No main, crie uma lista de funcionários e imprima os bônus de cada um.

#### ❓ *Perguntas Técnicas*
1. O que é polimorfismo e como ele é aplicado em Java?
2. Qual a diferença entre sobrescrita (@Override) e sobrecarga de métodos?
3. Como a substituição de métodos pode ser útil em um sistema real?

#### *Exercício 10: Criando uma Fábrica de Objetos (Factory Method)*
Implemente um padrão Factory Method para criar objetos de transporte.
- Crie uma interface Transporte com um método entregar().
- Implemente as classes Caminhao, Navio e Aviao que implementam Transporte.
- Crie uma classe TransporteFactory com um método estático criarTransporte(String tipo).

#### ❓ *Perguntas Técnicas*
1. O que é o padrão Factory Method e como ele melhora a flexibilidade do código?
2. Por que usamos interfaces nesse padrão de projeto?
3. Como garantir que a fábrica retorne o objeto correto sem precisar modificar a classe principal?
