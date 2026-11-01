package com.facebook.appevents;

import androidx.annotation.RestrictTo;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppEventsManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/v;", "", "Lmj/r;", "a", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f14289a = new v();

    /* JADX INFO: compiled from: AppEventsManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/facebook/appevents/v$a", "Lcom/facebook/internal/FetchedAppSettingsManager$a;", "Lcom/facebook/internal/q;", "fetchedAppSettings", "Lmj/r;", "a", "onError", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements FetchedAppSettingsManager.a {
        @Override // com.facebook.internal.FetchedAppSettingsManager.a
        public void onError() {
        }

        public static final void h(boolean z10) {
            if (z10) {
                r1.b.b();
            }
        }

        public static final void i(boolean z10) {
            if (z10) {
                b2.a.a();
            }
        }

        public static final void j(boolean z10) {
            if (z10) {
                ModelManager.f();
            }
        }

        public static final void k(boolean z10) {
            if (z10) {
                v1.a.a();
            }
        }

        public static final void l(boolean z10) {
            if (z10) {
                w1.k.a();
            }
        }

        public static final void m(boolean z10) {
            if (z10) {
                s1.b.b();
            }
        }

        @Override // com.facebook.internal.FetchedAppSettingsManager.a
        public void a(com.facebook.internal.q qVar) {
            FeatureManager featureManager = FeatureManager.f14322a;
            FeatureManager.a(FeatureManager.Feature.AAM, new FeatureManager.a() { // from class: com.facebook.appevents.p
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z10) {
                    v.a.h(z10);
                }
            });
            FeatureManager.a(FeatureManager.Feature.RestrictiveDataFiltering, new FeatureManager.a() { // from class: com.facebook.appevents.q
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z10) {
                    v.a.i(z10);
                }
            });
            FeatureManager.a(FeatureManager.Feature.PrivacyProtection, new FeatureManager.a() { // from class: com.facebook.appevents.r
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z10) {
                    v.a.j(z10);
                }
            });
            FeatureManager.a(FeatureManager.Feature.EventDeactivation, new FeatureManager.a() { // from class: com.facebook.appevents.s
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z10) {
                    v.a.k(z10);
                }
            });
            FeatureManager.a(FeatureManager.Feature.IapLogging, new FeatureManager.a() { // from class: com.facebook.appevents.t
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z10) {
                    v.a.l(z10);
                }
            });
            FeatureManager.a(FeatureManager.Feature.CloudBridge, new FeatureManager.a() { // from class: com.facebook.appevents.u
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z10) {
                    v.a.m(z10);
                }
            });
        }
    }

    public static final void a() {
        if (i2.a.d(v.class)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f14327a;
            FetchedAppSettingsManager.d(new a());
        } catch (Throwable th2) {
            i2.a.b(th2, v.class);
        }
    }
}
