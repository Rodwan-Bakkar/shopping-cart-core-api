# Shopping Cart Core Api

This is a shared library for the [shopping cart system](https://github.com/Rodwan-Bakkar/shopping-cart?tab=readme-ov-file),
containing the commands, events, and shared DTOs used by other services in the system.

It is designed to support Domain-Driven Design (DDD) principles and provides a single source of truth for domain
contracts. Both the Command Service and Query Service depend on this module to ensure consistent data structures
and business logic across the system.

The library is published to a GitHub Packages, making it easy to reuse in multiple microservices.
