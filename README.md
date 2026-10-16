<div align="center">

# Travel Agency Management System
### Java Swing Desktop Application · Academic Coursework Repository

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/GUI-Java%20Swing-5382a1?style=flat-square)
![AWT](https://img.shields.io/badge/UI-Swing%20%2B%20AWT-6e7681?style=flat-square)
![OOP](https://img.shields.io/badge/design-OOP-6e7681?style=flat-square)
![Status](https://img.shields.io/badge/status-academic%20project-2ea44f?style=flat-square)

</div>

A Java coursework repository for a travel-agency management system. The recommended portfolio implementation is the **Java Swing/AWT desktop application** under `Travel Agency GUI/`. The repository also preserves an **earlier console-based implementation** under `user data/`.

The Swing application demonstrates multi-screen desktop UI design, event-driven programming, file-based demo account storage, domestic/international package browsing, custom package configuration and local price calculation, administrator workflows, and simulated payment interfaces.

> **Scope note:** this is an academic demonstration, not a production booking or payment service. Payment screens are simulations and the local account files use plaintext demo data.

## Project snapshot

| Area | Details |
|---|---|
| Primary language | Java |
| Main UI | Java Swing + AWT |
| Main entry point | `Travel Agency GUI/Start.java` |
| Persistence | Local text files for demo accounts |
| User flows | Registration, login, package selection, custom package pricing |
| Admin flows | Login, view/add/delete user data, password-management UI |
| Destinations | 5 domestic + 5 international options |
| Payment | Card and mobile-banking UI simulations only |
| Secondary implementation | Earlier console application in `user data/` |
| Status | Academic coursework / portfolio demonstration |

## Main Swing application flow

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
  │          Local Price Calculation
  │             ↓
  │          Payment Option
  │             ├── Card UI
  │             └── Mobile Banking UI
  └── Admin Login
         ↓
      Admin Panel
         ├── User Data
         └── Admin Password
```

## Implemented user features

### Registration and login

The Swing application includes:

- local demo-account registration;
- basic field validation;
- a simple arithmetic CAPTCHA;
- security-question/answer fields;
- timestamped registration records;
- username/password login against the local data file.

Runtime registrations are written to `Travel Agency GUI/Data/user_data.txt` in plaintext. This design is suitable only for coursework/demo use.

### Default tour packages

The predefined-package flow separates destinations into domestic and international choices.

**Domestic destinations represented in the source:**

- Cox's Bazar
- Sajek Valley
- Sreemangal
- Bandarban
- Rangamati

**International destinations represented in the source:**

- India
- China
- Thailand
- Maldives
- Indonesia

Each destination has a dedicated Swing screen in the main application.

### Custom package builder

`SelfChoosenPacks.java` provides a configurable package flow with options for:

- international or domestic travel;
- destination;
- number of travelers;
- number of days;
- hotel type;
- transport method;
- transport/vehicle class where applicable.

The application calculates a local demo price from the selected options before continuing to the payment UI. The prices are hard-coded demonstration values rather than live booking data.

### Payment interfaces

The application provides two simulated payment paths:

- card-payment form;
- mobile-banking form.

The card screen collects interface fields such as cardholder name, number, validity and CVV. The mobile-banking screen collects a phone number, OTP and PIN field. The program only performs basic form checks and then displays a success screen; it does **not** communicate with a bank, payment gateway, bKash, Nagad, or another transaction processor.

**Do not enter real financial credentials when running the project.**

## Administrator features

The Swing administrator flow includes:

- local admin login;
- viewing locally stored user records in a table;
- adding a user through the admin interface;
- marking/removing user records;
- administrator-password management screens;
- navigation back to the main application.

The implementation reads local text files and is not intended as a secure production administration system.

## Two implementations are preserved

### 1. `Travel Agency GUI/` — recommended/current portfolio implementation

This directory contains the Swing/AWT desktop application and its UI assets. `Start.java` opens the welcome screen, which then leads into the application workflow.

### 2. `user data/` — earlier console implementation

This directory preserves an older command-line implementation with separate default/domestic/international Java packages and text-based account operations.

The legacy console source explicitly identifies **Team "Sqaure", Group 6** and names four contributors. Because the main Swing source does not contain the same contributor table, those names are attributed specifically to the console implementation rather than automatically assigned to the Swing application.

See **[CONTRIBUTORS.md](CONTRIBUTORS.md)** for the evidence-based contributor/source-lineage record.

## Repository structure

```text
.
├── README.md
├── CONTRIBUTORS.md
├── .gitignore
├── Travel Agency GUI/                  # Recommended Swing application
│   ├── Start.java                      # Main entry point
│   ├── Welcome.java
│   ├── Home.java
│   ├── Registration.java
│   ├── Login.java
│   ├── Packs.java
│   ├── DefPackTypes.java
│   ├── DomPlaces.java
│   ├── IntCountries.java
│   ├── Domestic*.java                  # Domestic destination screens
│   ├── International*.java             # International destination screens
│   ├── SelfChoosenPacks.java           # Custom package + local pricing
│   ├── Paymentoption.java
│   ├── CardPayment.java
│   ├── MobileBanking.java
│   ├── PaySuccess.java
│   ├── Admin*.java
│   ├── UserData.java
│   ├── Data/                           # Local synthetic/demo account files
│   ├── images/                         # UI and destination assets
│   └── run.sh
└── user data/                          # Earlier console implementation
    ├── Start.java
    ├── Verifylogin.java
    ├── Back.java
    ├── Default/
    ├── Domestic/
    └── International/
```

The repository also contains historically committed `.class` files. They are generated build artifacts rather than source code; future generated class files are excluded by `.gitignore`.

## Run locally

### Requirements

- Java Development Kit (JDK)
- `javac` and `java` available on your PATH
- desktop environment capable of displaying Java Swing windows

### Recommended: included script

From the repository root:

```bash
cd "Travel Agency GUI"
chmod +x run.sh
./run.sh
```

The script removes old `.class` files from the application directory, compiles `Start.java`, and launches the application.

### Manual compile/run

```bash
cd "Travel Agency GUI"
javac Start.java
java Start
```

`javac` resolves and compiles the referenced source classes in the same default package as needed.

### Platform note

Several data-file paths in the historical source use Windows-style backslashes such as `.\\Data\\user_data.txt`. The project is preserved close to the coursework implementation, so behavior may vary by operating system. If running on Linux/macOS and a data-file path fails, run the application from `Travel Agency GUI/` and adjust those historical path strings locally if necessary.

## Data and security notes

The current tracked user sample is synthetic demo data, and the repository should be treated strictly as a learning/portfolio project.

The historical design:

- stores account records in plaintext text files;
- stores passwords and security-question answers without hashing;
- exposes user fields to the local admin UI;
- relies on local/default demo administrator credentials;
- performs only basic input validation;
- simulates financial forms without secure payment processing;
- does not encrypt local records;
- has no production authorization or session layer.

Do **not** use real passwords, payment-card data, mobile-banking PINs, OTPs, or other sensitive credentials when testing this project.

A production redesign should use a proper persistence layer, password hashing, stronger validation, role-based authorization, secure secret handling, safer account-recovery design, and validated payment-provider integrations.

## What this project demonstrates

- Java Swing/AWT desktop GUI development
- event-driven application navigation
- multi-screen workflow design
- Java file I/O and simple persistence
- administrator/user flow separation
- dynamic package-selection controls
- hard-coded pricing logic for a coursework prototype
- table-based administration UI
- object-oriented organization across multiple Java classes
- maintaining both GUI and earlier console implementations of the same problem domain

## Contributors and attribution

This repository contains mixed project lineage, so contributor credit is intentionally evidence-based.

### Main Swing application

The current Swing source under `Travel Agency GUI/` does **not** contain an explicit team roster or contribution table. The repository therefore does not invent co-author names or percentages for this implementation.

**Repository maintainer:** MD Alif Ziad Sarkar

### Earlier console implementation

The source file `user data/Start.java` explicitly labels the project as **Travel agency**, **Team "Sqaure"**, **Group 6**, and lists:

- **Moshiur Rahman Nahin**
- **Farhan Sadik Ferdous**
- **Tapu Biswas**
- **Zaid Amin Rawfin**

Those names are credited specifically to the earlier console implementation because that is what the repository evidence supports. No student IDs, contribution percentages, or GitHub usernames are stated there, so none are inferred.

Full attribution note: **[CONTRIBUTORS.md](CONTRIBUTORS.md)**.

## Repository maintenance notes

- The previously committed personal-looking demo user record was replaced with synthetic sample data.
- Historical `.class` files remain in the repository as existing artifacts, while new generated classes are ignored.
- macOS/editor temporary files previously tracked during upload cleanup have been removed.
- `Travel Agency GUI/Start.java` is the recommended entry point.
- `user data/` is preserved as a separate earlier implementation rather than presented as part of the Swing architecture.

## Project status

**Academic coursework / portfolio demonstration.** The repository demonstrates Java desktop UI development, package-selection workflows, local file I/O, and basic administrator/user interactions. It is not a deployable travel-booking, identity-management, or payment-processing service.
