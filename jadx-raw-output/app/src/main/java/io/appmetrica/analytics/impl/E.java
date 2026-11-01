package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdRevenue f55152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4531t f55154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ym f55155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Vm f55156e;

    public final Pair a() {
        Map linkedHashMap;
        C4506s c4506s = new C4506s();
        int length = 0;
        for (Pair pair : nj.s.n(mj.h.a(this.f55152a.adNetwork, new C4631x(c4506s)), mj.h.a(this.f55152a.adPlacementId, new C4656y(c4506s)), mj.h.a(this.f55152a.adPlacementName, new C4681z(c4506s)), mj.h.a(this.f55152a.adUnitId, new A(c4506s)), mj.h.a(this.f55152a.adUnitName, new B(c4506s)), mj.h.a(this.f55152a.precision, new C(c4506s)), mj.h.a(this.f55152a.currency.getCurrencyCode(), new D(c4506s)))) {
            String str = (String) pair.getFirst();
            bk.l lVar = (bk.l) pair.getSecond();
            Ym ym2 = this.f55155d;
            ym2.getClass();
            String strA = ym2.a(str);
            byte[] bArrStringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] bArrStringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(strA);
            lVar.invoke(bArrStringToBytesForProtobuf2);
            length += bArrStringToBytesForProtobuf.length - bArrStringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) F.f55211a.get(this.f55152a.adType);
        c4506s.f57632d = num != null ? num.intValue() : 0;
        r rVar = new r();
        BigDecimal bigDecimal = this.f55152a.adRevenue;
        BigInteger bigInteger = AbstractC4664y7.f58015a;
        int i10 = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(AbstractC4664y7.f58015a) <= 0 && bigIntegerUnscaledValue.compareTo(AbstractC4664y7.f58016b) >= 0) {
                break;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i10++;
        }
        Pair pairA = mj.h.a(Long.valueOf(bigIntegerUnscaledValue.longValue()), Integer.valueOf(i10));
        long jLongValue = ((Number) pairA.getFirst()).longValue();
        int iIntValue = ((Number) pairA.getSecond()).intValue();
        rVar.f57582a = jLongValue;
        rVar.f57583b = iIntValue;
        c4506s.f57630b = rVar;
        Map<String, String> map = this.f55152a.payload;
        InterfaceC4531t interfaceC4531t = this.f55154c;
        if (map == null || (linkedHashMap = kotlin.collections.a.B(map)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        String strB = AbstractC4241hb.b(interfaceC4531t.a(linkedHashMap));
        Vm vm2 = this.f55156e;
        vm2.getClass();
        byte[] bArrStringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(vm2.a(strB));
        c4506s.f57639k = bArrStringToBytesForProtobuf3;
        int length2 = (StringUtils.stringToBytesForProtobuf(strB).length - bArrStringToBytesForProtobuf3.length) + length;
        if (this.f55153b) {
            c4506s.f57629a = "autocollected".getBytes(lk.c.f63591b);
        }
        return mj.h.a(MessageNano.toByteArray(c4506s), Integer.valueOf(length2));
    }

    public E(AdRevenue adRevenue, boolean z10, C4227gn c4227gn, PublicLogger publicLogger) {
        this.f55152a = adRevenue;
        this.f55153b = z10;
        this.f55154c = c4227gn;
        this.f55155d = new Ym(100, "ad revenue strings", publicLogger);
        this.f55156e = new Vm(30720, "ad revenue payload", publicLogger);
    }
}
