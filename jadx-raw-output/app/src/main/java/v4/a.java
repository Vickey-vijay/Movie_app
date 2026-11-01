package v4;

import g5.t;
import java.util.List;
import t4.e;

/* JADX INFO: compiled from: DvbDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends t4.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f73049o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        t tVar = new t(list.get(0));
        this.f73049o = new b(tVar.E(), tVar.E());
    }

    @Override // t4.c
    public e v(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f73049o.r();
        }
        return new c(this.f73049o.b(bArr, i10));
    }
}
