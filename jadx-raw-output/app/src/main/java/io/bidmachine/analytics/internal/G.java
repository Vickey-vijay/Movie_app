package io.bidmachine.analytics.internal;

import com.ironsource.C3426d4;
import com.ironsource.Z7;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\fJ\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lio/bidmachine/analytics/internal/G;", "", "", "path", "Lkk/i;", com.safedk.android.analytics.reporters.b.f44683d, "Lmj/r;", "a", "(Ljava/lang/String;Lkk/i;)V", "", "b", "()Z", "(Ljava/lang/String;)V", "()V", "Lio/bidmachine/analytics/internal/J;", "Lio/bidmachine/analytics/internal/J;", C3426d4.a.f28418k, "Lio/bidmachine/analytics/internal/K;", "Lio/bidmachine/analytics/internal/K;", "stream", "Lnk/l0;", "c", "Lnk/l0;", "scope", "Lkotlinx/coroutines/g;", "d", "Lkotlinx/coroutines/g;", "job", "<init>", "(Lio/bidmachine/analytics/internal/J;Lio/bidmachine/analytics/internal/K;Lnk/l0;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final J storage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final K stream;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final nk.l0 scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private kotlinx.coroutines.g job;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/analytics/internal/G$a;", "", "Lio/bidmachine/analytics/internal/G;", "a", "()Lio/bidmachine/analytics/internal/G;", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public interface a {
        G a();
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lnk/l0;", "Lmj/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @tj.d(c = "io.bidmachine.analytics.sdk.service.reader.alog.LogCatReader$read$1", f = "LogCatReader.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements bk.p<nk.l0, rj.c<? super mj.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f58692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f58693b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f58695d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, rj.c<? super b> cVar) {
            super(2, cVar);
            this.f58695d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<mj.r> create(Object obj, rj.c<?> cVar) {
            b bVar = G.this.new b(this.f58695d, cVar);
            bVar.f58693b = obj;
            return bVar;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1invoke(nk.l0 l0Var, rj.c<? super mj.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(mj.r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            BufferedReader bufferedReader;
            sj.a.f();
            if (this.f58692a == 0) {
                kotlin.c.b(obj);
                K k10 = G.this.stream;
                G g10 = G.this;
                String str = this.f58695d;
                synchronized (k10) {
                    try {
                        Result.a aVar = Result.Companion;
                        InputStream inputStreamA = g10.stream.a(lk.a0.N0(s0.b(str), new String[]{Z7.f27998r}, false, 0, 6, null));
                        mj.r rVar = null;
                        if (inputStreamA != null) {
                            Reader inputStreamReader = new InputStreamReader(inputStreamA, lk.c.f63591b);
                            if (inputStreamReader instanceof BufferedReader) {
                                bufferedReader = (BufferedReader) inputStreamReader;
                            } else {
                                bufferedReader = new BufferedReader(inputStreamReader, 8192);
                            }
                        } else {
                            bufferedReader = null;
                        }
                        if (bufferedReader != null) {
                            try {
                                g10.a(str, yj.k.d(bufferedReader));
                                mj.r rVar2 = mj.r.f64562a;
                                yj.b.a(bufferedReader, null);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    yj.b.a(bufferedReader, th2);
                                    throw th3;
                                }
                            }
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                            rVar = mj.r.f64562a;
                        }
                        Result.m3458constructorimpl(rVar);
                    } catch (Throwable th4) {
                        Result.a aVar2 = Result.Companion;
                        Result.m3458constructorimpl(kotlin.c.a(th4));
                    }
                }
                return mj.r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final boolean b() {
        kotlinx.coroutines.g gVar = this.job;
        return gVar != null && gVar.isActive();
    }

    public G(J j10, K k10, nk.l0 l0Var) {
        this.storage = j10;
        this.stream = k10;
        this.scope = l0Var;
    }

    public final void a() {
        kotlinx.coroutines.g gVar = this.job;
        if (gVar != null) {
            kotlinx.coroutines.g.a.a(gVar, null, 1, null);
        }
        this.job = null;
        synchronized (this.stream) {
            try {
                Result.a aVar = Result.Companion;
                this.stream.a();
                Result.m3458constructorimpl(mj.r.f64562a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                Result.m3458constructorimpl(kotlin.c.a(th2));
            }
        }
    }

    public final void a(String path) {
        kotlinx.coroutines.g gVar = this.job;
        if (gVar != null) {
            kotlinx.coroutines.g.a.a(gVar, null, 1, null);
        }
        this.job = nk.j.d(this.scope, null, null, new b(path, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String path, kk.i<String> lines) {
        Iterator<String> it = lines.iterator();
        while (b() && it.hasNext()) {
            this.storage.a(path, it.next());
        }
    }
}
