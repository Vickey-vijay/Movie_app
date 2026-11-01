package yads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ko3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f79506f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f79508h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f79515o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f79501a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f79502b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f79503c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f79504d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f79505e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f79507g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f79509i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f79510j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f79511k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f79512l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f79513m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f79514n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f79516p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f79517q = false;

    public final int a(String str, String str2, Set set, String str3) {
        int i10;
        if (this.f79501a.isEmpty() && this.f79502b.isEmpty() && this.f79503c.isEmpty() && this.f79504d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        String str4 = this.f79501a;
        if (str4.isEmpty()) {
            i10 = 0;
        } else {
            i10 = str4.equals(str) ? 1073741824 : -1;
        }
        String str5 = this.f79502b;
        if (!str5.isEmpty() && i10 != -1) {
            i10 = str5.equals(str2) ? i10 + 2 : -1;
        }
        String str6 = this.f79504d;
        if (!str6.isEmpty() && i10 != -1) {
            i10 = str6.equals(str3) ? i10 + 4 : -1;
        }
        if (i10 == -1 || !set.containsAll(this.f79503c)) {
            return 0;
        }
        return (this.f79503c.size() * 4) + i10;
    }
}
