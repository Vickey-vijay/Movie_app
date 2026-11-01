package un;

import java.net.InetAddress;
import java.net.URL;
import yn.z;

/* JADX INFO: compiled from: RemoteDeviceIdentity.java */
/* JADX INFO: loaded from: classes11.dex */
public class j extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f72961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f72962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InetAddress f72963e;

    public j(z zVar, j jVar) {
        this(zVar, jVar.a(), jVar.d(), jVar.f(), jVar.e());
    }

    public j(z zVar, Integer num, URL url, byte[] bArr, InetAddress inetAddress) {
        super(zVar, num);
        this.f72961c = url;
        this.f72962d = bArr;
        this.f72963e = inetAddress;
    }

    public URL d() {
        return this.f72961c;
    }

    public InetAddress e() {
        return this.f72963e;
    }

    public byte[] f() {
        return this.f72962d;
    }

    @Override // un.c
    public String toString() {
        if (mn.f.f64631a) {
            return "(RemoteDeviceIdentity) UDN: " + b() + ", Descriptor: " + d();
        }
        return "(" + getClass().getSimpleName() + ") UDN: " + b() + ", Descriptor: " + d();
    }

    public j(rn.a aVar) {
        this(aVar.A(), aVar.z(), aVar.y(), aVar.x(), aVar.u());
    }

    public j(rn.c cVar) {
        this(cVar.A(), cVar.z(), cVar.y(), cVar.x(), cVar.u());
    }
}
