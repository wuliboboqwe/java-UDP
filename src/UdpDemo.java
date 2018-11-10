import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UdpDemo {
	public static void main(String[] args) throws  IOException {
	for (int i = 0; i <=500; i++) {

		//发送内容
		//飞鸽传书协议
		String content = "1_lbt4_10#32899#002481627512#0#0#0:1289671407:admin:test:288:一日不见，如隔三秋";
		byte[] SendBuf = content.getBytes("GBK");
		//建立Udp连接
		DatagramSocket client = new DatagramSocket();
		//目标ip
		InetAddress addr = InetAddress.getByName("192.168.86.22");
		//飞秋端口号
		int  port=2425;
		DatagramPacket clientPacket = new DatagramPacket(SendBuf, SendBuf.length, addr, port);
		client.send(clientPacket);
	}
		
	}
}
