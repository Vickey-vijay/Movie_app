package com.unity3d.ads.core.data.repository;

import bk.q;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.h;
import mj.r;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidSessionRepository.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {}, m = "invokeSuspend")
public final class AndroidSessionRepository$persistedNativeConfiguration$1 extends SuspendLambda implements q<NativeConfigurationOuterClass.NativeConfiguration, Boolean, c<? super Pair<? extends NativeConfigurationOuterClass.NativeConfiguration, ? extends Boolean>>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;

    public AndroidSessionRepository$persistedNativeConfiguration$1(c<? super AndroidSessionRepository$persistedNativeConfiguration$1> cVar) {
        super(3, cVar);
    }

    public final Object invoke(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, boolean z10, c<? super Pair<NativeConfigurationOuterClass.NativeConfiguration, Boolean>> cVar) {
        AndroidSessionRepository$persistedNativeConfiguration$1 androidSessionRepository$persistedNativeConfiguration$1 = new AndroidSessionRepository$persistedNativeConfiguration$1(cVar);
        androidSessionRepository$persistedNativeConfiguration$1.L$0 = nativeConfiguration;
        androidSessionRepository$persistedNativeConfiguration$1.Z$0 = z10;
        return androidSessionRepository$persistedNativeConfiguration$1.invokeSuspend(r.f64562a);
    }

    @Override // bk.q
    public /* bridge */ /* synthetic */ Object invoke(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, Boolean bool, c<? super Pair<? extends NativeConfigurationOuterClass.NativeConfiguration, ? extends Boolean>> cVar) {
        return invoke(nativeConfiguration, bool.booleanValue(), (c<? super Pair<NativeConfigurationOuterClass.NativeConfiguration, Boolean>>) cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        if (this.label == 0) {
            kotlin.c.b(obj);
            return h.a((NativeConfigurationOuterClass.NativeConfiguration) this.L$0, tj.a.a(this.Z$0));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
