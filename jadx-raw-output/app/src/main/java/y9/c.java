package y9;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import g5.k0;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Map;
import k4.f0;
import k4.r;

/* JADX INFO: compiled from: ExoMediaSourceHelper.java */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f75322e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f75324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HttpDataSource.b f75325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Cache f75326d;

    public r e(String str, Map<String, String> map) {
        return f(str, map, false);
    }

    public static c d(Context context) {
        if (f75322e == null) {
            synchronized (c.class) {
                if (f75322e == null) {
                    f75322e = new c(context);
                }
            }
        }
        return f75322e;
    }

    public final com.google.android.exoplayer2.upstream.a.InterfaceC0188a a() {
        if (this.f75326d == null) {
            this.f75326d = h();
        }
        return new com.google.android.exoplayer2.upstream.cache.b(this.f75326d, b(), 2);
    }

    public final com.google.android.exoplayer2.upstream.a.InterfaceC0188a b() {
        return new com.google.android.exoplayer2.upstream.c(this.f75324b, c());
    }

    public final com.google.android.exoplayer2.upstream.a.InterfaceC0188a c() {
        if (this.f75325c == null) {
            this.f75325c = new com.google.android.exoplayer2.upstream.e(this.f75323a, null, 8000, 8000, true);
        }
        return this.f75325c;
    }

    public final Cache h() {
        return new com.google.android.exoplayer2.upstream.cache.f(new File(this.f75324b.getExternalCacheDir(), "exo-video-cache"), new com.google.android.exoplayer2.upstream.cache.e(536870912L), new n3.b(this.f75324b));
    }

    public final void i(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.equals(key, "User-Agent")) {
                this.f75325c.getDefaultRequestProperties().b(key, value);
            } else if (!TextUtils.isEmpty(value)) {
                try {
                    Field declaredField = this.f75325c.getClass().getDeclaredField("userAgent");
                    declaredField.setAccessible(true);
                    declaredField.set(this.f75325c, value);
                } catch (Exception unused) {
                }
            }
        }
    }

    public c(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f75324b = applicationContext;
        this.f75323a = k0.b0(applicationContext, applicationContext.getApplicationInfo().name);
    }

    public r f(String str, Map<String, String> map, boolean z10) {
        com.google.android.exoplayer2.upstream.a.InterfaceC0188a interfaceC0188aB;
        Uri uri = Uri.parse(str);
        int iG = g(str);
        if (z10) {
            interfaceC0188aB = a();
        } else {
            interfaceC0188aB = b();
        }
        if (this.f75325c != null) {
            i(map);
        }
        if (iG != 0) {
            if (iG != 1) {
                if (iG != 2) {
                    return new f0.a(interfaceC0188aB).a(uri);
                }
                return new HlsMediaSource.Factory(interfaceC0188aB).a(uri);
            }
            return new SsMediaSource.Factory(interfaceC0188aB).a(uri);
        }
        return new DashMediaSource.Factory(interfaceC0188aB).a(uri);
    }

    public final int g(String str) {
        String strK0 = k0.K0(str);
        if (strK0.contains(".mpd")) {
            return 0;
        }
        if (strK0.contains(".m3u8")) {
            return 2;
        }
        if (strK0.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?")) {
            return 1;
        }
        return 3;
    }
}
