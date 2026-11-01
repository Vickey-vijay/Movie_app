package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.ironsource.Q6;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f18614a = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f18615b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f18616c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f18617d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1 f18618e = new p1(this);

    public final String a() {
        if (!TextUtils.isEmpty(this.f18615b)) {
            return this.f18615b;
        }
        if (this.f18618e != null && this.f18614a.get()) {
            Handler handler = r.f18607b;
            handler.removeCallbacks(this.f18618e);
            handler.postDelayed(this.f18618e, 50L);
        }
        return System.getProperty("http.agent");
    }

    public final void b() {
        if (this.f18616c == null || !TextUtils.isEmpty(this.f18615b)) {
            return;
        }
        this.f18615b = this.f18616c.getSharedPreferences("fyber.ua", 0).getString(Q6.f27422d0, null);
        if (!TextUtils.isEmpty(this.f18615b)) {
            IAlog.a("UserAgentProvider | populated user agent from shared prefs", new Object[0]);
            this.f18617d.compareAndSet(false, true);
        }
        r.f18606a.execute(new r1(this));
    }

    public final void c() {
        Context context = this.f18616c;
        if (context != null) {
            String defaultUserAgent = null;
            try {
                defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
                this.f18614a.set(false);
            }
            if (TextUtils.isEmpty(defaultUserAgent)) {
                return;
            }
            this.f18615b = defaultUserAgent;
            if (!TextUtils.isEmpty(this.f18615b)) {
                IAlog.a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
                this.f18617d.compareAndSet(false, true);
            }
            r.f18606a.execute(new q1(this, defaultUserAgent));
        }
    }
}
