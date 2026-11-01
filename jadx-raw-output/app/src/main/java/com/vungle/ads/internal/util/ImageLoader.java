package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.app.NotificationCompat;
import bk.l;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.C3605n2;
import com.unity3d.services.core.fid.Constants;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import lk.x;
import mj.r;

/* JADX INFO: compiled from: ImageLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J$\u0010\u000b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bJ*\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/util/ImageLoader;", "", "Ljava/util/concurrent/Executor;", "ioExecutor", "Lmj/r;", C3426d4.a.f28413f, "", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "onImageLoaded", "displayImage", "Lkotlin/Function2;", "", "onImageSizeLoaded", "getImageSize", "Ljava/util/concurrent/Executor;", "<init>", "()V", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class ImageLoader {
    private static final String FILE_SCHEME = "file://";
    private Executor ioExecutor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = ImageLoader.class.getSimpleName();
    private static final ImageLoader instance = new ImageLoader();

    private ImageLoader() {
    }

    /* JADX INFO: compiled from: ImageLoader.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/util/ImageLoader$Companion;", "", "()V", "FILE_SCHEME", "", "TAG", "kotlin.jvm.PlatformType", C3605n2.f30210p, "Lcom/vungle/ads/internal/util/ImageLoader;", Constants.GET_INSTANCE, "()Lcom/vungle/ads/internal/util/ImageLoader;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final ImageLoader getInstance() {
            return ImageLoader.instance;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: displayImage$lambda-0, reason: not valid java name */
    public static final void m3292displayImage$lambda0(String str, l lVar) {
        p.j(lVar, "$onImageLoaded");
        if (x.R(str, "file://", false, 2, null)) {
            String strSubstring = str.substring(7);
            p.i(strSubstring, "this as java.lang.String).substring(startIndex)");
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strSubstring);
            if (bitmapDecodeFile != null) {
                lVar.invoke(bitmapDecodeFile);
                return;
            }
            Logger.Companion companion = Logger.INSTANCE;
            String str2 = TAG;
            p.i(str2, "TAG");
            companion.w(str2, "decode bitmap failed.");
        }
    }

    public final void displayImage(final String str, final l<? super Bitmap, r> lVar) {
        p.j(lVar, "onImageLoaded");
        if (this.ioExecutor == null) {
            Logger.Companion companion = Logger.INSTANCE;
            String str2 = TAG;
            p.i(str2, "TAG");
            companion.w(str2, "ImageLoader not initialized.");
            return;
        }
        if (str == null || str.length() == 0) {
            Logger.Companion companion2 = Logger.INSTANCE;
            String str3 = TAG;
            p.i(str3, "TAG");
            companion2.w(str3, "the uri is required.");
            return;
        }
        Executor executor = this.ioExecutor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.b
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.m3292displayImage$lambda0(str, lVar);
                }
            });
        }
    }

    public final void getImageSize(String str, bk.p<? super Integer, ? super Integer, r> pVar) {
        p.j(pVar, "onImageSizeLoaded");
        if ((str == null || str.length() == 0) || !x.R(str, "file://", false, 2, null)) {
            Logger.Companion companion = Logger.INSTANCE;
            String str2 = TAG;
            p.i(str2, "TAG");
            companion.w(str2, "the valid uri is required.");
            return;
        }
        String strSubstring = str.substring(7);
        p.i(strSubstring, "this as java.lang.String).substring(startIndex)");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strSubstring, options);
        pVar.mo1invoke(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public final void init(Executor executor) {
        p.j(executor, "ioExecutor");
        this.ioExecutor = executor;
    }
}
