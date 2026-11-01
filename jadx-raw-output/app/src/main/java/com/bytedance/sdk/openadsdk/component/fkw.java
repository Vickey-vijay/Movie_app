package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.ironsource.Mf;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class fkw implements com.bytedance.sdk.openadsdk.ouw.yu.vt {
    private final PAGAppOpenAdInteractionListener ouw;
    private final AtomicBoolean vt = new AtomicBoolean(false);

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final AtomicBoolean f12260lh = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.ouw.yu.vt
    public final void lh() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.vt.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.ouw) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public final void onAdClicked() {
        qbp.ouw("BVA", Mf.f27056f);
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.ouw;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.yu.vt
    public final void ouw() {
        if (this.f12260lh.compareAndSet(false, true)) {
            qbp.ouw("BVA", "onAdShow");
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.ouw;
            if (pAGAppOpenAdInteractionListener != null) {
                pAGAppOpenAdInteractionListener.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.yu.vt
    public final void vt() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        qbp.ouw("BVA", "onAdSkip");
        if (this.vt.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.ouw) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    public fkw(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.ouw = pAGAppOpenAdInteractionListener;
    }
}
