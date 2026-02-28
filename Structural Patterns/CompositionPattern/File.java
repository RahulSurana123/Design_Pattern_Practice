package CompositionPattern;

public class File implements Data {

    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayData(String indent) {
        System.out.println(indent + "- " + fileName);
    }
}