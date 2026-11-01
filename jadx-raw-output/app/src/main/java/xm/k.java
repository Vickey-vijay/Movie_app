package xm;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

/* JADX INFO: compiled from: Loader.java */
/* JADX INFO: loaded from: classes10.dex */
public class k {
    public static Class c(Class cls, String str) throws ClassNotFoundException {
        return d(cls, str, false);
    }

    public static String a(ClassLoader classLoader) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        while (classLoader != null && (classLoader instanceof URLClassLoader)) {
            URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
            if (uRLs != null) {
                for (URL url : uRLs) {
                    File fileB = an.e.g(url).b();
                    if (fileB != null && fileB.exists()) {
                        if (sb2.length() > 0) {
                            sb2.append(File.pathSeparatorChar);
                        }
                        sb2.append(fileB.getAbsolutePath());
                    }
                }
            }
            classLoader = classLoader.getParent();
        }
        return sb2.toString();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002d -> B:11:0x001f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x002f -> B:11:0x001f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:13:0x0025
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static java.net.URL b(java.lang.Class<?> r3, java.lang.String r4, boolean r5) {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r1 = 0
            r2 = r1
        La:
            if (r2 != 0) goto L1d
            if (r0 == 0) goto L1d
            java.net.URL r2 = r0.getResource(r4)
            if (r2 != 0) goto L1b
            if (r5 == 0) goto L1b
            java.lang.ClassLoader r0 = r0.getParent()
            goto La
        L1b:
            r0 = r1
            goto La
        L1d:
            if (r3 != 0) goto L21
        L1f:
            r3 = r1
            goto L25
        L21:
            java.lang.ClassLoader r3 = r3.getClassLoader()
        L25:
            if (r2 != 0) goto L36
            if (r3 == 0) goto L36
            java.net.URL r2 = r3.getResource(r4)
            if (r2 != 0) goto L1f
            if (r5 == 0) goto L1f
            java.lang.ClassLoader r3 = r3.getParent()
            goto L25
        L36:
            if (r2 != 0) goto L3c
            java.net.URL r2 = java.lang.ClassLoader.getSystemResource(r4)
        L3c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.k.b(java.lang.Class, java.lang.String, boolean):java.net.URL");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x004a -> B:17:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x004c -> B:17:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:19:0x0036
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static java.lang.Class d(java.lang.Class r6, java.lang.String r7, boolean r8) throws java.lang.ClassNotFoundException {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2 = 0
            r3 = r2
            r4 = r3
        L10:
            if (r3 != 0) goto L2e
            if (r0 == 0) goto L2e
            boolean r5 = r1.add(r0)
            if (r5 == 0) goto L2e
            java.lang.Class r3 = r0.loadClass(r7)     // Catch: java.lang.ClassNotFoundException -> L1f
            goto L23
        L1f:
            r5 = move-exception
            if (r4 != 0) goto L23
            r4 = r5
        L23:
            if (r3 != 0) goto L2c
            if (r8 == 0) goto L2c
            java.lang.ClassLoader r0 = r0.getParent()
            goto L10
        L2c:
            r0 = r2
            goto L10
        L2e:
            if (r6 != 0) goto L32
        L30:
            r6 = r2
            goto L36
        L32:
            java.lang.ClassLoader r6 = r6.getClassLoader()
        L36:
            if (r3 != 0) goto L53
            if (r6 == 0) goto L53
            boolean r0 = r1.add(r6)
            if (r0 == 0) goto L53
            java.lang.Class r0 = r6.loadClass(r7)     // Catch: java.lang.ClassNotFoundException -> L46
            r3 = r0
            goto L4a
        L46:
            r0 = move-exception
            if (r4 != 0) goto L4a
            r4 = r0
        L4a:
            if (r3 != 0) goto L30
            if (r8 == 0) goto L30
            java.lang.ClassLoader r6 = r6.getParent()
            goto L36
        L53:
            java.lang.Class<xm.k> r6 = xm.k.class
            java.lang.ClassLoader r6 = r6.getClassLoader()
            if (r3 != 0) goto L6c
            if (r6 == 0) goto L6c
            boolean r6 = r1.add(r6)
            if (r6 == 0) goto L6c
            java.lang.Class r3 = java.lang.Class.forName(r7)     // Catch: java.lang.ClassNotFoundException -> L68
            goto L6c
        L68:
            r6 = move-exception
            if (r4 != 0) goto L6c
            r4 = r6
        L6c:
            if (r3 == 0) goto L6f
            return r3
        L6f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xm.k.d(java.lang.Class, java.lang.String, boolean):java.lang.Class");
    }
}
