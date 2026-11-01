package com.vungle.ads.internal.downloader;

import android.util.Base64;
import androidx.annotation.WorkerThread;
import ck.p;
import com.ironsource.C3426d4;
import com.safedk.android.internal.partials.LiftoffMonetizeFilesBridge;
import com.vungle.ads.internal.Constants;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.c;
import mj.r;
import yj.b;

/* JADX INFO: compiled from: DefaultPrivacyIconInjector.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0002¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/downloader/DefaultPrivacyIconInjector;", "", "()V", "injectPrivacyIcon", "Ljava/io/File;", "dir", "writePrivacyFileFromString", "", C3426d4.i.f28530b, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DefaultPrivacyIconInjector {
    public static final DefaultPrivacyIconInjector INSTANCE = new DefaultPrivacyIconInjector();

    private DefaultPrivacyIconInjector() {
    }

    private final boolean writePrivacyFileFromString(File file) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            byte[] bArrDecode = Base64.decode(Constants.LO_PRIVACY_ICON_STRING, 0);
            FileOutputStream fileOutputStreamFileOutputStreamCtor = LiftoffMonetizeFilesBridge.fileOutputStreamCtor(file);
            try {
                fileOutputStreamFileOutputStreamCtor.write(bArrDecode);
                r rVar = r.f64562a;
                b.a(fileOutputStreamFileOutputStreamCtor, null);
                objM3458constructorimpl = Result.m3458constructorimpl(Boolean.TRUE);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(fileOutputStreamFileOutputStreamCtor, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th4));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = bool;
        }
        return ((Boolean) objM3458constructorimpl).booleanValue();
    }

    @WorkerThread
    public final File injectPrivacyIcon(File dir) {
        p.j(dir, "dir");
        File file = new File(dir, Constants.PRIVACY_ICON_FILE_NAME);
        if (file.exists() || writePrivacyFileFromString(file)) {
            return file;
        }
        return null;
    }
}
