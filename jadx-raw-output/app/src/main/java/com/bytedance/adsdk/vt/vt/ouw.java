package com.bytedance.adsdk.vt.vt;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.vt.le.yu;
import com.bytedance.adsdk.vt.lh;
import com.bytedance.adsdk.vt.lh.ra;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw {

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final AssetManager f11349le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public lh f11350lh;
    public final ra<String> ouw = new ra<>();
    public final Map<ra<String>, Typeface> vt = new HashMap();
    private final Map<String, Typeface> fkw = new HashMap();
    public String yu = ".ttf";

    public final Typeface ouw(com.bytedance.adsdk.vt.lh.lh lhVar) {
        String str = lhVar.ouw;
        Typeface typeface = this.fkw.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceCreateFromAsset = null;
        if (this.f11350lh != null && (typefaceCreateFromAsset = lh.vt()) == null) {
            typefaceCreateFromAsset = lh.ouw();
        }
        if (this.f11350lh != null && typefaceCreateFromAsset == null) {
            String strYu = lh.yu();
            if (strYu == null) {
                strYu = lh.lh();
            }
            if (strYu != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.f11349le, strYu);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        Typeface typeface2 = lhVar.yu;
        if (typeface2 != null) {
            return typeface2;
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.f11349le, "fonts/" + str + this.yu);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.fkw.put(str, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public ouw(Drawable.Callback callback, lh lhVar) {
        this.f11350lh = lhVar;
        if (!(callback instanceof View)) {
            yu.vt("LottieDrawable must be inside of a view for images to work.");
            this.f11349le = null;
        } else {
            this.f11349le = ((View) callback).getContext().getAssets();
        }
    }
}
