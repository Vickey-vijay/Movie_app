package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4108c7 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4372me f56467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4314k7 f56468b;

    /* JADX WARN: Multi-variable type inference failed */
    public C4108c7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4390n7 fromModel(C4159e7 c4159e7) {
        C4390n7 c4390n7 = new C4390n7();
        Integer num = c4159e7.f56639a;
        if (num != null) {
            c4390n7.f57315a = num.intValue();
        }
        String str = c4159e7.f56640b;
        if (str != null) {
            c4390n7.f57316b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c4159e7.f56641c;
        if (str2 != null) {
            c4390n7.f57317c = StringUtils.correctIllFormedString(str2);
        }
        Long l10 = c4159e7.f56642d;
        if (l10 != null) {
            c4390n7.f57318d = l10.longValue();
        }
        C4288j7 c4288j7 = c4159e7.f56643e;
        if (c4288j7 != null) {
            c4390n7.f57319e = this.f56468b.fromModel(c4288j7);
        }
        String str3 = c4159e7.f56644f;
        if (str3 != null) {
            c4390n7.f57320f = str3;
        }
        String str4 = c4159e7.f56645g;
        if (str4 != null) {
            c4390n7.f57321g = str4;
        }
        Long l11 = c4159e7.f56646h;
        if (l11 != null) {
            c4390n7.f57322h = l11.longValue();
        }
        Integer num2 = c4159e7.f56647i;
        if (num2 != null) {
            c4390n7.f57323i = num2.intValue();
        }
        Integer num3 = c4159e7.f56648j;
        if (num3 != null) {
            c4390n7.f57324j = num3.intValue();
        }
        String str5 = c4159e7.f56649k;
        if (str5 != null) {
            c4390n7.f57325k = str5;
        }
        J8 j10 = c4159e7.f56650l;
        if (j10 != null) {
            c4390n7.f57326l = j10.f55423a;
        }
        String str6 = c4159e7.f56651m;
        if (str6 != null) {
            c4390n7.f57327m = str6;
        }
        EnumC4162ea enumC4162ea = c4159e7.f56652n;
        if (enumC4162ea != null) {
            c4390n7.f57328n = enumC4162ea.f56666a;
        }
        EnumC4392n9 enumC4392n9 = c4159e7.f56653o;
        if (enumC4392n9 != null) {
            c4390n7.f57329o = enumC4392n9.f57340a;
        }
        Boolean bool = c4159e7.f56654p;
        if (bool != null) {
            c4390n7.f57330p = this.f56467a.fromModel(Boolean.valueOf(bool.booleanValue())).intValue();
        }
        Integer num4 = c4159e7.f56655q;
        if (num4 != null) {
            c4390n7.f57331q = num4.intValue();
        }
        byte[] bArr = c4159e7.f56656r;
        if (bArr != null) {
            c4390n7.f57332r = bArr;
        }
        return c4390n7;
    }

    public C4108c7(C4372me c4372me, C4314k7 c4314k7) {
        this.f56467a = c4372me;
        this.f56468b = c4314k7;
    }

    public /* synthetic */ C4108c7(C4372me c4372me, C4314k7 c4314k7, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new C4372me() : c4372me, (i10 & 2) != 0 ? new C4314k7(null, 1, null) : c4314k7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4159e7 toModel(C4390n7 c4390n7) {
        EnumC4392n9 enumC4392n9;
        C4390n7 c4390n8 = new C4390n7();
        Integer numValueOf = Integer.valueOf(c4390n7.f57315a);
        Integer num = numValueOf.intValue() != c4390n8.f57315a ? numValueOf : null;
        String str = c4390n7.f57316b;
        String str2 = ck.p.e(str, c4390n8.f57316b) ^ true ? str : null;
        String str3 = c4390n7.f57317c;
        String str4 = ck.p.e(str3, c4390n8.f57317c) ^ true ? str3 : null;
        Long lValueOf = Long.valueOf(c4390n7.f57318d);
        Long l10 = lValueOf.longValue() != c4390n8.f57318d ? lValueOf : null;
        C4288j7 model = this.f56468b.toModel(c4390n7.f57319e);
        String str5 = c4390n7.f57320f;
        String str6 = ck.p.e(str5, c4390n8.f57320f) ^ true ? str5 : null;
        String str7 = c4390n7.f57321g;
        String str8 = ck.p.e(str7, c4390n8.f57321g) ^ true ? str7 : null;
        Long lValueOf2 = Long.valueOf(c4390n7.f57322h);
        if (lValueOf2.longValue() == c4390n8.f57322h) {
            lValueOf2 = null;
        }
        Integer numValueOf2 = Integer.valueOf(c4390n7.f57323i);
        Integer num2 = numValueOf2.intValue() != c4390n8.f57323i ? numValueOf2 : null;
        Integer numValueOf3 = Integer.valueOf(c4390n7.f57324j);
        Integer num3 = numValueOf3.intValue() != c4390n8.f57324j ? numValueOf3 : null;
        String str9 = c4390n7.f57325k;
        String str10 = ck.p.e(str9, c4390n8.f57325k) ^ true ? str9 : null;
        Integer numValueOf4 = Integer.valueOf(c4390n7.f57326l);
        if (numValueOf4.intValue() == c4390n8.f57326l) {
            numValueOf4 = null;
        }
        J8 j8A = numValueOf4 != null ? J8.a(Integer.valueOf(numValueOf4.intValue())) : null;
        String str11 = c4390n7.f57327m;
        String str12 = ck.p.e(str11, c4390n8.f57327m) ^ true ? str11 : null;
        Integer numValueOf5 = Integer.valueOf(c4390n7.f57328n);
        if (numValueOf5.intValue() == c4390n8.f57328n) {
            numValueOf5 = null;
        }
        EnumC4162ea enumC4162eaA = numValueOf5 != null ? EnumC4162ea.a(Integer.valueOf(numValueOf5.intValue())) : null;
        Integer numValueOf6 = Integer.valueOf(c4390n7.f57329o);
        if (numValueOf6.intValue() == c4390n8.f57329o) {
            numValueOf6 = null;
        }
        if (numValueOf6 != null) {
            int iIntValue = numValueOf6.intValue();
            EnumC4392n9[] enumC4392n9ArrValues = EnumC4392n9.values();
            int length = enumC4392n9ArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    EnumC4392n9 enumC4392n10 = enumC4392n9ArrValues[i10];
                    EnumC4392n9[] enumC4392n9Arr = enumC4392n9ArrValues;
                    if (enumC4392n10.f57340a == iIntValue) {
                        enumC4392n9 = enumC4392n10;
                        break;
                    }
                    i10++;
                    enumC4392n9ArrValues = enumC4392n9Arr;
                } else {
                    enumC4392n9 = EnumC4392n9.NATIVE;
                    break;
                }
            }
        } else {
            enumC4392n9 = null;
        }
        Boolean boolA = this.f56467a.a(c4390n7.f57330p);
        Integer numValueOf7 = Integer.valueOf(c4390n7.f57331q);
        Integer num4 = numValueOf7.intValue() != c4390n8.f57331q ? numValueOf7 : null;
        byte[] bArr = c4390n7.f57332r;
        return new C4159e7(num, str2, str4, l10, model, str6, str8, lValueOf2, num2, num3, str10, j8A, str12, enumC4162eaA, enumC4392n9, boolA, num4, Arrays.equals(bArr, c4390n8.f57332r) ^ true ? bArr : null);
    }
}
