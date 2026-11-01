package po;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Iterator;

/* JADX INFO: compiled from: NetworkAddressFactory.java */
/* JADX INFO: loaded from: classes11.dex */
public interface g {
    Iterator<InetAddress> a();

    InetAddress b(NetworkInterface networkInterface, boolean z10, InetAddress inetAddress) throws IllegalStateException;

    boolean c();

    InetAddress d();

    int e();

    Iterator<NetworkInterface> f();

    int g();

    byte[] h(InetAddress inetAddress);
}
