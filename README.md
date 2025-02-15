# Arquitetura Hexagonal/Ports and Adapters (Java/Spring Boot)
Projeto em Java com Spring Boot utilizando arquitetura Hexagonal em microserviços, Apache Kafka e MongoDB.

## Estrutura de Pacotes na Arquitetura Hexagonal

### 📂 application
Pacote responsável pelo core da aplicação, contendo toda a regra de negócio. Este código deve estar isolado do mundo externo, ou seja, livre de frameworks.

- **application.core.domain** - Contém as classes de domínio da aplicação.
- **application.core.usecase** - Contém os casos de uso da aplicação (regras de negócio).
- **application.ports.in** - Contém todas as portas (interfaces) de entrada para acessar o core.
- **application.ports.out** - Contém todas as portas (interfaces) de saída para comunicação externa.

### 📂 adapters
Pacote onde ficarão as implementações das portas de entrada e saída.

- **adapters.in** - Definem como a aplicação recebe dados externos (ex: API, filas, scripts).
  - **adapters.in.controller** - Controladores da aplicação (endpoints REST).
  - **adapters.in.consumer** - Implementação de fila Kafka.

- **adapters.out** - Definem como a aplicação se comunica com sistemas externos (ex: banco de dados, APIs externas, filas).
  - **adapters.out.client** - Comunicação com microserviços externos (ex: serviço de busca de endereços).
  - **adapters.out.repository** - Implementação de acesso ao banco de dados.

### 📂 config
Pacote responsável pelas configurações do projeto.

---

> 🔧 **Observação:** Este projeto segue os princípios da Arquitetura Hexagonal (Ports and Adapters) para garantir desacoplamento e maior facilidade de manutenção.
