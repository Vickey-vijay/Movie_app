package gl;

import android.content.Context;
import com.yk.e.inf.IComCallback;
import com.yk.e.pl.PreloadManager;
import com.yk.e.util.AdLog;
import com.yk.e.util.MainPreloadService;
import java.util.Timer;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f53578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainPreloadService f53579b;

    public q(MainPreloadService mainPreloadService, Context context) {
        this.f53579b = mainPreloadService;
        this.f53578a = context;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        MainPreloadService mainPreloadService = this.f53579b;
        Timer timer = MainPreloadService.IL1Iii;
        mainPreloadService.getClass();
        String str2 = PreloadManager.tag;
        AdLog.e(str2, "preloadService, " + ("reqTimer failed, msg = " + str));
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        PreloadManager.getInstance(this.f53578a).preloadCacheList4Timer(this.f53578a);
    }
}
