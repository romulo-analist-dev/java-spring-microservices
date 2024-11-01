# User Management Microservices Project

Este projeto é um sistema de gerenciamento de usuários, desenvolvido para praticar e demonstrar conceitos e tecnologias de desenvolvimento de microsserviços em Java, com foco em Spring Boot, Spring Cloud, Docker, Kubernetes e REST APIs. Ele foi inspirado nas práticas e padrões de arquitetura modernos para sistemas distribuídos.

## Tecnologias Utilizadas

- **Java** e **Spring Boot**
- **Spring Cloud**
- **Docker**
- **Kubernetes**
- **REST API**

## Funcionalidades

- **APIs RESTful** para gerenciamento de usuários, incluindo criação, atualização, exclusão e consulta de usuários.
- **Tratamento de exceções** e **validações**
- **Documentação de APIs** com OpenAPI
- **Em construção**
- **Balanceamento de carga** e **escalabilidade dinâmica** com **Eureka Naming Server** e **API Gateway** para gerenciar o tráfego entre os serviços.
- **Monitoramento de serviços** com **Spring Boot Actuator**.
- **Tolerância a falhas** com **Resilience4J** para microsserviços resilientes.
- **Traços distribuídos** com **Zipkin** para rastrear requisições entre os serviços.


## Estrutura do Projeto

O projeto está dividido em vários microsserviços, cada um com uma responsabilidade específica. Aqui está um resumo dos principais componentes:

1. **User Service**: Serviço central para gerenciamento de usuários.
2. **Em construção**
3. **Config Server**: Servidor de configuração centralizado com **Spring Cloud Config**.
4. **API Gateway**: Gateway para roteamento de requisições e balanceamento de carga entre os serviços.
5. **Naming Server**: Gerencia a descoberta de serviços e permite o balanceamento de carga entre instâncias de microsserviços.
6. **Zipkin Server**: Facilita o rastreamento distribuído entre os serviços.

## Pré-requisitos

- [Java 21](https://docs.aws.amazon.com/corretto/latest/corretto-21-ug/downloads-list.html)
- [Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/)
- [Kubernetes](https://kubernetes.io/)


## Executando o Projeto

1. Por enquanto não é necessário nada específico.
