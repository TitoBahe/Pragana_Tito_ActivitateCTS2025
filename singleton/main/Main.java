package singleton.main;

import singleton.registry.PacheteAcomodare;
import singleton.registry.PacheteTransport;
import singleton.registry.PacheteTransportAcomodare;
import singleton.registry.RegistrySingleton;
import singleton.serializable.AgentiaSerializable;
import singleton.singleton_enum.AgentieEnum;
import singleton.thread_safe.AgentiaThreadSafe;

import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

       //threadsafe singleton
        AgentiaThreadSafe agentia = AgentiaThreadSafe.getIntanta("nume", 12.4f, 3);
        System.out.println(agentia.toString());

        //serializable singleton
        AgentiaSerializable agentia2 = AgentiaSerializable.getInstance(1, "nuuume", 12.4f);
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("output.dat"));
        out.writeObject(agentia2);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("output.dat"));
        AgentiaSerializable agentiaIN = (AgentiaSerializable) in.readObject();
        System.out.println(agentiaIN.toString());

        //registry singleton
        PacheteAcomodare acomodare = new PacheteAcomodare();
        PacheteTransport transport = new PacheteTransport();
        PacheteTransportAcomodare acomodareAndTransport = new PacheteTransportAcomodare();

        try{
            RegistrySingleton.register("acomodare", acomodare);
            RegistrySingleton.register("transport", transport);
            RegistrySingleton.register("acomodareAndTransport", acomodareAndTransport);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        RegistrySingleton.getPachet("acomodare").descriere();
        RegistrySingleton.getPachet("transport").descriere();
        RegistrySingleton.getPachet("acomodareAndTransport").descriere();

        //enum sungleton
        AgentieEnum enumAgentia = AgentieEnum.instanta;
        System.out.println(enumAgentia);
    }
}