package y5;

import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: BinaryBitmap.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f75273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c6.b f75274b;

    public c6.b a() throws NotFoundException {
        if (this.f75274b == null) {
            this.f75274b = this.f75273a.b();
        }
        return this.f75274b;
    }

    public c6.a b(int i10, c6.a aVar) throws NotFoundException {
        return this.f75273a.c(i10, aVar);
    }

    public int c() {
        return this.f75273a.d();
    }

    public int d() {
        return this.f75273a.f();
    }

    public boolean e() {
        return this.f75273a.e().e();
    }

    public b f() {
        return new b(this.f75273a.a(this.f75273a.e().f()));
    }

    public b(a aVar) {
        if (aVar != null) {
            this.f75273a = aVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public String toString() {
        try {
            return a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
