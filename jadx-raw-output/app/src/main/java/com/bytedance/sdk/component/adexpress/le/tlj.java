package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class tlj extends com.bytedance.adsdk.vt.le {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private Map<String, Bitmap> f11538lh;
    private String yu;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setAnimationsLoop(boolean z10) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setLottieAdDescMaxLength(int i10) {
    }

    public void setLottieAdTitleMaxLength(int i10) {
    }

    public void setLottieAppNameMaxLength(int i10) {
    }

    public static class ouw implements com.bytedance.sdk.component.fkw.rn {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final String f11540lh;
        private final WeakReference<tlj> ouw;
        private final com.bytedance.adsdk.vt.tlj vt;
        private final Map<String, Bitmap> yu;

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(int i10, String str, Throwable th2) {
        }

        public ouw(tlj tljVar, com.bytedance.adsdk.vt.tlj tljVar2, String str, Map<String, Bitmap> map) {
            this.ouw = new WeakReference<>(tljVar);
            this.vt = tljVar2;
            this.f11540lh = str;
            this.yu = map;
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
            Object objVt = cfVar.vt();
            if (objVt instanceof Bitmap) {
                com.bytedance.adsdk.vt.tlj tljVar = this.vt;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objVt, tljVar.ouw, tljVar.vt, false);
                this.yu.put(this.f11540lh, bitmapCreateScaledBitmap);
                tlj tljVar2 = this.ouw.get();
                if (tljVar2 != null) {
                    tljVar2.ouw(this.vt.f11343lh, bitmapCreateScaledBitmap);
                }
            }
        }
    }

    public void setImageLottieTosPath(String str) {
        this.yu = str;
    }

    public final void yu() {
        if (TextUtils.isEmpty(this.yu)) {
            return;
        }
        setProgress(0.0f);
        ouw(true);
        setAnimationFromUrl(this.yu);
        setImageAssetDelegate(new com.bytedance.adsdk.vt.yu() { // from class: com.bytedance.sdk.component.adexpress.le.tlj.1
            @Override // com.bytedance.adsdk.vt.yu
            public final Bitmap ouw(final com.bytedance.adsdk.vt.tlj tljVar) {
                final String str = tljVar.f11343lh;
                String str2 = tljVar.fkw;
                String str3 = tljVar.yu;
                if (TextUtils.equals(str, "image_0") && TextUtils.equals(str3, "Lark20201123-180048_2.png")) {
                    str3 = "hand.png";
                }
                Bitmap bitmap = (Bitmap) tlj.this.f11538lh.get(str);
                if (bitmap != null) {
                    return bitmap;
                }
                com.bytedance.sdk.component.utils.ko.ouw("DynamicLottieView", "dirName is : ", str2, "fileName is : ", str3);
                if (TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
                    if (!TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2)) {
                        str2 = str3;
                    } else if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
                        str2 = "";
                    } else {
                        str2 = str2 + str3;
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    return null;
                }
                com.bytedance.sdk.component.fkw.tlj tljVarOuw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().yu.ouw(str2).lh(2).ouw(new com.bytedance.sdk.component.fkw.pno() { // from class: com.bytedance.sdk.component.adexpress.le.tlj.1.1
                    @Override // com.bytedance.sdk.component.fkw.pno
                    public final Bitmap ouw(Bitmap bitmap2) {
                        com.bytedance.adsdk.vt.tlj tljVar2 = tljVar;
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, tljVar2.ouw, tljVar2.vt, false);
                        tlj.this.f11538lh.put(str, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                tlj tljVar2 = tlj.this;
                tljVarOuw.vt(new ouw(tljVar2, tljVar, str, tljVar2.f11538lh));
                return (Bitmap) tlj.this.f11538lh.get(str);
            }
        });
        ouw();
    }

    public tlj(Context context) {
        super(context);
        this.f11538lh = new HashMap();
    }
}
