package sg.bigo.ads.api.c;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f69345h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f69346i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f69347j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f69348a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f69349b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f69350c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f69351d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f69352e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f69353f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f69354g = false;

    public static void a() {
        f69346i = 1;
    }

    public static void a(int i10) {
        f69345h = i10;
    }

    public static void a(boolean z10) {
        f69347j = z10;
    }

    public static int b() {
        return f69345h;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    public static b b(int i10) {
        b bVar = new b();
        if (f69347j) {
            bVar.f69354g = true;
            bVar.f69350c = true;
            bVar.f69349b = true;
            bVar.f69353f = 2000L;
        } else if (i10 == 2) {
            bVar.f69354g = true;
            bVar.f69350c = true;
            bVar.f69349b = true;
            bVar.f69353f = 2000L;
            bVar.f69348a = 4;
        } else {
            if (i10 == 3) {
                bVar.f69354g = true;
                bVar.f69350c = true;
            } else if (i10 != 4) {
                if (i10 == 12) {
                    bVar.f69354g = true;
                    bVar.f69350c = true;
                    bVar.f69349b = true;
                    bVar.f69353f = 2000L;
                } else if (i10 == 20) {
                    bVar.f69350c = true;
                }
                bVar.f69348a = 4;
            } else {
                bVar.f69354g = true;
                bVar.f69350c = true;
                bVar.f69349b = true;
            }
            bVar.f69353f = 2000L;
            bVar.f69348a = f69346i;
        }
        f69346i = 3;
        return bVar;
    }
}
