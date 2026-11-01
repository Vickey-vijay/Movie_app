package gn;

import java.lang.reflect.Field;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.logging.Level;
import java.util.logging.Logger;
import no.j;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: AndroidNetworkAddressFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f53631g = Logger.getLogger(d.class.getName());

    @Override // no.j
    public boolean q() {
        return false;
    }

    @Override // no.j
    public boolean o(NetworkInterface networkInterface, InetAddress inetAddress) {
        Field declaredField;
        Object obj;
        boolean zO = super.o(networkInterface, inetAddress);
        if (zO) {
            String hostAddress = inetAddress.getHostAddress();
            try {
                try {
                    Field declaredField2 = InetAddress.class.getDeclaredField("holder");
                    declaredField2.setAccessible(true);
                    obj = declaredField2.get(inetAddress);
                    declaredField = obj.getClass().getDeclaredField("hostName");
                } catch (NoSuchFieldException unused) {
                    declaredField = InetAddress.class.getDeclaredField("hostName");
                    obj = inetAddress;
                }
                if (declaredField == null || hostAddress == null) {
                    return false;
                }
                declaredField.setAccessible(true);
                declaredField.set(obj, hostAddress);
            } catch (Exception e10) {
                f53631g.log(Level.SEVERE, "Failed injecting hostName to work around Android InetAddress DNS bug: " + inetAddress, (Throwable) e10);
                return false;
            }
        }
        return zO;
    }

    public a(int i10) {
        super(i10);
    }

    @Override // no.j, po.g
    public InetAddress b(NetworkInterface networkInterface, boolean z10, InetAddress inetAddress) {
        for (InetAddress inetAddress2 : l(networkInterface)) {
            if (z10 && (inetAddress2 instanceof Inet6Address)) {
                return inetAddress2;
            }
            if (!z10 && (inetAddress2 instanceof Inet4Address)) {
                return inetAddress2;
            }
        }
        throw new IllegalStateException("Can't find any IPv4 or IPv6 address on interface: " + networkInterface.getDisplayName());
    }

    @Override // no.j
    public void j() throws InitializationException {
        try {
            super.j();
        } catch (Exception e10) {
            f53631g.warning("Exception while enumerating network interfaces, trying once more: " + e10);
            super.j();
        }
    }
}
