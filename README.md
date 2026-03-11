# Microsserviços com Spring Boot, Spring Cloud, Docker e Kubernetes

Este repositório contém meus estudos e implementações baseados no curso **Microsserviços com Spring Cloud, Spring Boot, Docker e Kubernetes**.

O objetivo deste projeto é aprender e aplicar os principais conceitos de **arquitetura de microsserviços**, utilizando tecnologias modernas do ecossistema Java.

---

# 🚀 Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Cloud
* Spring Cloud Gateway
* Spring Cloud Config
* OpenFeign
* Netflix Eureka
* Resilience4J
* Docker
* Docker Compose
* Kubernetes
* Swagger / OpenAPI
* GitHub Actions (CI/CD)

---

# 📚 Conteúdos Estudados

Durante o desenvolvimento deste projeto foram abordados os seguintes conceitos:

### Fundamentos de Microsserviços

* O que são microsserviços
* Vantagens e desafios de arquiteturas distribuídas
* Padrões de arquitetura

### Desenvolvimento com Spring Boot

* Criação de APIs REST
* Separação de serviços
* Persistência de dados por serviço

### Comunicação entre Serviços

* Comunicação REST
* Client Feign (OpenFeign)

### Service Discovery

* Registro e descoberta de serviços com **Eureka Server**

### API Gateway

* Centralização de acesso aos serviços com **Spring Cloud Gateway**

### Configuração Centralizada

* Utilização do **Spring Cloud Config Server**

### Tolerância a Falhas

* Implementação de **Circuit Breaker** com **Resilience4J**

### Containerização

* Criação de containers com **Docker**
* Orquestração local com **Docker Compose**

### Orquestração de Containers

* Deploy e gerenciamento de serviços utilizando **Kubernetes**

### Integração Contínua

* Automação de builds e deploy utilizando **GitHub Actions**

---

# 🏗️ Arquitetura de Microsserviços

Exemplo de arquitetura utilizada no projeto:

```
                 +------------------+
                 |    API Gateway   |
                 +--------+---------+
                          |
         +----------------+----------------+
         |                                 |
  +-------------+                   +--------------+
  | UserService |                   | ProductService|
  +-------------+                   +--------------+
         |                                 |
         +-------------+-------------------+
                       |
               +---------------+
               | Config Server |
               +---------------+

               +---------------+
               | Eureka Server |
               +---------------+
```

---

# 🐳 Executando com Docker

Build das imagens:

```
docker build -t microservices-project .
```

Executar com Docker Compose:

```
docker-compose up -d
```

---

# ☸️ Executando com Kubernetes

Aplicar os manifests:

```
kubectl apply -f k8s/
```

Verificar os pods:

```
kubectl get pods
```

---

# 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com o objetivo de:

* Aprender **arquitetura de microsserviços**
* Praticar o ecossistema **Spring Cloud**
* Trabalhar com **Docker e Kubernetes**
* Simular uma arquitetura utilizada em aplicações reais

---

# 👨‍💻 Autor

**Nicolas Bueno**

Estudante de desenvolvimento Backend focado em **Java e Spring Boot**.
