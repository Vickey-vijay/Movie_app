package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class vm {
    /* JADX WARN: Code duplicated, block: B:37:0x009e A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #2 {all -> 0x00bd, blocks: (B:35:0x0098, B:37:0x009e), top: B:48:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x009e, please report this as an issue */
    public static void ouw() {
        int i10;
        Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
        if (contextOuw == null || !com.bytedance.sdk.component.utils.ko.yu()) {
            return;
        }
        com.bytedance.sdk.component.utils.ko.fkw("TTAdSdk-InitChecker", "The pangolin sdk access, the environment is debug, the initial configuration detection starts");
        String packageName = contextOuw.getPackageName();
        int i11 = contextOuw.getApplicationInfo().targetSdkVersion;
        boolean z10 = false;
        boolean z11 = true;
        try {
            String[] strArr = contextOuw.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("android.permission.INTERNET");
                arrayList.add("android.permission.ACCESS_NETWORK_STATE");
                arrayList.add("android.permission.WAKE_LOCK");
                for (String str : strArr) {
                    if (str != null) {
                        arrayList.remove(str);
                    }
                }
                if (arrayList.isEmpty()) {
                    com.bytedance.sdk.component.utils.ko.fkw("TTAdSdk-InitChecker", "AndroidManifest.xml permissions configuration is normal");
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            com.bytedance.sdk.component.utils.ko.fkw("TTAdSdk-InitChecker", "    May be missing permissions：" + ((String) it.next()) + "，Please refer to the access documentation");
                            z11 = false;
                        } catch (Throwable th2) {
                            th = th2;
                            com.bytedance.sdk.component.utils.ko.lh("TTAdSdk-InitChecker", "The usage-permission configuration error in AndroidManifest.xml, please refer to the access documentation", th);
                            z11 = z10;
                            i10 = Build.VERSION.SDK_INT;
                            if (i11 < 23) {
                                com.bytedance.sdk.component.utils.ko.fkw("TTAdSdk-InitChecker", "No adaptation required for dynamic permissions：target=" + i11 + "&phone=" + i10 + ", require=23");
                            }
                            if (!z11) {
                                com.bytedance.sdk.component.utils.ko.fkw("TTAdSdk-InitChecker", "You have not configured permission, please refer to the access documentation, otherwise it will affect the conversion");
                            }
                            com.bytedance.sdk.component.utils.ko.fkw("TTAdSdk-InitChecker", "End of pangolin sdk initial configuration test");
                        }
                    }
                }
            } else {
                com.bytedance.sdk.component.utils.ko.fkw("TTAdSdk-InitChecker", "The uses-permission configuration in AndroidManifest.xml is missing, please refer to the access documentation");
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = true;
        }
        try {
            i10 = Build.VERSION.SDK_INT;
            if (i11 < 23) {
                com.bytedance.sdk.component.utils.ko.fkw("TTAdSdk-InitChecker", "No adaptation required for dynamic permissions：target=" + i11 + "&phone=" + i10 + ", require=23");
            }
        } catch (Throwable th4) {
            com.bytedance.sdk.component.utils.ko.lh("TTAdSdk-InitChecker", "The dynamic permission is abnormal. Please check and read the access document in detail： ", th4);
        }
        if (!z11) {
            com.bytedance.sdk.component.utils.ko.fkw("TTAdSdk-InitChecker", "You have not configured permission, please refer to the access documentation, otherwise it will affect the conversion");
        }
        com.bytedance.sdk.component.utils.ko.fkw("TTAdSdk-InitChecker", "End of pangolin sdk initial configuration test");
    }
}
