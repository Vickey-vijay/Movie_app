package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4144dh extends Sg {
    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(Q5 q10) {
        Ek ekB;
        Uk uk2;
        C4342l9 c4342l9 = this.f55865a.f56212n;
        Sk sk2 = c4342l9.f57182c;
        if (sk2.f55874g == 0) {
            ekB = sk2.f55871d.b();
            Ek ekB2 = sk2.f55872e.b();
            if ((ekB == null ? -1L : ekB.f55193d) <= (ekB2 != null ? ekB2.f55193d : -1L)) {
                ekB = ekB2;
            }
        } else {
            ekB = sk2.f55873f;
        }
        if (ekB != null) {
            uk2 = new Uk();
            uk2.f55996a = ekB.f55193d;
            long andIncrement = ekB.f55195f.getAndIncrement();
            Vk vk2 = ekB.f55191b;
            vk2.a(Vk.f56038g, Long.valueOf(ekB.f55195f.get()));
            vk2.b();
            uk2.f55997b = andIncrement;
            uk2.f55998c = TimeUnit.MILLISECONDS.toSeconds(ekB.f55199j);
            uk2.f55999d = ekB.f55192c.f55315a;
        } else {
            long j10 = q10.f55782j;
            long jA = sk2.f55869b.a();
            M6 m10 = sk2.f55868a.f56203e;
            Wk wk2 = Wk.BACKGROUND;
            m10.a(jA, wk2, j10);
            Uk uk3 = new Uk();
            uk3.f55996a = jA;
            uk3.f55999d = wk2;
            uk3.f55997b = 0L;
            uk3.f55998c = 0L;
            uk2 = uk3;
        }
        c4342l9.a(q10, uk2);
        return false;
    }

    public C4144dh(Y4 y10) {
        super(y10);
    }
}
