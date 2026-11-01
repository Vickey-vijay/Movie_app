package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class ee0 implements bk1 {
    @Override // yads.bk1
    public final dk1 a(ak1 ak1Var) {
        int i10 = ib3.f78556a;
        if (i10 < 23 || i10 < 31) {
            return new d53().a(ak1Var);
        }
        int iD = ht1.d(ak1Var.f75544c.f80429m);
        ih1.c("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + ib3.d(iD));
        return new pj(iD).a(ak1Var);
    }
}
