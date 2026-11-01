package gl;

import android.content.Context;
import com.yk.e.util.Constant;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.MainPreloadService;
import java.util.TimerTask;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class y1 extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f53622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainPreloadService f53623c;

    public y1(MainPreloadService mainPreloadService, Context context) {
        this.f53623c = mainPreloadService;
        this.f53622b = context;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        MainPreloadService.IL1Iii("preloadTimer reqTimer");
        MainPreloadService mainPreloadService = this.f53623c;
        Context context = this.f53622b;
        mainPreloadService.getClass();
        a1 a1VarA = a1.a();
        String str = Constant.ReqTimer;
        JSONArray cacheFileAdsidJSArray = CoreUtils.getCacheFileAdsidJSArray(context);
        q qVar = new q(mainPreloadService, context);
        a1VarA.getClass();
        new Thread(new r1(new n(context, new q1(a1VarA, cacheFileAdsidJSArray, str, context, qVar)))).start();
    }
}
