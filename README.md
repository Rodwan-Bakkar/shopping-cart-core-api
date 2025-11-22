# Shopping Cart Core Api

This is a shared library for the [shopping cart system](https://github.com/Rodwan-Bakkar/shopping-cart?tab=readme-ov-file),
containing the commands, events, and shared DTOs used by other services in the system.

It is designed to support **Domain-Driven Design (DDD)** principles and provides a single source of truth for domain
contracts. Both the [**Command Service**](https://github.com/Rodwan-Bakkar/shopping-cart-command-svc) and
[**Query Service**](https://github.com/Rodwan-Bakkar/shopping-cart-query-svc) depend on this module to share consistent
data structures and domain contracts across the system. To support this reuse, the library is published to
**Maven Central**, allowing both services — and any future microservices — to consume it easily without requiring
credentials or custom configuration.
