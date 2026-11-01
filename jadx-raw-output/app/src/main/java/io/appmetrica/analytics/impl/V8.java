package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class V8 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map f56010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final V8 f56011i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4670yd f56012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uo f56013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4690z8 f56014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4566u9 f56015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Wb f56016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Vd f56017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final O9 f56018g;

    public V8(U8 u10) {
        this(u10.f55967a, u10.f55968b, u10.f55969c, u10.f55970d, u10.f55971e, u10.f55972f, u10.f55973g);
    }

    static {
        HashMap map = new HashMap();
        map.put(EnumC4162ea.FIRST_OCCURRENCE, 1);
        map.put(EnumC4162ea.NON_FIRST_OCCURENCE, 0);
        map.put(EnumC4162ea.UNKNOWN, -1);
        f56010h = Collections.unmodifiableMap(map);
        f56011i = new V8(new Si(), new C4072an(), new C4141de(), new Ri(), new C4317ka(), new C4343la(), new C4291ja());
    }

    public final C4187f9 a(O8 o10, C4350lh c4350lh) {
        C4187f9 c4187f9 = new C4187f9();
        C4161e9 c4161e9A = this.f56017f.a(o10.f55684l, o10.f55685m);
        C4058a9 c4058a9A = this.f56016e.a(o10.f55679g);
        if (c4161e9A != null) {
            c4187f9.f56740g = c4161e9A;
        }
        if (c4058a9A != null) {
            c4187f9.f56739f = c4058a9A;
        }
        String strA = this.f56012a.a(o10.f55673a);
        if (strA != null) {
            c4187f9.f56737d = strA;
        }
        c4187f9.f56738e = this.f56013b.a(o10, c4350lh);
        String str = o10.f55682j;
        if (str != null) {
            c4187f9.f56741h = str;
        }
        Integer numA = this.f56015d.a(o10);
        if (numA != null) {
            c4187f9.f56736c = numA.intValue();
        }
        Long l10 = o10.f55675c;
        if (l10 != null) {
            c4187f9.f56734a = l10.longValue();
        }
        Long l11 = o10.f55676d;
        if (l11 != null) {
            c4187f9.f56747n = l11.longValue();
        }
        Long l12 = o10.f55677e;
        if (l12 != null) {
            c4187f9.f56748o = l12.longValue();
        }
        Long l13 = o10.f55678f;
        if (l13 != null) {
            c4187f9.f56735b = l13.longValue();
        }
        Integer num = o10.f55683k;
        if (num != null) {
            c4187f9.f56742i = num.intValue();
        }
        c4187f9.f56743j = this.f56014c.a(o10.f55687o);
        C4288j7 c4288j7 = o10.f55679g;
        c4187f9.f56744k = c4288j7 != null ? new C4262i6().a(c4288j7.f56995a) : -1;
        String str2 = o10.f55686n;
        if (str2 != null) {
            c4187f9.f56745l = str2.getBytes();
        }
        EnumC4162ea enumC4162ea = o10.f55688p;
        Integer num2 = enumC4162ea != null ? (Integer) f56010h.get(enumC4162ea) : null;
        if (num2 != null) {
            c4187f9.f56746m = num2.intValue();
        }
        EnumC4392n9 enumC4392n9 = o10.f55689q;
        if (enumC4392n9 != null) {
            int iOrdinal = enumC4392n9.ordinal();
            if (iOrdinal == 0) {
                c4187f9.f56749p = 0;
            } else if (iOrdinal == 1) {
                c4187f9.f56749p = 1;
            } else if (iOrdinal == 2) {
                c4187f9.f56749p = 2;
            }
        }
        Boolean bool = o10.f55690r;
        if (bool != null) {
            c4187f9.f56750q = bool.booleanValue();
        }
        Integer num3 = o10.f55691s;
        if (num3 != null) {
            c4187f9.f56751r = num3.intValue();
        }
        c4187f9.f56752s = ((C4291ja) this.f56018g).a(o10.f55692t);
        return c4187f9;
    }

    public V8(InterfaceC4670yd interfaceC4670yd, uo uoVar, InterfaceC4690z8 interfaceC4690z8, InterfaceC4566u9 interfaceC4566u9, Wb wb2, Vd vd2, O9 o10) {
        this.f56012a = interfaceC4670yd;
        this.f56013b = uoVar;
        this.f56014c = interfaceC4690z8;
        this.f56015d = interfaceC4566u9;
        this.f56016e = wb2;
        this.f56017f = vd2;
        this.f56018g = o10;
    }

    public static U8 a() {
        return new U8(f56011i);
    }
}
