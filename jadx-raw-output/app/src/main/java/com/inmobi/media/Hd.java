package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class Hd implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Jd f22808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pk.n f22809b;

    public Hd(Jd jd2, pk.n nVar) {
        this.f22808a = jd2;
        this.f22809b = nVar;
    }

    @Override // qk.d
    public final Object emit(Object obj, rj.c cVar) {
        AbstractC2753bc abstractC2753bc = (AbstractC2753bc) obj;
        if (abstractC2753bc instanceof Xm) {
            Jd jd2 = this.f22808a;
            Xm xm2 = (Xm) abstractC2753bc;
            pk.n nVar = this.f22809b;
            if (!jd2.f22927c) {
                Long l10 = jd2.f22928d;
                if (l10 != null) {
                    if (xm2.f23806a >= l10.longValue() + jd2.f22925a.f23259b && kotlinx.coroutines.channels.a.i(nVar.n(mj.r.f64562a))) {
                        jd2.f22927c = true;
                        jd2.f22928d = null;
                        jd2.f22926b.set(false);
                    }
                } else {
                    jd2.f22928d = Long.valueOf(xm2.f23806a);
                    jd2.f22926b.set(true);
                }
            }
        } else if ((abstractC2753bc instanceof C2992kn) || (abstractC2753bc instanceof Om)) {
            Jd jd3 = this.f22808a;
            jd3.f22928d = null;
            jd3.f22926b.set(false);
        }
        return mj.r.f64562a;
    }
}
