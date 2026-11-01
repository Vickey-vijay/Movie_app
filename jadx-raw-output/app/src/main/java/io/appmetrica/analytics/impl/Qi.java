package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Qi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafePackageManager f55806b;

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        SafePackageManager safePackageManager = this.f55806b;
        Context context = this.f55805a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 4096);
        if (packageInfo == null) {
            return arrayList;
        }
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr == null) {
            return arrayList;
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (iArr == null || iArr.length <= i10 || (iArr[i10] & 2) == 0) {
                arrayList.add(new PermissionState(str, false));
            } else {
                arrayList.add(new PermissionState(str, true));
            }
        }
        return arrayList;
    }

    public Qi(Context context, SafePackageManager safePackageManager) {
        this.f55805a = context;
        this.f55806b = safePackageManager;
    }
}
