package com.unity3d.services.core.configuration;

import android.app.Application;
import android.content.Context;
import androidx.startup.Initializer;
import bk.p;
import ck.s;
import com.google.android.gms.net.CronetProviderInstaller;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.i0;
import nk.j;
import nk.l0;
import nk.w0;
import tj.d;

/* JADX INFO: compiled from: AdsSdkInitializer.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AdsSdkInitializer implements Initializer<r> {
    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ r create(Context context) {
        create2(context);
        return r.f64562a;
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.configuration.AdsSdkInitializer$create$1, reason: invalid class name */
    /* JADX INFO: compiled from: AdsSdkInitializer.kt */
    @d(c = "com.unity3d.services.core.configuration.AdsSdkInitializer$create$1", f = "AdsSdkInitializer.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, rj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return new AnonymousClass1(this.$context, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                ((OrientationRepository) ServiceProvider.INSTANCE.getRegistry().getService("", s.b(OrientationRepository.class))).invoke();
                try {
                    CronetProviderInstaller.installProvider(this.$context);
                } catch (Throwable unused) {
                }
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ClientProperties.setApplicationContext(context.getApplicationContext());
        if (context instanceof Application) {
            ClientProperties.setApplication((Application) context);
        } else if (context.getApplicationContext() instanceof Application) {
            Context applicationContext = context.getApplicationContext();
            ck.p.h(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ClientProperties.setApplication((Application) applicationContext);
        }
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
        j.d(kotlinx.coroutines.d.h(kotlinx.coroutines.d.a(w0.a()), new AdsSdkInitializer$create$$inlined$CoroutineExceptionHandler$1(i0.F8)), null, null, new AnonymousClass1(context, null), 3, null);
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return nj.s.k();
    }
}
