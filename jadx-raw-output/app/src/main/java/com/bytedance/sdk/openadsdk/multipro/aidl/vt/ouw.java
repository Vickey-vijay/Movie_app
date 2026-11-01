package com.bytedance.sdk.openadsdk.multipro.aidl.vt;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.bs;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw extends IAppOpenAdInteractionListener.Stub {
    private volatile com.bytedance.sdk.openadsdk.ouw.yu.vt ouw;

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public final void onDestroy() throws RemoteException {
        this.ouw = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public final void onAdClicked() throws RemoteException {
        final com.bytedance.sdk.openadsdk.ouw.yu.vt vtVar = this.ouw;
        if (vtVar == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.ouw.2
            @Override // java.lang.Runnable
            public final void run() {
                vtVar.onAdClicked();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public final void onAdShow() throws RemoteException {
        final com.bytedance.sdk.openadsdk.ouw.yu.vt vtVar = this.ouw;
        if (vtVar == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.ouw.1
            @Override // java.lang.Runnable
            public final void run() {
                vtVar.ouw();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public final void onAdSkip() throws RemoteException {
        final com.bytedance.sdk.openadsdk.ouw.yu.vt vtVar = this.ouw;
        if (vtVar == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.ouw.3
            @Override // java.lang.Runnable
            public final void run() {
                vtVar.vt();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public final void onAdTimeOver() throws RemoteException {
        final com.bytedance.sdk.openadsdk.ouw.yu.vt vtVar = this.ouw;
        if (vtVar == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.ouw.4
            @Override // java.lang.Runnable
            public final void run() {
                vtVar.lh();
            }
        });
    }

    public ouw(com.bytedance.sdk.openadsdk.ouw.yu.vt vtVar) {
        this.ouw = vtVar;
    }
}
