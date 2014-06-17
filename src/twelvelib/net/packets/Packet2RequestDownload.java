package twelvelib.net.packets;

public class Packet2RequestDownload extends Packet {
	public String mod; //The name of the mod we are requesting a download for.
	
	public Packet2RequestDownload(String m) {
		mod = m;
	}
	
	public Packet2RequestDownload() {
		
	}
	
	public int packetType() {
		return 2;
	}
}