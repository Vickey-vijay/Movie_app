package com.inmobi.media;

import android.net.Network;
import android.os.SystemClock;
import com.inmobi.media.core.config.models.AdConfig;
import java.net.InetAddress;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Z4 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Network f23889a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z4(Network network, rj.c cVar) {
        super(2, cVar);
        this.f23889a = network;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Z4(this.f23889a, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Z4(this.f23889a, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z10;
        String urlDomain;
        sj.a.f();
        kotlin.c.b(obj);
        try {
            try {
                AdConfig.CustomNetworkValidation customNetworkValidationA = C2720a5.a();
                if (customNetworkValidationA != null && (urlDomain = customNetworkValidationA.getUrlDomain()) != null) {
                    if (urlDomain.length() <= 0) {
                        urlDomain = null;
                    }
                    if (urlDomain != null) {
                        z10 = !ck.p.e(InetAddress.getByName(urlDomain).toString(), "");
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            } catch (Exception unused) {
            }
            try {
                C2720a5.f23942b = z10;
                C2720a5.f23941a = this.f23889a;
                C2720a5.f23943c = SystemClock.elapsedRealtime();
                Network network = C2720a5.f23941a;
            } catch (Exception e10) {
                mj.g gVar = P9.f23321a;
                P9.a(new L2(e10));
            }
            C2720a5.f23945e.set(false);
            return mj.r.f64562a;
        } catch (Throwable th2) {
            C2720a5.f23945e.set(false);
            throw th2;
        }
    }
}
