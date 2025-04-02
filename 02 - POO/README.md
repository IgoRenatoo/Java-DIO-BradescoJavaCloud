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

### 💀 Challenge

#### *Challenge 1: Conta Bancária Inteligente*

Uma conta bancária que permite realizar operações como consulta de saldo, cheque especial, depósitos, saques e pagamento
de boletos. A conta possui um limite de cheque especial baseado no valor inicial depositado e cobra uma taxa ao ser
utilizado.

**Requisitos de Implementação:**

- Crie uma interface `BankAccount` com os métodos `checkBalance()`, `checkOverdraft()`, `depositMoney()`,
  `withdrawMoney()`, `payBill()` e `isUsingOverdraft()`.
- Implemente as classes `CheckingAccount` e `SavingsAccount`, que implementam `BankAccount`.
- Crie uma classe `BankAccountFactory` com um método estático `createAccount(String type, double initialDeposit)`, que
  retorna o tipo de conta correto.
#### *Challenge 2: Simulador de Funções do Carro*

Um sistema que gerencia as funções básicas de um carro, como ligar, desligar, acelerar, reduzir velocidade, trocar
marchas e virar. As regras respeitam os limites de velocidade para cada marcha e garantem um funcionamento realista do
veículo.

**Requisitos de Implementação:**

- Crie uma interface `Car` com os métodos `turnOn()`, `turnOff()`, `accelerate()`, `decelerate()`, `turn(direction)`,
  `checkSpeed()` e `changeGear(newGear)`.
- Implemente a classe `ManualCar`, que respeita as regras de marchas e velocidade.
- Crie uma classe `CarFactory` com um método estático `createCar(String type)`, que retorna um carro conforme o tipo
  especificado.

#### *Challenge 3: Gerenciamento de Banho de Petshop*

Um sistema que controla uma máquina de banho para pets, permitindo abastecimento de água e shampoo, verificação de
níveis e regras específicas para entrada e saída dos animais, garantindo higiene adequada.

**Requisitos de Implementação:**

- Crie uma interface `PetBathMachine` com os métodos `giveBath()`, `refillWater()`, `refillShampoo()`,
  `checkWaterLevel()`, `checkShampooLevel()`, `placePet()`, `removePet()` e `cleanMachine()`.
- Implemente a classe `StandardPetBathMachine`, que respeita as regras de uso de água e shampoo.
- Crie uma classe `PetBathMachineFactory` com um método estático `createMachine(String type)`, que retorna o tipo de
  máquina adequado.

#### *Challenge 4: Gestão de Ingressos para Cinema*

Um sistema que gerencia a comercialização de ingressos de cinema, permitindo a criação de diferentes tipos de ingressos,
cálculo de valores finais e definição de características específicas como idioma e descontos.

**Requisitos de Implementação:**

- Crie uma interface `MovieTicket` com os métodos `getPrice()`, `getMovieName()`, `isDubbed()` e
  `calculateFinalPrice()`.
- Implemente a classe `StandardTicket`, que deve conter o valor base do ingresso, nome do filme e idioma (dublado ou
  legendado).
- Crie as classes `HalfPriceTicket` e `FamilyTicket`, que estendem `StandardTicket` e implementam as seguintes regras:
    - `HalfPriceTicket`: o valor final do ingresso deve ser metade do valor informado na criação.
    - `FamilyTicket`: o valor final do ingresso deve ser multiplicado pelo número de pessoas e receber um desconto de 5%
      caso o número de pessoas seja maior que 3.
- Implemente a classe `TicketFactory` com um método estático
  `createTicket(String type, double price, String movieName, boolean isDubbed, int numPeople)`, que retorna o tipo de
  ingresso adequado.

#### *Challenge 5: Sistema de Usuários para Plataforma Comercial*

Um sistema de gerenciamento de usuários para uma plataforma comercial, diferenciando papéis como Gerente, Vendedor e
Atendente, garantindo controle de permissões e operações específicas.

**Requisitos de Implementação:**

- Crie uma interface `User` com os métodos `login()`, `logout()`, `updateData()`, `changePassword()`.
- Implemente a classe `Manager`, que deve conter os atributos `name`, `email`, `password` e um atributo fixo
  `isAdmin = true`. Além dos métodos da interface, deve possuir `generateFinancialReport()` e `viewSales()`.
- Implemente a classe `Seller`, que deve conter os atributos `name`, `email`, `password`, `salesCount` e um atributo
  fixo `isAdmin = false`. Além dos métodos da interface, deve possuir `makeSale()`, que incrementa `salesCount`, e
  `viewSales()`.
- Implemente a classe `Attendant`, que deve conter os atributos `name`, `email`, `password`, `cashAmount` e um atributo
  fixo `isAdmin = false`. Além dos métodos da interface, deve possuir `receivePayment(double amount)`, que incrementa
  `cashAmount`, e `closeCashRegister()`.
- Crie uma classe `UserFactory` com um método estático
  `createUser(String type, String name, String email, String password)`, que retorna o tipo de usuário adequado.

#### *Challenge 6: Relógios Internacionais*

Um sistema para gerenciar diferentes tipos de relógios ao redor do mundo, garantindo ajustes corretos de horário
conforme regras específicas de cada país.

