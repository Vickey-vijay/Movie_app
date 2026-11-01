package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.cd;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ouw extends com.bytedance.sdk.openadsdk.core.le.lh {
    public int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f12532cf;
    public TTDislikeDialogAbstract fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f12533le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.model.vpp f12534lh;
    private com.bytedance.sdk.openadsdk.yu.ra ouw;
    public int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f12535ra;
    public String ryl;
    public boolean tlj;
    public Context vt;
    public com.bytedance.sdk.openadsdk.lh.lh yu;

    public ouw(@NonNull Context context) {
        super(context);
        this.f12533le = "embeded_ad";
        this.tlj = true;
        this.f12532cf = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void ouw() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.fkw;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.lh.lh lhVar = this.yu;
        if (lhVar != null) {
            lhVar.ouw();
        } else {
            TTDelegateActivity.ouw(this.f12534lh, null);
        }
    }

    public abstract void ouw(View view, int i10, com.bytedance.sdk.openadsdk.core.model.ko koVar);

    public String getDescription() {
        if (TextUtils.isEmpty(this.f12534lh.fqk)) {
            return !TextUtils.isEmpty(this.f12534lh.hun) ? this.f12534lh.hun : "";
        }
        return this.f12534lh.fqk;
    }

    public String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f12534lh;
        if (vppVar == null) {
            return "";
        }
        com.bytedance.sdk.openadsdk.core.model.le leVar = vppVar.wp;
        if (leVar == null || TextUtils.isEmpty(leVar.vt)) {
            return !TextUtils.isEmpty(this.f12534lh.f12883vh) ? this.f12534lh.f12883vh : "";
        }
        return this.f12534lh.wp.vt;
    }

    public float getRealHeight() {
        return osn.vt(this.vt, this.pno);
    }

    public float getRealWidth() {
        return osn.vt(this.vt, this.f12535ra);
    }

    public String getTitle() {
        com.bytedance.sdk.openadsdk.core.model.le leVar = this.f12534lh.wp;
        if (leVar != null && !TextUtils.isEmpty(leVar.vt)) {
            return this.f12534lh.wp.vt;
        }
        if (TextUtils.isEmpty(this.f12534lh.f12883vh)) {
            return !TextUtils.isEmpty(this.f12534lh.fqk) ? this.f12534lh.fqk : "";
        }
        return this.f12534lh.f12883vh;
    }

    public com.bytedance.sdk.openadsdk.core.mwh.vt.le getVideoView() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f12534lh;
        if (vppVar != null && this.vt != null) {
            if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar)) {
                try {
                    leVar = new com.bytedance.sdk.openadsdk.core.mwh.vt.le(this.vt, this.f12534lh, this.f12533le, this.ouw);
                    leVar.setVideoCacheUrl(this.ryl);
                    leVar.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.mwh.vt.le.vt() { // from class: com.bytedance.sdk.openadsdk.core.bly.ouw.2
                        @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.vt
                        public final void ouw(boolean z10, long j10, long j11, long j12, boolean z11) {
                        }
                    });
                    leVar.setIsAutoPlay(this.tlj);
                    leVar.ouw(this.f12532cf, "bannerGetVideoView");
                } catch (Throwable unused) {
                    leVar = null;
                }
            } else {
                leVar = null;
            }
            if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(this.f12534lh) && leVar != null && leVar.ouw(0L, true, false)) {
                return leVar;
            }
        }
        return null;
    }

    public void setDislikeInner(cd cdVar) {
        if (cdVar instanceof com.bytedance.sdk.openadsdk.lh.lh) {
            this.yu = (com.bytedance.sdk.openadsdk.lh.lh) cdVar;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        if (tTDislikeDialogAbstract != null && (vppVar = this.f12534lh) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(vppVar.yhj, vppVar.jae);
        }
        this.fkw = tTDislikeDialogAbstract;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public ouw(@NonNull Context context, String str) {
        super(context);
        this.f12533le = "embeded_ad";
        this.tlj = true;
        this.f12532cf = true;
        this.ryl = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    public final void ouw(View view, boolean z10) {
        com.bytedance.sdk.openadsdk.core.lh.vt vtVar;
        if (view == null) {
            return;
        }
        if (z10) {
            Context context = this.vt;
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f12534lh;
            String str = this.f12533le;
            vtVar = new com.bytedance.sdk.openadsdk.core.lh.ouw(context, vppVar, str, uoy.ouw(str));
        } else {
            Context context2 = this.vt;
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.f12534lh;
            String str2 = this.f12533le;
            vtVar = new com.bytedance.sdk.openadsdk.core.lh.vt(context2, vppVar2, str2, uoy.ouw(str2));
        }
        view.setOnTouchListener(vtVar);
        view.setOnClickListener(vtVar);
        vtVar.ouw(new vt() { // from class: com.bytedance.sdk.openadsdk.core.bly.ouw.1
            @Override // com.bytedance.sdk.openadsdk.core.bly.vt
            public final void ouw(View view2, int i10, com.bytedance.sdk.openadsdk.core.model.ko koVar) {
                ouw.this.ouw(view2, i10, koVar);
            }
        });
    }

    public final void ouw(int i10) {
        com.bytedance.sdk.openadsdk.core.zih.yu();
        this.f12532cf = com.bytedance.sdk.openadsdk.core.settings.cf.vt(String.valueOf(this.bly));
        com.bytedance.sdk.openadsdk.core.zih.yu();
        int iVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt(i10);
        if (3 == iVt) {
            this.tlj = false;
            return;
        }
        int iOuw = ksc.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 60000L);
        if (1 != iVt || !uoy.yu(iOuw)) {
            if (2 == iVt) {
                if (uoy.fkw(iOuw) || uoy.yu(iOuw) || uoy.le(iOuw)) {
                    this.tlj = true;
                    return;
                }
                return;
            }
            if (5 != iVt) {
                return;
            }
            if (!uoy.yu(iOuw) && !uoy.le(iOuw)) {
                return;
            }
        }
        this.tlj = true;
    }

    public final void ouw(View view) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f12534lh;
        if (vppVar == null || vppVar.f12874sd == null || view == null) {
            return;
        }
        ouw(view, vppVar.f12862ln == 1 && this.tlj);
    }
}
