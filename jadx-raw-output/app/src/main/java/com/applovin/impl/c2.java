package com.applovin.impl;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinExtras;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7116b;

    public Drawable a() {
        Object obj = this.f7115a.get(AppLovinExtras.Keys.KEY_WATERMARK);
        if (!a(obj)) {
            this.f7116b.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7116b.O().b("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.applovin.impl.sdk.k.o().getResources(), BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th2) {
            this.f7116b.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7116b.O().a("GoogleWatermarkGenerator", "Failed to render watermark", th2);
            }
            return null;
        }
    }

    public String b() {
        return "google watermark";
    }

    public boolean c() {
        return a(this.f7115a.get(AppLovinExtras.Keys.KEY_WATERMARK));
    }

    public c2(Map map, com.applovin.impl.sdk.k kVar) {
        this.f7115a = map == null ? Collections.emptyMap() : map;
        this.f7116b = kVar;
    }

    private boolean a(Object obj) {
        return (obj instanceof String) && StringUtils.isValidString((String) obj);
    }
}
