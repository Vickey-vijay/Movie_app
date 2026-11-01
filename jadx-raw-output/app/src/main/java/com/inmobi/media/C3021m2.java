package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3021m2 implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3170s2 f24796a;

    public C3021m2(nk.l0 l0Var, AbstractC3170s2 abstractC3170s2) {
        this.f24796a = abstractC3170s2;
    }

    @Override // qk.d
    public final Object emit(Object obj, rj.c cVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.f24796a.getClass();
        this.f24796a.f25293e.set(zBooleanValue);
        AbstractC3170s2 abstractC3170s2 = this.f24796a;
        if (abstractC3170s2.f25293e.get()) {
            C3284wg c3284wg = abstractC3170s2.c().f22435a;
            c3284wg.f25651f.set(false);
            c3284wg.a();
        } else {
            C3284wg c3284wg2 = abstractC3170s2.c().f22435a;
            c3284wg2.f25647b.setValue(Mn.HIDDEN);
            c3284wg2.f25651f.set(true);
            H6.a(c3284wg2.f25650e);
            c3284wg2.f25650e = null;
        }
        AbstractC3170s2 abstractC3170s3 = this.f24796a;
        if (abstractC3170s3.f25293e.get()) {
            abstractC3170s3.f25295g.a();
        } else {
            abstractC3170s3.f25295g.b();
        }
        return mj.r.f64562a;
    }
}
