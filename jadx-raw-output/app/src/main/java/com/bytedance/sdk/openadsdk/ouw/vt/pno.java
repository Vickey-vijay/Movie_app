package com.bytedance.sdk.openadsdk.ouw.vt;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.rn;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.bytedance.sdk.openadsdk.utils.ey;
import com.bytedance.sdk.openadsdk.utils.od;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class pno extends PAGNativeAd {
    private boolean bly;
    public ouw fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f13288le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final vpp f13289lh;
    private boolean ouw;
    public String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f13290ra;
    public rn vt;
    public final Context yu;

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull final ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        boolean z10;
        if (viewGroup == null) {
            ko.yu("container can't been null");
            return;
        }
        if (list == null) {
            ko.yu("clickView can't been null");
            return;
        }
        if (list.size() <= 0) {
            ko.yu("clickViews size must been more than 1");
            return;
        }
        final ra raVar = new ra(pAGNativeAdInteractionListener);
        if (list.size() <= 0) {
            ko.yu("clickViews size must been more than 1");
            return;
        }
        vpp vppVar = this.f13289lh;
        if (vppVar != null && vppVar.f12868pd != 5) {
            zih.yu();
            z10 = cf.qbp(String.valueOf(this.f13290ra)).bly == 1;
        }
        if (z10) {
            LinkedList linkedList = new LinkedList();
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    linkedList.add(list.get(i10));
                }
            }
            if (list2 != null && !list2.isEmpty()) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    linkedList.add(list2.get(i11));
                }
            }
            list2 = linkedList;
        }
        if (view != null && raVar.lh()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.pno.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/ouw/vt/pno$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f44975u, view2);
                    safedk_pno$1_onClick_effeb380a35f851c1017f37e1f2f125f(view2);
                }

                public void safedk_pno$1_onClick_effeb380a35f851c1017f37e1f2f125f(View p10) {
                    final String strOuw = ex.ouw();
                    TTDelegateActivity.ouw(pno.this.f13289lh, strOuw, new com.bytedance.sdk.openadsdk.core.yu.ra.ouw() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.pno.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.yu.ra.ouw
                        public final void ouw() {
                            raVar.vt();
                            bly.ouw().yu(strOuw);
                            PAGMediaView pAGMediaView = pno.this.fkw.f13282le;
                            if (pAGMediaView != null) {
                                pAGMediaView.close();
                            }
                        }
                    });
                }
            });
        }
        final rn rnVar = this.vt;
        rnVar.ouw(viewGroup, null, list, list2, raVar);
        rnVar.ouw(viewGroup);
        com.bytedance.sdk.openadsdk.core.lh.vt vtVar = rnVar.fkw;
        if (vtVar != null && rnVar.f12987le != null) {
            rn.ouw(list, vtVar);
            rn.ouw(list2, rnVar.f12987le);
            rnVar.ouw(rnVar.fkw, rnVar.f12987le);
            ey.ouw(viewGroup, true, 5, false, new ey.vt() { // from class: com.bytedance.sdk.openadsdk.core.rn.6
                public final /* synthetic */ ViewGroup ouw;

                @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
                public final void ouw(boolean z11) {
                    rn.ouw(rn.this, z11, viewGroup);
                }

                public AnonymousClass6() {
                    viewGroup = viewGroup;
                }

                @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
                public final void ouw() {
                    rn.ouw(rn.this, viewGroup);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
                public final void vt() {
                    rn.ouw(rn.this);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
                public final void ouw(View view2, boolean z11) {
                    if (!z11) {
                        com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(rn.this.ouw, 8);
                    } else {
                        com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(rn.this.ouw, 4);
                        rn.vt(rn.this, viewGroup);
                    }
                }
            }, null);
        }
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw ouwVar = null;
        vpp vppVar2 = this.f13289lh;
        if (vppVar2 != null && vppVar2.rn() == 2) {
            ouwVar = new com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.f13289lh.kfa);
        }
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(viewGroup, this.f13289lh, ouwVar);
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        Map<String, Object> map;
        vpp vppVar = this.f13289lh;
        if (vppVar == null || (map = vppVar.npr) == null) {
            return null;
        }
        try {
            return map.get(str);
        } catch (Throwable th2) {
            qbp.lh("TTNativeAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        vpp vppVar = this.f13289lh;
        if (vppVar != null) {
            return vppVar.npr;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new yu(this.fkw);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.bly) {
            return;
        }
        od.ouw(this.f13289lh, d10, str, str2);
        this.bly = true;
    }

    public void ouw(String str) {
        this.pno = str;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.ouw) {
            return;
        }
        od.ouw(this.f13289lh, d10);
        this.ouw = true;
    }

    public pno(@NonNull Context context, @NonNull vpp vppVar, boolean z10) {
        if (vppVar == null) {
            ko.yu("materialMeta can't been null");
        }
        this.f13289lh = vppVar;
        this.yu = context;
        this.f13288le = 5;
        this.f13290ra = vppVar.fqk();
        String strLh = uoy.lh(5);
        this.pno = strLh;
        if (z10) {
            ouw ouwVar = new ouw(context, vppVar, strLh);
            this.fkw = ouwVar;
            this.vt = new rn(context, this, vppVar, "embeded_ad", ouwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }
}
