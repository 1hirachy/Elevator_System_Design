# Elevator System Design

## Overview

This Java-based Elevator System is designed following Object-Oriented Design principles to simulate the operations of an elevator in a building. The system emphasizes scalability, maintainability, and a clear separation of concerns.

## Key Features

- **Enum-Based Floor Management:** Utilizes enums to represent floor numbers, ensuring type safety and clarity.
- **Interface-Driven Components:** Defines behaviors for buttons, control panels, and doors through interfaces, promoting flexibility and extensibility.
- **Singleton Design Pattern:** Ensures a single instance of the Elevator class to maintain consistent state and behavior across the system.
- **Robust Input Validation:** Handles floor selection errors gracefully, enhancing user experience and system reliability.
- **Efficient Request Handling:** Supports multiple elevator requests, processing them in an optimized manner.
- **Observer Pattern Implementation:** Dynamically tracks and responds to floor requests, improving responsiveness and accuracy.
- **Comprehensive Testing Features:** Includes unit tests to verify core functionalities, integration tests to ensure seamless interaction between components, and automated test scripts to validate system performance.

## Project Structure

```
Elevator_System_Design/
├── src/
│   ├── enums/
│   │   └── FloorNumber.java
│   ├── interfaces/
│   │   ├── Button.java
│   │   ├── ControlPanel.java
│   │   └── Door.java
│   ├── models/
│   │   ├── Elevator.java
│   │   ├── Floor.java
│   │   ├── ElevatorButton.java
│   │   ├── ElevatorControlPanel.java
│   │   └── ElevatorDoor.java
│   ├── tests/
│   │   ├── BaseElevatorSystemTest.java
│   │   ├── ComplexElevatorSystemTest.java
│   │   ├── ElevatorTest.java
├── .gitignore
├── README.md
├── pom.xml
└── LICENSE
```

- **`enums/`**: Contains the `FloorNumber.java` enum, representing the floors in the building.
- **`interfaces/`**: Defines interfaces such as `Button`, `ControlPanel`, and `Door` to standardize behaviors across different components.
- **`models/`**: Implements the core classes like `Elevator`, `Floor`, and their associated components (`ElevatorButton`, `ElevatorControlPanel`, `ElevatorDoor`).
- **`tests/`**: Includes unit and integration tests to verify the correctness and reliability of the system.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK) 8 or higher:** Ensure you have the appropriate JDK installed.
- **Maven:** Used for dependency management and building the project.

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/1hirachy/Elevator_System_Design.git
   ```
2. **Navigate to the project directory:**
   ```bash
   cd Elevator_System_Design
   ```
3. **Build the project using Maven:**
   ```bash
   mvn clean install
   ```

### Running the Application

After building the project, you can run the application using your preferred Java IDE or from the command line:

```bash
java -cp target/Elevator_System_Design-1.0-SNAPSHOT.jar com.yourpackage.Main
```

*Note:* Replace `com.yourpackage.Main` with the actual main class path if different.

## Testing the Application

To run unit and integration tests, use the following Maven command:

```bash
mvn test
```

This will execute all test cases located in the `tests/` directory and ensure the system is functioning correctly.

## Usage

Upon running the application, the system will prompt for floor requests. Users can input desired floor numbers, and the elevator will respond accordingly, demonstrating the implemented features such as request handling, state management, and input validation.

## Contributing

Contributions are welcome! To contribute:

1. **Fork the repository.**
2. **Create a new branch:**
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. **Make your changes and commit them:**
   ```bash
   git commit -m "Add your message here"
   ```
4. **Push to the branch:**
   ```bash
   git push origin feature/your-feature-name
   ```
5. **Submit a pull request.**

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
