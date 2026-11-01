package com.inmobi.media;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.inmobi.media.C2859ff;
import com.inmobi.media.core.config.models.SignalsConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: com.inmobi.media.ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2859ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3053n9 f24374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f24375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SignalsConfig.NovatiqConfig f24377e;

    public final C2808df a() {
        if (this.f24376d) {
            return new C2808df(kotlin.collections.a.l(mj.h.a("n-h-id", this.f24375c)));
        }
        C3053n9 c3053n9 = this.f24374b;
        if (c3053n9 != null) {
            c3053n9.a("NovatiqDataHandler", "Novatiq disabled. skip");
        }
        return new C2808df(kotlin.collections.a.j());
    }

    public C2859ff(Context context, C3053n9 c3053n9) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f24373a = context;
        this.f24374b = c3053n9;
        this.f24375c = "";
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(SignalsConfig.class, "clazz");
        this.f24377e = ((SignalsConfig) Y3.f23815a.a(SignalsConfig.class)).getNovatiqConfig();
        b();
    }

    public final void b() {
        String networkOperatorName;
        Context context = this.f24373a;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        if (this.f24377e.isNovatiqEnabled()) {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
                networkOperatorName = "";
            }
            List<String> carrierNames = this.f24377e.getCarrierNames();
            if (!(carrierNames instanceof Collection) || !carrierNames.isEmpty()) {
                Iterator<T> it = carrierNames.iterator();
                while (it.hasNext()) {
                    if (lk.a0.V(networkOperatorName, (String) it.next(), true)) {
                        try {
                            String strA = a(this.f24373a);
                            this.f24376d = true;
                            StringBuilder sb2 = new StringBuilder();
                            Random random = new Random();
                            for (int i10 = 0; i10 < 40; i10++) {
                                char cCharAt = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxxxxxx".charAt(i10);
                                if (cCharAt == 'x') {
                                    sb2.append(Character.forDigit(random.nextInt(16), 16));
                                } else {
                                    sb2.append(cCharAt);
                                }
                            }
                            String string = sb2.toString();
                            ck.p.i(string, "toString(...)");
                            this.f24375c = string;
                            ((C3227u9) He.f22812c.getValue()).a(new C2885gf(this.f24377e, new C2833ef(string, strA), this.f24374b).a()).F(new bk.l() { // from class: b7.v6
                                @Override // bk.l
                                public final Object invoke(Object obj) {
                                    return C2859ff.a(this.f5213b, (Throwable) obj);
                                }
                            });
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
            }
        }
        C3053n9 c3053n9 = this.f24374b;
        if (c3053n9 != null) {
            c3053n9.a("NovatiqDataHandler", "Novatiq disabled.. skipping");
        }
    }

    public static final mj.r a(C2859ff c2859ff, Throwable th2) {
        if (th2 == null) {
            C3053n9 c3053n9 = c2859ff.f24374b;
            if (c3053n9 != null) {
                c3053n9.a("NovatiqDataHandler", "Novatiq data sync successful");
            }
        } else {
            C3053n9 c3053n10 = c2859ff.f24374b;
            if (c3053n10 != null) {
                c3053n10.a("NovatiqDataHandler", "Error: " + th2);
            }
        }
        return mj.r.f64562a;
    }

    public static String a(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        return lk.x.M(context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString(), ' ', '_', false, 4, null) + "_app";
    }
}
