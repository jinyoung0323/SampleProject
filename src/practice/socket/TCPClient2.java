package practice.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClient2 {

  public static void main(String[] args) {
    Socket socket = null;
    
    try {
      
      socket = new Socket();
      System.out.println("[Client] Request connect to Server ");
      socket.connect(new InetSocketAddress("192.168.0.228", 20000));
      System.out.println("[Client] Connect Success to Server ");
      
//	  //데이터 쓰기
//	  OutputStream os = socket.getOutputStream();
//	  String data = "Hello Socket !!";
//	  os.write( data.getBytes("UTF-8") );
//	  os.close();
      
      InputStream is = socket.getInputStream();
      OutputStream os = socket.getOutputStream();
      
      String data = "hello world\n";
      os.write(data.getBytes("UTF-8"));
      
      byte buffer[] = new byte[128];
      int readByteCount = is.read(buffer);
      
      data = new String(buffer, 0, readByteCount, "UTF-8");
      System.out.println("[클라이언트] 데이터 수신 : " + data);
      is.close();
      os.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        socket.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

}
