
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.SocketException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Redaelli_Mattia03
 */
public class Invia {

    public void send() throws SocketException, IOException {
        Condivisa.getInstance().setDs();
        byte[] buff = new byte[1500];
        DatagramPacket dp = new DatagramPacket(buff, buff.length);
        dp.setAddress(Condivisa.getInstance().getAddress());
        buff = Condivisa.getInstance().getMessaggio().getBytes();
        dp.setData(buff);
        dp.setPort(Condivisa.getInstance().getPort());
        Condivisa.getInstance().getDs().send(dp);
        Condivisa.getInstance().setMessaggio("");
    }

}
