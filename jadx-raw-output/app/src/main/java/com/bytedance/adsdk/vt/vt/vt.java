package com.bytedance.adsdk.vt.vt;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.vt.le.pno;
import com.bytedance.adsdk.vt.tlj;
import com.bytedance.adsdk.vt.yu;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class vt {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static final Object f11351lh = new Object();
    private final String fkw;
    public yu ouw;
    public final Map<String, tlj> vt;
    private final Context yu;

    public final Bitmap ouw(String str) {
        tlj tljVar = this.vt.get(str);
        if (tljVar == null) {
            return null;
        }
        Bitmap bitmap = tljVar.f11341cf;
        if (bitmap != null) {
            return bitmap;
        }
        yu yuVar = this.ouw;
        if (yuVar != null) {
            return yuVar.ouw(tljVar);
        }
        Context context = this.yu;
        if (context == null) {
            return null;
        }
        String str2 = tljVar.yu;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (str2.startsWith("data:") && str2.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                return ouw(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e10) {
                com.bytedance.adsdk.vt.le.yu.ouw("data URL did not have correct base64 format.", e10);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.fkw)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.fkw + str2), null, options);
                if (bitmapDecodeStream != null) {
                    return ouw(str, pno.ouw(bitmapDecodeStream, tljVar.ouw, tljVar.vt));
                }
                com.bytedance.adsdk.vt.le.yu.vt("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e11) {
                com.bytedance.adsdk.vt.le.yu.ouw("Unable to decode image `" + str + "`.", e11);
                return null;
            }
        } catch (IOException e12) {
            com.bytedance.adsdk.vt.le.yu.ouw("Unable to open asset.", e12);
            return null;
        }
    }

    public vt(Drawable.Callback callback, String str, yu yuVar, Map<String, tlj> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.fkw = str + '/';
        } else {
            this.fkw = str;
        }
        this.vt = map;
        this.ouw = yuVar;
        if (!(callback instanceof View)) {
            this.yu = null;
        } else {
            this.yu = ((View) callback).getContext().getApplicationContext();
        }
    }

    public final boolean ouw(Context context) {
        return (context == null && this.yu == null) || this.yu.equals(context);
    }

    public final Bitmap ouw(String str, Bitmap bitmap) {
        synchronized (f11351lh) {
            this.vt.get(str).f11341cf = bitmap;
        }
        return bitmap;
    }
}
