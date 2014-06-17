package twelvelib.net;

import java.io.FileNotFoundException;

import twelvelib.net.packets.*;

import com.esotericsoftware.kryo.Kryo;

public class Registrar {
	//This method is called by the server and client before a connection to register all the types of packets used in the client/server communication.
	public static void registerPackets(Kryo k) {
		int i = 0;
		while(i < packs.length) {
			k.register(packs[i].c);
			i++;
		}
	}
	
	//If you create a packet, put it in this list so it will be registered in the NetworkCore of the client and server. If it's not registered it won't work.
	public static ClassCont[] packs = new ClassCont[] {
		new ClassCont(boolean[].class),
		new ClassCont(byte[].class),
		new ClassCont(int[].class),
		new ClassCont(float[].class),
		new ClassCont(char[].class),
		new ClassCont(Byte[].class),
		new ClassCont(Character[].class),
		new ClassCont(String[].class),
		new ClassCont(Packet0Login.class),
		new ClassCont(Packet1Load.class),
		new ClassCont(Packet2RequestDownload.class),
		new ClassCont(Packet3Download.class),
		new ClassCont(Packet4Join.class),
		new ClassCont(Packet5Message.class),
		new ClassCont(Packet10Instantiate.class),
		new ClassCont(Packet11RequestActor.class),
		new ClassCont(Packet12Destroy.class),
		new ClassCont(Packet13Kill.class),
		new ClassCont(Packet20Location.class),
		new ClassCont(Packet21Rotation.class),
		new ClassCont(Packet30Inventory.class),
		new ClassCont(Packet31Pickup.class),
		new ClassCont(Packet32Drop.class),
		new ClassCont(Packet40Ready.class),
		new ClassCont(Packet41Control.class)
	};

}

class ClassCont {
	public Class<? extends Object> c;
	public ClassCont(Class<? extends Object> a) {
		c = a;
	}
}