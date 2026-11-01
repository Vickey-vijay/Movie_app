package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: RouteSelector.java */
/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.a f37562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f37563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.d f37564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f37565d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f37567f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<Proxy> f37566e = Collections.emptyList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<InetSocketAddress> f37568g = Collections.emptyList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<c0> f37569h = new ArrayList();

    /* JADX INFO: compiled from: RouteSelector.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c0> f37570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f37571b = 0;

        public List<c0> a() {
            return new ArrayList(this.f37570a);
        }

        public boolean b() {
            return this.f37571b < this.f37570a.size();
        }

        public a(List<c0> list) {
            this.f37570a = list;
        }

        public c0 c() {
            if (b()) {
                List<c0> list = this.f37570a;
                int i10 = this.f37571b;
                this.f37571b = i10 + 1;
                return list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    public boolean a() {
        return b() || !this.f37569h.isEmpty();
    }

    private boolean b() {
        return this.f37567f < this.f37566e.size();
    }

    public void a(c0 c0Var, IOException iOException) {
        if (c0Var.b().type() != Proxy.Type.DIRECT && this.f37562a.h() != null) {
            this.f37562a.h().connectFailed(this.f37562a.k().n(), c0Var.b().address(), iOException);
        }
        this.f37563b.b(c0Var);
    }

    public f(com.mbridge.msdk.thrid.okhttp.a aVar, d dVar, com.mbridge.msdk.thrid.okhttp.d dVar2, o oVar) {
        this.f37562a = aVar;
        this.f37563b = dVar;
        this.f37564c = dVar2;
        this.f37565d = oVar;
        a(aVar.k(), aVar.f());
    }

    private Proxy d() throws IOException {
        if (b()) {
            List<Proxy> list = this.f37566e;
            int i10 = this.f37567f;
            this.f37567f = i10 + 1;
            Proxy proxy = list.get(i10);
            a(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f37562a.k().g() + "; exhausted proxy configurations: " + this.f37566e);
    }

    public a c() throws IOException {
        if (a()) {
            ArrayList arrayList = new ArrayList();
            while (b()) {
                Proxy proxyD = d();
                int size = this.f37568g.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c0 c0Var = new c0(this.f37562a, proxyD, this.f37568g.get(i10));
                    if (this.f37563b.c(c0Var)) {
                        this.f37569h.add(c0Var);
                    } else {
                        arrayList.add(c0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f37569h);
                this.f37569h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }

    private void a(s sVar, Proxy proxy) {
        List<Proxy> listA;
        if (proxy != null) {
            this.f37566e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f37562a.h().select(sVar.n());
            if (listSelect != null && !listSelect.isEmpty()) {
                listA = com.mbridge.msdk.thrid.okhttp.internal.c.a(listSelect);
            } else {
                listA = com.mbridge.msdk.thrid.okhttp.internal.c.a(Proxy.NO_PROXY);
            }
            this.f37566e = listA;
        }
        this.f37567f = 0;
    }

    private void a(Proxy proxy) throws IOException {
        String strG;
        int iJ;
        this.f37568g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress socketAddressAddress = proxy.address();
            if (socketAddressAddress instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strG = a(inetSocketAddress);
                iJ = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
        } else {
            strG = this.f37562a.k().g();
            iJ = this.f37562a.k().j();
        }
        if (iJ >= 1 && iJ <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f37568g.add(InetSocketAddress.createUnresolved(strG, iJ));
                return;
            }
            this.f37565d.dnsStart(this.f37564c, strG);
            List<InetAddress> listA = this.f37562a.c().a(strG);
            if (!listA.isEmpty()) {
                this.f37565d.dnsEnd(this.f37564c, strG, listA);
                int size = listA.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f37568g.add(new InetSocketAddress(listA.get(i10), iJ));
                }
                return;
            }
            throw new UnknownHostException(this.f37562a.c() + " returned no addresses for " + strG);
        }
        throw new SocketException("No route to " + strG + StringUtils.PROCESS_POSTFIX_DELIMITER + iJ + "; port is out of range");
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
