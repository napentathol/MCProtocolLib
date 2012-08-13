package ch.spacebase.mcprotocol.net.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import ch.spacebase.mcprotocol.net.Client;
import ch.spacebase.mcprotocol.net.ServerConnection;

public class PacketPlayer extends Packet {

	public boolean grounded;
	
	public PacketPlayer() {
	}
	
	public PacketPlayer(boolean grounded) {
		this.grounded = grounded;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		this.grounded = in.readBoolean();
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeBoolean(this.grounded);
	}

	@Override
	public void handleClient(Client conn) {
	}
	
	@Override
	public void handleServer(ServerConnection conn) {
	}
	
	@Override
	public int getId() {
		return 10;
	}
	
}
