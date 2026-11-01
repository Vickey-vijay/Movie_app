package sg.bigo.ads.core.e.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import sg.bigo.ads.api.core.q;

/* JADX INFO: loaded from: classes.dex */
public final class f extends sg.bigo.ads.common.g.b.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f71344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f71345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f71346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f71347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f71348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f71349n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f71350o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f71351p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final q f71352q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f71353r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f71354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f71355t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f71356u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f71357v;

    public f(@NonNull q qVar, Cursor cursor) {
        super(cursor);
        this.f71344i = 0;
        this.f71345j = 0L;
        this.f71346k = 0;
        this.f71347l = 0L;
        this.f71348m = 0;
        this.f71349n = 0L;
        this.f71350o = 0;
        this.f71351p = 0L;
        this.f71352q = qVar;
        this.f69653c = 1;
    }

    public f(@NonNull q qVar, @NonNull Map<String, String> map) {
        super(map);
        this.f71344i = 0;
        this.f71345j = 0L;
        this.f71346k = 0;
        this.f71347l = 0L;
        this.f71348m = 0;
        this.f71349n = 0L;
        this.f71350o = 0;
        this.f71351p = 0L;
        this.f71352q = qVar;
        this.f69653c = 1;
    }

    private void a(Context context, final String str, final e eVar) {
        String str2 = eVar.f71332b;
        if (eVar.b()) {
            if ("impl_track".equals(str)) {
                this.f71354s.remove(eVar);
                return;
            }
            if ("click_track".equals(str)) {
                this.f71355t.remove(eVar);
                return;
            } else if ("nurl_track".equals(str)) {
                this.f71356u.remove(eVar);
                return;
            } else {
                if ("lurl_track".equals(str)) {
                    this.f71357v.remove(eVar);
                    return;
                }
                return;
            }
        }
        int i10 = this.f71344i;
        if ("click_track".equals(str)) {
            i10 = this.f71346k;
        } else if ("nurl_track".equals(str)) {
            i10 = this.f71348m;
        } else if ("lurl_track".equals(str)) {
            i10 = this.f71350o;
        }
        int i11 = i10;
        sg.bigo.ads.common.u.a aVarD = eVar.d();
        int i12 = eVar.f71333c;
        eVar.a();
        sg.bigo.ads.core.e.b.a(context, i12, str, aVarD, str2, this.f71353r, this.f69652b, i11, this.f69658h, new sg.bigo.ads.core.e.b.a() { // from class: sg.bigo.ads.core.e.a.f.1
            @Override // sg.bigo.ads.core.e.b.a
            public final void a() {
                d.a().b(f.this);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final boolean a(int i13) {
                return f.this.f71352q.a(i13);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final void b() {
                CopyOnWriteArrayList<e> copyOnWriteArrayList;
                if ("impl_track".equals(str)) {
                    copyOnWriteArrayList = f.this.f71354s;
                } else if ("click_track".equals(str)) {
                    copyOnWriteArrayList = f.this.f71355t;
                } else {
                    if (!"nurl_track".equals(str)) {
                        if ("lurl_track".equals(str)) {
                            copyOnWriteArrayList = f.this.f71357v;
                        }
                        d.a().b(f.this);
                    }
                    copyOnWriteArrayList = f.this.f71356u;
                }
                copyOnWriteArrayList.remove(eVar);
                d.a().b(f.this);
            }
        });
    }

    private static boolean a(List<e> list) {
        return list != null && list.size() == 0;
    }

    @SuppressLint({"ConcurrentModification"})
    public final void a(Context context) {
        Iterator<e> it = this.f71354s.iterator();
        while (it.hasNext()) {
            a(context, "impl_track", it.next());
        }
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void a(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f71354s = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f71354s.add(new e(jSONArray.getJSONObject(i10)));
            }
        } catch (JSONException unused) {
        }
    }

    public final boolean a(int i10) {
        return this.f71352q.b(i10);
    }

    public final boolean a(List<e> list, int i10) {
        return list == null || list.size() == 0 || !a(i10);
    }

    @SuppressLint({"ConcurrentModification"})
    public final int b(Context context) {
        Iterator<e> it = this.f71355t.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            a(context, "click_track", it.next());
        }
        return i10;
    }

    @Override // sg.bigo.ads.common.g.b.c
    @NonNull
    public final String b() {
        if (this.f71354s == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.f71354s.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f71335e);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void b(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f71355t = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f71355t.add(new e(jSONArray.getJSONObject(i10)));
            }
        } catch (JSONException unused) {
        }
    }

    @SuppressLint({"ConcurrentModification"})
    public final int c(Context context) {
        Iterator<e> it = this.f71356u.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            a(context, "nurl_track", it.next());
        }
        return i10;
    }

    @Override // sg.bigo.ads.common.g.b.c
    @NonNull
    public final String c() {
        if (this.f71355t == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.f71355t.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f71335e);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void c(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f71356u = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f71356u.add(new e(jSONArray.getJSONObject(i10)));
            }
        } catch (JSONException unused) {
        }
    }

    @SuppressLint({"ConcurrentModification"})
    public final int d(Context context) {
        Iterator<e> it = this.f71357v.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            a(context, "lurl_track", it.next());
        }
        return i10;
    }

    @Override // sg.bigo.ads.common.g.b.c
    @NonNull
    public final String d() {
        if (this.f71356u == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.f71356u.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f71335e);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void d(String str) {
        if (sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f71357v = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f71357v.add(new e(jSONArray.getJSONObject(i10)));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.common.g.b.c
    @NonNull
    public final String e() {
        if (this.f71357v == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.f71357v.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f71335e);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final long f() {
        return Math.max(Math.max(this.f71345j, this.f71347l), this.f69654d);
    }

    public final boolean g() {
        return a(this.f71354s) && a(this.f71355t) && a(this.f71356u) && a(this.f71357v);
    }
}
