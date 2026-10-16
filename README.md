<div align="center">

# Travel Agency Management System
### Java Swing Desktop Application

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/GUI-Java%20Swing-5382a1?style=flat-square)
![OOP](https://img.shields.io/badge/design-OOP-6e7681?style=flat-square)
![Status](https://img.shields.io/badge/status-academic%20project-blue?style=flat-square)

</div>

A desktop travel-agency application built with **Java Swing/AWT**. The main implementation provides user registration/login, administrator access, domestic and international tour browsing, predefined/custom package flows, local price calculation, and simulated card/mobile-banking payment screens.

## What the project demonstrates

- Multi-screen Java Swing application design
- Event-driven GUI programming
- User and administrator flows
- File-based persistence for demo accounts
- Domestic and international package navigation
- Custom package configuration and price calculation
- Simulated payment UI workflows
- Object-oriented organization across multiple Java classes

## Main application flow

```text
Start
  ↓
Welcome
  ↓
Home
  ├── User Registration
  ├── User Login
  │      ↓
  │    Packages
  │      ├── Default Package
  │      │      ├── Domestic destinations
  │      │      └── International destinations
  │      └── Custom Package
  │             ↓
  │          Payment
  │             ├── Card
  │             └── Mobile Banking
  └── Admin Login
         ↓
      Admin Panel
```

## Implemented user features

### Authentication and registration

- Register a local demo account
- Validate basic registration fields
- Store account information in the project data file
- Log in using the locally stored username/password pair

### Tour/package selection

The predefined-package flow separates destinations into domestic and international groups.

**Domestic destinations represented in the source:**

- Sreemangal
- Cox's Bazar
- Sajek Valley
- Rangamati
- Bandarban

**International destinations represented in the source:**

- India
- China
- Indonesia
- Thailand
- Maldives

### Custom package builder

The custom-package screen allows configuration of items such as:

- Travel date
- Number of travelers
- Hotel quality
- Transport choice
- AC / non-AC options

The application calculates a local demo price from the selected options before continuing to the payment interface.

### Payment UI

Two payment paths are represented:

- Card-payment form
- Mobile-banking form with bKash/Rocket/Nagad choices

**These are interface simulations only.** The application does not connect to a real payment gateway, bank, mobile-financial-service API, or live transaction processor.

## Administrator features

The administrator flow includes screens for:

- Admin login
- Viewing locally stored user data
- Registering an additional administrator
- Deleting an account
- Changing an administrator password
- Logging out

## Repository structure

```text
.
├── README.md
├── Travel Agency GUI/              # Main/current Swing application
│   ├── Start.java                  # Application entry point
│   ├── Welcome.java
│   ├── Home.java
│   ├── Registration.java
│   ├── Login.java
│   ├── Packs.java
│   ├── DefPackTypes.java
│   ├── DomPlaces.java
│   ├── IntCountries.java
│   ├── Domestic*.java
│   ├── International*.java
│   ├── SelfChoosenPacks.java
│   ├── Paymentoption.java
│   ├── CardPayment.java
│   ├── MobileBanking.java
│   ├── Admin*.java
│   ├── Data/                       # Local demo account files
│   ├── images/                     # UI/destination assets
│   └── run.sh
└── user data/                      # Earlier/alternate coursework implementation
```

The repository also contains previously generated `.class` files. They are build artifacts rather than source; new generated class files are now ignored through `.gitignore`.

## Run locally

### Requirements

- A Java Development Kit (JDK)
- `javac` and `java` available on your PATH
- A desktop environment capable of displaying Swing windows

### Compile and run

```bash
cd "Travel Agency GUI"
javac *.java
java Start
```

The included `run.sh` performs the same basic compile/run sequence on a compatible shell environment.

## Data and security note

This is an academic desktop project and its account storage was designed for local demonstration, not production authentication.

The current design:

- Uses text files instead of a database
- Stores demo passwords/account fields in plaintext
- Uses local test credentials
- Simulates payment forms without secure payment processing
- Does not encrypt local user records

Do **not** use real passwords, payment-card data, mobile-banking PINs, or other sensitive credentials when testing this project.

A production redesign should use a proper database, password hashing, access control, secure secret handling, validated payment-provider integrations, stronger input validation, and a clearer separation between UI, business logic, and persistence.

## Repository maintenance notes

- `.class` files already committed historically remain in the repository, but future generated class files are ignored.
- `.DS_Store`, editor metadata and temporary files are now ignored.
- The `user data/` folder is preserved as an earlier/alternate implementation and is not the recommended entry point.
- `Travel Agency GUI/Start.java` is the main entry point for the current version.

## Project status

**Academic group-project implementation / portfolio demonstration.** The repository is useful for demonstrating Java Swing UI composition, event handling, package-selection logic, basic local persistence, and multi-screen desktop application flow; it is not a deployable travel-booking/payment service.

## Maintainer

**MD Alif Ziad Sarkar**  
BSc in Computer Science and Engineering, American International University-Bangladesh (AIUB)
