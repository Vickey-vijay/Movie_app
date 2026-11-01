package com.inmobi.media;

import android.app.ApplicationExitInfo;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: renamed from: com.inmobi.media.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3269w1 extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3319y1 f25606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ApplicationExitInfo f25607b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3269w1(C3319y1 c3319y1, ApplicationExitInfo applicationExitInfo, rj.c cVar) {
        super(1, cVar);
        this.f25606a = c3319y1;
        this.f25607b = applicationExitInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new C3269w1(this.f25606a, this.f25607b, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return new C3269w1(this.f25606a, this.f25607b, (rj.c) obj).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C3223u5 c3223u5;
        String string;
        Source source;
        sj.a.f();
        kotlin.c.b(obj);
        C3223u5 c3223u6 = this.f25606a.f25369a;
        int reason = this.f25607b.getReason();
        String description = this.f25607b.getDescription();
        InputStream traceInputStream = this.f25607b.getTraceInputStream();
        BufferedSource bufferedSourceBuffer = (traceInputStream == null || (source = Okio.source(traceInputStream)) == null) ? null : Okio.buffer(source);
        int i10 = this.f25606a.f25764d;
        ck.p.j("\"main\"", "startMarker");
        ck.p.j("ZygoteInit.java", "endMarker");
        try {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            if (bufferedSourceBuffer == null) {
                c3223u5 = c3223u6;
                break;
            }
            int i11 = i10;
            boolean z10 = false;
            while (true) {
                try {
                    String utf8Line = bufferedSourceBuffer.readUtf8Line();
                    if (utf8Line == null) {
                        c3223u5 = c3223u6;
                        break;
                    }
                    if (i10 > 0 && !z10) {
                        sb3.append(utf8Line);
                        sb3.append("\n");
                        i10--;
                    }
                    int i12 = i10;
                    c3223u5 = c3223u6;
                    boolean z11 = z10;
                    try {
                        if (lk.x.R(utf8Line, "\"main\"", false, 2, null)) {
                            lk.t.m(sb3);
                            z10 = true;
                        } else {
                            z10 = z11;
                        }
                        if (z10) {
                            i11--;
                            sb2.append(utf8Line);
                            sb2.append("\n");
                        }
                        if (lk.a0.X(utf8Line, "ZygoteInit.java", false, 2, null) || i11 <= 0) {
                            break;
                        }
                        i10 = i12;
                        c3223u6 = c3223u5;
                    } catch (IOException e10) {
                        e = e10;
                        Log.e("CommonExt", "Error reading from input stream", e);
                    }
                } catch (IOException e11) {
                    e = e11;
                    c3223u5 = c3223u6;
                }
            }
            if (sb2.length() == 0) {
                string = sb3.toString();
                ck.p.i(string, "toString(...)");
                if (bufferedSourceBuffer != null) {
                    ck.p.j(bufferedSourceBuffer, "<this>");
                    try {
                        bufferedSourceBuffer.close();
                    } catch (IOException unused) {
                    }
                }
            } else {
                string = sb2.toString();
                ck.p.i(string, "toString(...)");
                if (bufferedSourceBuffer != null) {
                    ck.p.j(bufferedSourceBuffer, "<this>");
                    bufferedSourceBuffer.close();
                }
            }
            c3223u5.a(new C3344z1(description, reason, string));
            return mj.r.f64562a;
        } catch (Throwable th2) {
            if (bufferedSourceBuffer != null) {
                ck.p.j(bufferedSourceBuffer, "<this>");
                try {
                    bufferedSourceBuffer.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }
}
