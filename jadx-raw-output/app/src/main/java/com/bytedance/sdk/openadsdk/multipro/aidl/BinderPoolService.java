package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.bly;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.aidl.ouw.fkw;
import com.bytedance.sdk.openadsdk.multipro.aidl.ouw.le;
import com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ra;
import com.bytedance.sdk.openadsdk.multipro.aidl.ouw.yu;

/* JADX INFO: loaded from: classes10.dex */
public class BinderPoolService extends Service {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static boolean f13258lh;
    public static volatile boolean ouw;
    private final Binder vt = new ouw();

    public static class ouw extends IBinderPool.Stub {
        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public final IBinder queryBinder(int i10) throws RemoteException {
            ko.lh("MultiProcess", "queryBinder...........binderCode=".concat(String.valueOf(i10)));
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    return null;
                                }
                                return com.bytedance.sdk.openadsdk.multipro.aidl.ouw.vt.ouw();
                            }
                            return yu.ouw();
                        }
                        return le.vt();
                    }
                    return com.bytedance.sdk.openadsdk.multipro.aidl.ouw.lh.ouw();
                }
                return fkw.ouw();
            }
            return ra.ouw();
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        ko.vt("TTAD.BinderPoolService", "BinderPoolService onBind ! ");
        return this.vt;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ko.vt("TTAD.BinderPoolService", "BinderPoolService has been created ! ");
        zih.vt(getApplicationContext());
        ouw = true;
        if (!f13258lh) {
            bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.1
                @Override // java.lang.Runnable
                public final void run() {
                    cf cfVarVt = cf.vt();
                    Context applicationContext = BinderPoolService.this.getApplicationContext();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("_tryFetRemoDat");
                    try {
                        if (Build.VERSION.SDK_INT >= 33) {
                            applicationContext.registerReceiver(cfVarVt.ryl, intentFilter, 4);
                        } else {
                            applicationContext.registerReceiver(cfVarVt.ryl, intentFilter);
                        }
                    } catch (Exception e10) {
                        qbp.ouw("TTAD.SdkSettings", "", e10);
                    }
                    if (cfVarVt.bly) {
                        cfVarVt.ouw(1, false);
                        cfVarVt.uoy();
                    }
                }
            });
        }
        f13258lh = true;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ko.vt("TTAD.BinderPoolService", "BinderPoolService is destroy ! ");
    }
}
