package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import kotlin.Result;

/* JADX INFO: loaded from: classes9.dex */
public final class si2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mj.g f82661a = kotlin.b.a(ri2.f82286b);

    public static Bitmap a(String str) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            byte[] bArrDecode = Base64.decode(lk.a0.E0(str, "data:image/png;base64,"), 0);
            if (!lk.x.R(str, "data:image/png;base64,", false, 2, null)) {
                bArrDecode = (bArrDecode.length == 0) ^ true ? nj.l.r((byte[]) f82661a.getValue(), bArrDecode) : new byte[0];
            }
            objM3458constructorimpl = Result.m3458constructorimpl((bArrDecode.length == 0) ^ true ? BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        return (Bitmap) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }
}
