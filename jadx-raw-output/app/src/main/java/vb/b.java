package vb;

import android.graphics.Path;

/* JADX INFO: compiled from: ClipPathManager.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f73153a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f73154b = null;

    /* JADX INFO: compiled from: ClipPathManager.java */
    public interface a {
        Path a(int i10, int i11);
    }

    public Path a() {
        return this.f73153a;
    }

    public void b(a aVar) {
        this.f73154b = aVar;
    }

    public void c(int i10, int i11) {
        this.f73153a.reset();
        a aVar = this.f73154b;
        Path pathA = aVar != null ? aVar.a(i10, i11) : null;
        if (pathA != null) {
            this.f73153a.set(pathA);
        }
    }
}
