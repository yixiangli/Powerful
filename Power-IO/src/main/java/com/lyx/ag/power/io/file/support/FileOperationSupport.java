/** 
 * @Project_Name Power-IO 
 * @File_Name FileOperationSupport.java 
 * @Date 2017年2月9日上午10:26:46 
 * @Copyright(c) 2017, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.lyx.ag.power.io.file.support;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.lyx.ag.power.io.content.FileApi;

/**
 * @developer liyixiang
 * @Info
 * @date 2017年2月9日
 * @since JDK 1.7
 * @Function	文件操作
 * @Reason
 */
public class FileOperationSupport implements FileApi {

	@Override
	public File copyFile(String sourceFile, String targetFile) {
		// TODO Auto-generated method stub
		int readByte = 0;
		InputStream inStream = null;
		OutputStream outStream =	 null;
		try {
			File oldFile = new File(sourceFile);
			//判断旧文件存在
			if(oldFile.exists()){ 
				inStream = new FileInputStream(sourceFile);
	            outStream = new FileOutputStream(targetFile);
	            //默认1m的文件
	            byte[] buffer = new byte[1 * 1024 * 1024];
                while ((readByte = inStream.read(buffer)) != -1) {
                    outStream.write(buffer, 0, readByte);
                }
			}
		}catch (Exception e){
			
		}finally {
			if(null != inStream){
				try {
					inStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
				}
			}
			if(null != outStream){
				try {
					outStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
				}
			}
		}		
		return null;
	}

	@Override
	public File copyFileBySign(String sourceFile, String targetFile, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File replaceSignByFile(String targetFile, String str, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

}
