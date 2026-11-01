package po;

import java.net.InetAddress;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: StreamServer.java */
/* JADX INFO: loaded from: classes11.dex */
public interface l<C> extends Runnable {
    void d0(InetAddress inetAddress, mo.a aVar) throws InitializationException;

    void stop();

    int t();
}
