package o8;

import android.content.Context;
import android.os.Environment;
import java.util.HashMap;

/* JADX INFO: compiled from: FileDirMap.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<Integer, String> f65143a = new HashMap<>();

    public static void a() {
        f65143a.clear();
    }

    public static String b(Context context, int i10) {
        HashMap<Integer, String> map = f65143a;
        String str = map.get(Integer.valueOf(i10));
        if (str != null) {
            return str;
        }
        c(context);
        return map.get(Integer.valueOf(i10));
    }

    public static void c(Context context) {
        HashMap<Integer, String> map = f65143a;
        if (map.get(1) == null) {
            map.put(1, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES).getPath());
        }
        if (map.get(2) == null) {
            map.put(2, context.getExternalFilesDir(Environment.DIRECTORY_MOVIES).getPath());
        }
        if (map.get(3) == null) {
            map.put(3, context.getExternalFilesDir(Environment.DIRECTORY_MUSIC).getPath());
        }
    }
}
