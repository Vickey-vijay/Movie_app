package com.bytedance.sdk.openadsdk.multipro.aidl.vt;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.core.yu.ra;
import com.bytedance.sdk.openadsdk.lh.tlj;
import com.bytedance.sdk.openadsdk.utils.bs;

/* JADX INFO: loaded from: classes5.dex */
public final class vt extends IDislikeClosedListener.Stub {
    private final ra.ouw ouw;
    private final String vt;

    @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
    public final void onItemClickClosed() throws RemoteException {
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.vt.vt.1
            @Override // java.lang.Runnable
            public final void run() {
                if (vt.this.ouw != null) {
                    vt.this.ouw.ouw();
                    tlj.ouw(vt.this.vt);
                }
            }
        });
    }

    public vt(String str, ra.ouw ouwVar) {
        this.vt = str;
        this.ouw = ouwVar;
    }
}
