package CompositionPattern;

public class Demo {

    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Folder folder1 = new Folder("Folder1");
        folder1.addData(file1);
        folder1.addData(file2);

        Folder folder2 = new Folder("Folder2");
        folder2.addData(folder1);

        System.out.println("Displaying contents of Folder2:");
        folder2.displayData("   ");
    }
}