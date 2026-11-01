package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class I9 extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J9 f55342b;

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(Q5 q10) {
        long jOptLong;
        J9 j10 = this.f55342b;
        C9 c10 = j10.f55424a.t().B;
        Long lValueOf = c10 != null ? Long.valueOf(c10.f55085a) : null;
        if (lValueOf != null) {
            yo yoVar = j10.f55424a.f56218t;
            synchronized (yoVar) {
                jOptLong = yoVar.f58037a.a().optLong("external_attribution_window_start", -1L);
            }
            if (jOptLong < 0) {
                jOptLong = j10.f55425b.currentTimeMillis();
                j10.f55424a.f56218t.a(jOptLong);
            }
            if (j10.f55425b.currentTimeMillis() - jOptLong <= lValueOf.longValue()) {
                B9 b10 = (B9) MessageNano.mergeFrom(new B9(), q10.getValueBytes());
                int i10 = b10.f55013a;
                String str = new String(b10.f55014b, lk.c.f63591b);
                String str2 = this.f55342b.f55424a.f56201c.k().get(Integer.valueOf(i10));
                if (str2 != null) {
                    try {
                        if (!(!JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2)))) {
                            this.f55865a.f56211m.info("Ignoring attribution of type `" + L9.a(i10) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                J9 j11 = this.f55342b;
                Map<Integer, String> mapK = j11.f55424a.f56201c.k();
                mapK.put(Integer.valueOf(i10), str);
                j11.f55424a.f56201c.b(mapK);
                this.f55865a.f56211m.info("Handling attribution of type `" + L9.a(i10) + '`', new Object[0]);
                return false;
            }
        }
        this.f55865a.f56211m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }

    public I9(Y4 y10, TimeProvider timeProvider) {
        super(y10);
        this.f55342b = new J9(y10, timeProvider);
    }
}
