package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.f2;
import com.applovin.impl.i5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class a extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AppLovinNativeAdImpl f9406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC0047a f9407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f9408i;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0047a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    private Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Attempting to cache resource: " + uri);
        }
        String strA = this.f7705a.G().a(a(), uri.toString(), this.f9406g.getCachePrefix(), Collections.emptyList(), false, false, 1, this.f9408i, f2.a(this.f9406g));
        if (TextUtils.isEmpty(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File fileA = this.f7705a.G().a(strA, a());
        if (fileA != null) {
            Uri uriFromFile = Uri.fromFile(fileA);
            if (uriFromFile != null) {
                return uriFromFile;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Unable to extract Uri from image file");
            }
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.b(this.f7706b, "Unable to retrieve File from cached image filename = " + strA);
        }
        return null;
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.k kVar, InterfaceC0047a interfaceC0047a) {
        super("TaskCacheNativeAd", kVar);
        this.f9408i = UUID.randomUUID().toString();
        this.f9406g = appLovinNativeAdImpl;
        this.f9407h = interfaceC0047a;
    }

    private float a(Uri uri) {
        File file = new File(uri.getPath());
        if (!file.exists()) {
            return -1.0f;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, null, options);
                int i10 = options.outWidth;
                int i11 = options.outHeight;
                if (i10 <= 0 || i11 <= 0) {
                    fileInputStream.close();
                    return -1.0f;
                }
                float f10 = i10 / i11;
                fileInputStream.close();
                return f10;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Failed to calculate aspect ratio", e10);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Begin caching ad #" + this.f9406g.getAdIdNumber() + "...");
        }
        Uri uriB = b(this.f9406g.getIconUri());
        if (uriB != null) {
            this.f9406g.setIconUri(uriB);
        }
        Uri uriB2 = b(this.f9406g.getMainImageUri());
        if (uriB2 != null) {
            this.f9406g.setMainImageUri(uriB2);
            float fA = a(uriB2);
            if (fA > 0.0f) {
                this.f9406g.setMainImageAspectRatio(fA);
            }
        }
        Uri uriB3 = b(this.f9406g.getPrivacyIconUri());
        if (uriB3 != null) {
            this.f9406g.setPrivacyIconUri(uriB3);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Finished caching ad #" + this.f9406g.getAdIdNumber());
        }
        this.f9407h.a(this.f9406g);
    }
}
