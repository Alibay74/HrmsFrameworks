package com.hrms.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//*******import org.testng.Reporter;
//*******import org.testng.annotations.Test;

import com.hrms.testBase.BaseClass;

public class ConfigsReader extends BaseClass {
	
public static Properties prop;
/*This method will read properties file
 *@param filePath               
 */

public static void readProperties (String filePath) {//throws IOException {

try {
FileInputStream fis =new FileInputStream(filePath);
prop=new Properties();
prop.load(fis);
fis.close();
}catch (FileNotFoundException e){
e.printStackTrace();	
}catch (IOException e) {
e.printStackTrace();
}
}
/*This method will return value of specified key
 * @param String key
 * @return String value     
 */
public static String getProperty (String key) {
return prop.getProperty(key);
	
}
}
