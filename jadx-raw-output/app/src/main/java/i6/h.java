package i6;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: EncoderContext.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SymbolShapeHint f54069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y5.c f54070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y5.c f54071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StringBuilder f54072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f54075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f54076i;

    public void j() {
        this.f54074g = -1;
    }

    public void k() {
        this.f54075h = null;
    }

    public int a() {
        return this.f54072e.length();
    }

    public StringBuilder b() {
        return this.f54072e;
    }

    public char c() {
        return this.f54068a.charAt(this.f54073f);
    }

    public String d() {
        return this.f54068a;
    }

    public int e() {
        return this.f54074g;
    }

    public k g() {
        return this.f54075h;
    }

    public final int h() {
        return this.f54068a.length() - this.f54076i;
    }

    public boolean i() {
        return this.f54073f < h();
    }

    public void l(y5.c cVar, y5.c cVar2) {
        this.f54070c = cVar;
        this.f54071d = cVar2;
    }

    public void m(int i10) {
        this.f54076i = i10;
    }

    public void n(SymbolShapeHint symbolShapeHint) {
        this.f54069b = symbolShapeHint;
    }

    public void o(int i10) {
        this.f54074g = i10;
    }

    public void q(int i10) {
        k kVar = this.f54075h;
        if (kVar == null || i10 > kVar.a()) {
            this.f54075h = k.l(i10, this.f54069b, this.f54070c, this.f54071d, true);
        }
    }

    public void r(char c10) {
        this.f54072e.append(c10);
    }

    public void s(String str) {
        this.f54072e.append(str);
    }

    public h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 == '?' && str.charAt(i10) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c10);
        }
        this.f54068a = sb2.toString();
        this.f54069b = SymbolShapeHint.FORCE_NONE;
        this.f54072e = new StringBuilder(str.length());
        this.f54074g = -1;
    }

    public int f() {
        return h() - this.f54073f;
    }

    public void p() {
        q(a());
    }
}
