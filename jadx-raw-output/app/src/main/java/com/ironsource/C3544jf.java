package com.ironsource;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.ironsource.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3544jf implements H3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29287d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f29288e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f29289f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N8 f29292c;

    /* JADX INFO: renamed from: com.ironsource.jf$a */
    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }
    }

    public C3544jf(Context context, String str, N8 n10) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, "baseName");
        ck.p.j(n10, "sdkSharedPref");
        this.f29290a = context;
        this.f29291b = str;
        this.f29292c = n10;
    }

    @Override // com.ironsource.H3
    public void a(String str, int i10) {
        ck.p.j(str, "identifier");
        this.f29292c.a(this.f29290a, new C3562kf(str, this.f29291b + ".show_count_show_counter").a(), i10);
    }

    @Override // com.ironsource.H3
    public Long b(String str) {
        ck.p.j(str, "identifier");
        return a(Long.valueOf(this.f29292c.b(this.f29290a, new C3562kf(str, this.f29291b + ".pacing_last_show_time").a(), -1L)));
    }

    @Override // com.ironsource.H3
    public Integer c(String str) {
        ck.p.j(str, "identifier");
        return a(Integer.valueOf(this.f29292c.b(this.f29290a, new C3562kf(str, this.f29291b + ".show_count_show_counter").a(), -1)));
    }

    @Override // com.ironsource.H3
    public void a(String str, long j10) {
        ck.p.j(str, "identifier");
        this.f29292c.a(this.f29290a, new C3562kf(str, this.f29291b + ".pacing_last_show_time").a(), j10);
    }

    @Override // com.ironsource.H3
    public void b(String str, long j10) {
        ck.p.j(str, "identifier");
        this.f29292c.a(this.f29290a, new C3562kf(str, this.f29291b + ".show_count_threshold").a(), j10);
    }

    public /* synthetic */ C3544jf(Context context, String str, N8 n10, int i10, ck.i iVar) {
        this(context, str, (i10 & 4) != 0 ? new Ie() : n10);
    }

    @Override // com.ironsource.H3
    public Long a(String str) {
        ck.p.j(str, "identifier");
        return a(Long.valueOf(this.f29292c.b(this.f29290a, new C3562kf(str, this.f29291b + ".show_count_threshold").a(), -1L)));
    }

    private final Long a(Long l10) {
        if (l10 != null && l10.longValue() == -1) {
            return null;
        }
        return l10;
    }

    private final Integer a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }
}
