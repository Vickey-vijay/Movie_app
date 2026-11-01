package com.inmobi.media;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static LinkedHashSet f22562a;

    public static void a(boolean z10) {
        LinkedHashSet linkedHashSet;
        if (Ji.f22951a == null || (linkedHashSet = f22562a) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            try {
                ((Sk) it.next()).getClass();
                Sk.a(z10);
            } catch (Exception e10) {
                ck.p.i("E1", "TAG");
                e10.getMessage();
            }
        }
    }

    public static void b(Context context) {
        Sk sk2 = Yk.f23867c;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(sk2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (f22562a == null) {
            f22562a = new LinkedHashSet();
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new D1(context));
                } catch (Throwable unused) {
                }
            }
        }
        LinkedHashSet linkedHashSet = f22562a;
        if (linkedHashSet != null) {
            linkedHashSet.add(sk2);
        }
    }

    public static boolean a(Context context) {
        try {
            Object systemService = context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            ck.p.h(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                String packageName = context.getPackageName();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (packageName.equals(runningAppProcessInfo.processName)) {
                        return runningAppProcessInfo.importance == 100;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e10) {
            ck.p.i("E1", "TAG");
            e10.getMessage();
            return false;
        }
    }
}
