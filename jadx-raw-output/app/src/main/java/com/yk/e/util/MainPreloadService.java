package com.yk.e.util;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yk.e.pl.PreloadManager;
import gl.a;
import gl.b0;
import gl.y1;
import java.util.ArrayList;
import java.util.Timer;

/* JADX INFO: loaded from: classes8.dex */
public class MainPreloadService extends Service {
    public static boolean I1I = false;
    public static Timer IL1Iii = null;
    public static int ILil = 600;

    public static void IL1Iii(Activity activity) {
        int preloadCachePeriod = UsLocalSaveHelper.getInstance().getPreloadCachePeriod();
        IL1Iii("startPreloadService, period = " + preloadCachePeriod + "s");
        try {
            if (preloadCachePeriod <= 1) {
                IL1Iii("startPreloadService failed, period <= 1 ");
            } else if (CoreUtils.isServiceRunning(activity, MainPreloadService.class)) {
                IL1Iii("PreloadService has been activated");
            } else if (I1I) {
                IL1Iii("PreloadService has started");
            } else {
                I1I = true;
                a aVar = new a(5, new b0(activity, preloadCachePeriod));
                aVar.f53435c.post(aVar.f53436d);
            }
        } catch (Exception e10) {
            LogUtil.printException(e10);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        IL1Iii("onDestroy");
        try {
            Timer timer = IL1Iii;
            if (timer != null) {
                timer.cancel();
                IL1Iii = null;
            }
            PreloadManager.getInstance(this).removeAllPreloadTask();
        } catch (Exception e10) {
            String str = "PreloadService destroy err, msg = " + e10.getMessage();
            AdLog.e(PreloadManager.tag, "preloadService, " + str);
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        IL1Iii("onStartCommand");
        if (intent == null) {
            return 2;
        }
        try {
            ILil = intent.getIntExtra(TypedValues.CycleType.S_WAVE_PERIOD, ILil) * 1000;
            IL1Iii = new Timer();
            y1 y1Var = new y1(this, this);
            Timer timer = IL1Iii;
            long j10 = ILil;
            timer.schedule(y1Var, j10, j10);
            return 2;
        } catch (Exception e10) {
            AdLog.e(PreloadManager.tag, e10.getMessage(), e10);
            return 2;
        }
    }

    public MainPreloadService() {
        new ArrayList();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    public static void IL1Iii(String str) {
        AdLog.d(PreloadManager.tag, "preloadService, " + str);
    }
}
