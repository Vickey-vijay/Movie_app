package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public interface q {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29768a;

        public a(String str) {
            ck.p.j(str, "adFormat");
            this.f29768a = str;
        }

        public final IronSourceError a(h hVar) {
            ck.p.j(hVar, "loadParams");
            h.b bVar = (h.b) hVar;
            if (bVar.f() == null) {
                return new IronSourceError(1060, this.f29768a + " was initialized and loaded without Activity");
            }
            if (bVar.g() == null) {
                return new IronSourceError(510, "Missing banner layout");
            }
            if (bVar.g().isDestroyed()) {
                return new IronSourceError(510, "Banner layout is destroyed");
            }
            ISBannerSize size = bVar.g().getSize();
            if (size == null) {
                return new IronSourceError(510, "Missing banner size");
            }
            if ("CUSTOM" == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                return new IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
            }
            if (bVar.e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strB = bVar.b();
            if ((strB == null || strB.length() == 0) && hVar.c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29769a;

        public b(String str) {
            ck.p.j(str, "adFormat");
            this.f29769a = str;
        }

        public final IronSourceError a(h.d dVar) {
            ck.p.j(dVar, "loadParams");
            if (dVar.d() == null) {
                return new IronSourceError(1060, this.f29769a + " was initialized and loaded without Activity");
            }
            if (dVar.e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strB = dVar.b();
            if ((strB == null || strB.length() == 0) && dVar.c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    IronSourceError a();
}