**Requisitos de Implementação:**

- Crie uma classe `Clock` com os atributos `hour`, `minute` e `second`, garantindo que respeitem as regras de
  funcionamento de um relógio.
- Implemente um método `getFormattedTime()` que retorna a hora no formato `HH:MM:SS`.
- Crie duas subclasses `AmericanClock` e `BrazilianClock`, sendo que `AmericanClock` deve restringir horas entre 1 e
  12 (formato AM/PM) e `BrazilianClock` deve seguir o formato 24h.
- Defina um método abstrato `updateTime(Clock clock)`, que deve ser implementado pelas subclasses para atualizar seu
  horário com base em outro relógio.
- Crie uma classe `ClockFactory` com um método estático `createClock(String type)`, que retorna o tipo de relógio
  adequado.

#### *Challenge 7: Sistema de Envio de Mensagens de Marketing*

Desenvolva um sistema para enviar mensagens de marketing para diferentes serviços de comunicação. O sistema deve
permitir o envio da mesma mensagem para múltiplos serviços, garantindo flexibilidade e modularidade.

**Requisitos de Implementação:**

- Crie uma interface `MessagingService` com o método `sendMessage(String message)`.
- Implemente as classes `SMSService`, `EmailService`, `SocialMediaService` e `WhatsAppService`, que implementam a
  interface e enviam mensagens de forma específica.
- Desenvolva a classe `MarketingMessageSender`, que permite enviar uma mesma mensagem para diversos serviços.

#### *Challenge 8: Cálculo de Tributos de Produtos*

Implemente um sistema para calcular o valor de tributos de produtos, considerando diferentes categorias e suas alíquotas
específicas.

**Requisitos de Implementação:**

- Crie uma interface `TaxableProduct` com um método `calculateTax()`.
- Implemente classes para os tipos de produtos: `FoodProduct`, `HealthProduct`, `ClothingProduct` e `CultureProduct`,
  cada uma aplicando sua respectiva taxa de imposto:
    - Alimentação: 1%
    - Saúde e bem-estar: 1.5%
    - Vestuário: 2.5%
    - Cultura: 4%
- Desenvolva uma classe `TaxCalculator`, que recebe uma lista de produtos e retorna o valor total dos tributos.

#### *Challenge 9: Cálculo de Área de Figuras Geométricas*

Crie um sistema que permita calcular a área de diferentes figuras geométricas com base em suas propriedades.

**Requisitos de Implementação:**

- Crie uma interface `Shape` com um método `calculateArea()`.
- Implemente as classes `Square`, `Rectangle` e `Circle`, cada uma aplicando sua respectiva fórmula para cálculo de
  área:
    - Quadrado: lado²
    - Retângulo: base * altura
    - Círculo: π * raio²
- Desenvolva uma classe `GeometryCalculator`, que recebe diferentes formas e calcula suas áreas.

#### *Challenge 10: Calculadora de Soma e Subtração*

Desenvolva um sistema que permita ao usuário informar múltiplos números para realizar operações matemáticas básicas.

**Requisitos de Implementação:**

- Crie uma classe `Calculator` com os métodos `sum(String numbers)` e `subtract(String numbers)`.
- O usuário deve informar todos os números de uma só vez, separados por vírgulas.
- O sistema deve validar se todos os valores inseridos são números antes de processar a operação.
- Retornar o resultado da operação solicitada.

#### *Challenge 11: Formatação de Entradas Telefônicas*

Implemente um sistema que recebe números de telefone e os formata de acordo com padrões estabelecidos.

**Requisitos de Implementação:**

- Crie uma classe `PhoneFormatter` com um método `format(String input)`.
- O código deve detectar os seguintes tipos de entrada:
    - Telefone fixo (8 dígitos sem DDD: `xxxx-xxxx`, 10 dígitos com DDD: `(xx)xxxx-xxxx`).
    - Celular (9 dígitos sem DDD: `xxxxx-xxxx`, 11 dígitos com DDD: `(xx)xxxxx-xxxx`).
- O sistema deve ser capaz de:
    - Identificar e formatar corretamente números válidos.
    - Informar quando um número é inválido por não corresponder a nenhum dos padrões aceitos.
    - Manter a formatação se o número já estiver correto.
    - Corrigir números com máscaras incorretas.
    - Tratar entradas com números misturados a caracteres inválidos.

#### *Challenge 12: Conversor de Entrada para JSON, XML e YAML*

Crie um sistema que permita ao usuário inserir dados seguindo um padrão específico e os converta para os formatos JSON,
XML e YAML.

**Requisitos de Implementação:**

- Desenvolva uma classe `DataConverter` com um método `convert(List<String> inputs)`.
- O usuário pode informar múltiplas entradas no seguinte formato: `NOME_CAMPO;VALOR;TIPO`.
- O sistema deve permitir os seguintes tipos de dados:
    - Texto
    - Datas
    - Data e hora
    - Números inteiros
    - Números com ponto flutuante
    - Booleanos
    - Arrays dos tipos anteriores (opcional: permitir arrays de objetos e objetos internos).
- O código deve converter os dados informados e retornar representações em JSON, XML e YAML.
