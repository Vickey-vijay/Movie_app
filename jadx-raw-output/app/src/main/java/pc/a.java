package pc;

import android.os.Bundle;

/* JADX INFO: compiled from: RequestExtras.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f66127b = "query_info_type";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f66128c = "requester_type_5";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f66129d = "UnityScar";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f66130a;

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f66127b, f66128c);
        return bundle;
    }

    public String b() {
        return this.f66130a;
    }

    public a(String str) {
        this.f66130a = f66129d + str;
    }
}
