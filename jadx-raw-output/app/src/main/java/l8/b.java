package l8;

import a8.e;
import o8.l;

/* JADX INFO: compiled from: PermissionConfig.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String[] f63496a = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f63497b = {"android.permission.CAMERA"};

    public static String[] a(int i10) {
        if (l.g()) {
            if (i10 == e.c()) {
                return new String[]{"android.permission.READ_MEDIA_IMAGES"};
            }
            if (i10 == e.d()) {
                return new String[]{"android.permission.READ_MEDIA_VIDEO"};
            }
            if (i10 == e.b()) {
                return new String[]{"android.permission.READ_MEDIA_AUDIO"};
            }
            return new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
        }
        return new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    }

    public static String[] b(int i10) {
        if (l.g()) {
            if (i10 == e.c()) {
                return new String[]{"android.permission.READ_MEDIA_IMAGES"};
            }
            if (i10 == e.d()) {
                return new String[]{"android.permission.READ_MEDIA_VIDEO"};
            }
            if (i10 == e.b()) {
                return new String[]{"android.permission.READ_MEDIA_AUDIO"};
            }
            return new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
        }
        return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
    }
}
