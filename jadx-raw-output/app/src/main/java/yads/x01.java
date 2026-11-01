package yads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class x01 implements be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gs2 f84395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f84396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z01 f84397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a11 f84398d;

    public /* synthetic */ x01(Context context) {
        this(context, new gs2());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    @Override // yads.be
    public final td a() {
        ResolveInfo resolveInfoResolveService;
        td tdVar;
        this.f84398d.getClass();
        Intent intentA = a11.a();
        gs2 gs2Var = this.f84395a;
        Context context = this.f84396b;
        gs2Var.getClass();
        try {
            resolveInfoResolveService = context.getPackageManager().resolveService(intentA, 0);
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
            resolveInfoResolveService = null;
        }
        if (resolveInfoResolveService == null) {
            return null;
        }
        try {
            com.monetization.ads.core.identifiers.ad.huawei.a aVar = new com.monetization.ads.core.identifiers.ad.huawei.a();
            if (!this.f84396b.bindService(intentA, aVar, 1)) {
                boolean z11 = ad1.f75480a;
                return null;
            }
            z01 z01Var = this.f84397c;
            z01Var.getClass();
            try {
                OpenDeviceIdentifierService openDeviceIdentifierService = (OpenDeviceIdentifierService) aVar.f42908a.poll(5L, TimeUnit.SECONDS);
                if (openDeviceIdentifierService != null) {
                    String oaid = openDeviceIdentifierService.getOaid();
                    boolean oaidTrackLimited = openDeviceIdentifierService.getOaidTrackLimited();
                    z01Var.f85166a.getClass();
                    if (oaid != null) {
                        tdVar = new td(oaid, oaidTrackLimited);
                    } else {
                        tdVar = null;
                    }
                } else {
                    tdVar = null;
                }
            } catch (Exception unused2) {
                boolean z12 = ad1.f75480a;
            }
            this.f84396b.unbindService(aVar);
            return tdVar;
        } catch (Throwable unused3) {
            boolean z13 = ad1.f75480a;
            return null;
        }
    }

    public x01(Context context, gs2 gs2Var) {
        this.f84395a = gs2Var;
        this.f84396b = context.getApplicationContext();
        this.f84397c = new z01();
        this.f84398d = new a11();
    }
}
