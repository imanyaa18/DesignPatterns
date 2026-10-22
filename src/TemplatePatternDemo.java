
abstract class DataParser {

    // Template method
    public final void parse() {
        readData();
        processData();
        System.out.println("Parsing completed!");
    }

    // Steps implemented by subclasses
    protected abstract void readData();

    protected abstract void processData();
}

// CSV parser
class CsvParser extends DataParser {

    @Override
    protected void readData() {
        System.out.println("Reading CSV file");
    }

    @Override
    protected void processData() {
        System.out.println("Processing CSV data");
    }
}

// XML parser
class XmlParser extends DataParser {

    @Override
    protected void readData() {
        System.out.println("Reading XML file");
    }

    @Override
    protected void processData() {
        System.out.println("Processing XML data");
    }
}

// Main class
public class TemplatePatternDemo {

    public static void main(String[] args) {

        System.out.println("--- CSV Parser ---");
        DataParser csv = new CsvParser();
        csv.parse();

        System.out.println();

        System.out.println("--- XML Parser ---");
        DataParser xml = new XmlParser();
        xml.parse();
    }
}
