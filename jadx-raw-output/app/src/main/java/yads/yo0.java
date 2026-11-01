package yads;

import android.content.Context;
import androidx.media3.database.ExoDatabaseProvider;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.datasource.cache.SimpleCache;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public final class yo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ug0 f85079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wy2 f85080b;

    public /* synthetic */ yo0() {
        this(new ug0(), new wy2());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public final SimpleCache a(Context context) {
        long j10;
        this.f85079a.getClass();
        File fileA = ug0.a(context, "mobileads-video-cache");
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA != null) {
            j10 = nt2VarA.f80759c;
            if (j10 == 0) {
                j10 = 52428800;
            }
        } else {
            j10 = 52428800;
        }
        LeastRecentlyUsedCacheEvictor leastRecentlyUsedCacheEvictor = new LeastRecentlyUsedCacheEvictor(is1.a(context, 41943040L, j10));
        ExoDatabaseProvider exoDatabaseProvider = new ExoDatabaseProvider(context);
        this.f85080b.getClass();
        return new SimpleCache(fileA, leastRecentlyUsedCacheEvictor, exoDatabaseProvider);
    }

    public yo0(ug0 ug0Var, wy2 wy2Var) {
        this.f85079a = ug0Var;
        this.f85080b = wy2Var;
    }
}
