# AI Banking Transaction Assistant

A Java and AI portfolio project for analyzing banking transaction events, categorizing spending, detecting unusual transaction patterns, and generating human-readable explanations.

## Planned Architecture

- Java 21
- Spring Boot
- REST APIs
- Apache Kafka
- PostgreSQL
- Spring AI
- Ollama or OpenAI-compatible LLM
- Docker
- JUnit / Mockito

## Core Features

1. Transaction ingestion API
2. Kafka-based transaction events
3. Transaction categorization
4. Rule-based anomaly detection
5. AI-generated anomaly explanations
6. Account-level transaction summaries
7. Search and reporting APIs
8. Dockerized local environment

## Current Progress

### Phase 1
- Spring Boot project setup
- Transaction model
- POST transaction API
- GET transactions API
- Basic validation

## API

### Create transaction

`POST /api/transactions`

Example:

```json
{
  "accountId": "ACC-1001",
  "amount": 249.99,
  "type": "DEBIT",
  "merchant": "Best Buy",
  "category": "ELECTRONICS"
}
```

### Get transactions

`GET /api/transactions`

## Roadmap

- [x] Initial Spring Boot API
- [ ] PostgreSQL persistence
- [ ] Kafka producer and consumer
- [ ] Transaction categorization engine
- [ ] Anomaly detection rules
- [ ] Spring AI integration
- [ ] AI explanation service
- [ ] Docker Compose
- [ ] Unit and integration tests
- [ ] React dashboard
