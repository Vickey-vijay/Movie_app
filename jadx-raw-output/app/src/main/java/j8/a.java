package j8;

import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SelectedManager.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList<LocalMedia> f61718a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList<LocalMedia> f61719b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList<LocalMedia> f61720c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList<LocalMediaFolder> f61721d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static LocalMediaFolder f61722e;

    public static void a(List<LocalMediaFolder> list) {
        if (list != null) {
            e();
            f61721d.addAll(list);
        }
    }

    public static void b(ArrayList<LocalMedia> arrayList) {
        if (arrayList != null) {
            f();
            f61720c.addAll(arrayList);
        }
    }

    public static synchronized void c(LocalMedia localMedia) {
        f61718a.add(localMedia);
    }

    public static void e() {
        ArrayList<LocalMediaFolder> arrayList = f61721d;
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    public static void f() {
        ArrayList<LocalMedia> arrayList = f61720c;
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    public static void g() {
        ArrayList<LocalMedia> arrayList = f61719b;
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    public static synchronized void h() {
        ArrayList<LocalMedia> arrayList = f61718a;
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    public static ArrayList<LocalMediaFolder> i() {
        return f61721d;
    }

    public static LocalMediaFolder j() {
        return f61722e;
    }

    public static ArrayList<LocalMedia> k() {
        return f61720c;
    }

    public static int l() {
        return f61718a.size();
    }

    public static ArrayList<LocalMedia> m() {
        return f61719b;
    }

    public static synchronized ArrayList<LocalMedia> n() {
        return f61718a;
    }

    public static String o() {
        ArrayList<LocalMedia> arrayList = f61718a;
        return arrayList.size() > 0 ? arrayList.get(0).s() : "";
    }

    public static void p(LocalMediaFolder localMediaFolder) {
        f61722e = localMediaFolder;
    }

    public static void d(ArrayList<LocalMedia> arrayList) {
        g();
        f61719b.addAll(arrayList);
    }
}
