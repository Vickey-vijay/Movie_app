package zo;

/* JADX INFO: compiled from: VideoViewConfig.java */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f86522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f86525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f86526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f86527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ap.c f86528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f86529h;

    /* JADX INFO: compiled from: VideoViewConfig.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f86530a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f86532c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f86534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f86535f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ap.c f86536g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f86531b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f86533d = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f86537h = true;

        public e j() {
            return new e(this);
        }

        public b k(c cVar) {
            this.f86534e = cVar;
            return this;
        }

        public static /* synthetic */ d e(b bVar) {
            bVar.getClass();
            return null;
        }
    }

    public e(b bVar) {
        this.f86525d = bVar.f86530a;
        this.f86523b = bVar.f86532c;
        this.f86522a = bVar.f86531b;
        this.f86524c = bVar.f86533d;
        b.e(bVar);
        this.f86527f = bVar.f86535f;
        if (bVar.f86534e == null) {
            this.f86526e = zo.a.a();
        } else {
            this.f86526e = bVar.f86534e;
        }
        if (bVar.f86536g == null) {
            this.f86528g = ap.e.b();
        } else {
            this.f86528g = bVar.f86536g;
        }
        this.f86529h = bVar.f86537h;
    }

    public static b a() {
        return new b();
    }
}
