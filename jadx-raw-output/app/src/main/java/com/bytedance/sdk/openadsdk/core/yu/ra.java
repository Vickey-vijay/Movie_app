package com.bytedance.sdk.openadsdk.core.yu;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.od;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class ra extends PAGBannerAd {
    private int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private List<com.bytedance.sdk.openadsdk.core.yu.ouw> f13190cf;
    private boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private boolean f13191le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public AdSlot f13192lh;
    public Context ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private fkw f13193ra;
    private final AtomicBoolean tlj = new AtomicBoolean(false);
    public vpp vt;
    public boolean yu;

    public interface ouw {
        void ouw();
    }

    private void ouw(vpp vppVar) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar;
        if (vppVar == null || (ouwVar = vppVar.f12885vm) == null) {
            return;
        }
        this.f13190cf = new ArrayList();
        int size = ouwVar.yu.size();
        if (!this.yu) {
            this.f13190cf.add(new com.bytedance.sdk.openadsdk.core.yu.ouw(this.ouw, vppVar, this.f13192lh, this, false));
            return;
        }
        this.f13193ra = new fkw(ouwVar.tlj, this.ouw, this.pno, this.bly);
        for (int i10 = 0; i10 < size; i10++) {
            this.f13192lh.setExpressViewAccepted(((this.pno - osn.vt(this.ouw, ouwVar.tlj.fkw)) - osn.vt(this.ouw, ouwVar.tlj.f12896le)) - (osn.vt(this.ouw, ouwVar.tlj.f12898ra) * 2), this.bly);
            vpp vppVar2 = ouwVar.yu.get(i10);
            if (i10 != 0 && i10 != 0) {
                if (!TextUtils.isEmpty(vppVar2.ehk)) {
                    vppVar2.ehk = "0";
                }
                Map<String, Object> map = vppVar2.npr;
                if (map != null && map.containsKey("price")) {
                    map.put("price", "0");
                }
            }
            com.bytedance.sdk.openadsdk.core.yu.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.core.yu.ouw(this.ouw, vppVar2, this.f13192lh, this, true);
            ouwVar2.ouw(i10);
            this.f13190cf.add(ouwVar2);
        }
        this.f13193ra.f13169lh = this.f13190cf;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public final void destroy() {
        try {
            List<com.bytedance.sdk.openadsdk.core.yu.ouw> list = this.f13190cf;
            if (list == null || list.isEmpty()) {
                return;
            }
            if (!this.yu) {
                this.f13190cf.get(0).fkw();
                return;
            }
            fkw fkwVar = this.f13193ra;
            if (fkwVar.vt != null) {
                try {
                    List<com.bytedance.sdk.openadsdk.core.yu.ouw> list2 = fkwVar.f13169lh;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i10 = 0; i10 < fkwVar.f13169lh.size(); i10++) {
                            fkwVar.f13169lh.get(i10).fkw();
                        }
                    }
                    fkwVar.yu = -1;
                    fkwVar.vt.vt();
                    fkwVar.vt.setSwiperWindowFocusChangedListener(null);
                    fkwVar.vt.setSwiperVisibleChangeListener(null);
                    fkwVar.vt.removeOnAttachStateChangeListener(fkwVar.fkw);
                    fkwVar.vt = null;
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            ko.fkw("PAGBannerAdImpl", "banner destroy error");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public final PAGBannerSize getBannerSize() {
        return this.f13192lh != null ? new PAGBannerSize(this.pno, this.bly) : new PAGBannerSize(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public final View getBannerView() {
        try {
            List<com.bytedance.sdk.openadsdk.core.yu.ouw> list = this.f13190cf;
            if (list != null && !list.isEmpty()) {
                return this.yu ? this.f13193ra.vt : this.f13190cf.get(0).ouw();
            }
        } catch (Throwable th2) {
            ko.lh("PAGBannerAdImpl", "getBannerView error ", th2);
        }
        return new View(this.ouw);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public final Object getExtraInfo(String str) {
        Map<String, Object> map;
        vpp vppVar = this.vt;
        if (vppVar == null || (map = vppVar.npr) == null) {
            return null;
        }
        try {
            return map.get(str);
        } catch (Throwable th2) {
            qbp.lh("PAGBannerAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public final Map<String, Object> getMediaExtraInfo() {
        vpp vppVar = this.vt;
        if (vppVar != null) {
            return vppVar.npr;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public final void loss(Double d10, String str, String str2) {
        if (this.f13191le) {
            return;
        }
        od.ouw(this.vt, d10, str, str2);
        this.f13191le = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public final void setAdInteractionCallback(final PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        List<com.bytedance.sdk.openadsdk.core.yu.ouw> list = this.f13190cf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.f13190cf.size(); i10++) {
            this.f13190cf.get(i10).ouw(new PAGBannerAdInteractionCallback() { // from class: com.bytedance.sdk.openadsdk.core.yu.ra.1
                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public final void onAdClicked() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public final void onAdDismissed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback
                public final void onAdShowFailed(@NonNull PAGErrorModel pAGErrorModel) {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdShowFailed(pAGErrorModel);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public final void onAdShowed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2;
                    if (!ra.this.tlj.compareAndSet(false, true) || (pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback) == null) {
                        return;
                    }
                    pAGBannerAdInteractionCallback2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public final void setAdInteractionListener(final PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        List<com.bytedance.sdk.openadsdk.core.yu.ouw> list = this.f13190cf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.f13190cf.size(); i10++) {
            this.f13190cf.get(i10).ouw(new PAGBannerAdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.ra.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public final void onAdClicked() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public final void onAdDismissed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public final void onAdShowed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2;
                    if (!ra.this.tlj.compareAndSet(false, true) || (pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener) == null) {
                        return;
                    }
                    pAGBannerAdInteractionListener2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public final void win(Double d10) {
        if (this.fkw) {
            return;
        }
        od.ouw(this.vt, d10);
        this.fkw = true;
    }

    public ra(Context context, vpp vppVar, AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar;
        boolean z10 = false;
        this.pno = 0;
        this.bly = 0;
        this.ouw = context;
        this.vt = vppVar;
        this.f13192lh = adSlot;
        this.pno = (int) adSlot.getExpressViewAcceptedWidth();
        this.bly = (int) this.f13192lh.getExpressViewAcceptedHeight();
        vpp vppVar2 = this.vt;
        if (vppVar2 != null && (ouwVar = vppVar2.f12885vm) != null) {
            if (ouwVar.yu() && ouwVar.yu.size() > 1) {
                z10 = true;
            }
            this.yu = z10;
        }
        ouw(vppVar);
    }
}
