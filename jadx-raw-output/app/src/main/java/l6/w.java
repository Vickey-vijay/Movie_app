package l6;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;

/* JADX INFO: compiled from: UPCEANExtensionSupport.java */
/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f63473c = {1, 1, 2};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f63474a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f63475b = new v();

    public y5.i a(int i10, c6.a aVar, int i11) throws NotFoundException {
        int[] iArrM = x.m(aVar, i11, false, f63473c);
        try {
            return this.f63475b.b(i10, aVar, iArrM);
        } catch (ReaderException unused) {
            return this.f63474a.b(i10, aVar, iArrM);
        }
    }
}
