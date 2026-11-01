package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.j;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f16113m;

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(j jVar, String str) {
        return jVar.b(str, this.f16112l);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(j jVar, String str) {
        String str2 = this.f16112l;
        jVar.getClass();
        String strA = j.a(str, "min", "rat", "bidding", j.e(str2));
        String strA2 = j.a(str, "min", "rat", "bidding", "all_mediators");
        "read".equalsIgnoreCase(str);
        Integer numA = jVar.a(strA2);
        int iIntValue = numA != null ? numA.intValue() : 5000;
        Integer numA2 = jVar.a(strA);
        return numA2 != null ? numA2.intValue() : iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(j jVar, String str) {
        String str2 = this.f16112l;
        jVar.getClass();
        String strA = j.a(str, "rat", "bidding", "perc", j.e(str2));
        String strA2 = j.a(str, "rat", "bidding", "perc", "all_mediators");
        "read".equalsIgnoreCase(str);
        Integer numA = jVar.a(strA2);
        int iIntValue = numA != null ? numA.intValue() : 15;
        Integer numA2 = jVar.a(strA);
        return numA2 != null ? numA2.intValue() : iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(j jVar) {
        String str = this.f16112l;
        jVar.getClass();
        String strA = j.a("timeout", "threshold", "rat", "bidding", j.e(str));
        Integer numA = jVar.a(j.a("timeout", "threshold", "rat", "bidding", "all_mediators"));
        int iIntValue = numA != null ? numA.intValue() : com.safedk.android.internal.d.f44769a;
        Integer numA2 = jVar.a(strA);
        return numA2 != null ? numA2.intValue() : iIntValue;
    }

    public c(String str, j jVar, String str2) {
        super(str, jVar, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final void d(j jVar, String str) {
        boolean zBooleanValue;
        super.d(jVar, str);
        Boolean boolC = jVar.c("reverse_retries");
        if (boolC != null) {
            zBooleanValue = boolC.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.f16106g = zBooleanValue;
        String strA = j.a("retry_interval", "rat", "bidding");
        int iIntValue = 100;
        Integer numA = jVar.a(j.a("retry_interval", "all_mediators"));
        if (numA != null) {
            iIntValue = numA.intValue();
        }
        Integer numA2 = jVar.a(strA);
        if (numA2 != null) {
            iIntValue = numA2.intValue();
        }
        this.f16104e = iIntValue;
        this.f16102c = (this.f16109i + this.f16108h) - (iIntValue + this.f16105f);
        String strA2 = j.a("bidding", "irat", j.e(this.f16112l));
        int iIntValue2 = 10000;
        Integer numA3 = jVar.a(j.a("bidding", "irat", "all_mediators"));
        if (numA3 != null) {
            iIntValue2 = numA3.intValue();
        }
        Integer numA4 = jVar.a(strA2);
        if (numA4 != null) {
            iIntValue2 = numA4.intValue();
        }
        this.f16103d = iIntValue2;
        this.f16113m = ((double) Math.min(this.f16111k, this.f16110j)) / ((double) Math.max(this.f16111k, this.f16110j));
        b(this.f16103d);
        this.f16100a = Math.max(0, a());
        if (this.f16106g) {
            IAlog.a("%s : RequestBiddingAdTimeout shouldReverseRetries - reversing timeouts", IAlog.a(this));
            a(0);
        }
        IAlog.a("%s : RequestBiddingAdTimeout init timeouts, total retries: %d", IAlog.a(this), Integer.valueOf(this.f16100a));
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c() {
        return this.f16104e;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(int i10) {
        if (this.f16106g) {
            i10 = this.f16100a - i10;
        }
        int i11 = (this.f16101b * i10) + this.f16103d;
        IAlog.a("%s : RequestBiddingAdTimeout resolveTimeoutForRetry, timeout: %d ms for retry: %d", IAlog.a(this), Integer.valueOf(i11), Integer.valueOf(i10));
        b(i11);
        return i11;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b() {
        return this.f16100a;
    }

    public final void b(int i10) {
        double d10 = this.f16113m;
        if (d10 == 1.0d || d10 == 0.0d) {
            IAlog.a("%s : RequestBiddingAdTimeout Ratio: %f, connection and read timeouts should be divided in equal proportions", IAlog.a(this), Double.valueOf(this.f16113m));
            this.f16113m = 0.5d;
        }
        int i11 = (int) (((double) i10) * this.f16113m);
        this.f16108h = i11;
        this.f16109i = i10 - i11;
        IAlog.a("%s : RequestBiddingAdTimeout Update timeouts connection: %d read: %d", IAlog.a(this), Integer.valueOf(this.f16109i), Integer.valueOf(this.f16108h));
    }
}
