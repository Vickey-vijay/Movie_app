package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class N3 extends Q5 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashMap f55601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Ym f55602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Vm f55603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Vm f55604t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C4052a3 f55605u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Ym f55606v;

    @VisibleForTesting
    public N3(@NonNull PublicLogger publicLogger) {
        this.f55601q = new HashMap();
        a(publicLogger);
    }

    public final void a(String str, String str2, M3 m10) {
        if (!StringUtils.equalsNullSafety(str, str2)) {
            this.f55601q.put(m10, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        } else {
            this.f55601q.remove(m10);
        }
        int iIntValue = 0;
        Iterator it = this.f55601q.values().iterator();
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f55779g = iIntValue;
    }

    public static Q5 b(String str, String str2) {
        Q5 q10 = new Q5("", 0);
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        q10.f55776d = 5376;
        q10.a(str, str2);
        return q10;
    }

    public static Q5 n() {
        Q5 q10 = new Q5("", 0);
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        q10.f55776d = 5632;
        return q10;
    }

    public static Q5 o() {
        Q5 q10 = new Q5("", 0);
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        q10.f55776d = 40961;
        return q10;
    }

    @Override // io.appmetrica.analytics.impl.Q5
    @NonNull
    public final void c(@Nullable String str) {
        Ym ym2 = this.f55606v;
        ym2.getClass();
        this.f55780h = ym2.a(str);
    }

    public final String d(String str) {
        Ym ym2 = this.f55602r;
        ym2.getClass();
        String strA = ym2.a(str);
        a(str, strA, M3.NAME);
        return strA;
    }

    public final String e(String str) {
        Vm vm2 = this.f55603s;
        vm2.getClass();
        String strA = vm2.a(str);
        a(str, strA, M3.VALUE);
        return strA;
    }

    public final N3 f(@NonNull String str) {
        Vm vm2 = this.f55604t;
        vm2.getClass();
        String strA = vm2.a(str);
        a(str, strA, M3.VALUE);
        this.f55774b = strA;
        return this;
    }

    @NonNull
    public final HashMap<M3, Integer> p() {
        return this.f55601q;
    }

    @Override // io.appmetrica.analytics.impl.Q5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(@Nullable String str) {
        this.f55773a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.Q5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(@Nullable String str) {
        this.f55774b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.Q5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final void setValueBytes(@Nullable byte[] bArr) {
        a(bArr);
    }

    public N3(String str, int i10, @NonNull PublicLogger publicLogger) {
        this("", str, i10, publicLogger);
    }

    public N3(String str, String str2, int i10, @NonNull PublicLogger publicLogger) {
        this(str, str2, i10, 0, publicLogger);
    }

    public N3(String str, String str2, int i10, int i11, @NonNull PublicLogger publicLogger) {
        this.f55601q = new HashMap();
        a(publicLogger);
        this.f55774b = e(str);
        this.f55773a = d(str2);
        setType(i10);
        setCustomType(i11);
    }

    public final N3 a(@NonNull HashMap<M3, Integer> map) {
        this.f55601q = map;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.f55602r = new Ym(1000, "event name", publicLogger);
        this.f55603s = new Vm(245760, "event value", publicLogger);
        this.f55604t = new Vm(1024000, "event extended value", publicLogger);
        this.f55605u = new C4052a3(245760, "event value bytes", publicLogger);
        this.f55606v = new Ym(200, "user profile id", publicLogger);
    }

    public N3(byte[] bArr, @Nullable String str, int i10, @NonNull PublicLogger publicLogger) {
        this.f55601q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.f55773a = d(str);
        setType(i10);
    }

    public final void a(byte[] bArr) {
        C4052a3 c4052a3 = this.f55605u;
        c4052a3.getClass();
        byte[] bArrA = c4052a3.a(bArr);
        M3 m10 = M3.VALUE;
        if (bArr.length != bArrA.length) {
            this.f55601q.put(m10, Integer.valueOf(bArr.length - bArrA.length));
        } else {
            this.f55601q.remove(m10);
        }
        int iIntValue = 0;
        Iterator it = this.f55601q.values().iterator();
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f55779g = iIntValue;
        super.setValueBytes(bArrA);
    }

    public static Q5 a(@NonNull C4305jo c4305jo) {
        Q5 q5O = o();
        q5O.setValue(new String(Base64.encode(MessageNano.toByteArray(c4305jo), 0)));
        return q5O;
    }

    public static N3 a(PublicLogger publicLogger, Pi pi2) {
        int length;
        N3 n10 = new N3(publicLogger);
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        n10.f55776d = 40976;
        Ni ni2 = new Ni();
        ni2.f55647b = pi2.f55739a.currency.getCurrencyCode().getBytes();
        ni2.f55651f = pi2.f55739a.priceMicros;
        ni2.f55648c = StringUtils.stringToBytesForProtobuf(new Ym(200, "revenue productID", pi2.f55743e).a(pi2.f55739a.productID));
        ni2.f55646a = ((Integer) WrapUtils.getOrDefault(pi2.f55739a.quantity, 1)).intValue();
        Vm vm2 = pi2.f55740b;
        String str = pi2.f55739a.payload;
        vm2.getClass();
        ni2.f55649d = StringUtils.stringToBytesForProtobuf(vm2.a(str));
        if (mo.a(pi2.f55739a.receipt)) {
            Ii ii2 = new Ii();
            String str2 = (String) pi2.f55741c.a(pi2.f55739a.receipt.data);
            length = true ^ StringUtils.equalsNullSafety(pi2.f55739a.receipt.data, str2) ? pi2.f55739a.receipt.data.length() : 0;
            String str3 = (String) pi2.f55742d.a(pi2.f55739a.receipt.signature);
            ii2.f55356a = StringUtils.stringToBytesForProtobuf(str2);
            ii2.f55357b = StringUtils.stringToBytesForProtobuf(str3);
            ni2.f55650e = ii2;
        } else {
            length = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(ni2), Integer.valueOf(length));
        n10.f55774b = n10.e(new String(Base64.encode((byte[]) pair.first, 0)));
        n10.f55779g = ((Integer) pair.second).intValue();
        return n10;
    }

    public static N3 a(PublicLogger publicLogger, E e10) {
        N3 n10 = new N3(publicLogger);
        EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
        n10.f55776d = 40977;
        kotlin.Pair pairA = e10.a();
        n10.f55774b = n10.e(new String(Base64.encode((byte[]) pairA.getFirst(), 0)));
        n10.f55779g = ((Integer) pairA.getSecond()).intValue();
        return n10;
    }
}
