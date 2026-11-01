package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.l.n;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3426d4;
import com.ironsource.C3784xa;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: CrashFileCollector.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f6489b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6490a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0027b f6494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, C0027b> f6495g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<File> f6491c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<File> f6492d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6493e = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f6496h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f6497i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.f();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f6498j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.d();
        }
    };

    private void e() {
        this.f6496h = true;
        this.f6495g = null;
        NativeImpl.j();
    }

    /* JADX INFO: renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CrashFileCollector.java */
    public static class C0027b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f6513a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f6516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a f6517e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<a> f6514b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<a> f6515c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f6518f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f6519g = 0;

        public C0027b(String str) {
            this.f6513a = str;
        }
    }

    public static b a() {
        if (f6489b == null) {
            synchronized (b.class) {
                if (f6489b == null) {
                    f6489b = new b(com.apm.insight.e.g());
                }
            }
        }
        return f6489b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() throws Throwable {
        if (this.f6496h || this.f6495g == null) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f6490a)) {
            e();
        }
        if (this.f6493e == -1) {
            if (com.apm.insight.runtime.a.a() && com.apm.insight.runtime.a.f()) {
                this.f6493e = 1;
            } else {
                this.f6493e = 0;
            }
        }
        boolean z10 = this.f6493e == 1;
        com.apm.insight.runtime.f fVar = new com.apm.insight.runtime.f(this.f6490a);
        Iterator<C0027b> it = this.f6495g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), z10, fVar);
        }
        Iterator<C0027b> it2 = this.f6495g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), z10, fVar);
        }
        Iterator<C0027b> it3 = this.f6495g.values().iterator();
        while (it3.hasNext()) {
            com.apm.insight.l.f.a(com.apm.insight.l.j.a(this.f6490a, it3.next().f6513a));
        }
        fVar.a();
        com.apm.insight.runtime.b.a();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() throws Throwable {
        if (this.f6496h) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f6490a) || (System.currentTimeMillis() - com.apm.insight.e.j() <= 5000 && com.apm.insight.e.i().isApmExists() && !Npth.hasCrash())) {
            m.a().a(this.f6497i, 5000L);
        } else {
            d();
        }
    }

    private void g() {
        File[] fileArrListFiles = com.apm.insight.l.j.i(this.f6490a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a();
                file.getAbsolutePath();
            } else {
                try {
                    com.apm.insight.f.b bVarC = com.apm.insight.l.f.c(file.getAbsolutePath());
                    if (bVarC != null) {
                        if (bVarC.b() != null) {
                            bVarC.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), bVarC.e(), bVarC.d(), bVarC.f(), bVarC.g())) {
                            com.apm.insight.l.f.a(file);
                            String strC = bVarC.c();
                            if (!TextUtils.isEmpty(strC)) {
                                com.apm.insight.l.f.a(new File(strC));
                            }
                        }
                    } else {
                        com.apm.insight.l.f.a(file);
                    }
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                }
            }
        }
    }

    public final void b() {
        try {
            if (!this.f6496h && com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                m.a().a(this.f6498j);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean c() {
        return this.f6496h;
    }

    private b(Context context) {
        this.f6490a = context;
    }

    private void b(HashMap<String, C0027b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.d(this.f6490a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0027b c0027b = map.get(name);
                    if (c0027b == null) {
                        c0027b = new C0027b(name);
                        map.put(name, c0027b);
                    }
                    c0027b.f6515c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    /* JADX INFO: compiled from: CrashFileCollector.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public File f6508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f6509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f6510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public CrashType f6511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f6512e;

        public a(File file, @Nullable CrashType crashType) {
            this.f6509b = -1L;
            this.f6510c = -1L;
            this.f6508a = file;
            this.f6511d = crashType;
            this.f6512e = file.getName();
        }

        public a(File file, long j10, @Nullable CrashType crashType) {
            this.f6510c = -1L;
            this.f6508a = file;
            this.f6509b = j10;
            this.f6511d = crashType;
            this.f6512e = file.getName();
        }
    }

    public final void a(boolean z10) throws Throwable {
        if (!Npth.isStopUpload() && z10) {
            if (this.f6494f == null) {
                this.f6494f = new C0027b("old_uuid");
                HashMap<String, C0027b> map = new HashMap<>();
                this.f6495g = map;
                a(map);
                a(this.f6495g, this.f6494f);
                com.apm.insight.l.f.a(com.apm.insight.l.j.b(this.f6490a));
                b(this.f6495g);
                b(this.f6494f, true, null);
                a(this.f6494f, true, null);
                this.f6494f = null;
                if (this.f6495g.isEmpty()) {
                    e();
                } else {
                    f();
                }
            }
            g();
            com.apm.insight.a.c();
        }
    }

    private void b(final C0027b c0027b, boolean z10, @Nullable com.apm.insight.runtime.f fVar) {
        boolean z11;
        if (c0027b.f6515c.size() <= 1 && c0027b.f6515c.isEmpty()) {
            c0027b.f6517e = c0027b.f6516d;
            return;
        }
        boolean zB = com.apm.insight.l.k.b(this.f6490a);
        c0027b.f6517e = c0027b.f6516d;
        com.apm.insight.nativecrash.a aVar = new com.apm.insight.nativecrash.a(this.f6490a);
        Iterator<a> it = c0027b.f6515c.iterator();
        while (it.hasNext()) {
            a next = it.next();
            final File file = next.f6508a;
            try {
                aVar.a(file);
                JSONObject jSONObjectA = a(aVar);
                if (jSONObjectA != null && jSONObjectA.length() != 0) {
                    if (jSONObjectA.length() != 0) {
                        try {
                            if (!z10) {
                                long jOptLong = jSONObjectA.optLong("crash_time");
                                try {
                                    a aVar2 = c0027b.f6517e;
                                    if (aVar2 == null) {
                                        c0027b.f6517e = next;
                                        c0027b.f6518f = true;
                                        if (fVar == null || fVar.a("default")) {
                                            it = it;
                                            z11 = zB;
                                        } else {
                                            aVar.i();
                                        }
                                        com.apm.insight.c.a();
                                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                        com.apm.insight.l.f.a(file);
                                    } else {
                                        it = it;
                                        try {
                                            if (c0027b.f6518f) {
                                                z11 = zB;
                                            } else {
                                                z11 = zB;
                                                try {
                                                    if (jOptLong < aVar2.f6509b) {
                                                        c0027b.f6517e = next;
                                                        if (fVar != null && !fVar.a("default")) {
                                                            aVar.i();
                                                            zB = z11;
                                                            it = it;
                                                        } else {
                                                            a(file);
                                                            c0027b.f6518f = true;
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            }
                                            com.apm.insight.entity.a.a(jSONObjectA, "filters", C3784xa.f31580b, String.valueOf(jSONObjectA.optJSONObject("header").opt(C3784xa.f31580b)));
                                            jSONObjectA.optJSONObject("header").put(C3784xa.f31580b, 2010);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            z11 = zB;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    z11 = zB;
                                }
                            } else {
                                it = it;
                                z11 = zB;
                                if (fVar != null && !fVar.a("default")) {
                                    aVar.i();
                                }
                            }
                            com.apm.insight.entity.a.a(jSONObjectA, "filters", "start_uuid", c0027b.f6513a);
                            com.apm.insight.entity.a.a(jSONObjectA, "filters", "crash_thread_name", jSONObjectA.optString("crash_thread_name", "unknown"));
                            if (z11) {
                                c.a aVar3 = new c.a(jSONObjectA, CrashType.NATIVE);
                                com.apm.insight.entity.b.a(jSONObjectA, com.apm.insight.entity.b.a(aVar3.c(), aVar3.a(), o.a().b(aVar3.b() == -1 ? System.currentTimeMillis() : aVar3.b())), new com.apm.insight.entity.b.a() { // from class: com.apm.insight.k.b.4
                                    @Override // com.apm.insight.entity.b.a
                                    public final void a(JSONObject jSONObject) {
                                        d.a();
                                        d.a(jSONObject, file, com.apm.insight.l.j.a(b.this.f6490a, c0027b.f6513a));
                                    }
                                });
                                if (!aVar.i()) {
                                    aVar.f();
                                }
                            }
                            c.a(CrashType.NATIVE, jSONObjectA);
                        } catch (Throwable th5) {
                            th = th5;
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                            com.apm.insight.l.f.a(file);
                        }
                    } else {
                        it = it;
                        z11 = zB;
                    }
                } else {
                    it = it;
                    z11 = zB;
                    aVar.i();
                }
            } catch (Throwable th6) {
                th = th6;
            }
            zB = z11;
            it = it;
        }
    }

    private void a(HashMap<String, C0027b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.f(this.f6490a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0027b c0027b = map.get(name);
                    if (c0027b == null) {
                        c0027b = new C0027b(name);
                        map.put(name, c0027b);
                    }
                    JSONArray jSONArrayA = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(file), com.apm.insight.l.j.m(file));
                    int length = jSONArrayA.length();
                    c0027b.f6519g = length;
                    if (length > 0) {
                        try {
                            com.apm.insight.l.f.a(com.apm.insight.l.j.n(file), jSONArrayA);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    private void a(HashMap<String, C0027b> map, C0027b c0027b) {
        byte b10;
        CrashType crashType;
        File[] fileArrListFiles = com.apm.insight.l.j.a(this.f6490a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        Arrays.sort(fileArrListFiles, Collections.reverseOrder());
        char c10 = 0;
        int i10 = 0;
        while (i10 < fileArrListFiles.length) {
            File file = fileArrListFiles[i10];
            try {
                if (com.apm.insight.e.a.a().a(file.getAbsolutePath())) {
                    com.apm.insight.l.f.a(file);
                } else if (!com.apm.insight.l.f.e(file) && !com.apm.insight.g.a.a().b(file.getName())) {
                    if (file.isFile()) {
                        com.apm.insight.l.f.a(file);
                    } else {
                        String name = file.getName();
                        if (name.endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                            String[] strArrSplit = name.split("_");
                            if (strArrSplit.length < 5) {
                                c0027b.f6514b.add(new a(file, null));
                            } else {
                                try {
                                    long j10 = Long.parseLong(strArrSplit[c10]);
                                    long j11 = Long.parseLong(strArrSplit[4]);
                                    String str = strArrSplit[2];
                                    String str2 = strArrSplit[1];
                                    int iHashCode = str2.hashCode();
                                    if (iHashCode != -1109843021) {
                                        if (iHashCode != 96741) {
                                            if (iHashCode == 3254818 && str2.equals("java")) {
                                                b10 = 1;
                                            } else {
                                                b10 = -1;
                                            }
                                        } else if (str2.equals("anr")) {
                                            b10 = 2;
                                        } else {
                                            b10 = -1;
                                        }
                                    } else if (str2.equals("launch")) {
                                        b10 = 0;
                                    } else {
                                        b10 = -1;
                                    }
                                    if (b10 == 0) {
                                        crashType = CrashType.LAUNCH;
                                    } else if (b10 != 1) {
                                        crashType = b10 != 2 ? null : CrashType.ANR;
                                    } else {
                                        crashType = CrashType.JAVA;
                                    }
                                    C0027b c0027b2 = map.get(str);
                                    if (c0027b2 == null) {
                                        c0027b2 = new C0027b(str);
                                        map.put(str, c0027b2);
                                    }
                                    a aVar = new a(file, j10, crashType);
                                    aVar.f6510c = j11;
                                    a aVar2 = c0027b2.f6516d;
                                    if ((aVar2 == null || aVar2.f6509b > aVar.f6509b) && crashType != null && crashType != CrashType.ANR && !name.contains("ignore")) {
                                        c0027b2.f6516d = aVar;
                                    }
                                    c0027b2.f6514b.add(aVar);
                                } catch (Throwable unused) {
                                    c0027b.f6514b.add(new a(file, null));
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(new RuntimeException("err format crashTime:".concat(name)), "NPTH_CATCH");
                                }
                            }
                        } else {
                            com.apm.insight.l.f.a(file);
                        }
                    }
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
            i10++;
            c10 = 0;
        }
    }

    private static JSONObject a(com.apm.insight.nativecrash.a aVar) {
        JSONObject jSONObjectB = aVar.b();
        if (jSONObjectB != null && jSONObjectB.length() != 0) {
            return jSONObjectB;
        }
        if (com.apm.insight.e.d()) {
            aVar.j();
        }
        if (!aVar.a()) {
            aVar.i();
            return null;
        }
        if (!aVar.d()) {
            aVar.i();
            return null;
        }
        if (aVar.e()) {
            aVar.i();
            return null;
        }
        aVar.c();
        return aVar.h();
    }

    private void a(final C0027b c0027b, boolean z10, @Nullable com.apm.insight.runtime.f fVar) {
        Iterator<a> it;
        final File file;
        CrashType crashType;
        if (c0027b.f6514b.isEmpty()) {
            return;
        }
        if (c0027b.f6517e == null) {
            c0027b.f6517e = c0027b.f6516d;
        }
        for (Iterator<a> it2 = c0027b.f6514b.iterator(); it2.hasNext(); it2 = it) {
            a next = it2.next();
            try {
                File file2 = next.f6508a;
                CrashType crashType2 = next.f6511d;
                it = it2;
                try {
                    final com.apm.insight.f.b bVarA = a(file2, crashType2, c0027b.f6513a, next.f6509b, next.f6510c);
                    if (bVarA == null) {
                        com.apm.insight.l.f.a(file2);
                    } else {
                        JSONObject jSONObjectB = bVarA.b();
                        if (jSONObjectB == null) {
                            com.apm.insight.l.f.a(file2);
                        } else {
                            JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject("header");
                            if (jSONObjectOptJSONObject == null) {
                                com.apm.insight.l.f.a(file2);
                            } else {
                                if (crashType2 == null) {
                                    file = file2;
                                    if (new File(file, file2.getName()).exists() || file.getName().split("_").length < 5) {
                                        if (e.b(bVarA.a(), jSONObjectB.toString()).a()) {
                                            com.apm.insight.l.f.a(file);
                                        }
                                    }
                                } else {
                                    file = file2;
                                }
                                File fileA = com.apm.insight.entity.b.a(file);
                                if (!fileA.exists()) {
                                    com.apm.insight.l.f.a(file);
                                } else {
                                    try {
                                        JSONArray jSONArray = new JSONArray(com.apm.insight.l.f.a(fileA, "\n"));
                                        JSONObject jSONObjectOptJSONObject2 = crashType2 == CrashType.LAUNCH ? ((JSONArray) jSONObjectB.opt("data")).optJSONObject(0) : jSONObjectB;
                                        if ((!z10 && c0027b.f6517e != next) || next.f6512e.contains("ignore")) {
                                            try {
                                                com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", C3784xa.f31580b, String.valueOf(jSONObjectOptJSONObject.opt(C3784xa.f31580b)));
                                                crashType = crashType2;
                                                try {
                                                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "has_ignore", String.valueOf(next.f6512e.contains("ignore")));
                                                    jSONObjectOptJSONObject.put(C3784xa.f31580b, 2010);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    com.apm.insight.c.a();
                                                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                crashType = crashType2;
                                            }
                                        } else {
                                            crashType = crashType2;
                                            if (fVar != null && !fVar.a(jSONObjectOptJSONObject2.optString("crash_md5", "default"))) {
                                                com.apm.insight.l.f.a(next.f6508a);
                                            }
                                        }
                                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "start_uuid", c0027b.f6513a);
                                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "leak_threads_count", String.valueOf(c0027b.f6519g));
                                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "crash_thread_name", jSONObjectOptJSONObject2.optString("crash_thread_name", "unknown"));
                                        try {
                                            com.apm.insight.entity.b.a(jSONObjectB, jSONArray, new com.apm.insight.entity.b.a() { // from class: com.apm.insight.k.b.3
                                                @Override // com.apm.insight.entity.b.a
                                                public final void a(JSONObject jSONObject) {
                                                    e.a(bVarA.a(), jSONObject.toString(), new File(file, "logZip"), com.apm.insight.l.j.a(b.this.f6490a, c0027b.f6513a));
                                                }
                                            });
                                            if (!com.apm.insight.l.f.a(file)) {
                                                com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(file.getAbsolutePath()));
                                            }
                                            c.a(crashType, jSONObjectB);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            com.apm.insight.c.a();
                                            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                            com.apm.insight.l.f.a(next.f6508a);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                    com.apm.insight.l.f.a(next.f6508a);
                }
            } catch (Throwable th6) {
                th = th6;
                it = it2;
            }
        }
    }

    private static boolean a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    private com.apm.insight.f.b a(File file, CrashType crashType, String str, long j10, long j11) {
        com.apm.insight.f.b bVar;
        try {
            try {
                if (file.isFile()) {
                    com.apm.insight.l.f.a(file);
                    return null;
                }
                boolean z10 = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return com.apm.insight.l.f.b(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = null;
                        com.apm.insight.l.f.a(file);
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        return bVar;
                    }
                }
                com.apm.insight.f.b bVarA = com.apm.insight.l.f.a(file, crashType);
                try {
                    JSONObject jSONObjectB = bVarA.b();
                    try {
                        if (bVarA.b() != null) {
                            if (crashType == CrashType.ANR) {
                                return bVarA;
                            }
                            jSONObjectB.put("crash_time", j10);
                            jSONObjectB.put("app_start_time", j11);
                            JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject("header");
                            if (jSONObjectOptJSONObject == null) {
                                jSONObjectOptJSONObject = Header.a(j10).f();
                            } else if (z10) {
                                jSONObjectB.remove("header");
                            }
                            String strOptString = jSONObjectOptJSONObject.optString("sdk_version_name", null);
                            if (strOptString == null) {
                                strOptString = "2008-20250701130429";
                            }
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "sdk_version", strOptString);
                            JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray("logcat");
                            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                                jSONObjectB.put("logcat", com.apm.insight.runtime.h.a(str));
                            }
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_dump", "true");
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_logcat", String.valueOf(!com.apm.insight.a.a(jSONObjectB, "logcat")));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.a(str)));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.b(str)));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.c(str)));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_devices", String.valueOf(Header.a()));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_runtime", String.valueOf(NativeImpl.f()));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_x86_devices", String.valueOf(Header.b()));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(str).exists()));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_root", String.valueOf(com.apm.insight.nativecrash.a.k()));
                            jSONObjectB.put("launch_did", com.apm.insight.i.a.a(this.f6490a));
                            jSONObjectB.put("crash_uuid", file.getName());
                            try {
                                long j12 = Long.parseLong(com.apm.insight.runtime.b.a(j10, str));
                                com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", Math.abs(j12 - j10) < 60000 ? "< 60s" : "> 60s");
                                jSONObjectB.put("lastAliveTime", String.valueOf(j12));
                            } catch (Throwable unused) {
                                jSONObjectB.put("lastAliveTime", "unknown");
                                com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", "unknown");
                            }
                            jSONObjectB.put("has_dump", "true");
                            if (jSONObjectB.opt(C3426d4.a.f28418k) == null) {
                                com.apm.insight.e.g();
                                com.apm.insight.entity.a.a(jSONObjectB, n.a());
                            }
                            if (Header.b(jSONObjectOptJSONObject)) {
                                com.apm.insight.entity.a.a(jSONObjectB, "filters", "unauthentic_version", "unauthentic_version");
                            }
                            com.apm.insight.entity.d.b(jSONObjectB);
                            bVarA.b().put("upload_scene", "launch_scan");
                            if (z10) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObjectB.put(StatsEvent.f44666z, "start_crash");
                                jSONObjectB.put("stack", jSONObjectB.remove("data"));
                                jSONObject.put("data", new JSONArray().put(jSONObjectB));
                                jSONObject.put("header", jSONObjectOptJSONObject);
                                bVarA.a(jSONObject);
                            } else {
                                jSONObjectB.put("isJava", 1);
                            }
                        } else {
                            com.apm.insight.l.f.a(file);
                        }
                        return bVarA;
                    } catch (Throwable th3) {
                        th = th3;
                        bVar = bVarA;
                        com.apm.insight.l.f.a(file);
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        return bVar;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            bVar = null;
        }
        com.apm.insight.l.f.a(file);
        com.apm.insight.c.a();
        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
        return bVar;
    }
}
