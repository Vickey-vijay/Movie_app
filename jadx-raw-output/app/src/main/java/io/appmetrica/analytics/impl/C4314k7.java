package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4314k7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4372me f57081a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4314k7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4415o7 fromModel(C4288j7 c4288j7) {
        C4415o7 c4415o7 = new C4415o7();
        Boolean bool = c4288j7.f56995a;
        if (bool != null) {
            c4415o7.f57383a = this.f57081a.fromModel(Boolean.valueOf(bool.booleanValue())).intValue();
        }
        Double d10 = c4288j7.f56997c;
        if (d10 != null) {
            c4415o7.f57385c = d10.doubleValue();
        }
        Double d11 = c4288j7.f56996b;
        if (d11 != null) {
            c4415o7.f57384b = d11.doubleValue();
        }
        Long l10 = c4288j7.f57002h;
        if (l10 != null) {
            c4415o7.f57390h = l10.longValue();
        }
        Integer num = c4288j7.f57000f;
        if (num != null) {
            c4415o7.f57388f = num.intValue();
        }
        Integer num2 = c4288j7.f56999e;
        if (num2 != null) {
            c4415o7.f57387e = num2.intValue();
        }
        Integer num3 = c4288j7.f57001g;
        if (num3 != null) {
            c4415o7.f57389g = num3.intValue();
        }
        Integer num4 = c4288j7.f56998d;
        if (num4 != null) {
            c4415o7.f57386d = num4.intValue();
        }
        String str = c4288j7.f57003i;
        if (str != null) {
            c4415o7.f57391i = str;
        }
        String str2 = c4288j7.f57004j;
        if (str2 != null) {
            c4415o7.f57392j = str2;
        }
        return c4415o7;
    }

    public C4314k7(C4372me c4372me) {
        this.f57081a = c4372me;
    }

    public /* synthetic */ C4314k7(C4372me c4372me, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new C4372me() : c4372me);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4288j7 toModel(C4415o7 c4415o7) {
        if (c4415o7 == null) {
            return new C4288j7(null, null, null, null, null, null, null, null, null, null);
        }
        C4415o7 c4415o8 = new C4415o7();
        Boolean boolA = this.f57081a.a(c4415o7.f57383a);
        Double dValueOf = Double.valueOf(c4415o7.f57385c);
        if (!(!(dValueOf.doubleValue() == c4415o8.f57385c))) {
            dValueOf = null;
        }
        Double dValueOf2 = Double.valueOf(c4415o7.f57384b);
        if (!(!(dValueOf2.doubleValue() == c4415o8.f57384b))) {
            dValueOf2 = null;
        }
        Long lValueOf = Long.valueOf(c4415o7.f57390h);
        Long l10 = lValueOf.longValue() != c4415o8.f57390h ? lValueOf : null;
        Integer numValueOf = Integer.valueOf(c4415o7.f57388f);
        Integer num = numValueOf.intValue() != c4415o8.f57388f ? numValueOf : null;
        Integer numValueOf2 = Integer.valueOf(c4415o7.f57387e);
        Integer num2 = numValueOf2.intValue() != c4415o8.f57387e ? numValueOf2 : null;
        Integer numValueOf3 = Integer.valueOf(c4415o7.f57389g);
        Integer num3 = numValueOf3.intValue() != c4415o8.f57389g ? numValueOf3 : null;
        Integer numValueOf4 = Integer.valueOf(c4415o7.f57386d);
        Integer num4 = numValueOf4.intValue() != c4415o8.f57386d ? numValueOf4 : null;
        String str = c4415o7.f57391i;
        String str2 = ck.p.e(str, c4415o8.f57391i) ^ true ? str : null;
        String str3 = c4415o7.f57392j;
        return new C4288j7(boolA, dValueOf2, dValueOf, num4, num2, num, num3, l10, str2, ck.p.e(str3, c4415o8.f57392j) ^ true ? str3 : null);
    }
}
