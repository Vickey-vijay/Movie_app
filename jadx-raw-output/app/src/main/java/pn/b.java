package pn;

import java.net.InetAddress;
import org.fourthline.cling.model.message.UpnpMessage;
import pn.d;

/* JADX INFO: compiled from: IncomingDatagramMessage.java */
/* JADX INFO: loaded from: classes2.dex */
public class b<O extends d> extends UpnpMessage<O> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InetAddress f66237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f66238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InetAddress f66239i;

    public b(O o10, InetAddress inetAddress, int i10, InetAddress inetAddress2) {
        super(o10);
        this.f66237g = inetAddress;
        this.f66238h = i10;
        this.f66239i = inetAddress2;
    }

    public InetAddress u() {
        return this.f66239i;
    }

    public InetAddress v() {
        return this.f66237g;
    }

    public int w() {
        return this.f66238h;
    }

    public b(b<O> bVar) {
        super(bVar);
        this.f66237g = bVar.v();
        this.f66238h = bVar.w();
        this.f66239i = bVar.u();
    }
}
