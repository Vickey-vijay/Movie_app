package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import kotlin.Metadata;

/* JADX INFO: compiled from: InstallReferrerUtil.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002R\u0014\u0010\u000b\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/facebook/internal/w;", "", "Lcom/facebook/internal/w$a;", "callback", "Lmj/r;", "d", "c", "e", "", "b", "()Z", "isUpdated", "<init>", "()V", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f14520a = new w();

    /* JADX INFO: compiled from: InstallReferrerUtil.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/w$a;", "", "", "s", "Lmj/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface a {
        void a(String str);
    }

    /* JADX INFO: compiled from: InstallReferrerUtil.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/facebook/internal/w$b", "Lcom/android/installreferrer/api/InstallReferrerStateListener;", "", "responseCode", "Lmj/r;", "onInstallReferrerSetupFinished", "onInstallReferrerServiceDisconnected", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InstallReferrerClient f14521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f14522b;

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }

        public b(InstallReferrerClient installReferrerClient, a aVar) {
            this.f14521a = installReferrerClient;
            this.f14522b = aVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i10) {
            if (i2.a.d(this)) {
                return;
            }
            try {
                if (i10 != 0) {
                    if (i10 == 2) {
                        w.f14520a.e();
                        return;
                    }
                    return;
                }
                try {
                    ReferrerDetails installReferrer = this.f14521a.getInstallReferrer();
                    ck.p.i(installReferrer, "{\n                      referrerClient.installReferrer\n                    }");
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null && (lk.a0.X(installReferrer2, "fb", false, 2, null) || lk.a0.X(installReferrer2, "facebook", false, 2, null))) {
                        this.f14522b.a(installReferrer2);
                    }
                    w.f14520a.e();
                } catch (RemoteException unused) {
                }
            } catch (Throwable th2) {
                i2.a.b(th2, this);
            }
        }
    }

    public static final void d(a aVar) {
        ck.p.j(aVar, "callback");
        w wVar = f14520a;
        if (wVar.b()) {
            return;
        }
        wVar.c(aVar);
    }

    public final boolean b() {
        return q1.t.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    public final void c(a aVar) {
        InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(q1.t.l()).build();
        try {
            installReferrerClientBuild.startConnection(new b(installReferrerClientBuild, aVar));
        } catch (Exception unused) {
        }
    }

    public final void e() {
        q1.t.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
