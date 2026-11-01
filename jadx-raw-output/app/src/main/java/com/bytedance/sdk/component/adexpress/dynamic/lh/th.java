package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.le.ksc;
import com.bytedance.sdk.component.utils.vpp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class th implements ra<ksc> {
    private String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.tlj f11414le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw f11415lh;
    private ksc ouw;
    private Context vt;
    private com.bytedance.sdk.component.adexpress.dynamic.yu.ra yu;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final /* bridge */ /* synthetic */ ViewGroup lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void ouw() {
        ksc kscVar = this.ouw;
        kscVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.le.ksc.1
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    ksc.this.f11507le.ouw();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void vt() {
        this.ouw.clearAnimation();
    }

    public th(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar, String str, com.bytedance.sdk.component.adexpress.dynamic.yu.tlj tljVar) {
        this.vt = context;
        this.f11415lh = fkwVar;
        this.yu = raVar;
        this.fkw = str;
        this.f11414le = tljVar;
        int i10 = raVar.yu.f11461xn;
        final com.bytedance.sdk.component.adexpress.dynamic.le.ouw dynamicClickListener = fkwVar.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.fkw)) {
            Context context2 = this.vt;
            ksc kscVar = new ksc(context2, com.bytedance.sdk.component.adexpress.lh.ouw.ouw(context2), this.f11414le);
            this.ouw = kscVar;
            if (kscVar.getWriggleLayout() != null) {
                this.ouw.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.ouw.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.yu.yu.f11436fg)) {
                    this.ouw.getTopTextView().setText(vpp.vt(this.vt, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.ouw.getTopTextView().setText(this.yu.yu.f11436fg);
                }
            }
        } else {
            Context context3 = this.vt;
            this.ouw = new ksc(context3, com.bytedance.sdk.component.adexpress.lh.ouw.ouw(context3), this.f11414le);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.ouw.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.vt, i10)));
        this.ouw.setLayoutParams(layoutParams);
        this.ouw.setShakeText(this.yu.yu.f11460vm);
        this.ouw.setClipChildren(false);
        final View wriggleProgressIv = this.ouw.getWriggleProgressIv();
        this.ouw.setOnShakeViewListener(new ksc.ouw() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lh.th.1
        });
    }
}
