package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.aidl.ouw.fkw;
import com.bytedance.sdk.openadsdk.multipro.aidl.ouw.le;
import com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ra;
import com.bytedance.sdk.openadsdk.multipro.aidl.ouw.yu;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;

/* JADX INFO: loaded from: classes7.dex */
public final class ouw {
    private static final ouw vt = new ouw();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private vt f13261lh;
    private IBinderPool ouw;
    private long yu = 0;
    private final ServiceConnection fkw = new ServiceConnection() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ouw.2
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            bs.ouw(new pno("onServiceConnected") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ouw.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    ouw.this.ouw = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        ouw.this.ouw.asBinder().linkToDeath(ouw.this.f13260le, 0);
                    } catch (RemoteException e10) {
                        qbp.ouw("TTAD.BinderPool", "onServiceConnected throws :", e10);
                    }
                    ko.vt("TTAD.BinderPool", "onServiceConnected - binderService consume time ：" + (System.currentTimeMillis() - ouw.this.yu));
                    if (ouw.this.f13261lh != null) {
                        ouw.this.f13261lh.ouw();
                    }
                }
            }, 5);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            ko.lh("TTAD.BinderPool", "BinderPool......onServiceDisconnected");
        }
    };

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final IBinder.DeathRecipient f13260le = new IBinder.DeathRecipient() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ouw.3
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            bs.ouw(new pno("binderDied") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ouw.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    ko.yu("TTAD.BinderPool", "binder died.");
                    try {
                        if (ouw.this.ouw.asBinder().isBinderAlive()) {
                            ouw.this.ouw.asBinder().unlinkToDeath(ouw.this.f13260le, 0);
                        }
                    } catch (Exception e10) {
                        qbp.lh("TTAD.BinderPool", e10.getMessage());
                    }
                    ouw.this.ouw = null;
                    ouw.this.yu();
                }
            }, 5);
        }
    };

    public static void vt() {
        try {
            Context contextOuw = zih.ouw();
            contextOuw.startService(new Intent(contextOuw, (Class<?>) BinderPoolService.class));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yu() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ko.lh("TTAD.BinderPool", "BinderPool......connectBinderPoolService");
            lh();
        }
    }

    public final void lh() {
        try {
            Context contextOuw = zih.ouw();
            contextOuw.bindService(new Intent(contextOuw, (Class<?>) BinderPoolService.class), this.fkw, 1);
            this.yu = System.currentTimeMillis();
        } catch (Throwable unused) {
        }
    }

    private ouw() {
        yu();
    }

    public static ouw ouw() {
        return vt;
    }

    public final void ouw(vt vtVar) {
        this.f13261lh = vtVar;
        if (this.ouw != null) {
            bs.ouw(new pno("onServiceConnected2") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (ouw.this.f13261lh != null) {
                        ouw.this.f13261lh.ouw();
                    }
                }
            }, 5);
        }
    }

    public final IBinder ouw(int i10) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                try {
                    IBinderPool iBinderPool = this.ouw;
                    if (iBinderPool != null) {
                        return iBinderPool.queryBinder(i10);
                    }
                    return null;
                } catch (RemoteException e10) {
                    qbp.lh("TTAD.BinderPool", e10.getMessage());
                    uoy.le("queryBinder error");
                    return null;
                }
            }
            if (i10 == 0) {
                return ra.ouw();
            }
            if (i10 == 1) {
                return fkw.ouw();
            }
            if (i10 == 5) {
                return le.vt();
            }
            if (i10 == 6) {
                return yu.ouw();
            }
            if (i10 != 7) {
                return null;
            }
            return com.bytedance.sdk.openadsdk.multipro.aidl.ouw.vt.ouw();
        } catch (Throwable unused) {
            return null;
        }
    }
}
