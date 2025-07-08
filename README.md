# Quantum Bookstore

A Java-based bookstore management system that demonstrates object-oriented programming concepts including inheritance, polymorphism, and abstraction.

## Features

- **Multiple Book Types**: Support for physical books, e-books, and showcase books
- **Inventory Management**: Add, display, and remove books from inventory
- **Purchase Processing**: Handle book purchases with different delivery methods
- **Email Notifications**: Send purchase confirmations via email
- **Shipping Services**: Physical delivery for paper books
- **Automatic Cleanup**: Remove outdated books from inventory

## Book Types

- **PaperBook**: Physical books that require shipping
- **EBook**: Digital books delivered via email
- **ShowcaseBook**: Demo books that cannot be purchased

## Project Structure

```
src/
├── com/quantumbookstore/
    ├── QuantumBookstoreTest.java    # Main test class
    ├── books/
    │   ├── Book.java                # Abstract base class
    │   ├── PaperBook.java          # Physical book implementation
    │   ├── EBook.java              # Digital book implementation
    │   └── ShowcaseBook.java       # Demo book implementation
    ├── services/
    │   ├── MailService.java        # Email notification service
    │   └── ShippingService.java    # Shipping service
    └── store/
        └── Bookstore.java          # Main bookstore logic
```

## How to Run

1. Compile the Java files:
   ```cmd
   javac -d . src/com/quantumbookstore/*.java src/com/quantumbookstore/**/*.java
   ```

2. Run the test application:
   ```cmd
   java com.quantumbookstore.QuantumBookstoreTest
   ```

## Example Output

The application demonstrates:
- Adding books to inventory
- Displaying current inventory
- Processing book purchases
- Handling purchase restrictions (showcase books)
- Removing outdated books

## Screenshots

Screenshots of the application output are available in the *screenshots directory* to show the various features and functionality in action.

## Requirements

- Java 8 or higher
- No external dependencies
