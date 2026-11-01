package xm;

import org.eclipse.jetty.util.Utf8Appendable;

/* JADX INFO: compiled from: Utf8StringBuffer.java */
/* JADX INFO: loaded from: classes10.dex */
public class r extends Utf8Appendable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StringBuffer f75071g;

    public r(int i10) {
        super(new StringBuffer(i10));
        this.f75071g = (StringBuffer) this.f65743a;
    }

    public StringBuffer h() {
        d();
        return this.f75071g;
    }

    public String toString() {
        d();
        return this.f75071g.toString();
    }
}
