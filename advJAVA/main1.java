import java.io.IO.Exception;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import restaurantsystem.component.auth.Login:
 
 public class main1 extends JFrame()
  {
  	public static void main(String args[])
  	{
  	  createRequiredFileIfDoesNotExist();

  	  Login im=new Login();
  	  im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      im.setVisible(true);	
  	}
  private static void createRequiredFile!!DoesNotExist()
    {
        String fileName[];
        File root Dir=new File("storage");
        rootDir.mkdirs();
        file Names=new String[]
        {"storage/item.txt","storage/labour.txt","storage/order.txt","storage/orderline.txt"}

        for(String file=new File(fileName){
            File file=new File(fileName);
            if(!file.exist())
            {
              try{
                file.create New File();
              }catch(IOExeption ex){

               Logger.get.Logger(Main.class.getName()).log(Level SERVERE,null,ex);
              }
import java.util.logging.FileHandler;

            }
        }
    }
}