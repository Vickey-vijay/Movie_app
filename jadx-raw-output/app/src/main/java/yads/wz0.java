package yads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: loaded from: classes10.dex */
public final class wz0 implements be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zz0 f84383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b01 f84384b;

    public /* synthetic */ wz0(Context context) {
        this(new zz0(context), new b01(context));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Override // yads.be
    public final td a() {
        td tdVar;
        ResolveInfo resolveInfoResolveService;
        zz0 zz0Var = this.f84383a;
        zz0Var.getClass();
        td tdVar2 = null;
        try {
            zz0Var.f85661a.getClass();
            if (AdvertisingIdClient.class != 0) {
                pm2 pm2Var = zz0Var.f85661a;
                Object[] objArr = {zz0Var.f85663c};
                pm2Var.getClass();
                Object objA = pm2.a(AdvertisingIdClient.class, "getAdvertisingIdInfo", objArr);
                if (objA != null) {
                    String str = (String) om2.a(objA, "getId", new Object[0]);
                    Boolean bool = (Boolean) om2.a(objA, "isLimitAdTrackingEnabled", new Object[0]);
                    zz0Var.f85662b.getClass();
                    if (bool == null || str == null) {
                        tdVar = null;
                    } else {
                        tdVar = new td(str, bool.booleanValue());
                    }
                } else {
                    tdVar = null;
                }
            } else {
                tdVar = null;
            }
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
        }
        if (tdVar != null) {
            return tdVar;
        }
        b01 b01Var = this.f84384b;
        b01Var.f75684d.getClass();
        Intent intentA = d01.a();
        gs2 gs2Var = b01Var.f75681a;
        Context context = b01Var.f75682b;
        gs2Var.getClass();
        try {
            resolveInfoResolveService = context.getPackageManager().resolveService(intentA, 0);
        } catch (Throwable unused2) {
            boolean z11 = ad1.f75480a;
            resolveInfoResolveService = null;
        }
        if (resolveInfoResolveService == null) {
            return null;
        }
        try {
            yz0 yz0Var = new yz0();
            if (b01Var.f75682b.bindService(intentA, yz0Var, 1)) {
                td tdVarA = b01Var.f75683c.a(yz0Var);
                b01Var.f75682b.unbindService(yz0Var);
                tdVar2 = tdVarA;
            } else {
                boolean z12 = ad1.f75480a;
            }
            return tdVar2;
        } catch (Throwable unused3) {
            boolean z13 = ad1.f75480a;
            return tdVar2;
        }
    }

    public wz0(zz0 zz0Var, b01 b01Var) {
        this.f84383a = zz0Var;
        this.f84384b = b01Var;
    }
}
