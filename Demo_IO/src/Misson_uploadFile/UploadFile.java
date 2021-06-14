package Misson_uploadFile;

import java.io.*;
import java.util.Scanner;

public class UploadFile {
    public static void main(String[] args)throws IOException {
        // 获取合法路径 定义一个方法，获取合法路径： getPath();
        // 定义一个方法，判断文件是否在lib中存在，存在提示说明存在，上传失败，不存在则上传，提示成功
        File file = getPath();
        System.out.println(file);
        boolean flag = isExists(file.getName());
        if(flag){
            System.out.println("该用户头像已经存在，上传失败");
        }else{
            upload(file);
        }
    }
    public static File getPath() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入上传文件的路径: ");
            String path = sc.nextLine();
            if (!path.endsWith(".jpg") && !path.endsWith(".png") && !path.endsWith("bmp")) {
                System.out.println("您录入的不是图片，请重新录入：");
                continue;
            }
            File f1 = new File(path);
            if (f1.exists() && f1.isFile()) {
                return f1;
            } else {
                System.out.println("您录入的路径不合法，请重写录入：");
            }
        }
    }

    public static boolean isExists(String path){
        File file = new File("lib");
        String[] names = file.list();
        for (String str1 : names) {
            if(str1.equals(path)){
                return true;
            }
        }
        return  false;
    }

    public static  void upload(File path)throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path)); // D:/asdfa.jpg
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/"+path.getName()));  // lib:/asdfa.jpg
        int len;
        while((len = bis.read()) != -1){
            bos.write(len);
        }
        bis.close();
        bos.close();

        System.out.println("上传成功！");
    }
}
