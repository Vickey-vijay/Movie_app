package io.bidmachine.analytics.internal;

import android.util.Base64;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.analytics.BidMachineAnalytics;
import io.bidmachine.analytics.internal.Y;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 $*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001\u0007B+\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\"\u0010#J#\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\u0014J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\u0015J\u000f\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\u0016J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0011\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lio/bidmachine/analytics/internal/Y;", "Self", "", "Lio/bidmachine/analytics/internal/s;", "encryptionManager", "", "data", "a", "(Lio/bidmachine/analytics/internal/s;[B)[B", "", IronSourceConstants.REQUEST_URL, "content", "Lmj/r;", "(Ljava/lang/String;[B)V", "Ljava/net/URLConnection;", "connection", "", "b", "(Ljava/net/URLConnection;)I", "Lkotlin/Result;", "(Ljava/net/URLConnection;)Ljava/lang/Object;", "(Lrj/c;)Ljava/lang/Object;", "()Lio/bidmachine/analytics/internal/Y;", "()[B", "Lio/bidmachine/analytics/internal/o0;", "Lio/bidmachine/analytics/internal/o0;", "requestMethod", "Ljava/lang/String;", "Lio/bidmachine/analytics/internal/p0;", "c", "Lio/bidmachine/analytics/internal/p0;", "dispatchers", "d", "Lio/bidmachine/analytics/internal/s;", "<init>", "(Lio/bidmachine/analytics/internal/o0;Ljava/lang/String;Lio/bidmachine/analytics/internal/p0;Lio/bidmachine/analytics/internal/s;)V", "e", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public abstract class Y<Self extends Y<Self>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o0 requestMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String requestUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p0 dispatchers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C4748s encryptionManager;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @tj.d(c = "io.bidmachine.analytics.sdk.tracker.network.NetworkRequest", f = "NetworkRequest.kt", l = {26}, m = "execute-IoAF18A")
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f58787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y<Self> f58788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f58789c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y<Self> y10, rj.c<? super b> cVar) {
            super(cVar);
            this.f58788b = y10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f58787a = obj;
            this.f58789c |= Integer.MIN_VALUE;
            Object objA = this.f58788b.a(this);
            return objA == sj.a.f() ? objA : Result.m3457boximpl(objA);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/bidmachine/analytics/internal/Y;", "Self", "Lnk/l0;", "Lkotlin/Result;", "<anonymous>", "(Lnk/l0;)Lkotlin/Result;"}, k = 3, mv = {1, 7, 1})
    @tj.d(c = "io.bidmachine.analytics.sdk.tracker.network.NetworkRequest$execute$2", f = "NetworkRequest.kt", l = {32}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements bk.p<nk.l0, rj.c<? super Result<? extends Self>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f58790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y<Self> f58791b;

        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/bidmachine/analytics/internal/Y;", "Self", "Lnk/l0;", "", "<anonymous>", "(Lnk/l0;)[B"}, k = 3, mv = {1, 7, 1})
        @tj.d(c = "io.bidmachine.analytics.sdk.tracker.network.NetworkRequest$execute$2$content$1", f = "NetworkRequest.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements bk.p<nk.l0, rj.c<? super byte[]>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f58792a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y<Self> f58793b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Y<Self> y10, rj.c<? super a> cVar) {
                super(2, cVar);
                this.f58793b = y10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final rj.c<mj.r> create(Object obj, rj.c<?> cVar) {
                return new a(this.f58793b, cVar);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1invoke(nk.l0 l0Var, rj.c<? super byte[]> cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                sj.a.f();
                if (this.f58792a == 0) {
                    kotlin.c.b(obj);
                    Y<Self> y10 = this.f58793b;
                    return y10.a(((Y) y10).encryptionManager, this.f58793b.b());
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y<Self> y10, rj.c<? super c> cVar) {
            super(2, cVar);
            this.f58791b = y10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<mj.r> create(Object obj, rj.c<?> cVar) {
            return new c(this.f58791b, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(nk.l0 l0Var, rj.c<? super Result<? extends Self>> cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM3458constructorimpl;
            Object objF = sj.a.f();
            int i10 = this.f58790a;
            try {
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            kotlin.c.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        kotlin.c.b(obj);
                        if (((Y) this.f58791b).encryptionManager == null) {
                            Result.a aVar = Result.Companion;
                            return Result.m3457boximpl(Result.m3458constructorimpl(this.f58791b.a()));
                        }
                        nk.h0 h0VarB = ((Y) this.f58791b).dispatchers.b();
                        a aVar2 = new a(this.f58791b, null);
                        this.f58790a = 1;
                        obj = nk.h.g(h0VarB, aVar2, this);
                        if (obj == objF) {
                            return objF;
                        }
                    }
                    byte[] bArr = (byte[]) obj;
                    Y<Self> y10 = this.f58791b;
                    y10.a(((Y) y10).requestUrl, bArr);
                    Result.a aVar3 = Result.Companion;
                    objM3458constructorimpl = Result.m3458constructorimpl(this.f58791b.a());
                } catch (Throwable unused) {
                    Result.a aVar4 = Result.Companion;
                    return Result.m3457boximpl(Result.m3458constructorimpl(this.f58791b.a()));
                }
            } catch (Throwable th2) {
                Result.a aVar5 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            return Result.m3457boximpl(objM3458constructorimpl);
        }
    }

    public Y(o0 o0Var, String str, p0 p0Var, C4748s c4748s) {
        this.requestMethod = o0Var;
        this.requestUrl = str;
        this.dispatchers = p0Var;
        this.encryptionManager = c4748s;
    }

    public abstract Self a();

    public abstract byte[] b();

    public /* synthetic */ Y(o0 o0Var, String str, p0 p0Var, C4748s c4748s, int i10, ck.i iVar) {
        this(o0Var, str, p0Var, (i10 & 8) != 0 ? BidMachineAnalytics.INSTANCE.getEncryptionManager$bidmachine_android_sdk_bh_3_3_0() : c4748s);
    }

    private final int b(URLConnection connection) {
        if (connection instanceof HttpURLConnection) {
            return ((HttpURLConnection) connection).getResponseCode();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x008c A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:4:0x0011, B:6:0x0027, B:8:0x003b, B:11:0x0040, B:13:0x0043, B:16:0x0052, B:21:0x005f, B:23:0x0068, B:24:0x006f, B:25:0x0070, B:35:0x0088, B:44:0x00a1, B:45:0x00bb, B:37:0x008c, B:39:0x0094, B:41:0x009a), top: B:53:0x0011 }] */
    public final void a(String requestUrl, byte[] content) throws Throwable {
        String headerField;
        HttpURLConnection httpURLConnection = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(requestUrl).openConnection();
            ck.p.h(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                this.requestMethod.a(httpURLConnection2);
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setConnectTimeout(40000);
                httpURLConnection2.setReadTimeout(40000);
                C4748s c4748s = this.encryptionManager;
                if (c4748s != null) {
                    httpURLConnection2.setRequestProperty("bm-data", Base64.encodeToString(c4748s.getKeyManager().getClientPublicKeyBytes(), 2));
                }
                if (content != null) {
                    if (!(content.length == 0)) {
                        httpURLConnection2.setDoOutput(true);
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                bufferedOutputStream2.write(content);
                                s0.a((Flushable) bufferedOutputStream2);
                                s0.a((Closeable) bufferedOutputStream2);
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    Result.m3457boximpl(s0.a((Flushable) bufferedOutputStream));
                                }
                                if (bufferedOutputStream != null) {
                                    Result.m3457boximpl(s0.a((Closeable) bufferedOutputStream));
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
                int iB = b(httpURLConnection2);
                if (iB == 200 || iB == 204) {
                    a(httpURLConnection2);
                    return;
                }
                if (iB != 305 && iB != 307 && iB != 308) {
                    switch (iB) {
                        case 301:
                        case 302:
                        case 303:
                            headerField = httpURLConnection2.getHeaderField("Location");
                            if (headerField != null) {
                                a(headerField, content);
                                a(httpURLConnection2);
                                return;
                            }
                            break;
                    }
                } else {
                    headerField = httpURLConnection2.getHeaderField("Location");
                    if (headerField != null && headerField.length() > 0) {
                        a(headerField, content);
                        a(httpURLConnection2);
                        return;
                    }
                }
                throw new IllegalStateException(("Invalid response code: " + iB).toString());
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = httpURLConnection2;
                a(httpURLConnection);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private final Object a(URLConnection connection) {
        try {
            Result.a aVar = Result.Companion;
            if (connection instanceof HttpURLConnection) {
                ((HttpURLConnection) connection).disconnect();
            }
            return Result.m3458constructorimpl(mj.r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] a(C4748s encryptionManager, byte[] data) {
        if (data != null) {
            return C4749t.a(data, encryptionManager);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rj.c<? super Result<? extends Self>> cVar) throws Throwable {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f58789c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f58789c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objG = bVar.f58787a;
        Object objF = sj.a.f();
        int i11 = bVar.f58789c;
        if (i11 == 0) {
            kotlin.c.b(objG);
            nk.h0 h0VarC = this.dispatchers.c();
            c cVar2 = new c(this, null);
            bVar.f58789c = 1;
            objG = nk.h.g(h0VarC, cVar2, bVar);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objG);
        }
        return ((Result) objG).m3466unboximpl();
    }
}
