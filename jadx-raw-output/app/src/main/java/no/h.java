package no;

import java.net.InetAddress;

/* JADX INFO: compiled from: MulticastReceiverConfigurationImpl.java */
/* JADX INFO: loaded from: classes11.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InetAddress f64897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f64898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64899c;

    public h(InetAddress inetAddress, int i10, int i11) {
        this.f64897a = inetAddress;
        this.f64898b = i10;
        this.f64899c = i11;
    }

    public InetAddress a() {
        return this.f64897a;
    }

    public int b() {
        return this.f64899c;
    }

    public int c() {
        return this.f64898b;
    }

    public h(InetAddress inetAddress, int i10) {
        this(inetAddress, i10, 640);
    }
}
