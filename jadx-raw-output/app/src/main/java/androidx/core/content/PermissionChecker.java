package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.AppOpsManagerCompat;
import androidx.core.util.ObjectsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes8.dex */
public final class PermissionChecker {
    public static final int PERMISSION_DENIED = -1;
    public static final int PERMISSION_DENIED_APP_OP = -2;
    public static final int PERMISSION_GRANTED = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface PermissionResult {
    }

    private PermissionChecker() {
    }

    public static int checkCallingOrSelfPermission(@NonNull Context context, @NonNull String str) {
        String packageName;
        if (Binder.getCallingPid() == Process.myPid()) {
            packageName = context.getPackageName();
        } else {
            packageName = null;
        }
        return checkPermission(context, str, Binder.getCallingPid(), Binder.getCallingUid(), packageName);
    }

    public static int checkCallingPermission(@NonNull Context context, @NonNull String str, @Nullable String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return checkPermission(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int checkPermission(@NonNull Context context, @NonNull String str, int i10, int i11, @Nullable String str2) {
        boolean z10;
        int iNoteProxyOpNoThrow;
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManagerCompat.permissionToOp(str);
        if (strPermissionToOp == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (iMyUid == i11 && ObjectsCompat.equals(packageName, str2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            iNoteProxyOpNoThrow = AppOpsManagerCompat.checkOrNoteProxyOp(context, i11, strPermissionToOp, str2);
        } else {
            iNoteProxyOpNoThrow = AppOpsManagerCompat.noteProxyOpNoThrow(context, strPermissionToOp, str2);
        }
        if (iNoteProxyOpNoThrow == 0) {
            return 0;
        }
        return -2;
    }

    public static int checkSelfPermission(@NonNull Context context, @NonNull String str) {
        return checkPermission(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
