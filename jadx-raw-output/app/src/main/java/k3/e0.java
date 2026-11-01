package k3;

import java.util.HashSet;

/* JADX INFO: compiled from: ExoPlayerLibraryInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f62125a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f62126b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f62125a.add(str)) {
            f62126b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f62126b;
    }
}
