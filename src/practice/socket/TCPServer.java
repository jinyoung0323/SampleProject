package practice.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.0.228", 10001));	// 192.168.0.228
			System.out.println("[서버] 연결 기다림");
			Socket socket = serverSocket.accept();
		
			InetSocketAddress inetSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[서버] 연결됨 from" +
							    inetSocketAddress.getHostName() + " : " +
								inetSocketAddress.getPort());
			
			// 클라이언트 소켓으로부터 데이터를 받기 위한 준비
			InputStream is = socket.getInputStream();
			while(true) {
				byte buffer[] = new byte[128];
				int readByteCount = is.read(buffer);	// 버퍼 크기만큼 is에서 읽기
				
				if(readByteCount < 0) {	// 읽은 바이트 크기가 0 미만이면, 클라이언트 연결 끊김.
					System.out.println("[서버] 클라이언트로부터 연결끊김");
					is.close();
					socket.close();
					break;
				}
				String data2 = new String(buffer, 0, readByteCount, "UTF-8");
				System.out.print(data2);
			}
			
//			socket.close();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(serverSocket != null && serverSocket.isClosed() == false) {
				try {
					serverSocket.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
