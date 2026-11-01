package com.yandex.div.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.PictureDrawable;
import android.util.Base64;
import androidx.annotation.WorkerThread;
import bk.a;
import bk.l;
import ck.p;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.logging.Severity;
import com.yandex.div.svg.SvgDecoder;
import java.io.ByteArrayInputStream;
import lk.a0;
import lk.x;
import mj.r;

/* JADX INFO: compiled from: DecodeBase64ImageTask.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DecodeBase64ImageTask implements Runnable {
    private final l<ImageRepresentation, r> onDecoded;
    private String rawBase64string;
    private final boolean synchronous;

    private final Bitmap decodeToBitmap(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (IllegalArgumentException unused) {
            KLog kLog = KLog.INSTANCE;
            if (!kLog.isAtLeast(Severity.ERROR)) {
                return null;
            }
            kLog.print(6, "Div", "Problem with decoding base-64 preview image occurred");
            return null;
        }
    }

    private final PictureDrawable decodeToPictureDrawable(byte[] bArr) {
        return new SvgDecoder(false, 1, null).decode(new ByteArrayInputStream(bArr));
    }

    private final String extractFromDataUrl(String str) {
        if (!x.R(str, "data:", false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(a0.k0(str, ',', 0, false, 6, null) + 1);
        p.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    private final boolean isSvg(String str) {
        return x.R(str, "data:image/svg", false, 2, null);
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public void run() {
        try {
            byte[] bArrDecode = Base64.decode(extractFromDataUrl(this.rawBase64string), 0);
            final ImageRepresentation imageRepresentationM3306boximpl = null;
            if (isSvg(this.rawBase64string)) {
                PictureDrawable pictureDrawableDecodeToPictureDrawable = decodeToPictureDrawable(bArrDecode);
                PictureDrawable pictureDrawableM3295asImageRepresentation9g2PFUk = pictureDrawableDecodeToPictureDrawable != null ? m3295asImageRepresentation9g2PFUk(pictureDrawableDecodeToPictureDrawable) : null;
                if (pictureDrawableM3295asImageRepresentation9g2PFUk != null) {
                    imageRepresentationM3306boximpl = ImageRepresentation.PictureDrawable.m3312boximpl(pictureDrawableM3295asImageRepresentation9g2PFUk);
                }
            } else {
                Bitmap bitmapDecodeToBitmap = decodeToBitmap(bArrDecode);
                Bitmap bitmapM3296asImageRepresentationMlk_otY = bitmapDecodeToBitmap != null ? m3296asImageRepresentationMlk_otY(bitmapDecodeToBitmap) : null;
                if (bitmapM3296asImageRepresentationMlk_otY != null) {
                    imageRepresentationM3306boximpl = ImageRepresentation.Bitmap.m3306boximpl(bitmapM3296asImageRepresentationMlk_otY);
                }
            }
            if (this.synchronous) {
                this.onDecoded.invoke(imageRepresentationM3306boximpl);
            } else {
                UiThreadHandler.INSTANCE.postOnMainThread(new a<r>() { // from class: com.yandex.div.core.DecodeBase64ImageTask.run.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // bk.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        DecodeBase64ImageTask.this.onDecoded.invoke(imageRepresentationM3306boximpl);
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.ERROR)) {
                kLog.print(6, "Div", "Bad base-64 image preview");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DecodeBase64ImageTask(String str, boolean z10, l<? super ImageRepresentation, r> lVar) {
        this.rawBase64string = str;
        this.synchronous = z10;
        this.onDecoded = lVar;
    }

    /* JADX INFO: renamed from: asImageRepresentation-9g2PFUk, reason: not valid java name */
    private final PictureDrawable m3295asImageRepresentation9g2PFUk(PictureDrawable pictureDrawable) {
        return ImageRepresentation.PictureDrawable.m3313constructorimpl(pictureDrawable);
    }

    /* JADX INFO: renamed from: asImageRepresentation-Mlk_otY, reason: not valid java name */
    private final Bitmap m3296asImageRepresentationMlk_otY(Bitmap bitmap) {
        return ImageRepresentation.Bitmap.m3307constructorimpl(bitmap);
    }
}
