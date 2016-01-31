import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Directory {

    private String name;
    private List<BaseFile> file = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public Directory(String name, BaseFile... filesNames) {
        this.name = name;
        for (BaseFile f : filesNames) {
            this.file.add(f);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private StringBuilder getFilesInfo() {
        Collection<BaseFile> fileInfo = file;
        Iterator<BaseFile> iter = fileInfo.iterator();
        StringBuilder strBuild = new StringBuilder();
        while(iter.hasNext()){
            strBuild.append("      - ").append(iter.next()).append("\n");
        }
        return strBuild;
    }

    public BaseFile getFile(String fileName){
        BaseFile tmpFileLink = null;
        for (int i = 0; i < file.size(); i++) {
            /*if (file.get(i).getName().equals(fileName)){
                tmpFileLink =  file.get(i);
            }*/
            if (file.get(i).getName().contains(fileName)){
                tmpFileLink =  file.get(i);
            }
        }
        return tmpFileLink;
    }

    public void setFiles(BaseFile... filesNames) {
        for (BaseFile f : filesNames) {
            this.file.add(f);
        }
    }

    @Override
    public String  toString(){

        return new StringBuilder().append("Directory name: ").append(getName()).append("\n").append(getFilesInfo()).toString();
    }
}
