package com.mbridge.msdk.foundation.same.directory;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: MBridgeDirManager.java */
/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f34956c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f34957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<a> f34958b = new ArrayList<>();

    public static File a(c cVar) {
        try {
            if (b() == null || b().f34958b == null || b().f34958b.isEmpty()) {
                return null;
            }
            for (a aVar : b().f34958b) {
                if (aVar.f34960b.equals(cVar)) {
                    return aVar.f34959a;
                }
            }
            return null;
        } catch (Throwable th2) {
            q0.b("MBridgeDirManager", th2.getMessage(), th2);
            return null;
        }
    }

    public static String b(c cVar) {
        File fileA = a(cVar);
        if (fileA != null) {
            return fileA.getAbsolutePath();
        }
        return null;
    }

    /* JADX INFO: compiled from: MBridgeDirManager.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public File f34959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f34960b;

        public a(c cVar, File file) {
            this.f34960b = cVar;
            this.f34959a = file;
        }
    }

    private e(b bVar) {
        this.f34957a = bVar;
    }

    public static synchronized e b() {
        if (f34956c == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
            t0.a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        return f34956c;
    }

    public static synchronized void a(b bVar) {
        if (f34956c == null) {
            f34956c = new e(bVar);
        }
    }

    public boolean a() {
        return a(this.f34957a.a());
    }

    private boolean a(com.mbridge.msdk.foundation.same.directory.a aVar) {
        String strB;
        com.mbridge.msdk.foundation.same.directory.a aVarC = aVar.c();
        if (aVarC == null) {
            strB = aVar.b();
        } else {
            File fileA = a(aVarC.d());
            if (fileA == null) {
                return false;
            }
            strB = fileA.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(strB);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f34958b.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.directory.a> listA = aVar.a();
        if (listA != null) {
            Iterator<com.mbridge.msdk.foundation.same.directory.a> it = listA.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
