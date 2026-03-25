import java.io.File;
import java.util.Scanner;
public class directory {
    public static void main(String args[])
    {

        File root=new File("C:\\AK\\Java programming");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the traget filename");
        String target=sc.nextLine();   
        searchfile(root,target);
    }
        public static void searchfile(File root,String target)
        {
            File[] files=root.listFiles();
            if(files==null)
            {
                return;
            }
            for(File file : files)
            {
                if(file.isDirectory())
                {
                    searchfile(file,target);
                }
                else if(file.isFile())
                {
                    if(file.getName().equals(target))
                    {
                        System.out.println("Found "+file.getAbsolutePath());
                    }

                }
            }


        }     
    }
    

