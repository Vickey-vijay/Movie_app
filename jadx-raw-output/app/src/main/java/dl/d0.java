package dl;

import java.io.InputStream;

/* JADX INFO: compiled from: JvmJsonStreams.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class d0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f52144a;

    public d0(InputStream inputStream) {
        ck.p.j(inputStream, "stream");
        this.f52144a = new q(inputStream, lk.c.f63591b);
    }

    @Override // dl.v0
    public int a(char[] cArr, int i10, int i11) {
        ck.p.j(cArr, "buffer");
        return this.f52144a.d(cArr, i10, i11);
    }

    public final void b() {
        this.f52144a.e();
    }
}
