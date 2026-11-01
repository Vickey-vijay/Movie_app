package com.vungle.ads.internal.session;

import android.content.Context;
import bk.l;
import ck.p;
import cl.d;
import cl.m;
import com.ironsource.C3426d4;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.FutureResult;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import jk.o;
import kotlin.Metadata;
import kotlin.Result;
import mj.r;
import nj.s;
import xk.h;

/* JADX INFO: compiled from: UnclosedAdDetector.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001,B'\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b*\u0010+J \u0010\u0005\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/vungle/ads/internal/session/UnclosedAdDetector;", "", "T", "", "jsonString", "decodeJson", "(Ljava/lang/String;)Ljava/lang/Object;", "", "Lcom/vungle/ads/internal/model/UnclosedAd;", "readUnclosedAdFromFile", "unclosedAdList", "Lmj/r;", "writeUnclosedAdToFile", "ad", "addUnclosedAd", "removeUnclosedAd", "retrieveUnclosedAd", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", JsonStorageKeyNames.SESSION_ID_KEY, "Ljava/lang/String;", "Lcom/vungle/ads/internal/executor/Executors;", "executors", "Lcom/vungle/ads/internal/executor/Executors;", "getExecutors", "()Lcom/vungle/ads/internal/executor/Executors;", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "Ljava/io/File;", C3426d4.i.f28530b, "Ljava/io/File;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "", C3426d4.i.f28564s, "Z", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/internal/executor/Executors;Lcom/vungle/ads/internal/util/PathProvider;)V", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class UnclosedAdDetector {
    private static final String FILENAME = "unclosed_ad";
    private final Context context;
    private final Executors executors;
    private File file;
    private final PathProvider pathProvider;
    private boolean ready;
    private final String sessionId;
    private final CopyOnWriteArrayList<UnclosedAd> unclosedAdList;
    private static final cl.a json = m.b(null, new l<d, r>() { // from class: com.vungle.ads.internal.session.UnclosedAdDetector$Companion$json$1
        @Override // bk.l
        public /* bridge */ /* synthetic */ r invoke(d dVar) {
            invoke2(dVar);
            return r.f64562a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(d dVar) {
            p.j(dVar, "$this$Json");
            dVar.f(true);
            dVar.d(true);
            dVar.e(false);
            dVar.c(true);
        }
    }, 1, null);

    public UnclosedAdDetector(Context context, String str, Executors executors, PathProvider pathProvider) {
        Object objM3458constructorimpl;
        boolean zM3464isSuccessimpl;
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, JsonStorageKeyNames.SESSION_ID_KEY);
        p.j(executors, "executors");
        p.j(pathProvider, "pathProvider");
        this.context = context;
        this.sessionId = str;
        this.executors = executors;
        this.pathProvider = pathProvider;
        this.file = pathProvider.getUnclosedAdFile(FILENAME);
        this.unclosedAdList = new CopyOnWriteArrayList<>();
        if (this.file.exists()) {
            zM3464isSuccessimpl = true;
        } else {
            try {
                Result.a aVar = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(Boolean.valueOf(this.file.createNewFile()));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
            if (thM3461exceptionOrNullimpl != null) {
                Logger.INSTANCE.e("UnclosedAdDetector", "Fail to create unclosed ad file: " + thM3461exceptionOrNullimpl.getMessage());
            }
            zM3464isSuccessimpl = Result.m3464isSuccessimpl(objM3458constructorimpl);
        }
        this.ready = zM3464isSuccessimpl;
    }

    private final /* synthetic */ <T> T decodeJson(String jsonString) {
        cl.a aVar = json;
        el.c cVarA = aVar.a();
        p.p(6, "T");
        xk.b<Object> bVarB = h.b(cVarA, null);
        p.h(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (T) aVar.b(bVarB, jsonString);
    }

    private final List<UnclosedAd> readUnclosedAdFromFile() {
        return !this.ready ? s.k() : (List) new FutureResult(this.executors.getIO_EXECUTOR().submit(new Callable() { // from class: com.vungle.ads.internal.session.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UnclosedAdDetector.m3264readUnclosedAdFromFile$lambda4(this.f45460b);
            }
        })).get(1000L, TimeUnit.MILLISECONDS);
    }

    private final void writeUnclosedAdToFile(List<UnclosedAd> list) {
        if (this.ready) {
            try {
                cl.a aVar = json;
                xk.b<Object> bVarB = h.b(aVar.a(), ck.s.m(List.class, o.f61802c.a(ck.s.l(UnclosedAd.class))));
                p.h(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                final String strC = aVar.c(bVarB, list);
                this.executors.getIO_EXECUTOR().execute(new Runnable() { // from class: com.vungle.ads.internal.session.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        UnclosedAdDetector.m3266writeUnclosedAdToFile$lambda5(this.f45458b, strC);
                    }
                });
            } catch (Throwable th2) {
                Logger.INSTANCE.e("UnclosedAdDetector", "Fail to write unclosed ad file " + th2.getMessage());
            }
        }
    }

    public final void addUnclosedAd(UnclosedAd unclosedAd) {
        p.j(unclosedAd, "ad");
        if (this.ready) {
            unclosedAd.setSessionId(this.sessionId);
            this.unclosedAdList.add(unclosedAd);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final Executors getExecutors() {
        return this.executors;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    public final void removeUnclosedAd(UnclosedAd unclosedAd) {
        p.j(unclosedAd, "ad");
        if (this.ready && this.unclosedAdList.contains(unclosedAd)) {
            this.unclosedAdList.remove(unclosedAd);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final List<UnclosedAd> retrieveUnclosedAd() {
        ArrayList arrayList = new ArrayList();
        if (!this.ready) {
            return arrayList;
        }
        List<UnclosedAd> unclosedAdFromFile = readUnclosedAdFromFile();
        if (unclosedAdFromFile != null) {
            arrayList.addAll(unclosedAdFromFile);
        }
        this.executors.getIO_EXECUTOR().execute(new Runnable() { // from class: com.vungle.ads.internal.session.a
            @Override // java.lang.Runnable
            public final void run() {
                UnclosedAdDetector.m3265retrieveUnclosedAd$lambda3(this.f45457b);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readUnclosedAdFromFile$lambda-4, reason: not valid java name */
    public static final List m3264readUnclosedAdFromFile$lambda4(UnclosedAdDetector unclosedAdDetector) {
        boolean z10;
        p.j(unclosedAdDetector, "this$0");
        try {
            String string = FileUtility.INSTANCE.readString(unclosedAdDetector.file);
            if (string != null && string.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                cl.a aVar = json;
                xk.b<Object> bVarB = h.b(aVar.a(), ck.s.m(List.class, o.f61802c.a(ck.s.l(UnclosedAd.class))));
                p.h(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                return (List) aVar.b(bVarB, string);
            }
            return new ArrayList();
        } catch (Exception e10) {
            Logger.INSTANCE.e("UnclosedAdDetector", "Fail to read unclosed ad file " + e10.getMessage());
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: retrieveUnclosedAd$lambda-3, reason: not valid java name */
    public static final void m3265retrieveUnclosedAd$lambda3(UnclosedAdDetector unclosedAdDetector) {
        p.j(unclosedAdDetector, "this$0");
        try {
            FileUtility.deleteAndLogIfFailed(unclosedAdDetector.file);
        } catch (Exception e10) {
            Logger.INSTANCE.e("UnclosedAdDetector", "Fail to delete file " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeUnclosedAdToFile$lambda-5, reason: not valid java name */
    public static final void m3266writeUnclosedAdToFile$lambda5(UnclosedAdDetector unclosedAdDetector, String str) {
        p.j(unclosedAdDetector, "this$0");
        p.j(str, "$jsonContent");
        FileUtility.INSTANCE.writeString(unclosedAdDetector.file, str);
    }
}
