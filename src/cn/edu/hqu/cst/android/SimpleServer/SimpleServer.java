package cn.edu.hqu.cst.android.SimpleServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class SimpleServer {
	private final static int localPort = 5645;

	public static void main(String[] args) throws IOException {
		byte[] buffer = new byte[1024];
		@SuppressWarnings("resource")
		DatagramSocket ds = new DatagramSocket(localPort);
		DatagramPacket dp = new DatagramPacket(buffer, 1024);
		ds.receive(dp);
		System.out.println(new String(dp.getData(), dp.getOffset(), dp.getLength()));
	}

}
