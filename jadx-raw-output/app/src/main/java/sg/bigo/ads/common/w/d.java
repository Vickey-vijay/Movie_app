package sg.bigo.ads.common.w;

/* JADX INFO: loaded from: classes5.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f70316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f70317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f70318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f70319d = {0.24f, 0.52f, 0.24f};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f70320e = true;

    static {
        d dVar = new d();
        f70316a = dVar;
        float[] fArr = dVar.f70318c;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
        float[] fArr2 = dVar.f70317b;
        fArr2[0] = 0.35f;
        fArr2[1] = 1.0f;
    }

    public d() {
        float[] fArr = new float[3];
        this.f70317b = fArr;
        float[] fArr2 = new float[3];
        this.f70318c = fArr2;
        a(fArr);
        a(fArr2);
    }

    private static void a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }
}
