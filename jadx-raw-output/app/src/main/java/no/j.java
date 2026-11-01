package no;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.transport.spi.InitializationException;
import org.fourthline.cling.transport.spi.NoNetworkException;

/* JADX INFO: compiled from: NetworkAddressFactoryImpl.java */
/* JADX INFO: loaded from: classes11.dex */
public class j implements po.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Logger f64908f = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<String> f64909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f64910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<NetworkInterface> f64911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<InetAddress> f64912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f64913e;

    /* JADX INFO: compiled from: NetworkAddressFactoryImpl.java */
    public class a extends so.b<NetworkInterface> {
        public a(Collection collection) {
            super(collection);
        }

        @Override // so.b
        public void a(int i10) {
            synchronized (j.this.f64911c) {
                j.this.f64911c.remove(i10);
            }
        }
    }

    /* JADX INFO: compiled from: NetworkAddressFactoryImpl.java */
    public class b extends so.b<InetAddress> {
        public b(Collection collection) {
            super(collection);
        }

        @Override // so.b
        public void a(int i10) {
            synchronized (j.this.f64912d) {
                j.this.f64912d.remove(i10);
            }
        }
    }

    public j() throws InitializationException {
        this(0);
    }

    @Override // po.g
    public int g() {
        return 1900;
    }

    @Override // po.g
    public byte[] h(InetAddress inetAddress) {
        try {
            NetworkInterface byInetAddress = NetworkInterface.getByInetAddress(inetAddress);
            if (byInetAddress != null) {
                return byInetAddress.getHardwareAddress();
            }
            return null;
        } catch (Throwable th2) {
            f64908f.log(Level.WARNING, "Cannot get hardware address for: " + inetAddress, th2);
            return null;
        }
    }

    public boolean n(byte[] bArr, byte[] bArr2, short s10) {
        if (bArr.length != bArr2.length || s10 / 8 > bArr.length) {
            return false;
        }
        int i10 = 0;
        while (s10 >= 8 && i10 < bArr.length) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
            s10 = (short) (s10 - 8);
        }
        if (i10 == bArr.length) {
            return true;
        }
        byte b10 = (byte) (~((1 << (8 - s10)) - 1));
        return (bArr[i10] & b10) == (bArr2[i10] & b10);
    }

    public boolean q() {
        return true;
    }

    public j(int i10) throws InitializationException {
        HashSet hashSet = new HashSet();
        this.f64909a = hashSet;
        HashSet hashSet2 = new HashSet();
        this.f64910b = hashSet2;
        ArrayList arrayList = new ArrayList();
        this.f64911c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f64912d = arrayList2;
        System.setProperty("java.net.preferIPv4Stack", "true");
        String property = System.getProperty("org.fourthline.cling.network.useInterfaces");
        if (property != null) {
            hashSet.addAll(Arrays.asList(property.split(StringUtils.COMMA)));
        }
        String property2 = System.getProperty("org.fourthline.cling.network.useAddresses");
        if (property2 != null) {
            hashSet2.addAll(Arrays.asList(property2.split(StringUtils.COMMA)));
        }
        j();
        i();
        if (arrayList.size() == 0 || arrayList2.size() == 0) {
            f64908f.warning("No usable network interface or addresses found");
            if (q()) {
                throw new NoNetworkException("Could not discover any usable network interfaces and/or addresses");
            }
        }
        this.f64913e = i10;
    }

    @Override // po.g
    public Iterator<InetAddress> a() {
        return new b(this.f64912d);
    }

    @Override // po.g
    public boolean c() {
        return this.f64911c.size() > 0 && this.f64912d.size() > 0;
    }

    @Override // po.g
    public InetAddress d() {
        try {
            return InetAddress.getByName("239.255.255.250");
        } catch (UnknownHostException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // po.g
    public int e() {
        return this.f64913e;
    }

    @Override // po.g
    public Iterator<NetworkInterface> f() {
        return new a(this.f64911c);
    }

    public void i() throws InitializationException {
        try {
            synchronized (this.f64911c) {
                Iterator<NetworkInterface> it = this.f64911c.iterator();
                while (it.hasNext()) {
                    NetworkInterface next = it.next();
                    f64908f.finer("Discovering addresses of interface: " + next.getDisplayName());
                    int i10 = 0;
                    for (InetAddress inetAddress : l(next)) {
                        if (inetAddress == null) {
                            f64908f.warning("Network has a null address: " + next.getDisplayName());
                        } else if (o(next, inetAddress)) {
                            f64908f.fine("Discovered usable network interface address: " + inetAddress.getHostAddress());
                            i10++;
                            synchronized (this.f64912d) {
                                this.f64912d.add(inetAddress);
                            }
                        } else {
                            f64908f.finer("Ignoring non-usable network interface address: " + inetAddress.getHostAddress());
                        }
                    }
                    if (i10 == 0) {
                        f64908f.finer("Network interface has no usable addresses, removing: " + next.getDisplayName());
                        it.remove();
                    }
                }
            }
        } catch (Exception e10) {
            throw new InitializationException("Could not not analyze local network interfaces: " + e10, e10);
        }
    }

    public InetAddress k(InetAddress inetAddress) {
        synchronized (this.f64911c) {
            try {
                Iterator<NetworkInterface> it = this.f64911c.iterator();
                while (it.hasNext()) {
                    for (InterfaceAddress interfaceAddress : m(it.next())) {
                        synchronized (this.f64912d) {
                            if (interfaceAddress != null) {
                                if (this.f64912d.contains(interfaceAddress.getAddress())) {
                                    if (n(inetAddress.getAddress(), interfaceAddress.getAddress().getAddress(), interfaceAddress.getNetworkPrefixLength())) {
                                        return interfaceAddress.getAddress();
                                    }
                                }
                            }
                        }
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean o(NetworkInterface networkInterface, InetAddress inetAddress) {
        if (!(inetAddress instanceof Inet4Address)) {
            f64908f.finer("Skipping unsupported non-IPv4 address: " + inetAddress);
            return false;
        }
        if (inetAddress.isLoopbackAddress()) {
            f64908f.finer("Skipping loopback address: " + inetAddress);
            return false;
        }
        if (this.f64910b.size() <= 0 || this.f64910b.contains(inetAddress.getHostAddress())) {
            return true;
        }
        f64908f.finer("Skipping unwanted address: " + inetAddress);
        return false;
    }

    @Override // po.g
    public InetAddress b(NetworkInterface networkInterface, boolean z10, InetAddress inetAddress) {
        InetAddress inetAddressK = k(inetAddress);
        if (inetAddressK != null) {
            return inetAddressK;
        }
        f64908f.finer("Could not find local bind address in same subnet as: " + inetAddress.getHostAddress());
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

    public void j() throws InitializationException {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                f64908f.finer("Analyzing network interface: " + networkInterface.getDisplayName());
                if (p(networkInterface)) {
                    f64908f.fine("Discovered usable network interface: " + networkInterface.getDisplayName());
                    synchronized (this.f64911c) {
                        this.f64911c.add(networkInterface);
                    }
                } else {
                    f64908f.finer("Ignoring non-usable network interface: " + networkInterface.getDisplayName());
                }
            }
        } catch (Exception e10) {
            throw new InitializationException("Could not not analyze local network interfaces: " + e10, e10);
        }
    }

    public List<InetAddress> l(NetworkInterface networkInterface) {
        return Collections.list(networkInterface.getInetAddresses());
    }

    public List<InterfaceAddress> m(NetworkInterface networkInterface) {
        return networkInterface.getInterfaceAddresses();
    }

    public boolean p(NetworkInterface networkInterface) throws Exception {
        if (!networkInterface.isUp()) {
            f64908f.finer("Skipping network interface (down): " + networkInterface.getDisplayName());
            return false;
        }
        if (l(networkInterface).size() == 0) {
            f64908f.finer("Skipping network interface without bound IP addresses: " + networkInterface.getDisplayName());
            return false;
        }
        String name = networkInterface.getName();
        Locale locale = Locale.ROOT;
        if (!name.toLowerCase(locale).startsWith("vmnet") && (networkInterface.getDisplayName() == null || !networkInterface.getDisplayName().toLowerCase(locale).contains("vmnet"))) {
            if (networkInterface.getName().toLowerCase(locale).startsWith("vnic")) {
                f64908f.finer("Skipping network interface (Parallels): " + networkInterface.getDisplayName());
                return false;
            }
            if (networkInterface.getName().toLowerCase(locale).startsWith("vboxnet")) {
                f64908f.finer("Skipping network interface (Virtual Box): " + networkInterface.getDisplayName());
                return false;
            }
            if (networkInterface.getName().toLowerCase(locale).contains("virtual")) {
                f64908f.finer("Skipping network interface (named '*virtual*'): " + networkInterface.getDisplayName());
                return false;
            }
            if (networkInterface.getName().toLowerCase(locale).startsWith("ppp")) {
                f64908f.finer("Skipping network interface (PPP): " + networkInterface.getDisplayName());
                return false;
            }
            if (networkInterface.isLoopback()) {
                f64908f.finer("Skipping network interface (ignoring loopback): " + networkInterface.getDisplayName());
                return false;
            }
            if (this.f64909a.size() > 0 && !this.f64909a.contains(networkInterface.getName())) {
                f64908f.finer("Skipping unwanted network interface (-Dorg.fourthline.cling.network.useInterfaces): " + networkInterface.getName());
                return false;
            }
            if (!networkInterface.supportsMulticast()) {
                f64908f.warning("Network interface may not be multicast capable: " + networkInterface.getDisplayName());
                return true;
            }
            return true;
        }
        f64908f.finer("Skipping network interface (VMWare): " + networkInterface.getDisplayName());
        return false;
    }
}
