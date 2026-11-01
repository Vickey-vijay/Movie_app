package yads;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class tg1 implements rg1, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oy2 f83027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f83028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mj.g f83029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f83030e;

    public final void a() {
        ((SharedPreferences) this.f83029d.getValue()).edit().clear().apply();
    }

    public final long b(String str) {
        return ((SharedPreferences) this.f83029d.getValue()).getLong(str, 0L);
    }

    public final String c(String str) {
        return ((SharedPreferences) this.f83029d.getValue()).getString(str, null);
    }

    public final void d(String str) {
        ((SharedPreferences) this.f83029d.getValue()).edit().remove(str).apply();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            Iterator it = this.f83030e.iterator();
            while (it.hasNext()) {
                qg1 qg1Var = (qg1) ((WeakReference) it.next()).get();
                if (qg1Var != null) {
                    zw zwVar = (zw) qg1Var;
                    synchronized (zw.f85621j) {
                        ix ixVarA = zwVar.f85623c.a(this, str);
                        if (ixVarA == null) {
                            ixVarA = zwVar.f85622b.a(this, str);
                        }
                        if (ixVarA != null) {
                            zwVar.a(ixVarA);
                        }
                        mj.r rVar = mj.r.f64562a;
                    }
                }
            }
        }
    }

    public tg1(Context context, String str, oy2 oy2Var) {
        this.f83026a = str;
        this.f83027b = oy2Var;
        Context applicationContext = context.getApplicationContext();
        this.f83028c = applicationContext != null ? applicationContext : context;
        this.f83029d = kotlin.b.a(new sg1(this));
        this.f83030e = new LinkedHashSet();
    }

    public final boolean a(String str) {
        return ((SharedPreferences) this.f83029d.getValue()).contains(str);
    }

    public final void b(String str, boolean z10) {
        ((SharedPreferences) this.f83029d.getValue()).edit().putBoolean(str, z10).apply();
    }

    public final boolean a(String str, boolean z10) {
        return ((SharedPreferences) this.f83029d.getValue()).getBoolean(str, z10);
    }

    public final void b(int i10, String str) {
        ((SharedPreferences) this.f83029d.getValue()).edit().putInt(str, i10).apply();
    }

    public final int a(int i10, String str) {
        ((SharedPreferences) this.f83029d.getValue()).contains(str);
        return ((SharedPreferences) this.f83029d.getValue()).getInt(str, i10);
    }

    public final Set a(String str, Set set) {
        return ((SharedPreferences) this.f83029d.getValue()).getStringSet(str, set);
    }

    public final void a(String str, long j10) {
        ((SharedPreferences) this.f83029d.getValue()).edit().putLong(str, j10).apply();
    }

    public final void a(String str, String str2) {
        ((SharedPreferences) this.f83029d.getValue()).edit().putString(str, str2).apply();
    }

    public final void a(String str, HashSet hashSet) {
        ((SharedPreferences) this.f83029d.getValue()).edit().putStringSet(str, hashSet).apply();
    }

    public final void a(qg1 qg1Var) {
        if (this.f83030e.isEmpty()) {
            ((SharedPreferences) this.f83029d.getValue()).registerOnSharedPreferenceChangeListener(this);
        }
        this.f83030e.add(new WeakReference(qg1Var));
    }
}
