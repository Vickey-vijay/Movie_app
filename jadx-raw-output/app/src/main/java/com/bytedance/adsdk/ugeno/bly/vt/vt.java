package com.bytedance.adsdk.ugeno.bly.vt;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public class vt extends com.bytedance.adsdk.ugeno.vt.ouw<com.bytedance.adsdk.ugeno.bly.vt.ouw> {

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.bly.vt.ouw f10779ln;

    public static class ouw extends com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw {
        public int ksc;

        @Override // com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw
        public final void ouw(Context context, String str, String str2) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.ouw(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                int i10 = -1;
                if (!TextUtils.isEmpty(str2) && (strArrSplit = str2.split("\\|")) != null && strArrSplit.length > 0) {
                    int i11 = 0;
                    for (String str3 : strArrSplit) {
                        str3.hashCode();
                        int i12 = 5;
                        switch (str3) {
                            case "bottom":
                                i12 = 80;
                                break;
                            case "center":
                                i12 = 17;
                                break;
                            case "center_vertical":
                                i12 = 16;
                                break;
                            case "top":
                                i12 = 48;
                                break;
                            case "left":
                                i12 = 3;
                                break;
                            case "right":
                                break;
                            case "center_horizontal":
                                i12 = 1;
                                break;
                            default:
                                i12 = -1;
                                break;
                        }
                        i11 |= i12;
                    }
                    i10 = i11;
                }
                this.ksc = i10;
            }
        }

        public ouw(com.bytedance.adsdk.ugeno.vt.ouw ouwVar) {
            super(ouwVar);
            this.ksc = -1;
        }

        @Override // com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw
        public final /* synthetic */ ViewGroup.LayoutParams ouw() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.ouw, (int) this.vt);
            layoutParams.leftMargin = (int) this.f11007le;
            layoutParams.rightMargin = (int) this.f11009ra;
            layoutParams.topMargin = (int) this.pno;
            layoutParams.bottomMargin = (int) this.bly;
            layoutParams.gravity = this.ksc;
            return layoutParams;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw
    public final com.bytedance.adsdk.ugeno.vt.ouw.C0074ouw bly() {
        return new ouw(this);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        com.bytedance.adsdk.ugeno.bly.vt.ouw ouwVar = new com.bytedance.adsdk.ugeno.bly.vt.ouw(this.vt);
        this.f10779ln = ouwVar;
        ouwVar.ouw = this;
        return ouwVar;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw, com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() {
        this.f10779ln.setEventMap(this.mwe);
        super.vt();
    }

    public vt(Context context) {
        super(context);
    }
}
