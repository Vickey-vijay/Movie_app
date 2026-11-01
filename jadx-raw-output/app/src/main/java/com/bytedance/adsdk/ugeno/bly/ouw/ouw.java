package com.bytedance.adsdk.ugeno.bly.ouw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.bly.le.vt;
import com.bytedance.adsdk.ugeno.fkw;
import com.bytedance.adsdk.ugeno.ra.ra;
import com.bytedance.adsdk.ugeno.ra.yu;

/* JADX INFO: loaded from: classes7.dex */
public final class ouw extends vt {
    private boolean baa;
    private String byv;
    private int ehk;

    /* JADX INFO: renamed from: fg, reason: collision with root package name */
    private boolean f10776fg;

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    private String f10777fn;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.ra.ouw.C0073ouw f10778ki;
    private String qni;
    private String smu;
    private int xwt;

    @Override // com.bytedance.adsdk.ugeno.bly.le.vt, com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() {
        super.vt();
        if (!TextUtils.isEmpty(this.qni)) {
            ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setCompoundDrawables(null, null, null, null);
            if (this.qni.startsWith("local://")) {
                try {
                    String strReplace = this.qni.replace("local://", "");
                    Context context = this.vt;
                    vt(ra.ouw(context, yu.vt(context, strReplace)));
                } catch (Throwable unused) {
                }
            } else {
                fkw.ouw().f10849lh.ouw(this.bly, this.qni, new com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw() { // from class: com.bytedance.adsdk.ugeno.bly.ouw.ouw.1
                    @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw
                    public final void ouw(final Bitmap bitmap) {
                        if (bitmap == null) {
                            return;
                        }
                        ra.ouw(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bly.ouw.ouw.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ouw.this.vt(new BitmapDrawable(ouw.this.vt.getResources(), bitmap));
                            }
                        });
                    }
                });
            }
        }
        ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setGravity(17);
    }

    public ouw(Context context) {
        super(context);
        this.smu = "row";
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void bs() {
        super.bs();
        if (this.f10776fg) {
            ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setTextColor(((vt) this).f10771ln);
        }
        if (this.baa) {
            if (this.qld) {
                ouw(this.yiz);
            } else {
                lh(this.osn);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void fvf() {
        super.fvf();
        if (this.f10776fg) {
            ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setTextColor(this.xwt);
        }
        if (this.baa) {
            if (this.qld) {
                ouw(this.f10778ki);
            } else {
                lh(this.ehk);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bly.le.vt, com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        str.hashCode();
        switch (str) {
            case "direction":
                this.smu = str2;
                break;
            case "highlightTextColor":
            case "highlightedTextColor":
                this.xwt = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ViewCompat.MEASURED_STATE_MASK);
                this.f10776fg = true;
                break;
            case "image":
                this.qni = str2;
                break;
            case "highlightImage":
                this.f10777fn = str2;
                break;
            case "highlightBackgroundColor":
                if (com.bytedance.adsdk.ugeno.ra.ouw.lh(str2)) {
                    this.qld = true;
                    this.f10778ki = com.bytedance.adsdk.ugeno.ra.ouw.vt(str2);
                } else {
                    this.ehk = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ViewCompat.MEASURED_STATE_MASK);
                    this.qld = false;
                }
                this.baa = true;
                break;
            case "highlightBackgroundImage":
                this.byv = str2;
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void vt(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        String str = this.smu;
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1781065991:
                if (str.equals("column_reverse")) {
                    b10 = 2;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    b10 = 1;
                }
                break;
            case -207799939:
                if (str.equals("row_reverse")) {
                    b10 = 0;
                }
                break;
            case 113114:
                if (str.equals("row")) {
                    b10 = 3;
                }
                break;
        }
        if (b10 == 0) {
            ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            return;
        }
        if (b10 == 1) {
            ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        } else if (b10 != 2) {
            ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
        }
    }
}
