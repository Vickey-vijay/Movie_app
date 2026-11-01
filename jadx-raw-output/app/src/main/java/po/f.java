package po;

import java.net.NetworkInterface;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: MulticastReceiver.java */
/* JADX INFO: loaded from: classes11.dex */
public interface f<C> extends Runnable {
    void E(NetworkInterface networkInterface, mo.a aVar, g gVar, d dVar) throws InitializationException;

    void stop();
}
