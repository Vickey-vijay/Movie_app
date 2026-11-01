package androidx.privacysandbox.ads.adservices.appsetid;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.core.os.OutcomeReceiverKt;
import androidx.media3.exoplayer.dash.offline.a;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import ck.i;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import rj.c;
import tj.f;

/* JADX INFO: compiled from: AppSetIdManager.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AppSetIdManager {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: AppSetIdManager.kt */
    @RequiresExtension(extension = 1000000, version = 4)
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public static final class Api33Ext4Impl extends AppSetIdManager {
        private final android.adservices.appsetid.AppSetIdManager mAppSetIdManager;

        public Api33Ext4Impl(android.adservices.appsetid.AppSetIdManager appSetIdManager) {
            p.j(appSetIdManager, "mAppSetIdManager");
            this.mAppSetIdManager = appSetIdManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object getAppSetIdAsyncInternal(c<? super android.adservices.appsetid.AppSetId> cVar) {
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            cVar2.J();
            this.mAppSetIdManager.getAppSetId(new a(), OutcomeReceiverKt.asOutcomeReceiver(cVar2));
            Object objB = cVar2.B();
            if (objB == sj.a.f()) {
                f.c(cVar);
            }
            return objB;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager
        @DoNotInline
        public Object getAppSetId(c<? super AppSetId> cVar) throws Throwable {
            AppSetIdManager$Api33Ext4Impl$getAppSetId$1 appSetIdManager$Api33Ext4Impl$getAppSetId$1;
            Api33Ext4Impl api33Ext4Impl;
            if (cVar instanceof AppSetIdManager$Api33Ext4Impl$getAppSetId$1) {
                appSetIdManager$Api33Ext4Impl$getAppSetId$1 = (AppSetIdManager$Api33Ext4Impl$getAppSetId$1) cVar;
                int i10 = appSetIdManager$Api33Ext4Impl$getAppSetId$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    appSetIdManager$Api33Ext4Impl$getAppSetId$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    appSetIdManager$Api33Ext4Impl$getAppSetId$1 = new AppSetIdManager$Api33Ext4Impl$getAppSetId$1(this, cVar);
                }
            } else {
                appSetIdManager$Api33Ext4Impl$getAppSetId$1 = new AppSetIdManager$Api33Ext4Impl$getAppSetId$1(this, cVar);
            }
            Object appSetIdAsyncInternal = appSetIdManager$Api33Ext4Impl$getAppSetId$1.result;
            Object objF = sj.a.f();
            int i11 = appSetIdManager$Api33Ext4Impl$getAppSetId$1.label;
            if (i11 == 0) {
                kotlin.c.b(appSetIdAsyncInternal);
                appSetIdManager$Api33Ext4Impl$getAppSetId$1.L$0 = this;
                appSetIdManager$Api33Ext4Impl$getAppSetId$1.label = 1;
                appSetIdAsyncInternal = getAppSetIdAsyncInternal(appSetIdManager$Api33Ext4Impl$getAppSetId$1);
                if (appSetIdAsyncInternal == objF) {
                    return objF;
                }
                api33Ext4Impl = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                api33Ext4Impl = (Api33Ext4Impl) appSetIdManager$Api33Ext4Impl$getAppSetId$1.L$0;
                kotlin.c.b(appSetIdAsyncInternal);
            }
            return api33Ext4Impl.convertResponse((android.adservices.appsetid.AppSetId) appSetIdAsyncInternal);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Api33Ext4Impl(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            Object systemService = context.getSystemService((Class<Object>) android.adservices.appsetid.AppSetIdManager.class);
            p.i(systemService, "context.getSystemService…:class.java\n            )");
            this((android.adservices.appsetid.AppSetIdManager) systemService);
        }

        private final AppSetId convertResponse(android.adservices.appsetid.AppSetId appSetId) {
            if (appSetId.getScope() == 1) {
                String id2 = appSetId.getId();
                p.i(id2, "response.id");
                return new AppSetId(id2, 1);
            }
            String id3 = appSetId.getId();
            p.i(id3, "response.id");
            return new AppSetId(id3, 2);
        }
    }

    /* JADX INFO: compiled from: AppSetIdManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final AppSetIdManager obtain(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final AppSetIdManager obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object getAppSetId(c<? super AppSetId> cVar);
}
