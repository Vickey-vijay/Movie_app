package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.ironsource.C3676r4;
import com.ironsource.InterfaceC3475g;
import com.ironsource.InterfaceC3493h;
import com.ironsource.Rc;
import com.ironsource.Sc;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes6.dex */
public interface p {

    public static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f31026a;

        /* JADX WARN: Code duplicated, block: B:20:0x0058  */
        public a(String str, Sc sc2, InterfaceC3493h interfaceC3493h, InterfaceC3475g interfaceC3475g) {
            b aVar;
            ck.p.j(str, "method");
            ck.p.j(sc2, "openUrlConfigurations");
            ck.p.j(interfaceC3493h, "activityIntentFactory");
            ck.p.j(interfaceC3475g, "actionIntentFactory");
            int iHashCode = str.hashCode();
            if (iHashCode != -1455867212) {
                if (iHashCode != 109770977) {
                    if (iHashCode == 1224424441 && str.equals(C3426d4.i.K)) {
                        aVar = new b.d(sc2, interfaceC3493h);
                    } else {
                        aVar = new b.C0285b(str);
                    }
                } else if (str.equals(C3426d4.i.U)) {
                    aVar = new b.c(sc2, interfaceC3493h);
                } else {
                    aVar = new b.C0285b(str);
                }
            } else if (str.equals(C3426d4.i.J)) {
                aVar = new b.a(sc2, interfaceC3475g);
            } else {
                aVar = new b.C0285b(str);
            }
            this.f31026a = aVar;
        }

        @Override // com.ironsource.sdk.controller.p
        public c a(Context context, Rc rc2) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            ck.p.j(rc2, "openUrl");
            try {
                return this.f31026a.a(context, rc2);
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                String message = e10.getMessage();
                String message2 = (message == null || message.length() == 0) ? "" : e10.getMessage();
                ck.p.g(message2);
                return new c.a(message2);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String str, Sc sc2) {
            this(str, sc2, new k.c(), new k.a());
            ck.p.j(str, "method");
            ck.p.j(sc2, "openUrlConfigurations");
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Sc f31027a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final InterfaceC3475g f31028b;

            public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                if (p11 == null) {
                    return;
                }
                BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44960f);
                p10.startActivity(p11);
            }

            public a(Sc sc2, InterfaceC3475g interfaceC3475g) {
                ck.p.j(sc2, "configurations");
                ck.p.j(interfaceC3475g, "intentFactory");
                this.f31027a = sc2;
                this.f31028b = interfaceC3475g;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Rc rc2) {
                ck.p.j(context, GAMConfig.KEY_CONTEXT);
                ck.p.j(rc2, "openUrl");
                if (TextUtils.isEmpty(rc2.d())) {
                    return new c.a("url is empty");
                }
                Intent intentA = this.f31028b.a();
                intentA.setData(Uri.parse(rc2.d()));
                String strC = rc2.c();
                if (strC != null && strC.length() != 0) {
                    intentA = intentA.setPackage(rc2.c());
                    ck.p.i(intentA, "this.setPackage(openUrl.packageName)");
                }
                if (!(context instanceof Activity)) {
                    intentA = intentA.addFlags(this.f31027a.c());
                }
                ck.p.i(intentA, "intentFactory\n          …ations.flags) else this }");
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
                return c.b.f31035a;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        public static final class C0285b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f31029a;

            public C0285b(String str) {
                ck.p.j(str, "method");
                this.f31029a = str;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Rc rc2) {
                ck.p.j(context, GAMConfig.KEY_CONTEXT);
                ck.p.j(rc2, "openUrl");
                return new c.a("method " + this.f31029a + " is unsupported");
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Sc f31030a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final InterfaceC3493h f31031b;

            public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                if (p11 == null) {
                    return;
                }
                BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44960f);
                p10.startActivity(p11);
            }

            public c(Sc sc2, InterfaceC3493h interfaceC3493h) {
                ck.p.j(sc2, "configurations");
                ck.p.j(interfaceC3493h, "intentFactory");
                this.f31030a = sc2;
                this.f31031b = interfaceC3493h;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Rc rc2) {
                ck.p.j(context, GAMConfig.KEY_CONTEXT);
                ck.p.j(rc2, "openUrl");
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new OpenUrlActivity.e(this.f31031b).a(this.f31030a.c()).a(rc2.d()).b(true).c(true).a(context));
                return c.b.f31035a;
            }
        }

        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Sc f31032a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final InterfaceC3493h f31033b;

            public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                if (p11 == null) {
                    return;
                }
                BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44960f);
                p10.startActivity(p11);
            }

            public d(Sc sc2, InterfaceC3493h interfaceC3493h) {
                ck.p.j(sc2, "configurations");
                ck.p.j(interfaceC3493h, "intentFactory");
                this.f31032a = sc2;
                this.f31033b = interfaceC3493h;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Rc rc2) {
                ck.p.j(context, GAMConfig.KEY_CONTEXT);
                ck.p.j(rc2, "openUrl");
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new OpenUrlActivity.e(this.f31033b).a(this.f31032a.c()).a(rc2.d()).a(this.f31032a.d()).b(true).a(context));
                return c.b.f31035a;
            }
        }

        c a(Context context, Rc rc2);
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f31034a;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.f31034a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && ck.p.e(this.f31034a, ((a) obj).f31034a);
            }

            public int hashCode() {
                return this.f31034a.hashCode();
            }

            public String toString() {
                return "Error(errorMessage=" + this.f31034a + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(null);
                ck.p.j(str, "errorMessage");
                this.f31034a = str;
            }

            public final a a(String str) {
                ck.p.j(str, "errorMessage");
                return new a(str);
            }

            public final String b() {
                return this.f31034a;
            }

            public /* synthetic */ a(String str, int i10, ck.i iVar) {
                this((i10 & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f31034a;
                }
                return aVar.a(str);
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f31035a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(ck.i iVar) {
            this();
        }

        private c() {
        }
    }

    c a(Context context, Rc rc2);
}
