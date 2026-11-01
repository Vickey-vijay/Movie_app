package x6;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

/* JADX INFO: compiled from: QRCode.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mode f74376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ErrorCorrectionLevel f74377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v6.f f74378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f74379d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f74380e;

    public static boolean b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public b a() {
        return this.f74380e;
    }

    public void c(ErrorCorrectionLevel errorCorrectionLevel) {
        this.f74377b = errorCorrectionLevel;
    }

    public void d(int i10) {
        this.f74379d = i10;
    }

    public void e(b bVar) {
        this.f74380e = bVar;
    }

    public void f(Mode mode) {
        this.f74376a = mode;
    }

    public void g(v6.f fVar) {
        this.f74378c = fVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f74376a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f74377b);
        sb2.append("\n version: ");
        sb2.append(this.f74378c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f74379d);
        if (this.f74380e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f74380e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
