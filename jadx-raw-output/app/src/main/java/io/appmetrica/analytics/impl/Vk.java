package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Vk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f56035d = "SESSION_SLEEP_START";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f56036e = "SESSION_LAST_EVENT_OFFSET";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f56037f = "SESSION_ID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f56038g = "SESSION_COUNTER_ID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f56039h = "SESSION_INIT_TIME";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f56040i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Xe f56042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4215gb f56043c;

    public final Vk a(long j10) {
        a(f56039h, Long.valueOf(j10));
        return this;
    }

    public final Vk b(long j10) {
        a(f56036e, Long.valueOf(j10));
        return this;
    }

    @Nullable
    public final Long c() {
        return this.f56043c.a(f56039h);
    }

    public final Vk d(long j10) {
        a(f56037f, Long.valueOf(j10));
        return this;
    }

    @Nullable
    public final Long e() {
        return this.f56043c.a(f56038g);
    }

    public final Vk a(boolean z10) {
        a(f56040i, Boolean.valueOf(z10));
        return this;
    }

    public final void b() {
        this.f56042b.e(this.f56041a, this.f56043c.toString());
        this.f56042b.b();
    }

    public final Vk c(long j10) {
        a(f56038g, Long.valueOf(j10));
        return this;
    }

    @Nullable
    public final Long d() {
        return this.f56043c.a(f56036e);
    }

    public final Vk e(long j10) {
        a(f56035d, Long.valueOf(j10));
        return this;
    }

    @Nullable
    public final Long f() {
        return this.f56043c.a(f56037f);
    }

    @Nullable
    public final Long g() {
        return this.f56043c.a(f56035d);
    }

    public final boolean h() {
        return this.f56043c.length() > 0;
    }

    @Nullable
    public final Boolean i() {
        C4215gb c4215gb = this.f56043c;
        c4215gb.getClass();
        try {
            return Boolean.valueOf(c4215gb.getBoolean(f56040i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public Vk(@NonNull Xe xe2, @NonNull String str) {
        this.f56042b = xe2;
        this.f56041a = str;
        C4215gb c4215gb = new C4215gb();
        try {
            String strH = xe2.h(str);
            if (!TextUtils.isEmpty(strH)) {
                c4215gb = new C4215gb(strH);
            }
        } catch (Throwable unused) {
        }
        this.f56043c = c4215gb;
    }

    public final void a(String str, Object obj) {
        try {
            this.f56043c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.f56043c = new C4215gb();
        b();
    }
}
