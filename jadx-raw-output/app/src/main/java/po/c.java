package po;

import java.net.InetAddress;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: DatagramIO.java */
/* JADX INFO: loaded from: classes11.dex */
public interface c<C> extends Runnable {
    void A(InetAddress inetAddress, mo.a aVar, d dVar) throws InitializationException;

    void b(org.fourthline.cling.model.message.a aVar);

    void stop();
}
