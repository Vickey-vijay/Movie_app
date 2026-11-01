package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zih implements com.bytedance.sdk.openadsdk.mwh.pno {
    public int bly;
    public boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.lh.ra f12424le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.component.bly.le f12425lh;
    public final Activity ouw;
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final AtomicBoolean f12426ra = new AtomicBoolean(false);
    private volatile boolean tlj;
    public final vpp vt;
    public ImageView yu;

    public final void ouw(final int i10, final String str) {
        if (this.tlj) {
            return;
        }
        this.tlj = true;
        if (i10 != Integer.MAX_VALUE) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(new com.bytedance.sdk.component.pno.pno("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.zih.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i10);
                        jSONObject.put("error_code", i10);
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put("url", str2);
                        }
                        vpp vppVar = zih.this.vt;
                        com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, vppVar.vt(), "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            vpp vppVar = this.vt;
            com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, vppVar.vt(), "load_vast_endcard_success", (JSONObject) null);
        }
    }

    public static class ouw implements com.bytedance.sdk.component.fkw.rn {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final WeakReference<zih> f12428lh;
        private final WeakReference<ImageView> ouw;
        private final String vt;
        private final AtomicBoolean yu;

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
            zih zihVar;
            ImageView imageView = this.ouw.get();
            if (imageView == null || (zihVar = this.f12428lh.get()) == null || cfVar == null) {
                return;
            }
            Object objVt = cfVar.vt();
            if (objVt == null) {
                zihVar.ouw(-1, this.vt);
                return;
            }
            if (objVt instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objVt);
            } else if (objVt instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && (objVt instanceof AnimatedImageDrawable)) {
                    ((AnimatedImageDrawable) objVt).start();
                }
                imageView.setImageDrawable((Drawable) objVt);
            }
            this.yu.set(true);
            zihVar.ouw(Integer.MAX_VALUE, null);
        }

        public ouw(ImageView imageView, String str, zih zihVar, AtomicBoolean atomicBoolean) {
            this.ouw = new WeakReference<>(imageView);
            this.vt = str;
            this.f12428lh = new WeakReference<>(zihVar);
            this.yu = atomicBoolean;
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(int i10, String str, @Nullable Throwable th2) {
            zih zihVar;
            ImageView imageView = this.ouw.get();
            if (imageView == null || (zihVar = this.f12428lh.get()) == null) {
                return;
            }
            imageView.setVisibility(8);
            zihVar.ouw(-2, this.vt);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mwh.pno
    public final void vt(int i10) {
        int i11 = this.bly;
        if (i11 == 0 && i10 > 0) {
            this.vt.cu.ouw.ouw.pno(this.pno.ex.fkw());
        } else if (i11 > 0 && i10 == 0) {
            this.vt.cu.ouw.ouw.ra(this.pno.ex.fkw());
        }
        this.bly = i10;
    }

    public zih(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.pno = ouwVar;
        this.vt = ouwVar.vt;
        this.ouw = ouwVar.jvy;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean ouw(ko koVar) {
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar;
        com.bytedance.sdk.openadsdk.core.ryl.lh lhVar;
        if (!this.fkw) {
            return false;
        }
        if (this.yu != null && this.f12426ra.get()) {
            this.yu.setVisibility(0);
        } else {
            com.bytedance.sdk.component.bly.le leVar = this.f12425lh;
            if (leVar != null) {
                leVar.setVisibility(0);
                if (this.f12425lh.getWebView() != null) {
                    this.f12425lh.getWebView().setOnTouchListener(this.f12424le);
                }
            }
        }
        vpp vppVar = this.vt;
        if (vppVar == null || (ouwVar = vppVar.cu) == null || (lhVar = ouwVar.f13013lh) == null) {
            return true;
        }
        lhVar.vt(koVar != null ? koVar.fkw() : -1L);
        return true;
    }
}
