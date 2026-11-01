package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.ignite.m;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public String A;
    public String B;
    public String C;
    public String E;
    public String F;
    public String G;
    public String I;
    public CreativeType M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f18439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f18440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f18441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f18442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f18443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f18444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f18445n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f18446o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public UnitDisplayType f18447p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f18448q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Map f18449r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f18450s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImpressionData f18451t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.fyber.inneractive.sdk.dv.j f18452u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f18455x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Exception f18457z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18453v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f18454w = -1.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18456y = -1;
    public boolean D = false;
    public m H = m.NONE;
    public boolean J = false;
    public long K = 0;
    public boolean L = false;

    public abstract InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, r rVar);

    public final void a(String str) {
        long j10;
        try {
            j10 = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            j10 = 20;
        }
        this.f18433b = j10;
        this.f18432a = TimeUnit.MINUTES.toMillis(j10) + this.f18434c;
    }

    public abstract InneractiveErrorCode b();

    public final boolean a() {
        return (this.H == m.NONE || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.G) || TextUtils.isEmpty(this.I)) ? false : true;
    }
}
