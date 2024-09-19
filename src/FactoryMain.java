
import com.phone.OS;
import com.phone.OperatingSystemFactory;
import com.phone.Windows;
import com.phone.Android;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author localadmin
 */
public class FactoryMain {
    public static void main(String a[]){
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Closed");
        obj.spec();
        
    }
    
    
}
