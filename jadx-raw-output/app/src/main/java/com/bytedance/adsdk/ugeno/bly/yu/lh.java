package com.bytedance.adsdk.ugeno.bly.yu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.le;
import com.bytedance.adsdk.ugeno.fkw;
import com.bytedance.adsdk.ugeno.ra.ra;
import com.bytedance.adsdk.ugeno.ra.yu;

/* JADX INFO: loaded from: classes4.dex */
public class lh extends com.bytedance.adsdk.ugeno.vt.lh<ouw> {
    private float byv;
    private float ehk;

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    private int f10780fn;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    public ImageView.ScaleType f10781ln;
    public String ouw;
    public boolean qni;
    public String smu;

    @Override // com.bytedance.adsdk.ugeno.vt.lh, com.bytedance.adsdk.ugeno.yu
    public final void le() {
        super.le();
        ((ouw) this.fkw).post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bly.yu.lh.4
            @Override // java.lang.Runnable
            public final void run() {
                Drawable drawable = ((ouw) lh.this.fkw).getDrawable();
                if (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) {
                    return;
                }
                ((AnimatedImageDrawable) drawable).start();
            }
        });
    }

    public final void mwh(String str) {
        this.ouw = str;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public void ouw(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.ouw(str, str2);
        str.hashCode();
        switch (str) {
            case "scaleMode":
            case "scaleType":
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                str2.hashCode();
                switch (str2) {
                    case "center":
                        scaleType = ImageView.ScaleType.CENTER;
                        break;
                    case "fitEnd":
                        scaleType = ImageView.ScaleType.FIT_END;
                        break;
                    case "fitStart":
                        scaleType = ImageView.ScaleType.FIT_START;
                        break;
                    case "centerInside":
                        scaleType = ImageView.ScaleType.CENTER_INSIDE;
                        break;
                    case "fit":
                    case "fitCenter":
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                        break;
                    case "crop":
                    case "centerCrop":
                        scaleType = ImageView.ScaleType.CENTER_CROP;
                        break;
                    case "fill":
                    case "fitXY":
                        scaleType = ImageView.ScaleType.FIT_XY;
                        break;
                }
                this.f10781ln = scaleType;
                break;
            case "imageBlur":
                this.byv = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, -1.0f);
                break;
            case "isBgGaussianBlur":
                this.qni = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, false);
                break;
            case "src":
                this.ouw = str2;
                break;
            case "tintColor":
                this.f10780fn = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ViewCompat.MEASURED_STATE_MASK);
                break;
            case "imageBgBlur":
                this.ehk = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, -1.0f);
                break;
        }
    }

    public String pno() {
        return this.smu;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh, com.bytedance.adsdk.ugeno.yu
    public final void ra() {
        super.ra();
        Drawable drawable = ((ouw) this.fkw).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) {
            return;
        }
        ((AnimatedImageDrawable) drawable).stop();
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public void vt() {
        super.vt();
        if (!TextUtils.isEmpty(this.ouw)) {
            ((ouw) this.fkw).setImageDrawable(null);
            if (this.ouw.startsWith("local://")) {
                try {
                    String strReplace = this.ouw.replace("local://", "");
                    if (TextUtils.equals(pno(), "raw")) {
                        ((ouw) this.fkw).setImageResource(yu.ouw(this.vt, strReplace));
                    } else {
                        ((ouw) this.fkw).setImageResource(yu.vt(this.vt, strReplace));
                    }
                } catch (Throwable unused) {
                }
            } else if (this.ouw.startsWith("@")) {
                try {
                    ((ouw) this.fkw).setImageResource(Integer.parseInt(this.ouw.substring(1)));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } else if (this.byv > 0.0f) {
                fkw.ouw().f10849lh.ouw(this.bly, this.ouw, new com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw() { // from class: com.bytedance.adsdk.ugeno.bly.yu.lh.1
                    @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw
                    public final void ouw(Bitmap bitmap) {
                        if (bitmap == null) {
                            if (lh.this.ms != null) {
                                le unused2 = lh.this.ms;
                                return;
                            }
                            return;
                        }
                        if (lh.this.ms != null) {
                            le unused3 = lh.this.ms;
                        }
                        final Bitmap bitmapOuw = ra.ouw(lh.this.vt, bitmap, (int) lh.this.byv);
                        if (bitmapOuw != null) {
                            ra.ouw(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bly.yu.lh.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((ouw) lh.this.fkw).setImageBitmap(bitmapOuw);
                                }
                            });
                        }
                        lh lhVar = lh.this;
                        if (lhVar.qni || lhVar.ehk > 0.0f) {
                            Bitmap bitmapOuw2 = ra.ouw(lh.this.vt, bitmap, lh.this.ehk > 0.0f ? (int) lh.this.ehk : 10);
                            if (bitmapOuw2 != null) {
                                final BitmapDrawable bitmapDrawable = new BitmapDrawable(lh.this.vt.getResources(), bitmapOuw2);
                                ra.ouw(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bly.yu.lh.1.2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ((ouw) lh.this.fkw).setBackground(bitmapDrawable);
                                    }
                                });
                            }
                        }
                    }
                });
            } else {
                com.bytedance.adsdk.ugeno.ouw ouwVar = fkw.ouw().f10849lh;
                cf cfVar = this.bly;
                String str = this.ouw;
                T t10 = this.fkw;
                ImageView imageView = (ImageView) t10;
                int width = ((ouw) t10).getWidth();
                int height = ((ouw) this.fkw).getHeight();
                new com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw() { // from class: com.bytedance.adsdk.ugeno.bly.yu.lh.2
                    @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw
                    public final void ouw(Bitmap bitmap) {
                        if (bitmap == null) {
                            if (lh.this.ms != null) {
                                le unused2 = lh.this.ms;
                            }
                        } else if (lh.this.ms != null) {
                            le unused3 = lh.this.ms;
                        }
                    }
                };
                ouwVar.ouw(cfVar, str, imageView, width, height);
                if (this.qni || this.ehk > 0.0f) {
                    fkw.ouw().f10849lh.ouw(this.bly, this.ouw, new com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw() { // from class: com.bytedance.adsdk.ugeno.bly.yu.lh.3
                        @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0071ouw
                        public final void ouw(Bitmap bitmap) {
                            if (bitmap == null) {
                                return;
                            }
                            final Bitmap bitmapOuw = ra.ouw(lh.this.vt, bitmap, lh.this.ehk > 0.0f ? (int) lh.this.ehk : 10);
                            ra.ouw(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bly.yu.lh.3.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (bitmapOuw != null) {
                                        ((ouw) lh.this.fkw).setBackground(new BitmapDrawable(lh.this.vt.getResources(), bitmapOuw));
                                    }
                                }
                            });
                        }
                    });
                }
            }
        }
        ((ouw) this.fkw).setScaleType(this.f10781ln);
        ((ouw) this.fkw).setBorderColor(this.yhj);
        ((ouw) this.fkw).setCornerRadius(this.ux);
        ((ouw) this.fkw).setBorderWidth(this.yib);
        int i10 = this.f10780fn;
        if (i10 != -1) {
            ((ouw) this.fkw).setColorFilter(i10);
        }
    }

    public lh(Context context) {
        super(context);
        this.f10781ln = ImageView.ScaleType.FIT_XY;
        this.f10780fn = -1;
        this.byv = -1.0f;
        this.ehk = -1.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        ouw ouwVar = new ouw(this.vt);
        ouwVar.vt = this;
        return ouwVar;
    }
}
