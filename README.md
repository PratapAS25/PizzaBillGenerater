# Pizza Bill Generator

A simple Java console application to order pizzas, add extras, and generate an itemized bill.

## Features
- Choose Veg (`₹300`) or Non-Veg (`₹400`) base pizza
- Deluxe variants auto-include extra cheese and topping
- Add extras: extra cheese (`+₹100`), extra topping (`+₹150`), takeaway parcel (`+₹20`)
- View itemized bill: base, chosen extras, and total

## Project Structure
- `src/Main.java` — entry point and interactive menu
- `src/Pizza.java` — core pricing and bill generation logic
- `src/DeluxePizza.java` — deluxe pizza that auto-adds cheese and topping
- `out/production/...` — compiled class files after build

## Requirements
- Java JDK 8+ installed and on `PATH`
- Windows PowerShell or any terminal

## Build
```bash
cd "d:\Pizza bill generator\pizzaBillGenerator"
javac -d out/production/pizzaBillGenerator src/*.java
```

## Run
```bash
java -cp out/production/pizzaBillGenerator Main
```

## Usage
- Select pizza type:
  - `1` Veg, `2` Non-Veg, `3` Deluxe Veg, `4` Deluxe Non-Veg
- For regular pizzas, options:
  - `1` add extra cheese, `2` add extra topping, `3` add takeaway, `4` view bill, `5` exit
- For deluxe pizzas, options:
  - `3` add takeaway, `4` view bill, `5` exit

## Notes
- If the `₹` symbol appears incorrectly, it is a console encoding issue. Amounts remain correct.

## Entry Points
- Main entry: `pizzaBillGenerator/src/Main.java:4`
- Core pricing: `pizzaBillGenerator/src/Pizza.java:1`
- Deluxe behavior: `pizzaBillGenerator/src/DeluxePizza.java:1`

