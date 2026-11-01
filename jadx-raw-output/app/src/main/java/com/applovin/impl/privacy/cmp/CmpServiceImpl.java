package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.impl.k0;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes8.dex */
public class CmpServiceImpl implements AppLovinCmpService, com.applovin.impl.privacy.cmp.a.InterfaceC0043a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f8772a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AppLovinCmpError f8776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f8777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f8778g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8774c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f8775d = d.NONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.privacy.cmp.a f8773b = c();

    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AppLovinCmpService.OnCompletedListener f8779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f8780b;

        /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a, reason: collision with other inner class name */
        public class C0042a implements f {
            public C0042a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.f8779a.onCompleted(appLovinCmpError);
            }
        }

        public a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f8779a = onCompletedListener;
            this.f8780b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f8779a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.f8780b, new C0042a());
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f8783a;

        public b(Activity activity) {
            this.f8783a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f8773b.b(this.f8783a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f8785a;

        public c(Activity activity) {
            this.f8785a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f8773b.a(this.f8785a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    public enum d {
        NONE,
        LOADING,
        COMPLETED
    }

    public interface e {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public interface f {
        void a(AppLovinCmpError appLovinCmpError);
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0043a
    public void onFlowHidden(Bundle bundle) {
        b((AppLovinCmpError) null);
        b();
    }

    public void preloadCmp(Activity activity) {
        a(activity, null);
    }

    @NonNull
    public String toString() {
        return "[CmpService]";
    }

    private void a(AppLovinCmpError appLovinCmpError) {
        e eVar = this.f8777f;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.f8777f = null;
        this.f8776e = null;
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        f fVar = this.f8778g;
        if (fVar == null) {
            return;
        }
        fVar.a(appLovinCmpError);
        this.f8778g = null;
    }

    private com.applovin.impl.privacy.cmp.a c() {
        if (n7.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.f8772a);
        }
        if (!this.f8772a.x().j()) {
            return null;
        }
        o.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.f8773b != null;
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0043a
    public void onFlowLoaded(Bundle bundle) {
        synchronized (this.f8774c) {
            if (this.f8777f == null) {
                this.f8775d = d.COMPLETED;
            } else {
                this.f8775d = d.NONE;
                a((AppLovinCmpError) null);
            }
        }
    }

    public void showCmp(Activity activity, f fVar) {
        b bVar = new b(activity);
        this.f8778g = fVar;
        if (this.f8773b.e()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(@NonNull Activity activity, @NonNull AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f8772a.O();
        if (o.a()) {
            this.f8772a.O().a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!this.f8772a.x().j()) {
            o.h("AppLovinCmpService", "Unable to show CMP for existing user. Please enable the consent flow.");
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "Consent flow is not enabled"));
        } else if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
        } else {
            d();
            loadCmp(activity, new a(onCompletedListener, activity));
        }
    }

    public CmpServiceImpl(k kVar) {
        this.f8772a = kVar;
    }

    private void d() {
        if (!hasSupportedCmp()) {
            return;
        }
        this.f8773b.c();
    }

    public void loadCmp(Activity activity, e eVar) {
        a(activity, eVar);
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0043a
    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        b();
        synchronized (this.f8774c) {
            if (this.f8777f == null) {
                this.f8775d = d.COMPLETED;
                this.f8776e = cmpErrorImpl;
            } else {
                this.f8775d = d.NONE;
                a(cmpErrorImpl);
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0043a
    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        b(cmpErrorImpl);
        b();
    }

    private void b() {
        com.applovin.impl.privacy.cmp.a aVar = this.f8773b;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private void a(Activity activity, e eVar) {
        if (!hasSupportedCmp()) {
            if (eVar != null) {
                eVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
                return;
            }
            return;
        }
        boolean z10 = false;
        synchronized (this.f8774c) {
            if (eVar != null) {
                this.f8777f = eVar;
            }
            d dVar = this.f8775d;
            d dVar2 = d.NONE;
            if (dVar == dVar2) {
                this.f8775d = d.LOADING;
            } else {
                if (dVar == d.LOADING) {
                    return;
                }
                this.f8775d = dVar2;
                z10 = true;
            }
            if (z10) {
                a(this.f8776e);
                return;
            }
            c cVar = new c(activity);
            if (this.f8773b.d()) {
                AppLovinSdkUtils.runOnUiThread(cVar);
            } else {
                cVar.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k0 a() {
        return new k0(this.f8772a.x().d());
    }
}
