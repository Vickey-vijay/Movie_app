package com.applovin.impl.sdk;

import com.applovin.impl.y2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f9532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9533b = new HashMap(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9534c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f9535d = Collections.synchronizedMap(new HashMap(5));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f9536e = Collections.synchronizedMap(new HashMap(5));

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f9539c;

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String strB = b();
            String strB2 = aVar.b();
            if (strB != null ? !strB.equals(strB2) : strB2 != null) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            String strC = c();
            String strC2 = aVar.c();
            return strC != null ? strC.equals(strC2) : strC2 == null;
        }

        public String a() {
            return this.f9538b;
        }

        public String b() {
            return this.f9537a;
        }

        public String c() {
            return this.f9539c;
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ")";
        }

        public a(String str, String str2, String str3) {
            this.f9537a = str;
            this.f9538b = str2;
            this.f9539c = str3;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            String strB = b();
            int iHashCode3 = 43;
            if (strB == null) {
                iHashCode = 43;
            } else {
                iHashCode = strB.hashCode();
            }
            String strA = a();
            int i10 = (iHashCode + 59) * 59;
            if (strA == null) {
                iHashCode2 = 43;
            } else {
                iHashCode2 = strA.hashCode();
            }
            int i11 = i10 + iHashCode2;
            String strC = c();
            int i12 = i11 * 59;
            if (strC != null) {
                iHashCode3 = strC.hashCode();
            }
            return i12 + iHashCode3;
        }
    }

    public String a(String str) {
        return (String) this.f9536e.get(str);
    }

    public void b(y2 y2Var) {
        this.f9535d.put(y2Var.getAdUnitId(), y2Var.Q());
    }

    public void c(y2 y2Var) {
        synchronized (this.f9534c) {
            if (o.a()) {
                this.f9532a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + y2Var);
            }
            this.f9533b.put(y2Var.getAdUnitId(), new a(y2Var.B(), y2Var.c(), y2Var.getNetworkName()));
        }
        this.f9536e.put(y2Var.getAdUnitId(), y2Var.Q());
    }

    public void a(y2 y2Var) {
        synchronized (this.f9534c) {
            String adUnitId = y2Var.getAdUnitId();
            a aVar = (a) this.f9533b.get(adUnitId);
            if (aVar == null) {
                if (o.a()) {
                    this.f9532a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                }
                return;
            }
            if (y2Var.B().equals(aVar.b())) {
                if (o.a()) {
                    this.f9532a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                }
                this.f9533b.remove(adUnitId);
            } else if (o.a()) {
                this.f9532a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + y2Var + " , since it could have already been updated with a new ad: " + aVar);
            }
        }
    }

    public String b(String str) {
        return (String) this.f9535d.get(str);
    }

    public p(k kVar) {
        this.f9532a = kVar.O();
    }

    public a c(String str) {
        a aVar;
        synchronized (this.f9534c) {
            aVar = (a) this.f9533b.get(str);
        }
        return aVar;
    }
}
