package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class zin {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f12240cf;
    public com.bytedance.sdk.openadsdk.core.le.le fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public vm f12241le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final Context f12242lh;
    public final RelativeLayout ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public TTAdDislikeToast f12243ra;
    private TextView ryl;
    public final vpp vt;
    public ImageView yu;
    public final AtomicBoolean pno = new AtomicBoolean(false);
    public final AtomicBoolean bly = new AtomicBoolean(false);
    public final int tlj = osn.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 44.0f);

    public zin(Context context, RelativeLayout relativeLayout, vpp vppVar) {
        String strOuw;
        this.f12242lh = context;
        this.ouw = relativeLayout;
        this.vt = vppVar;
        this.yu = (ImageView) relativeLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.f13424ng);
        this.ryl = (TextView) relativeLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.fwd);
        ImageView imageView = (ImageView) relativeLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.coz);
        this.fkw = (com.bytedance.sdk.openadsdk.core.le.le) relativeLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.lvd);
        if (vppVar != null) {
            TextView textView = this.ryl;
            if (TextUtils.isEmpty(vppVar.fqk)) {
                strOuw = com.bytedance.sdk.component.utils.vpp.ouw(context, "tt_web_title_default");
            } else {
                strOuw = vppVar.fqk;
            }
            textView.setText(strOuw);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.zin.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/zin$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_zin$1_onClick_2ad736bbd33d2fb12bc0e4d402199aec(view);
            }

            /* JADX WARN: Code duplicated, block: B:12:0x004c A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #0 {all -> 0x0059, blocks: (B:9:0x001a, B:10:0x0034, B:12:0x004c), top: B:20:0x001a }] */
            public void safedk_zin$1_onClick_2ad736bbd33d2fb12bc0e4d402199aec(View p10) {
                FrameLayout frameLayout;
                final zin zinVar = zin.this;
                if (zinVar.bly.get()) {
                    zinVar.f12243ra.show(TTAdDislikeToast.getDislikeTip());
                    return;
                }
                vm vmVar = zinVar.f12241le;
                if (vmVar == null) {
                    if (vmVar == null) {
                        try {
                            vm vmVar2 = new vm(zinVar.f12242lh, zinVar.vt);
                            zinVar.f12241le = vmVar2;
                            vmVar2.setDislikeSource("landing_page");
                            zinVar.f12241le.setCallback(new vm.ouw() { // from class: com.bytedance.sdk.openadsdk.common.zin.6
                                @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                                public final void ouw() {
                                    zin.this.pno.set(true);
                                }

                                @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                                public final void ouw(FilterWord filterWord) {
                                    if (zin.this.bly.get() || filterWord == null || filterWord.hasSecondOptions()) {
                                        return;
                                    }
                                    zin.this.bly.set(true);
                                }

                                @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                                public final void vt() {
                                    zin.this.pno.set(false);
                                }
                            });
                            frameLayout = (FrameLayout) zinVar.ouw.getRootView().findViewById(R.id.content);
                            frameLayout.addView(zinVar.f12241le);
                            if (zinVar.f12243ra == null) {
                                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(zinVar.f12242lh);
                                zinVar.f12243ra = tTAdDislikeToast;
                                frameLayout.addView(tTAdDislikeToast);
                            }
                        } catch (Throwable th2) {
                            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th2);
                        }
                    } else {
                        frameLayout = (FrameLayout) zinVar.ouw.getRootView().findViewById(R.id.content);
                        frameLayout.addView(zinVar.f12241le);
                        if (zinVar.f12243ra == null) {
                            TTAdDislikeToast tTAdDislikeToast2 = new TTAdDislikeToast(zinVar.f12242lh);
                            zinVar.f12243ra = tTAdDislikeToast2;
                            frameLayout.addView(tTAdDislikeToast2);
                        }
                    }
                }
                vm vmVar3 = zinVar.f12241le;
                if (vmVar3 != null) {
                    vmVar3.ouw();
                }
            }
        });
    }
}
