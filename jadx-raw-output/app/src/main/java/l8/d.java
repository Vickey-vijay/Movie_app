package l8;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: PermissionUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public class d {
    public static boolean b(int[] iArr) {
        if (iArr.length <= 0) {
            return false;
        }
        for (int i10 : iArr) {
            if (i10 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        p10.startActivityForResult(p11, p12);
    }

    public static void a(Fragment fragment, int i10) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", fragment.getActivity().getPackageName(), null));
            safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(fragment, intent, i10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
