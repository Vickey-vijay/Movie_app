package com.unity3d.ads.core.data.repository;

import android.content.Context;
import bk.l;
import bk.p;
import com.ironsource.D8;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.sequences.SequencesKt___SequencesKt;
import lk.a0;
import mj.r;
import nk.h0;
import nk.k0;
import nk.l0;
import org.json.JSONArray;
import qk.e;
import qk.v;
import rj.c;
import tj.d;
import yj.h;

/* JADX INFO: compiled from: AndroidCacheRepository.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidCacheRepository implements CacheRepository {
    private final File cacheDir;
    private final CleanupDirectory cleanupDirectory;
    private final Context context;
    private final CreateFile createFile;
    private final DownloadPriorityQueue downloadPriorityQueue;
    private final GetCacheDirectory getCacheDirectory;
    private final CacheDataSource localCacheDataSource;
    private final CacheDataSource remoteCacheDataSource;
    private final l0 scope;
    private final SessionRepository sessionRepository;
    private final File webviewCacheDir;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidCacheRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository", f = "AndroidCacheRepository.kt", l = {100}, m = "doesFileExist")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidCacheRepository.this.doesFileExist(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidCacheRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2", f = "AndroidCacheRepository.kt", l = {70, 77, 89}, m = "invokeSuspend")
    public static final class C38702 extends SuspendLambda implements p<l0, c<? super CacheResult>, Object> {
        public final /* synthetic */ File $cacheDirectory;
        public final /* synthetic */ int $priority;
        public final /* synthetic */ String $url;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38702(String str, File file, int i10, c<? super C38702> cVar) {
            super(2, cVar);
            this.$url = str;
            this.$cacheDirectory = file;
            this.$priority = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidCacheRepository.this.new C38702(this.$url, this.$cacheDirectory, this.$priority, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super CacheResult> cVar) {
            return ((C38702) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidCacheRepository.kt */
        @d(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1", f = "AndroidCacheRepository.kt", l = {79, 85}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements l<c<? super r>, Object> {
            public final /* synthetic */ File $cacheDirectory;
            public final /* synthetic */ qk.l<CacheResult> $fileResult;
            public final /* synthetic */ String $filename;
            public final /* synthetic */ int $priority;
            public final /* synthetic */ String $url;
            public int label;
            public final /* synthetic */ AndroidCacheRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, int i10, qk.l<CacheResult> lVar, c<? super AnonymousClass1> cVar) {
                super(1, cVar);
                this.this$0 = androidCacheRepository;
                this.$cacheDirectory = file;
                this.$filename = str;
                this.$url = str2;
                this.$priority = i10;
                this.$fileResult = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<r> create(c<?> cVar) {
                return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$priority, this.$fileResult, cVar);
            }

            @Override // bk.l
            public final Object invoke(c<? super r> cVar) {
                return ((AnonymousClass1) create(cVar)).invokeSuspend(r.f64562a);
            }

            /* JADX WARN: Code duplicated, block: B:29:? A[LOOP:0: B:24:0x0075->B:29:?, LOOP_END, SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CacheResult cacheResult;
                qk.l<CacheResult> lVar;
                Object objF = sj.a.f();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            kotlin.c.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        kotlin.c.b(obj);
                    }
                    cacheResult = (CacheResult) obj;
                    lVar = this.$fileResult;
                    while (!lVar.a(lVar.getValue(), cacheResult)) {
                    }
                    return r.f64562a;
                }
                kotlin.c.b(obj);
                CacheDataSource cacheDataSource = this.this$0.localCacheDataSource;
                File file = this.$cacheDirectory;
                String str = this.$filename;
                String str2 = this.$url;
                Integer numD = tj.a.d(this.$priority);
                this.label = 1;
                obj = cacheDataSource.getFile(file, str, str2, numD, this);
                if (obj == objF) {
                    return objF;
                }
                CacheResult cacheResult2 = (CacheResult) obj;
                if (!(cacheResult2 instanceof CacheResult.Success)) {
                    CacheDataSource cacheDataSource2 = this.this$0.remoteCacheDataSource;
                    File file2 = this.$cacheDirectory;
                    String str3 = this.$filename;
                    String str4 = this.$url;
                    Integer numD2 = tj.a.d(this.$priority);
                    this.label = 2;
                    obj = cacheDataSource2.getFile(file2, str3, str4, numD2, this);
                    if (obj == objF) {
                        return objF;
                    }
                    cacheResult = (CacheResult) obj;
                    lVar = this.$fileResult;
                    while (!lVar.a(lVar.getValue(), cacheResult)) {
                    }
                    return r.f64562a;
                }
                qk.l<CacheResult> lVar2 = this.$fileResult;
                while (!lVar2.a(lVar2.getValue(), cacheResult2)) {
                }
                return r.f64562a;
            }
        }

        /* JADX WARN: Code duplicated, block: B:24:0x009f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object file;
            String str;
            qk.l lVarA;
            Object objR;
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    String str2 = (String) this.L$0;
                    kotlin.c.b(obj);
                    str = str2;
                    file = obj;
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj);
                        return obj;
                    }
                    lVarA = (qk.l) this.L$0;
                    kotlin.c.b(obj);
                }
                qk.c cVarP = e.p(lVarA);
                this.L$0 = null;
                this.label = 3;
                objR = e.r(cVarP, this);
                if (objR == objF) {
                    return objF;
                }
                return objR;
            }
            kotlin.c.b(obj);
            String filename = AndroidCacheRepository.this.getFilename(this.$url);
            CacheDataSource cacheDataSource = AndroidCacheRepository.this.localCacheDataSource;
            File file2 = this.$cacheDirectory;
            String str3 = this.$url;
            Integer numD = tj.a.d(this.$priority);
            this.L$0 = filename;
            this.label = 1;
            file = cacheDataSource.getFile(file2, filename, str3, numD, this);
            if (file == objF) {
                return objF;
            }
            str = filename;
            CacheResult cacheResult = (CacheResult) file;
            if (cacheResult instanceof CacheResult.Success) {
                return cacheResult;
            }
            lVarA = v.a(null);
            DownloadPriorityQueue downloadPriorityQueue = AndroidCacheRepository.this.downloadPriorityQueue;
            int i11 = this.$priority;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(AndroidCacheRepository.this, this.$cacheDirectory, str, this.$url, i11, lVarA, null);
            this.L$0 = lVarA;
            this.label = 2;
            if (downloadPriorityQueue.invoke(i11, anonymousClass1, this) == objF) {
                return objF;
            }
            qk.c cVarP2 = e.p(lVarA);
            this.L$0 = null;
            this.label = 3;
            objR = e.r(cVarP2, this);
            if (objR == objF) {
                return objF;
            }
            return objR;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidCacheRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidCacheRepository.this.new AnonymousClass2(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                boolean cleanCache = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getDebugSettings().getCleanCache();
                if (!cleanCache && AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                    NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration();
                    AndroidCacheRepository.this.cleanupDirectory.invoke(AndroidCacheRepository.this.cacheDir, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
                } else {
                    File[] fileArrListFiles = AndroidCacheRepository.this.cacheDir.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            file.delete();
                        }
                    }
                }
                if (!cleanCache && AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().hasCachedWebviewFilesConfiguration()) {
                    NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getCachedWebviewFilesConfiguration();
                    AndroidCacheRepository.this.cleanupDirectory.invoke(AndroidCacheRepository.this.webviewCacheDir, cachedWebviewFilesConfiguration.getMaxCachedAssetSizeMb(), cachedWebviewFilesConfiguration.getMaxCachedAssetAgeMs());
                    return r.f64562a;
                }
                File[] fileArrListFiles2 = AndroidCacheRepository.this.webviewCacheDir.listFiles();
                if (fileArrListFiles2 != null) {
                    for (File file2 : fileArrListFiles2) {
                        file2.delete();
                    }
                    return r.f64562a;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidCacheRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
    public static final class C38692 extends SuspendLambda implements p<l0, c<? super Long>, Object> {
        public int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidCacheRepository.kt */
        public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements l<File, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1, File.class, D8.f26327d, "isFile()Z", 0);
            }

            @Override // bk.l
            public final Boolean invoke(File file) {
                ck.p.j(file, "p0");
                return Boolean.valueOf(file.isFile());
            }
        }

        public C38692(c<? super C38692> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidCacheRepository.this.new C38692(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super Long> cVar) {
            return ((C38692) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                long length = 0;
                Iterator it = SequencesKt___SequencesKt.z(h.q(AndroidCacheRepository.this.cacheDir, null, 1, null), AnonymousClass1.INSTANCE).iterator();
                while (it.hasNext()) {
                    length += ((File) it.next()).length();
                }
                return tj.a.e(length);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public AndroidCacheRepository(h0 h0Var, GetCacheDirectory getCacheDirectory, CacheDataSource cacheDataSource, CacheDataSource cacheDataSource2, Context context, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, DownloadPriorityQueue downloadPriorityQueue, CreateFile createFile) {
        ck.p.j(h0Var, "ioDispatcher");
        ck.p.j(getCacheDirectory, "getCacheDirectory");
        ck.p.j(cacheDataSource, "localCacheDataSource");
        ck.p.j(cacheDataSource2, "remoteCacheDataSource");
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(sessionRepository, "sessionRepository");
        ck.p.j(cleanupDirectory, "cleanupDirectory");
        ck.p.j(downloadPriorityQueue, "downloadPriorityQueue");
        ck.p.j(createFile, "createFile");
        this.getCacheDirectory = getCacheDirectory;
        this.localCacheDataSource = cacheDataSource;
        this.remoteCacheDataSource = cacheDataSource2;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.downloadPriorityQueue = downloadPriorityQueue;
        this.createFile = createFile;
        this.scope = kotlinx.coroutines.d.h(kotlinx.coroutines.d.h(kotlinx.coroutines.d.a(h0Var), new k0("CacheRepository")), kotlinx.coroutines.h.f63171b);
        this.cacheDir = initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME);
        this.webviewCacheDir = initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_WEBVIEW_DIR_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, JSONArray jSONArray, int i10, c<? super CacheResult> cVar) {
        return nk.h.g(this.scope.getCoroutineContext(), new C38702(str, file, i10, null), cVar);
    }

    private final File initCacheDir(String str) {
        GetCacheDirectory getCacheDirectory = this.getCacheDirectory;
        File cacheDir = this.context.getCacheDir();
        ck.p.i(cacheDir, "context.cacheDir");
        File fileInvoke = getCacheDirectory.invoke(cacheDir, str);
        fileInvoke.mkdirs();
        return fileInvoke;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object clearCache(c<? super r> cVar) {
        return nk.h.g(this.scope.getCoroutineContext(), new AnonymousClass2(null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object doesFileExist(String str, c<? super Boolean> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objRetrieveFile = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(objRetrieveFile);
            anonymousClass1.label = 1;
            objRetrieveFile = retrieveFile(str, anonymousClass1);
            if (objRetrieveFile == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objRetrieveFile);
        }
        return tj.a.a(objRetrieveFile instanceof CacheResult.Success);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getCacheSize(c<? super Long> cVar) {
        return nk.h.g(this.scope.getCoroutineContext(), new C38692(null), cVar);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getFile(String str, JSONArray jSONArray, int i10, c<? super CacheResult> cVar) {
        return getFileInternal(this.cacheDir, str, jSONArray, i10, cVar);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getWebviewFile(String str, String str2, c<? super CacheResult> cVar) {
        File fileInvoke = this.createFile.invoke(this.webviewCacheDir, str2);
        fileInvoke.mkdirs();
        return getFileInternal(fileInvoke, str, null, 0, cVar);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(CachedFile cachedFile) {
        ck.p.j(cachedFile, "cachedFile");
        File file = cachedFile.getFile();
        if (file != null) {
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                return file.delete();
            }
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object retrieveFile(String str, c<? super CacheResult> cVar) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, this.cacheDir, str, null, null, cVar, 12, null);
    }

    public final String getFilename(String str) {
        ck.p.j(str, "url");
        String strX0 = a0.X0(a0.Z0(a0.d1(str, '?', null, 2, null), '/', null, 2, null), '.', "");
        if (!a0.n0(strX0)) {
            return StringExtensionsKt.getSHA256Hash(str) + '.' + strX0;
        }
        return StringExtensionsKt.getSHA256Hash(str);
    }
}
