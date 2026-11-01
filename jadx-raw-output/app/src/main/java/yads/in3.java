package yads;

import com.bytedance.sdk.openadsdk.TTAdConstant;

/* JADX INFO: loaded from: classes7.dex */
public final class in3 implements jn3 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f78744m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f78745n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pq0 f78746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m73 f78747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mn3 f78748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f78749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f78750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jb2 f78751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f78752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mx0 f78753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f78754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f78755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f78756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f78757l;

    public static int a(int i10, int i11) {
        return i10 * 2 * i11;
    }

    @Override // yads.jn3
    public final void a(int i10, long j10) {
        this.f78746a.a(new pn3(this.f78748c, this.f78749d, i10, j10));
        this.f78747b.a(this.f78753h);
    }

    public in3(pq0 pq0Var, m73 m73Var, mn3 mn3Var) throws ob2 {
        this.f78746a = pq0Var;
        this.f78747b = m73Var;
        this.f78748c = mn3Var;
        int iMax = Math.max(1, mn3Var.f80289b / 10);
        this.f78752g = iMax;
        jb2 jb2Var = new jb2(mn3Var.f80292e);
        jb2Var.h();
        int iH = jb2Var.h();
        this.f78749d = iH;
        int i10 = mn3Var.f80288a;
        int i11 = (((mn3Var.f80290c - (i10 * 4)) * 8) / (mn3Var.f80291d * i10)) + 1;
        if (iH == i11) {
            int iA = ib3.a(iMax, iH);
            this.f78750e = new byte[mn3Var.f80290c * iA];
            this.f78751f = new jb2(a(iH, i10) * iA);
            int i12 = ((mn3Var.f80289b * mn3Var.f80290c) * 8) / iH;
            this.f78753h = new lx0().d("audio/raw").a(i12).e(i12).c(a(iMax, i10)).b(mn3Var.f80288a).g(mn3Var.f80289b).d(2).a();
            return;
        }
        throw ob2.a("Expected frames per block: " + i11 + "; got: " + iH);
    }

    @Override // yads.jn3
    public final void a(long j10) {
        this.f78754i = 0;
        this.f78755j = j10;
        this.f78756k = 0;
        this.f78757l = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045 A[LOOP:0: B:6:0x002a->B:12:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0041 -> B:11:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // yads.jn3
    public final boolean a(yads.ld0 r21, long r22) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.in3.a(yads.ld0, long):boolean");
    }
}
