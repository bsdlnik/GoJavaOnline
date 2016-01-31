public abstract class BaseFile {

    private String name;
    private int size;
    private String format;

   /* private static final String defaultName = "NoName";
    private static final int defaultSize = 0;
    private static final String defaultFormat = "unknown";

    public File(){
        this(defaultName, defaultSize, defaultFormat);
    }*/

    public BaseFile(String name, int size, String format) {
        this.name = name;
        this.size = size;
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString(){
        return "File type: " + getClass().getName() + ", File name: " + "\"" + getName() +  "." + getFormat() + "\"" + " size: " + getSize();
    }



}
