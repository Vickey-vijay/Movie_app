package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public final class vm extends com.bytedance.sdk.openadsdk.core.le.lh implements com.bytedance.sdk.openadsdk.lh.tlj.vt {
    private String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private boolean f12228le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private ouw f12229lh;
    private View ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.lh.tlj f12230ra;
    private vpp vt;
    private Context yu;

    public interface ouw {
        void ouw();

        void ouw(FilterWord filterWord);

        void vt();
    }

    public vm(@NonNull Context context, @NonNull vpp vppVar) {
        this(context.getApplicationContext());
        this.vt = vppVar;
        this.yu = context;
        com.bytedance.sdk.openadsdk.lh.tlj tljVar = this.f12230ra;
        tljVar.bly = vppVar.yhj;
        tljVar.ouw(this);
        lh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
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

    private void lh() {
        com.bytedance.sdk.openadsdk.lh.tlj tljVar;
        vpp vppVar = this.vt;
        if (vppVar == null || (tljVar = this.f12230ra) == null) {
            return;
        }
        tljVar.ouw(vppVar.jae);
    }

    public final void ouw() {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.DisLD", "showDislike: ");
        if (this.ouw.getParent() == null) {
            addView(this.ouw);
        }
        setVisibility(0);
        this.f12228le = true;
        ouw ouwVar = this.f12229lh;
        if (ouwVar != null) {
            ouwVar.ouw();
        }
    }

    public final void setCallback(ouw ouwVar) {
        this.f12229lh = ouwVar;
    }

    public final void setDislikeSource(String str) {
        this.fkw = str;
        this.f12230ra.tlj = str;
    }

    public final void vt() {
        setVisibility(8);
        this.f12228le = false;
        ouw ouwVar = this.f12229lh;
        if (ouwVar != null) {
            ouwVar.vt();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.sdk.openadsdk.lh.tlj tljVar = this.f12230ra;
        if (tljVar != null) {
            tljVar.ouw();
        }
    }

    private vm(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    @Override // com.bytedance.sdk.openadsdk.lh.tlj.vt
    public final void ouw(int i10) {
        if (com.bytedance.sdk.openadsdk.lh.tlj.vt == i10) {
            FilterWord filterWord = this.f12230ra.f13256vm;
            if (filterWord == null || com.bytedance.sdk.openadsdk.lh.tlj.ouw.equals(filterWord)) {
                return;
            }
            ouw ouwVar = this.f12229lh;
            if (ouwVar != null) {
                try {
                    ouwVar.ouw(filterWord);
                } catch (Throwable unused) {
                }
            }
            vt();
            return;
        }
        if (com.bytedance.sdk.openadsdk.lh.tlj.f13248lh == i10) {
            vt();
            return;
        }
        if (com.bytedance.sdk.openadsdk.lh.tlj.fkw == i10) {
            Context context = this.yu;
            if (context instanceof Activity) {
                boolean z10 = !((Activity) context).isFinishing();
                com.bytedance.sdk.openadsdk.lh.ryl rylVar = new com.bytedance.sdk.openadsdk.lh.ryl(this.yu, this.f12230ra);
                rylVar.ouw = new com.bytedance.sdk.openadsdk.lh.ryl.ouw() { // from class: com.bytedance.sdk.openadsdk.common.vm.2
                    @Override // com.bytedance.sdk.openadsdk.lh.ryl.ouw
                    public final void ouw() {
                        vm.this.setVisibility(8);
                    }

                    @Override // com.bytedance.sdk.openadsdk.lh.ryl.ouw
                    public final void lh() {
                        vm.this.setVisibility(0);
                    }

                    @Override // com.bytedance.sdk.openadsdk.lh.ryl.ouw
                    public final void ouw(String str) {
                        vm.this.f12230ra.vt(str);
                        vm.this.setVisibility(0);
                    }

                    @Override // com.bytedance.sdk.openadsdk.lh.ryl.ouw
                    public final void vt() {
                        vm.this.setVisibility(0);
                    }
                };
                rylVar.ouw("", this.vt);
                if (!z10 || rylVar.isShowing()) {
                    return;
                }
                rylVar.show();
            }
        }
    }

    private vm(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private vm(@NonNull Context context, @Nullable AttributeSet attributeSet, byte b10) {
        super(context, attributeSet, 0);
        this.f12228le = false;
        com.bytedance.sdk.openadsdk.lh.tlj tljVar = new com.bytedance.sdk.openadsdk.lh.tlj();
        this.f12230ra = tljVar;
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.vm.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/vm$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_vm$1_onClick_93579315885e91732f4d2754e2df41d3(view);
            }

            public void safedk_vm$1_onClick_93579315885e91732f4d2754e2df41d3(View p10) {
                if (vm.this.f12230ra != null) {
                    vm.this.f12230ra.lh();
                } else {
                    vm.this.vt();
                }
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.ouw = new com.bytedance.sdk.openadsdk.lh.bly(context, tljVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = osn.ouw(getContext(), 20.0f);
        layoutParams.rightMargin = osn.ouw(getContext(), 20.0f);
        this.ouw.setLayoutParams(layoutParams);
        this.ouw.setClickable(true);
        lh();
    }
}
