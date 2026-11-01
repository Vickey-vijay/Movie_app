package im;

import java.io.IOException;
import mm.k;
import org.eclipse.jetty.io.Buffers;

/* JADX INFO: compiled from: BlockingHttpConnection.java */
/* JADX INFO: loaded from: classes9.dex */
public class d extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final zm.c f54251t = zm.b.a(d.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f54252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public mm.d f54253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f54254s;

    /* JADX WARN: Bottom block not found for handler: all -> 0x0271 */
    @Override // mm.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mm.j e() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.d.e():mm.j");
    }

    @Override // im.a
    public void n(i iVar) {
        synchronized (this) {
            super.n(iVar);
            this.f54254s = true;
            notifyAll();
        }
    }

    @Override // im.a
    public void q() throws IOException {
        this.f54252q = false;
        this.f54254s = false;
        super.q();
    }

    @Override // mm.b, mm.j
    public void a(long j10) {
        try {
            f54251t.i("onIdleExpired {}ms {} {}", Long.valueOf(j10), this, this.f64595c);
            this.f54254s = true;
            this.f64595c.close();
        } catch (IOException e10) {
            f54251t.h(e10);
            try {
                this.f64595c.close();
            } catch (IOException e11) {
                f54251t.h(e11);
            }
        }
        synchronized (this) {
            notifyAll();
        }
    }

    public d(Buffers buffers, Buffers buffers2, k kVar) {
        super(buffers, buffers2, kVar);
        this.f54254s = false;
    }

    @Override // im.a
    public boolean r(i iVar) throws IOException {
        boolean zR = super.r(iVar);
        if (zR) {
            synchronized (this) {
                notifyAll();
            }
        }
        return zR;
    }
}
