package yads;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ho0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f78291a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f78292b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f78291a.add(str)) {
            f78292b += ", " + str;
        }
    }
}
