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

## Requirements

- Java 8 or higher
- No external dependencies required
