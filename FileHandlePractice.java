import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
 
public class FileHandlePractice
{
  public static void main(String[] args) throws Exception
  {
    File f = new File("practice.txt");
    FileOutputStream fos = new FileOutputStream(f);
    try (DataOutputStream dos = new DataOutputStream(fos)) {
      dos.writeUTF("Thank you");

    FileInputStream fis = new FileInputStream(f);
    try (DataInputStream dis = new DataInputStream(fis)) {
      String str = dis.readUTF();
      System.out.println(str);
    }

    }
    }
  }

 


