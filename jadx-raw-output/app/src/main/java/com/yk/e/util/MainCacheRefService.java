package com.yk.e.util;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.yk.e.pl.PreloadManager;
import gl.a;
import gl.y0;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes6.dex */
public class MainCacheRefService extends Service {
    public static int I1I = 30000;
    public static Timer IL1Iii;
    public static TimerTask ILil;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        AdLog.d("MainCacheRefService", "preloadService, ".concat("onDestroy"));
        try {
            Timer timer = IL1Iii;
            if (timer != null) {
                timer.cancel();
                IL1Iii = null;
            }
            PreloadManager.getInstance(this).removeAllPreloadTask();
        } catch (Exception e10) {
            AdLog.e("MainCacheRefService", "preloadService, " + ("PreloadService destroy err, msg = " + e10.getMessage()));
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        AdLog.d("MainCacheRefService", "preloadService, ".concat("onStartCommand"));
        try {
            I1I = intent.getIntExtra("refTime", I1I) * 1000;
            a aVar = new a(60, new y0());
            aVar.f53435c.post(aVar.f53436d);
            return 2;
        } catch (Exception e10) {
            AdLog.e(PreloadManager.tag, e10.getMessage(), e10);
            return 2;
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }
}
