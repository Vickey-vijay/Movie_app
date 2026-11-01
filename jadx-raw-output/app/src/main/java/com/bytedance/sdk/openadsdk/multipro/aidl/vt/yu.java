package com.bytedance.sdk.openadsdk.multipro.aidl.vt;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.bs;

/* JADX INFO: loaded from: classes9.dex */
public final class yu extends IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouw;

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public final void onDestroy() throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public final void onAdClose() throws RemoteException {
        if (this.ouw == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.yu.3
            @Override // java.lang.Runnable
            public final void run() {
                if (yu.this.ouw != null) {
                    yu.this.ouw.vt();
                }
                yu.this.ouw = null;
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public final void onAdShow() throws RemoteException {
        if (this.ouw == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.yu.1
            @Override // java.lang.Runnable
            public final void run() {
                if (yu.this.ouw != null) {
                    yu.this.ouw.ouw();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public final void onAdVideoBarClick() throws RemoteException {
        if (this.ouw == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.yu.2
            @Override // java.lang.Runnable
            public final void run() {
                if (yu.this.ouw != null) {
                    yu.this.ouw.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public final void onRewardVerify(final boolean z10, final int i10, final String str, final int i11, final String str2) throws RemoteException {
        if (this.ouw == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.yu.4
            @Override // java.lang.Runnable
            public final void run() {
                if (yu.this.ouw != null) {
                    yu.this.ouw.ouw(z10, i10, str, i11, str2);
                }
            }
        });
    }

    public yu(com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar) {
        this.ouw = ouwVar;
    }
}
