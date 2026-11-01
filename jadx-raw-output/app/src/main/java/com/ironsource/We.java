package com.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public enum We {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27840b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27845a;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        public final We a(int i10) {
            for (We we2 : We.values()) {
                if (we2.f27845a == i10) {
                    if (we2 == null) {
                        return We.CurrentlyLoadedAds;
                    }
                    return we2;
                }
            }
            we2 = null;
            if (we2 == null) {
                return We.CurrentlyLoadedAds;
            }
            return we2;
        }
    }

    public final int b() {
        return this.f27845a;
    }

    We(int i10) {
        this.f27845a = i10;
    }
}
