package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public final class th {
    public boolean bly;
    public int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f13148le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public float f13149lh;
    public final ouw ouw;
    public float yu;
    private final boolean tlj = false;
    public boolean vt = false;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f13150ra = true;
    public boolean pno = false;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final View.OnTouchListener f13147cf = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.th.1
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/th$1;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            CreativeInfoManager.onViewTouched(g.f44975u, view, motionEvent);
            return safedk_th$1_onTouch_fcfb370339b803a887e2796367140ace(view, motionEvent);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean safedk_th$1_onTouch_fcfb370339b803a887e2796367140ace(View p10, MotionEvent p11) {
            boolean z10;
            if (th.this.ouw.vpp()) {
                return !th.this.vt;
            }
            float x10 = p11.getX();
            float y10 = p11.getY();
            int action = p11.getAction();
            if (action == 0) {
                th thVar = th.this;
                if (p11.getActionMasked() == 0) {
                    int iYu = osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw().getApplicationContext());
                    int iLe = osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw().getApplicationContext());
                    float rawX = p11.getRawX();
                    float rawY = p11.getRawY();
                    float f10 = iYu;
                    if (rawX > f10 * 0.01f && rawX < f10 * 0.99f) {
                        float f11 = iLe;
                        if (rawY > 0.01f * f11 && rawY < f11 * 0.99f) {
                            z10 = false;
                        }
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                thVar.bly = z10;
                th thVar2 = th.this;
                thVar2.f13149lh = x10;
                thVar2.yu = y10;
                thVar2.fkw = (int) x10;
                thVar2.f13148le = (int) y10;
                thVar2.f13150ra = true;
                ouw ouwVar = thVar2.ouw;
                if (ouwVar != null && thVar2.vt) {
                    ouwVar.jg();
                }
            } else if (action == 1) {
                if (Math.abs(x10 - th.this.fkw) > 20.0f || Math.abs(y10 - th.this.f13148le) > 20.0f) {
                    th.this.f13150ra = false;
                }
                th thVar3 = th.this;
                thVar3.f13150ra = true;
                thVar3.pno = false;
                thVar3.f13149lh = 0.0f;
                thVar3.yu = 0.0f;
                thVar3.fkw = 0;
                ouw ouwVar2 = thVar3.ouw;
                if (ouwVar2 != null) {
                    ouwVar2.jg();
                }
                th.this.bly = false;
            } else if (action == 3) {
                th.this.bly = false;
            }
            return !th.this.vt;
        }
    };

    public interface ouw {
        void jg();

        boolean vpp();
    }

    public final void ouw(View view) {
        if (view != null) {
            view.setOnTouchListener(this.f13147cf);
        }
    }

    public th(ouw ouwVar) {
        this.ouw = ouwVar;
    }
}
