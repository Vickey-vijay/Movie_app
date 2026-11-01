package com.bytedance.sdk.openadsdk.core.cf.vt.ouw;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.fkw;
import com.bytedance.adsdk.ugeno.ra.ra;
import com.bytedance.adsdk.ugeno.vt.lh;
import com.bytedance.adsdk.vt.tlj;
import com.bytedance.adsdk.vt.yu;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw extends lh<vt> {
    private float baa;
    private boolean byv;
    private boolean ehk;

    /* JADX INFO: renamed from: fg, reason: collision with root package name */
    private boolean f12660fg;

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    private String f12661fn;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f12662ki;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    public HashMap<String, Bitmap> f12663ln;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    private float f12664nn;
    public String ouw;
    public ImageView.ScaleType qni;
    public ImageView.ScaleType smu;
    private boolean xwt;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw$1, reason: invalid class name */
    public class AnonymousClass1 implements yu {
        @Override // com.bytedance.adsdk.vt.yu
        public final Bitmap ouw(final tlj tljVar) {
            final String strOuw;
            if (tljVar == null) {
                return null;
            }
            String str = tljVar.fkw;
            String str2 = tljVar.yu;
            if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(str, ouw.this.yu);
            } else if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(str2, ouw.this.yu);
            } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                strOuw = null;
            } else {
                strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(str, ouw.this.yu) + com.bytedance.adsdk.ugeno.lh.vt.ouw(str2, ouw.this.yu);
            }
            if (TextUtils.isEmpty(strOuw)) {
                return null;
            }
            Bitmap bitmap = ouw.this.f12663ln.get(strOuw);
            if (bitmap != null) {
                return bitmap;
            }
            fkw.ouw().f10849lh.ouw(ouw.this.bly, strOuw, new com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw() { // from class: com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw.1.1
                @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw
                public final void ouw(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        tlj tljVar2 = tljVar;
                        final Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, tljVar2.ouw, tljVar2.vt, false);
                        ouw.this.f12663ln.put(strOuw, bitmapCreateScaledBitmap);
                        ra.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((vt) ouw.this.fkw).ouw(tljVar.f11343lh, bitmapCreateScaledBitmap);
                            }
                        });
                    }
                }
            });
            return ouw.this.f12663ln.get(strOuw);
        }

        public AnonymousClass1() {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.ouw(str, str2);
        str.hashCode();
        switch (str) {
            case "scaleMode":
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                str2.hashCode();
                switch (str2) {
                    case "center":
                    case "none":
                        scaleType = ImageView.ScaleType.CENTER;
                        break;
                    case "fit":
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                        break;
                    case "crop":
                        scaleType = ImageView.ScaleType.CENTER_CROP;
                        break;
                    case "fill":
                        scaleType = ImageView.ScaleType.FIT_XY;
                        break;
                }
                this.smu = scaleType;
                break;
            case "scaleType":
                ImageView.ScaleType scaleType2 = ImageView.ScaleType.FIT_XY;
                str2.hashCode();
                switch (str2) {
                    case "center":
                        scaleType2 = ImageView.ScaleType.CENTER;
                        break;
                    case "fitEnd":
                        scaleType2 = ImageView.ScaleType.FIT_END;
                        break;
                    case "fitStart":
                        scaleType2 = ImageView.ScaleType.FIT_START;
                        break;
                    case "centerInside":
                        scaleType2 = ImageView.ScaleType.CENTER_INSIDE;
                        break;
                    case "fitXY":
                        scaleType2 = ImageView.ScaleType.FIT_XY;
                        break;
                    case "fitCenter":
                        scaleType2 = ImageView.ScaleType.FIT_CENTER;
                        break;
                    case "centerCrop":
                        scaleType2 = ImageView.ScaleType.CENTER_CROP;
                        break;
                }
                this.qni = scaleType2;
                break;
            case "progress":
                this.baa = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case "imagePath":
                this.f12661fn = str2;
                break;
            case "autoReverse":
                this.byv = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, false);
                break;
            case "src":
                this.ouw = com.bytedance.sdk.openadsdk.core.cf.lh.ouw(str2);
                break;
            case "loop":
                if (!ex()) {
                    this.ehk = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, false);
                    break;
                } else {
                    this.f12662ki = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0);
                    break;
                }
                break;
            case "speed":
                this.f12664nn = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 1.0f);
                break;
            case "autoPlay":
                this.xwt = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, false);
                break;
            case "autoplay":
                this.f12660fg = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() {
        String str;
        super.vt();
        ((vt) this.fkw).setProgress(this.baa);
        if (this.f12664nn <= 0.0f) {
            this.f12664nn = 1.0f;
        }
        ((vt) this.fkw).setSpeed(this.f12664nn);
        if (this.ouw.startsWith("local")) {
            String str2 = this.ouw;
            if (TextUtils.isEmpty(str2) || !str2.contains("local")) {
                str = "";
            } else if (str2.contains("shake_phone")) {
                str = "lottie_json/shake_phone.json";
            } else if (str2.contains("swipe_right")) {
                str = "lottie_json/swipe_right.json";
            } else {
                str = "";
            }
            ((vt) this.fkw).setAnimation(str);
            ((vt) this.fkw).setImageAssetsFolder(this.f12661fn);
        } else {
            ((vt) this.fkw).setAnimationFromUrl(this.ouw);
        }
        ((vt) this.fkw).setImageAssetDelegate(new AnonymousClass1());
        if (ex()) {
            ((vt) this.fkw).setScaleType(this.smu);
        } else {
            ((vt) this.fkw).setScaleType(this.qni);
        }
        if (ex()) {
            ((vt) this.fkw).setRepeatCount(this.f12662ki);
        } else {
            ((vt) this.fkw).ouw(this.ehk);
        }
        if (!ex()) {
            T t10 = this.fkw;
            if (t10 != 0) {
                ((vt) t10).ouw();
                return;
            }
            return;
        }
        T t11 = this.fkw;
        if (t11 == 0 || !this.f12660fg) {
            return;
        }
        ((vt) t11).ouw();
    }

    public ouw(Context context) {
        super(context);
        this.f12661fn = "images";
        this.f12660fg = true;
        this.f12664nn = 1.0f;
        this.qni = ImageView.ScaleType.FIT_CENTER;
        this.smu = ImageView.ScaleType.FIT_XY;
        this.f12663ln = new HashMap<>();
    }

    public final void ouw(AnimatorListenerAdapter animatorListenerAdapter) {
        ((vt) this.fkw).ouw(animatorListenerAdapter);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        vt vtVar = new vt(this.vt);
        vtVar.f12666lh = this;
        return vtVar;
    }
}
