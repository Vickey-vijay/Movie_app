package com.vungle.ads.internal.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import ck.p;
import com.iab.omid.library.vungle.Omid;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.reporters.b;
import com.vungle.ads.R;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import lk.c;
import mj.r;
import yj.k;

/* JADX INFO: compiled from: OMInjector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\"J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0006\u0010\f\u001a\u00020\u000bJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\r\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001f¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/omsdk/OMInjector;", "", "", "getOMSessionJS", "", "resId", "loadJsFromRaw", b.f44683d, "Ljava/io/File;", "outputFile", "writeToFile", "Lmj/r;", C3426d4.a.f28413f, "dir", "", "injectJsFiles$vungle_ads_release", "(Ljava/io/File;)Ljava/util/List;", "injectJsFiles", "getOMSDKJS$vungle_ads_release", "()Ljava/lang/String;", "getOMSDKJS", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/os/Handler;", "uiHandler", "Landroid/os/Handler;", "Ljava/util/concurrent/atomic/AtomicReference;", "cachedOMSDKJS", "Ljava/util/concurrent/atomic/AtomicReference;", "cachedOMSessionJS", "<init>", "(Landroid/content/Context;)V", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class OMInjector {
    private static final String TAG = "OMInjector";
    private AtomicReference<String> cachedOMSDKJS;
    private AtomicReference<String> cachedOMSessionJS;
    private final Context context;
    private final Handler uiHandler;

    private final String loadJsFromRaw(@RawRes int resId) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            InputStream inputStreamOpenRawResource = this.context.getResources().openRawResource(resId);
            p.i(inputStreamOpenRawResource, "context.resources.openRawResource(resId)");
            Reader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, c.f63591b);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String strE = k.e(bufferedReader);
                yj.b.a(bufferedReader, null);
                objM3458constructorimpl = Result.m3458constructorimpl(strE);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    yj.b.a(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th4));
        }
        return (String) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }

    public OMInjector(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.cachedOMSDKJS = new AtomicReference<>(null);
        this.cachedOMSessionJS = new AtomicReference<>(null);
    }

    private final String getOMSessionJS() {
        String str = this.cachedOMSessionJS.get();
        if (str != null) {
            return str;
        }
        String strLoadJsFromRaw = loadJsFromRaw(R.raw.omid_session_client_v1_5_7);
        this.cachedOMSessionJS.set(strLoadJsFromRaw);
        return strLoadJsFromRaw;
    }

    private final File writeToFile(String lines, File outputFile) throws IOException {
        if (lines == null) {
            throw new IOException("omsdk js must not be null");
        }
        FileWriter fileWriter = new FileWriter(outputFile);
        try {
            fileWriter.write(lines);
            fileWriter.flush();
            yj.b.a(fileWriter, null);
            return outputFile;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                yj.b.a(fileWriter, th2);
                throw th3;
            }
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getOMSDKJS$vungle_ads_release() {
        String str = this.cachedOMSDKJS.get();
        if (str != null) {
            return str;
        }
        String strLoadJsFromRaw = loadJsFromRaw(R.raw.omsdk_v1_5_7);
        this.cachedOMSDKJS.set(strLoadJsFromRaw);
        return strLoadJsFromRaw;
    }

    public final void init() {
        this.uiHandler.post(new Runnable() { // from class: com.vungle.ads.internal.omsdk.a
            @Override // java.lang.Runnable
            public final void run() {
                OMInjector.m3251init$lambda2(this.f45451b);
            }
        });
    }

    @WorkerThread
    public final List<File> injectJsFiles$vungle_ads_release(File dir) throws IOException {
        p.j(dir, "dir");
        ArrayList arrayList = new ArrayList();
        File file = new File(dir, Constants.OM_SDK_JS);
        if (!file.exists()) {
            Logger.INSTANCE.d(TAG, "injecting omsdk.js to " + file.getAbsolutePath());
            String oMSDKJS$vungle_ads_release = getOMSDKJS$vungle_ads_release();
            if (oMSDKJS$vungle_ads_release != null) {
                writeToFile(oMSDKJS$vungle_ads_release, file);
            }
            arrayList.add(file);
        }
        File file2 = new File(dir, Constants.OM_SESSION_JS);
        if (!file2.exists()) {
            Logger.INSTANCE.d(TAG, "injecting omsdk-session.js to " + file2.getAbsolutePath());
            String oMSessionJS = getOMSessionJS();
            if (oMSessionJS != null) {
                writeToFile(oMSessionJS, file2);
            }
            arrayList.add(file2);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final void m3251init$lambda2(OMInjector oMInjector) {
        Object objM3458constructorimpl;
        p.j(oMInjector, "this$0");
        try {
            Result.a aVar = Result.Companion;
            if (!Omid.isActive()) {
                Omid.activate(oMInjector.context);
            }
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl != null) {
            Logger.INSTANCE.e("OMSDK", "error: " + thM3461exceptionOrNullimpl.getLocalizedMessage());
        }
    }
}
