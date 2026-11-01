package f0;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: IgnoreHostProxySelector.java */
/* JADX INFO: loaded from: classes9.dex */
public class i extends ProxySelector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<Proxy> f52806d = Arrays.asList(Proxy.NO_PROXY);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProxySelector f52807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52809c;

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f52807a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        return this.f52808b.equals(uri.getHost()) && this.f52809c == uri.getPort() ? f52806d : this.f52807a.select(uri);
    }

    public i(ProxySelector proxySelector, String str, int i10) {
        this.f52807a = (ProxySelector) k.c(proxySelector);
        this.f52808b = (String) k.c(str);
        this.f52809c = i10;
    }

    public static void a(String str, int i10) {
        ProxySelector.setDefault(new i(ProxySelector.getDefault(), str, i10));
    }
}
