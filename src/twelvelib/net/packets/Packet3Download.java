package twelvelib.net.packets;

public class Packet3Download extends Packet {
	public String file; //Name of the file
	public int hash; //ID for this download.
	public byte data[]; //This array of bytes is the data for the file.
	
	public int part, total; //The part number and the total parts.
	
	public Packet3Download(String f, int h, byte[] b, int p, int t) {
		file = f;
		hash = h;
		part = p;
		total = t;
		data = b;
	}
	
	public Packet3Download() {

	}
	
	public int packetType() {
		return 3;
	}
}