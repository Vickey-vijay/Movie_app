package mm;

import java.util.Locale;

/* JADX INFO: compiled from: BufferDateCache.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends xm.i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f64601p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f64602q;

    public synchronized d g(long j10) {
        String strA = super.a(j10);
        if (strA == this.f64602q) {
            return this.f64601p;
        }
        this.f64602q = strA;
        h hVar = new h(strA);
        this.f64601p = hVar;
        return hVar;
    }

    public f(String str, Locale locale) {
        super(str, locale);
    }
}
