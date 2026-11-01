package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public interface NativeAdDataInterface {

    public static class Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable f29557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f29558b;

        public final Drawable getDrawable() {
            return this.f29557a;
        }

        public final Uri getUri() {
            return this.f29558b;
        }

        public Image(Drawable drawable, Uri uri) {
            this.f29557a = drawable;
            this.f29558b = uri;
        }
    }

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Image getIcon();

    String getTitle();
}
