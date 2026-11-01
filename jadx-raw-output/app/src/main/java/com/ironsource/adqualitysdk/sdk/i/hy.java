package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class hy {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private a f2421;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ia f2422;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private hm f2423;

    public static class a {

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private Object f2426;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Class f2433;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Class f2434;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private List<String> f2435;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private Class f2436;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private int f2437;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private int f2429 = -1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private int f2432 = -1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private int f2428 = -1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private int f2430 = -1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private int f2431 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private int f2425 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private int f2427 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private boolean f2424 = true;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f2437 != aVar.f2437 || this.f2429 != aVar.f2429 || this.f2432 != aVar.f2432 || this.f2428 != aVar.f2428 || this.f2430 != aVar.f2430 || this.f2431 != aVar.f2431 || this.f2425 != aVar.f2425 || this.f2427 != aVar.f2427 || this.f2424 != aVar.f2424) {
                    return false;
                }
                Class cls = this.f2434;
                if (cls == null ? aVar.f2434 != null : !cls.equals(aVar.f2434)) {
                    return false;
                }
                Class cls2 = this.f2436;
                if (cls2 == null ? aVar.f2436 != null : !cls2.equals(aVar.f2436)) {
                    return false;
                }
                Class cls3 = this.f2433;
                if (cls3 == null ? aVar.f2433 != null : !cls3.equals(aVar.f2433)) {
                    return false;
                }
                List<String> list = this.f2435;
                if (list == null ? aVar.f2435 != null : !list.equals(aVar.f2435)) {
                    return false;
                }
                Object obj2 = this.f2426;
                Object obj3 = aVar.f2426;
                if (obj2 != null) {
                    return obj2.equals(obj3);
                }
                if (obj3 == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Class cls = this.f2434;
            int iHashCode = (cls != null ? cls.hashCode() : 0) * 31;
            Class cls2 = this.f2436;
            int iHashCode2 = (iHashCode + (cls2 != null ? cls2.hashCode() : 0)) * 31;
            Class cls3 = this.f2433;
            int iHashCode3 = (iHashCode2 + (cls3 != null ? cls3.hashCode() : 0)) * 31;
            List<String> list = this.f2435;
            int iHashCode4 = (((((((((((((((((((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f2437) * 31) + this.f2429) * 31) + this.f2432) * 31) + this.f2428) * 31) + this.f2430) * 31) + this.f2431) * 31) + this.f2425) * 31) + this.f2427) * 31) + (this.f2424 ? 1 : 0)) * 31;
            Object obj = this.f2426;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private hy f2438 = new hy(0);

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public final c m2415(int i10) {
            this.f2438.f2421.f2427 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final c m2417(int i10) {
            this.f2438.f2421.f2428 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final c m2421(int i10) {
            this.f2438.f2421.f2430 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final c m2423(int i10) {
            this.f2438.f2421.f2429 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final c m2426(int i10) {
            this.f2438.f2421.f2425 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final c m2428(int i10) {
            this.f2438.f2421.f2432 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public final c m2414(int i10) {
            this.f2438.f2421.f2431 = i10;
            return this;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public final c m2416(boolean z10) {
            this.f2438.f2421.f2424 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final c m2418(Object obj) {
            this.f2438.f2421.f2426 = obj;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final c m2422(boolean z10) {
            this.f2438.f2421.f2427 = z10 ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final hy m2425(ia iaVar, List<String> list, int i10) {
            return m2420(iaVar, null, list, i10);
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final c m2427(boolean z10) {
            this.f2438.f2421.f2430 = z10 ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final c m2429(boolean z10) {
            this.f2438.f2421.f2425 = z10 ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final hy m2420(ia iaVar, hm hmVar, List<String> list, int i10) {
            this.f2438.f2422 = iaVar;
            this.f2438.f2423 = hmVar;
            this.f2438.f2421.f2435 = list;
            this.f2438.f2421.f2437 = i10;
            this.f2438.f2421.f2436 = iaVar.getClass();
            this.f2438.f2421.f2433 = hmVar != null ? hmVar.getClass() : null;
            return this.f2438;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final c m2424(boolean z10) {
            this.f2438.f2421.f2431 = z10 ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final c m2419(boolean z10) {
            this.f2438.f2421.f2432 = z10 ? -1 : Integer.MAX_VALUE;
            return this;
        }
    }

    public /* synthetic */ hy(byte b10) {
        this();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m2376(int i10, int i11) {
        return i10 >= i11;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ia m2379() {
        return this.f2422;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m2385() {
        return this.f2421.f2437;
    }

    private hy() {
        this.f2421 = new a();
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m2378(int i10) {
        return m2376(i10, this.f2421.f2431);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2380(int i10) {
        return m2376(i10, this.f2421.f2425);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int m2381(int i10) {
        if (m2376(i10, this.f2421.f2432)) {
            return this.f2421.f2428;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m2383() {
        return this.f2421.f2435;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m2387(int i10) {
        return m2376(i10, this.f2421.f2429);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final hm m2388() {
        return this.f2423;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m2384(int i10) {
        return m2376(i10, this.f2421.f2427);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final a m2386(Class cls) {
        this.f2421.f2434 = cls;
        return this.f2421;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m2389(int i10) {
        return m2376(i10, this.f2421.f2430);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m2382() {
        return this.f2421.f2424;
    }
}
