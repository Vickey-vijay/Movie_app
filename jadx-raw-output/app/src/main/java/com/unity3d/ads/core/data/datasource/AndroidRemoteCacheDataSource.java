package com.unity3d.ads.core.data.datasource;

import bk.p;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import lk.a0;
import mj.r;
import nj.b0;
import nk.h;
import nk.h0;
import nk.l0;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;
import rj.c;
import tj.d;
import yj.b;
import yj.g;

/* JADX INFO: compiled from: AndroidRemoteCacheDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidRemoteCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;
    private final HttpClientProvider httpClientProvider;
    private final h0 ioDispatcher;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidRemoteCacheDataSource.kt */
    @d(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$2", f = "AndroidRemoteCacheDataSource.kt", l = {51, 52}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super CacheResult>, Object> {
        public final /* synthetic */ File $cachePath;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ Integer $priority;
        public final /* synthetic */ String $url;
        public long J$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ AndroidRemoteCacheDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, AndroidRemoteCacheDataSource androidRemoteCacheDataSource, File file, String str2, Integer num, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$url = str;
            this.this$0 = androidRemoteCacheDataSource;
            this.$cachePath = file;
            this.$fileName = str2;
            this.$priority = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$url, this.this$0, this.$cachePath, this.$fileName, this.$priority, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super CacheResult> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX WARN: Code duplicated, block: B:130:0x028f  */
        /* JADX WARN: Code duplicated, block: B:132:0x0299  */
        /* JADX WARN: Code duplicated, block: B:134:0x02a1  */
        /* JADX WARN: Code duplicated, block: B:138:0x02b2  */
        /* JADX WARN: Code duplicated, block: B:147:0x02d6  */
        /* JADX WARN: Code duplicated, block: B:149:0x02e8  */
        /* JADX WARN: Code duplicated, block: B:152:0x02f7 A[Catch: all -> 0x033c, TryCatch #8 {all -> 0x033c, blocks: (B:150:0x02f1, B:152:0x02f7, B:155:0x02fe, B:156:0x0309, B:157:0x030a, B:159:0x0310, B:161:0x0316, B:164:0x031d, B:165:0x0328, B:166:0x0329, B:167:0x0330, B:168:0x033b), top: B:197:0x02f1 }] */
        /* JADX WARN: Code duplicated, block: B:159:0x0310 A[Catch: all -> 0x033c, TryCatch #8 {all -> 0x033c, blocks: (B:150:0x02f1, B:152:0x02f7, B:155:0x02fe, B:156:0x0309, B:157:0x030a, B:159:0x0310, B:161:0x0316, B:164:0x031d, B:165:0x0328, B:166:0x0329, B:167:0x0330, B:168:0x033b), top: B:197:0x02f1 }] */
        /* JADX WARN: Code duplicated, block: B:161:0x0316 A[Catch: all -> 0x033c, TryCatch #8 {all -> 0x033c, blocks: (B:150:0x02f1, B:152:0x02f7, B:155:0x02fe, B:156:0x0309, B:157:0x030a, B:159:0x0310, B:161:0x0316, B:164:0x031d, B:165:0x0328, B:166:0x0329, B:167:0x0330, B:168:0x033b), top: B:197:0x02f1 }] */
        /* JADX WARN: Code duplicated, block: B:167:0x0330 A[Catch: all -> 0x033c, TryCatch #8 {all -> 0x033c, blocks: (B:150:0x02f1, B:152:0x02f7, B:155:0x02fe, B:156:0x0309, B:157:0x030a, B:159:0x0310, B:161:0x0316, B:164:0x031d, B:165:0x0328, B:166:0x0329, B:167:0x0330, B:168:0x033b), top: B:197:0x02f1 }] */
        /* JADX WARN: Code duplicated, block: B:173:0x034d  */
        /* JADX WARN: Code duplicated, block: B:175:0x0357  */
        /* JADX WARN: Code duplicated, block: B:177:0x036b  */
        /* JADX WARN: Code duplicated, block: B:180:0x0377  */
        /* JADX WARN: Code duplicated, block: B:181:0x037e  */
        /* JADX WARN: Code duplicated, block: B:202:0x0244 A[EDGE_INSN: B:202:0x0244->B:88:0x0244 BREAK  A[LOOP:0: B:186:0x022f->B:87:0x0237], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:48:0x018e  */
        /* JADX WARN: Code duplicated, block: B:50:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:56:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:59:0x01dc  */
        /* JADX WARN: Code duplicated, block: B:60:0x01de  */
        /* JADX WARN: Code duplicated, block: B:63:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:65:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:73:0x0204  */
        /* JADX WARN: Code duplicated, block: B:74:0x0208  */
        /* JADX WARN: Code duplicated, block: B:76:0x020b  */
        /* JADX WARN: Code duplicated, block: B:78:0x021c  */
        /* JADX WARN: Code duplicated, block: B:86:0x0236  */
        /* JADX WARN: Instruction removed from duplicated block: B:48:0x018e, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v18 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            l0 l0Var;
            long length;
            File fileInvoke;
            Object objInvoke;
            File file;
            HttpRequest httpRequest;
            Object objExecute;
            HttpResponse httpResponse;
            List<String> list;
            String strL1;
            boolean z10;
            Object body;
            InputStream inputStream;
            Ref$IntRef ref$IntRef;
            Object objM3458constructorimpl;
            Throwable thM3461exceptionOrNullimpl;
            File file2;
            Object objM3458constructorimpl2;
            Throwable thM3461exceptionOrNullimpl2;
            String strInvoke;
            Integer num;
            int iIntValue;
            Throwable th2;
            byte[] bArr;
            Sink sinkAppendingSink;
            BufferedSink bufferedSinkBuffer;
            Throwable th3;
            int i10;
            String str;
            Object objF = sj.a.f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    length = this.J$0;
                    httpRequest = (HttpRequest) this.L$3;
                    File file3 = (File) this.L$2;
                    file = (File) this.L$1;
                    l0Var = (l0) this.L$0;
                    kotlin.c.b(obj);
                    objInvoke = obj;
                    fileInvoke = file3;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = this.J$0;
                    File file4 = (File) this.L$2;
                    File file5 = (File) this.L$1;
                    kotlin.c.b(obj);
                    fileInvoke = file4;
                    file = file5;
                    objExecute = obj;
                }
                httpResponse = (HttpResponse) objExecute;
                if (!HttpResponseKt.isSuccessful(httpResponse)) {
                    return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, new Exception("Request failed with status code " + httpResponse.getStatusCode()));
                }
                list = httpResponse.getHeaders().get(Command.HTTP_HEADER_ETAG);
                if (list != null || (str = (String) b0.h0(list)) == null || (strL1 = a0.l1(str, '\"')) == null) {
                    strL1 = "";
                }
                if (strL1.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    strL1 = null;
                }
                if (strL1 != null) {
                    g.n(fileInvoke, strL1, null, 2, null);
                }
                if (length > 0 && httpResponse.getStatusCode() == 200) {
                    file.delete();
                    file.createNewFile();
                }
                body = httpResponse.getBody();
                if (body instanceof InputStream) {
                    inputStream = (InputStream) body;
                } else {
                    inputStream = null;
                }
                if (inputStream == null) {
                    return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, new Exception("Response body is not an InputStream"));
                }
                ref$IntRef = new Ref$IntRef();
                try {
                    Result.a aVar = Result.Companion;
                    try {
                        try {
                            try {
                                bArr = new byte[8192];
                                sinkAppendingSink = Okio.appendingSink(file);
                                try {
                                    bufferedSinkBuffer = Okio.buffer(sinkAppendingSink);
                                    while (true) {
                                        try {
                                            try {
                                                i10 = inputStream.read(bArr);
                                                if (i10 != -1) {
                                                    break;
                                                }
                                                l0Var = null;
                                                try {
                                                    bufferedSinkBuffer.write(bArr, 0, i10);
                                                    bufferedSinkBuffer.flush();
                                                    ref$IntRef.element += i10;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                                th = th4;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                Throwable th6 = th;
                                                try {
                                                    throw th6;
                                                } catch (Throwable th7) {
                                                    b.a(sinkAppendingSink, th6);
                                                    throw th7;
                                                }
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            l0Var = null;
                                        }
                                        th3 = th;
                                        try {
                                            throw th3;
                                        } catch (Throwable th9) {
                                            b.a(bufferedSinkBuffer, th3);
                                            throw th9;
                                        }
                                    }
                                    l0Var = null;
                                    r rVar = r.f64562a;
                                    b.a(bufferedSinkBuffer, null);
                                    b.a(sinkAppendingSink, null);
                                    b.a(inputStream, null);
                                    objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                                    thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                                    if (thM3461exceptionOrNullimpl != null) {
                                        return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, thM3461exceptionOrNullimpl);
                                    }
                                    if (((httpResponse.getStatusCode() == 206 ? httpResponse.getContentSize() == -1 ? file.length() <= 0 : file.length() != httpResponse.getContentSize() : file.length() != httpResponse.getContentSize() + length) ? l0Var : 1) == 0) {
                                        return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, null, 4, null);
                                    }
                                    file2 = new File(this.$cachePath, this.$fileName);
                                    try {
                                        if (file2.exists() && !file2.delete()) {
                                            throw new IllegalStateException("Final file exists and could not be deleted before overwriting".toString());
                                        }
                                        if (!file.renameTo(file2)) {
                                            throw new IllegalStateException("Could not rename temporary file to final file".toString());
                                        }
                                        if (fileInvoke.exists() && !fileInvoke.delete()) {
                                            throw new IllegalStateException("Could not delete Etag file after successful download".toString());
                                        }
                                        objM3458constructorimpl2 = Result.m3458constructorimpl(r.f64562a);
                                        thM3461exceptionOrNullimpl2 = Result.m3461exceptionOrNullimpl(objM3458constructorimpl2);
                                        if (thM3461exceptionOrNullimpl2 != null) {
                                            return new CacheResult.Failure(CacheError.FILE_STATE_WRONG, CacheSource.REMOTE, thM3461exceptionOrNullimpl2);
                                        }
                                        String str2 = this.$url;
                                        String str3 = this.$fileName;
                                        strInvoke = this.this$0.getFileExtensionFromUrl.invoke(this.$url);
                                        if (strInvoke == null) {
                                            strInvoke = "";
                                        }
                                        long j10 = ref$IntRef.element;
                                        String protocol = httpResponse.getProtocol();
                                        num = this.$priority;
                                        if (num != null) {
                                            iIntValue = num.intValue();
                                        } else {
                                            iIntValue = Integer.MAX_VALUE;
                                        }
                                        return new CacheResult.Success(new CachedFile(str2, str3, file2, strInvoke, j10, protocol, iIntValue), CacheSource.REMOTE);
                                    } catch (Throwable th10) {
                                        Result.a aVar2 = Result.Companion;
                                        objM3458constructorimpl2 = Result.m3458constructorimpl(kotlin.c.a(th10));
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    l0Var = null;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                l0Var = null;
                                th2 = th;
                                try {
                                    throw th2;
                                } catch (Throwable th13) {
                                    b.a(inputStream, th2);
                                    throw th13;
                                }
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            th2 = th;
                            throw th2;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        Result.a aVar3 = Result.Companion;
                        objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th));
                        thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                        if (thM3461exceptionOrNullimpl != null) {
                            return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, thM3461exceptionOrNullimpl);
                        }
                        if (((httpResponse.getStatusCode() == 206 ? httpResponse.getContentSize() == -1 ? file.length() <= 0 : file.length() != httpResponse.getContentSize() : file.length() != httpResponse.getContentSize() + length) ? l0Var : 1) == 0) {
                            return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, null, 4, null);
                        }
                        file2 = new File(this.$cachePath, this.$fileName);
                        if (file2.exists()) {
                            throw new IllegalStateException("Final file exists and could not be deleted before overwriting".toString());
                        }
                        if (!file.renameTo(file2)) {
                            throw new IllegalStateException("Could not rename temporary file to final file".toString());
                        }
                        if (fileInvoke.exists()) {
                            throw new IllegalStateException("Could not delete Etag file after successful download".toString());
                        }
                        objM3458constructorimpl2 = Result.m3458constructorimpl(r.f64562a);
                        thM3461exceptionOrNullimpl2 = Result.m3461exceptionOrNullimpl(objM3458constructorimpl2);
                        if (thM3461exceptionOrNullimpl2 != null) {
                            return new CacheResult.Failure(CacheError.FILE_STATE_WRONG, CacheSource.REMOTE, thM3461exceptionOrNullimpl2);
                        }
                        String str4 = this.$url;
                        String str5 = this.$fileName;
                        strInvoke = this.this$0.getFileExtensionFromUrl.invoke(this.$url);
                        if (strInvoke == null) {
                            strInvoke = "";
                        }
                        long j11 = ref$IntRef.element;
                        String protocol2 = httpResponse.getProtocol();
                        num = this.$priority;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = Integer.MAX_VALUE;
                        }
                        return new CacheResult.Success(new CachedFile(str4, str5, file2, strInvoke, j11, protocol2, iIntValue), CacheSource.REMOTE);
                    }
                } catch (Throwable th16) {
                    th = th16;
                    l0Var = null;
                }
            } else {
                kotlin.c.b(obj);
                l0Var = (l0) this.L$0;
                String str6 = this.$url;
                if (str6 == null || str6.length() == 0) {
                    return new CacheResult.Failure(CacheError.MALFORMED_URL, CacheSource.REMOTE, null, 4, null);
                }
                File fileInvoke2 = this.this$0.createFile.invoke(this.$cachePath, this.$fileName + ".part");
                if (!fileInvoke2.exists()) {
                    fileInvoke2.createNewFile();
                }
                length = fileInvoke2.length();
                fileInvoke = this.this$0.createFile.invoke(this.$cachePath, this.$fileName + ".etag");
                File file6 = fileInvoke.exists() ? fileInvoke : null;
                String strK = file6 != null ? g.k(file6, null, 1, null) : null;
                Map mapD = nj.l0.d();
                if (length > 0) {
                    mapD.put(Command.HTTP_HEADER_RANGE, nj.r.e("bytes=" + length + '-'));
                }
                if (strK != null) {
                    mapD.put("If-Range", nj.r.e('\"' + strK + '\"'));
                }
                Map mapC = nj.l0.c(mapD);
                Integer num2 = this.$priority;
                HttpRequest httpRequest2 = new HttpRequest(this.$url, null, null, null, mapC, null, null, null, null, 0, 0, 0, 0, false, null, null, num2 != null ? num2.intValue() : Integer.MAX_VALUE, 65518, null);
                HttpClientProvider httpClientProvider = this.this$0.httpClientProvider;
                this.L$0 = l0Var;
                this.L$1 = fileInvoke2;
                this.L$2 = fileInvoke;
                this.L$3 = httpRequest2;
                this.J$0 = length;
                this.label = 1;
                objInvoke = httpClientProvider.invoke(this);
                if (objInvoke == objF) {
                    return objF;
                }
                file = fileInvoke2;
                httpRequest = httpRequest2;
            }
            this.L$0 = l0Var;
            this.L$1 = file;
            this.L$2 = fileInvoke;
            this.L$3 = null;
            this.J$0 = length;
            this.label = 2;
            objExecute = ((HttpClient) objInvoke).execute(httpRequest, true, this);
            if (objExecute == objF) {
                return objF;
            }
            httpResponse = (HttpResponse) objExecute;
            if (!HttpResponseKt.isSuccessful(httpResponse)) {
                return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, new Exception("Request failed with status code " + httpResponse.getStatusCode()));
            }
            list = httpResponse.getHeaders().get(Command.HTTP_HEADER_ETAG);
            if (list != null) {
                strL1 = "";
            } else {
                strL1 = "";
            }
            if (strL1.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                strL1 = null;
            }
            if (strL1 != null) {
                g.n(fileInvoke, strL1, null, 2, null);
            }
            if (length > 0) {
                file.delete();
                file.createNewFile();
            }
            body = httpResponse.getBody();
            if (body instanceof InputStream) {
                inputStream = (InputStream) body;
            } else {
                inputStream = null;
            }
            if (inputStream == null) {
                return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, new Exception("Response body is not an InputStream"));
            }
            ref$IntRef = new Ref$IntRef();
            Result.a aVar4 = Result.Companion;
            bArr = new byte[8192];
            sinkAppendingSink = Okio.appendingSink(file);
            bufferedSinkBuffer = Okio.buffer(sinkAppendingSink);
            while (true) {
                i10 = inputStream.read(bArr);
                if (i10 != -1) {
                    break;
                    break;
                }
                l0Var = null;
                bufferedSinkBuffer.write(bArr, 0, i10);
                bufferedSinkBuffer.flush();
                ref$IntRef.element += i10;
                th = th4;
                th3 = th;
                throw th3;
            }
            l0Var = null;
            r rVar2 = r.f64562a;
            b.a(bufferedSinkBuffer, null);
            b.a(sinkAppendingSink, null);
            b.a(inputStream, null);
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
            thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
            if (thM3461exceptionOrNullimpl != null) {
                return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, thM3461exceptionOrNullimpl);
            }
            if (((httpResponse.getStatusCode() == 206 ? httpResponse.getContentSize() == -1 ? file.length() <= 0 : file.length() != httpResponse.getContentSize() : file.length() != httpResponse.getContentSize() + length) ? l0Var : 1) == 0) {
                return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, null, 4, null);
            }
            file2 = new File(this.$cachePath, this.$fileName);
            if (file2.exists()) {
                throw new IllegalStateException("Final file exists and could not be deleted before overwriting".toString());
            }
            if (!file.renameTo(file2)) {
                throw new IllegalStateException("Could not rename temporary file to final file".toString());
            }
            if (fileInvoke.exists()) {
                throw new IllegalStateException("Could not delete Etag file after successful download".toString());
            }
            objM3458constructorimpl2 = Result.m3458constructorimpl(r.f64562a);
            thM3461exceptionOrNullimpl2 = Result.m3461exceptionOrNullimpl(objM3458constructorimpl2);
            if (thM3461exceptionOrNullimpl2 != null) {
                return new CacheResult.Failure(CacheError.FILE_STATE_WRONG, CacheSource.REMOTE, thM3461exceptionOrNullimpl2);
            }
            String str7 = this.$url;
            String str8 = this.$fileName;
            strInvoke = this.this$0.getFileExtensionFromUrl.invoke(this.$url);
            if (strInvoke == null) {
                strInvoke = "";
            }
            long j12 = ref$IntRef.element;
            String protocol3 = httpResponse.getProtocol();
            num = this.$priority;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = Integer.MAX_VALUE;
            }
            return new CacheResult.Success(new CachedFile(str7, str8, file2, strInvoke, j12, protocol3, iIntValue), CacheSource.REMOTE);
        }
    }

    public AndroidRemoteCacheDataSource(h0 h0Var, CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl, HttpClientProvider httpClientProvider) {
        ck.p.j(h0Var, "ioDispatcher");
        ck.p.j(createFile, "createFile");
        ck.p.j(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        ck.p.j(httpClientProvider, "httpClientProvider");
        this.ioDispatcher = h0Var;
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
        this.httpClientProvider = httpClientProvider;
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public Object getFile(File file, String str, String str2, Integer num, c<? super CacheResult> cVar) {
        return h.g(this.ioDispatcher, new AnonymousClass2(str2, this, file, str, num, null), cVar);
    }
}
