# Simple PDF Reports

---

This project demonstrates various features of [OpenPDF](https://github.com/LibrePDF/OpenPDF).
This is a Maven project that uses Java 17.

## Current Functionality
Reads a 1,000 line CSV file and creates a PDF file in tabular format.

## Future Functionality
Insert data into an existing PDF document that contains text fields.

## Running the Application
Build the project

`./mvnw clean package`

Run the application:
Note: you must pass the path where you want the PDF file to be created.
`java -jar ./target/simple-reporting-pdf-1.0-SNAPSHOT-jar-with-dependencies.jar /desired/output/path/sample.pdf`