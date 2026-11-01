package sg.bigo.ads.common.u.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.u.a;
import sg.bigo.ads.common.u.f;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c<T extends sg.bigo.ads.common.u.a> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f69949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final T f69950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Executor f69951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f69952m = 15000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map<String, Set<String>> f69953n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f69954o;

    public c(int i10, @NonNull T t10, boolean z10, Context context) {
        this.f69949j = i10;
        this.f69950k = t10;
        this.f69954o = z10;
        a("BIGO-Ad-Request-Id", String.valueOf(i10));
        a("User-Agent", sg.bigo.ads.common.aa.c.c(context));
    }

    @NonNull
    private Set<String> b(@NonNull String str) {
        Set<String> set = this.f69953n.get(str);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.f69953n.put(str, hashSet);
        return hashSet;
    }

    @NonNull
    public String a() {
        return "GET";
    }

    public final void a(String str) {
        b(str).clear();
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        b(str).add(str2);
    }

    @Nullable
    public f b() {
        return null;
    }

    @Nullable
    public byte[] c() {
        return null;
    }

    @Nullable
    public String d() {
        return null;
    }

    public int e() {
        return -1;
    }

    public boolean f() {
        return false;
    }

    @NonNull
    public final String g() {
        return this.f69950k.a();
    }

    public void h() {
    }
}
