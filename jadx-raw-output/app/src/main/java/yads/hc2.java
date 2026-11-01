package yads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f78176a = nj.s.n("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");

    public static void a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            List listR0 = nj.b0.R0(f78176a);
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                listR0.removeAll(nj.n.q0(strArr));
                if (!listR0.isEmpty()) {
                    ck.w wVar = ck.w.f6066a;
                    String str = String.format("Please, check %s permission in AndroidManifest file.", Arrays.copyOf(new Object[]{listR0}, 1));
                    ck.p.i(str, "format(...)");
                    throw new ub1(str, str);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
