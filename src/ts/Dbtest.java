package ts;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dbtest {
	
	public static void main(String[] args){
		
//		 ApplicationContext context = new ClassPathXmlApplicationContext("/spring/applicationContext-quartz.xml");
//	     System.out.println("loading....");
//		Long a = 1505985514276l;
//		Date d = new Date(a);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println(sdf.format(d));
		
		byte[] req = new byte[]{'1','2','3'};
		byte[] split = new byte[]{'4','5','6'};
		byte[] data3 = new byte[req.length + split.length];  
	    System.arraycopy(req, 0, data3, 0, req.length);  
	    System.arraycopy(split, 0, data3, req.length, split.length);
	    System.out.println(data3.length);
	    for(int i = 0; i< data3.length; i++){
	    	System.out.println(data3[i]);
	    }
	    
	}
	
}