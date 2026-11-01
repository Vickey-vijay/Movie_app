package l8;

import a8.e;
import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.luck.picture.lib.basic.PictureCommonFragment;
import java.util.ArrayList;
import java.util.List;
import o8.l;

/* JADX INFO: compiled from: PermissionChecker.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f63495a;

    public static boolean a(Context context, String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                if (ContextCompat.checkSelfPermission(context.getApplicationContext(), str) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void requestPermissions(Fragment fragment, String[] strArr, c cVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(strArr);
        requestPermissions(fragment, arrayList, 10086, cVar);
    }

    public static a b() {
        if (f63495a == null) {
            synchronized (a.class) {
                if (f63495a == null) {
                    f63495a = new a();
                }
            }
        }
        return f63495a;
    }

    public static boolean c(Context context) {
        return a(context, new String[]{"android.permission.CAMERA"});
    }

    @RequiresApi(api = 33)
    public static boolean d(Context context) {
        return a(context, new String[]{"android.permission.READ_MEDIA_AUDIO"});
    }

    @RequiresApi(api = 33)
    public static boolean e(Context context) {
        return a(context, new String[]{"android.permission.READ_MEDIA_IMAGES"});
    }

    @RequiresApi(api = 33)
    public static boolean g(Context context) {
        return a(context, new String[]{"android.permission.READ_MEDIA_VIDEO"});
    }

    public static boolean i(Context context) {
        return a(context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    public static boolean f(int i10, Context context) {
        if (l.g()) {
            if (i10 == e.c()) {
                return e(context);
            }
            if (i10 == e.d()) {
                return g(context);
            }
            if (i10 == e.b()) {
                return d(context);
            }
            if (e(context) && g(context)) {
                return true;
            }
            return false;
        }
        return a(context, new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
    }

    public static boolean h(Context context, String[] strArr) {
        return a(context, strArr);
    }

    public void j(int[] iArr, c cVar) {
        if (d.b(iArr)) {
            cVar.onGranted();
        } else {
            cVar.a();
        }
    }

    public void requestPermissions(Fragment fragment, List<String[]> list, c cVar) {
        requestPermissions(fragment, list, 10086, cVar);
    }

    private void requestPermissions(Fragment fragment, List<String[]> list, int i10, c cVar) {
        if (!o8.a.c(fragment.getActivity()) && (fragment instanceof PictureCommonFragment)) {
            FragmentActivity activity = fragment.getActivity();
            ArrayList arrayList = new ArrayList();
            for (String[] strArr : list) {
                for (String str : strArr) {
                    if (ContextCompat.checkSelfPermission(activity, str) != 0) {
                        arrayList.add(str);
                    }
                }
            }
            if (arrayList.size() <= 0) {
                if (cVar != null) {
                    cVar.onGranted();
                }
            } else {
                ((PictureCommonFragment) fragment).E0(cVar);
                String[] strArr2 = new String[arrayList.size()];
                arrayList.toArray(strArr2);
                fragment.requestPermissions(strArr2, i10);
                ActivityCompat.requestPermissions(activity, strArr2, i10);
            }
        }
    }
}
