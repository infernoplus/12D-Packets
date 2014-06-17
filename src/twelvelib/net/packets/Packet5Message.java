package twelvelib.net.packets;

public class Packet5Message extends Packet {
	public String message;
	public String whisper;
	
	public Packet5Message(String m) {
		message = m;
		whisper = "";
	}
	
	public Packet5Message(String m, String w) {
		message = m;
		whisper = w;
	}
	
	public Packet5Message() {
		
	}
	
	public int packetType() {
		return 5;
	}
}