import java.io.File;

public class FileHandlingBasic {
    public static void main(String[] args) {
        File file= new File("C:\\MY_DATA\\RS_SoftTech\\Java Assignment\\File handling\\File Handling\\src\\Myfile.txt");
//        System.out.println(file.exists());
        if(file.exists()){
            System.out.println("File exists");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.isFile());
            System.out.println(file.length());
        }
    }
}
