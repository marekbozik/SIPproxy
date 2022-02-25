/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sipproxy;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.mjsip.server.ServerProfile;
import org.mjsip.server.StatefulProxy;
import org.mjsip.sip.provider.SipProvider;

/**
 *
 * @author marek
 */
public class Sipproxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
        InetAddress localhost = InetAddress.getLocalHost();
//        System.out.println("System IP Address : "
//                + (localhost.getHostAddress()).trim().toString());

        SipProvider sip_provider = new SipProvider((localhost.getHostAddress()).trim().toString(), 5060);
        ServerProfile server_profile = new ServerProfile(null);

        StatefulProxy sproxy = new StatefulProxy(sip_provider, server_profile);
    }

}
