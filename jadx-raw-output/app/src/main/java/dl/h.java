package dl;

/* JADX INFO: compiled from: JsonLexer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements CharSequence {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f52151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52152c;

    public h(char[] cArr) {
        ck.p.j(cArr, "buffer");
        this.f52151b = cArr;
        this.f52152c = cArr.length;
    }

    public char b(int i10) {
        return this.f52151b[i10];
    }

    public int c() {
        return this.f52152c;
    }

    public void d(int i10) {
        this.f52152c = i10;
    }

    public final String e(int i10, int i11) {
        return lk.x.y(this.f52151b, i10, Math.min(i11, length()));
    }

    public final void f(int i10) {
        d(Math.min(this.f52151b.length, i10));
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return lk.x.y(this.f52151b, i10, Math.min(i11, length()));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return b(i10);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return e(0, length());
    }
}
