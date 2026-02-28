package CompositionPattern;

import java.util.ArrayList;

public class Folder implements Data {

    ArrayList<Data> dataList = new ArrayList<>();
    private String folderName;
    
    public Folder(String folderName) {
        this.folderName = folderName;
    }

    @Override
    public void displayData(String indent) {
        System.out.println(indent + "+ " + folderName);
        for (Data data : dataList) {
            data.displayData(indent + "   ");
        }
    }

    public void addData(Data data) {
        dataList.add(data);
    }
    public void removeData(Data data) {
        dataList.remove(data);
    }
}