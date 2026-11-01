package sg.bigo.ads.controller.e;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f70801c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Map<String, Long> f70802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f70803b = new AtomicInteger(0);

    private c() {
    }

    public static c a() {
        return f70801c;
    }

    public static boolean a(Map<String, Long> map, String str) {
        Long l10;
        return map == null || str == null || (l10 = map.get(str)) == null || SystemClock.elapsedRealtime() - l10.longValue() > 600000;
    }

    public final boolean a(@Nullable String str) {
        return a(this.f70802a, str);
    }

    public final void b() {
        Map<String, Long> map = this.f70802a;
        if (map != null) {
            map.clear();
        }
        this.f70803b.set(1);
    }
}
