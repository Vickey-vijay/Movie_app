package com.bytedance.sdk.openadsdk.lh;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.cd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class lh implements cd {
    private cd.ouw fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f13242lh;
    public yu ouw;
    public ryl vt;
    private final Context yu;

    @Override // com.bytedance.sdk.openadsdk.core.cd
    public final void vt() {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.destroy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cd
    public final void ouw() {
        Context context = this.yu;
        if (!((context instanceof Activity) && !((Activity) context).isFinishing()) || this.ouw.isShowing()) {
            return;
        }
        this.ouw.show();
    }

    public lh(Context context, String str, List<FilterWord> list, String str2, vpp vppVar) {
        this.yu = context;
        this.ouw = new yu(context, str, list);
        ryl rylVar = new ryl(context, this.ouw.getDislikeManager());
        this.vt = rylVar;
        rylVar.ouw(str2, vppVar);
        this.vt.ouw = new ryl.ouw() { // from class: com.bytedance.sdk.openadsdk.lh.lh.1
            @Override // com.bytedance.sdk.openadsdk.lh.ryl.ouw
            public final void ouw() {
            }

            @Override // com.bytedance.sdk.openadsdk.lh.ryl.ouw
            public final void lh() {
                lh.this.ouw();
            }

            @Override // com.bytedance.sdk.openadsdk.lh.ryl.ouw
            public final void ouw(String str3) {
                lh.this.ouw.onSuggestionSubmit(str3);
                lh.this.ouw();
            }

            @Override // com.bytedance.sdk.openadsdk.lh.ryl.ouw
            public final void vt() {
                lh.this.ouw();
            }
        };
        this.ouw.yu = new yu.ouw() { // from class: com.bytedance.sdk.openadsdk.lh.lh.2
            @Override // com.bytedance.sdk.openadsdk.lh.yu.ouw
            public final void ouw() {
                lh lhVar = lh.this;
                lhVar.f13242lh = true;
                if (lhVar.ouw != null && lh.this.ouw.isShowing()) {
                    lh.this.ouw.hide();
                }
                lh.vt(lh.this);
            }

            @Override // com.bytedance.sdk.openadsdk.lh.yu.ouw
            public final void lh() {
                ko.fkw("TTAdDislikeImpl", "onDislikeDismiss: ");
                try {
                    if (lh.this.fkw != null) {
                        lh.this.fkw.ouw();
                    }
                } catch (Throwable th2) {
                    qbp.ouw("TTAdDislikeImpl", "dislike callback cancel error: ", th2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.lh.yu.ouw
            public final void vt() {
                ko.vt("TTAdDislikeImpl", "onDislikeShow: ");
            }

            @Override // com.bytedance.sdk.openadsdk.lh.yu.ouw
            public final void ouw(FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && lh.this.fkw != null) {
                        lh.this.fkw.ouw(filterWord.getName());
                    }
                    ko.fkw("TTAdDislikeImpl", "onDislikeSelected: 0, " + filterWord.getName());
                } catch (Throwable th2) {
                    ko.lh("TTAdDislikeImpl", "dislike callback selected error: ", th2);
                }
            }
        };
    }

    public static /* synthetic */ void vt(lh lhVar) {
        Context context = lhVar.yu;
        if ((context instanceof Activity) && (!((Activity) context).isFinishing()) && !lhVar.vt.isShowing()) {
            lhVar.vt.show();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cd
    public final void ouw(cd.ouw ouwVar) {
        this.fkw = ouwVar;
    }
}
