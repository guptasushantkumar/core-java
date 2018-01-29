package com.sushant.files;

import java.awt.Desktop;
import java.io.File;

public class JavaOpenFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("D:\\Research\\learning\\.gitignore");
		
		if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
		
		Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
        
        file = new File("D:\\Books\\w_hado01.pdf");
        if(file.exists()) desktop.open(file);
	}

}
