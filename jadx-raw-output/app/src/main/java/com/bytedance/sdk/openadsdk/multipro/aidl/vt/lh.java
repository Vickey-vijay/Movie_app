package com.bytedance.sdk.openadsdk.multipro.aidl.vt;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.bs;

/* JADX INFO: loaded from: classes.dex */
public final class lh extends IFullScreenVideoAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.ouw.lh.vt ouw;

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public final void onDestroy() throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public final void onAdClose() throws RemoteException {
        if (this.ouw == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.lh.3
            @Override // java.lang.Runnable
            public final void run() {
                if (lh.this.ouw != null) {
                    lh.this.ouw.vt();
                }
                lh.this.ouw = null;
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public final void onAdShow() throws RemoteException {
        if (this.ouw == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.lh.1
            @Override // java.lang.Runnable
            public final void run() {
                if (lh.this.ouw != null) {
                    lh.this.ouw.ouw();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public final void onAdVideoBarClick() throws RemoteException {
        if (this.ouw == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.lh.2
            @Override // java.lang.Runnable
            public final void run() {
                if (lh.this.ouw != null) {
                    lh.this.ouw.onAdClicked();
                }
            }
        });
    }

    public lh(com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar) {
        this.ouw = vtVar;
    }
}
