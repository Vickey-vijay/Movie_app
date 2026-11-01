package sk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f71953a = new i();

    public final <S> S a(String str, ClassLoader classLoader, Class<S> cls) throws ClassNotFoundException {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    public final List<r> c() {
        r rVar;
        if (!j.a()) {
            return b(r.class, r.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            r rVar2 = null;
            try {
                rVar = (r) r.class.cast(Class.forName("ok.a", true, r.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                rVar = null;
            }
            if (rVar == null) {
                return b(r.class, r.class.getClassLoader());
            }
            arrayList.add(rVar);
            try {
                rVar2 = (r) r.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, r.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (rVar2 == null) {
                return arrayList;
            }
            arrayList.add(rVar2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(r.class, r.class.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        ck.p.i(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nj.x.C(arrayList, f71953a.e((URL) it.next()));
        }
        Set setT0 = nj.b0.T0(arrayList);
        if (!(!setT0.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        ArrayList arrayList2 = new ArrayList(nj.t.v(setT0, 10));
        Iterator it2 = setT0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f71953a.a((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }

    public final List<String> f(BufferedReader bufferedReader) throws IOException {
        boolean z10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return nj.b0.O0(linkedHashSet);
            }
            String string = lk.a0.k1(lk.a0.e1(line, "#", null, 2, null)).toString();
            int i10 = 0;
            while (true) {
                if (i10 >= string.length()) {
                    z10 = true;
                    break;
                }
                char cCharAt = string.charAt(i10);
                if (!(cCharAt == '.' || Character.isJavaIdentifierPart(cCharAt))) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (!z10) {
                throw new IllegalArgumentException(("Illegal service provider class name: " + string).toString());
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }

    public final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            return nj.b0.O0(ServiceLoader.load(cls, classLoader));
        }
    }

    public final List<String> e(URL url) throws IOException {
        String string = url.toString();
        if (lk.x.R(string, "jar", false, 2, null)) {
            String strD1 = lk.a0.d1(lk.a0.W0(string, "jar:file:", null, 2, null), '!', null, 2, null);
            String strW0 = lk.a0.W0(string, "!/", null, 2, null);
            JarFile jarFile = new JarFile(strD1, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strW0)), "UTF-8"));
                try {
                    List<String> listF = f71953a.f(bufferedReader);
                    yj.b.a(bufferedReader, null);
                    jarFile.close();
                    return listF;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        yj.b.a(bufferedReader, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    try {
                        jarFile.close();
                        throw th5;
                    } catch (Throwable th6) {
                        mj.d.a(th4, th6);
                        throw th4;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(url.openStream()));
        try {
            List<String> listF2 = f71953a.f(bufferedReader2);
            yj.b.a(bufferedReader2, null);
            return listF2;
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                yj.b.a(bufferedReader2, th7);
                throw th8;
            }
        }
    }
}
