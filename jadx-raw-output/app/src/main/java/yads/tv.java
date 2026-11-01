package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class tv implements pm1, om1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pm1 f83181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public om1 f83182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public sv[] f83183d = new sv[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f83184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f83185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f83186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public vv f83187h;

    @Override // yads.pm1
    public final long a(long j10, ww2 ww2Var) {
        long j11 = this.f83185f;
        if (j10 == j11) {
            return j11;
        }
        int i10 = ib3.f78556a;
        long jMax = Math.max(0L, Math.min(ww2Var.f84369a, j10 - j11));
        long j12 = ww2Var.f84370b;
        long j13 = this.f83186g;
        long jMax2 = Math.max(0L, Math.min(j12, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10));
        if (jMax != ww2Var.f84369a || jMax2 != ww2Var.f84370b) {
            ww2Var = new ww2(jMax, jMax2);
        }
        return this.f83181b.a(j10, ww2Var);
    }

    @Override // yads.rx2
    public final boolean continueLoading(long j10) {
        return this.f83181b.continueLoading(j10);
    }

    @Override // yads.pm1
    public final void discardBuffer(long j10, boolean z10) {
        this.f83181b.discardBuffer(j10, z10);
    }

    @Override // yads.rx2
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f83181b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.f83186g;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // yads.rx2
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f83181b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.f83186g;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // yads.pm1
    public final i73 getTrackGroups() {
        return this.f83181b.getTrackGroups();
    }

    @Override // yads.rx2
    public final boolean isLoading() {
        return this.f83181b.isLoading();
    }

    @Override // yads.pm1
    public final void maybeThrowPrepareError() throws vv {
        vv vvVar = this.f83187h;
        if (vvVar != null) {
            throw vvVar;
        }
        this.f83181b.maybeThrowPrepareError();
    }

    @Override // yads.pm1
    public final long readDiscontinuity() {
        long j10 = this.f83184e;
        if (j10 != -9223372036854775807L) {
            this.f83184e = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j10;
        }
        long discontinuity2 = this.f83181b.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (discontinuity2 < this.f83185f) {
            throw new IllegalStateException();
        }
        long j11 = this.f83186g;
        if (j11 == Long.MIN_VALUE || discontinuity2 <= j11) {
            return discontinuity2;
        }
        throw new IllegalStateException();
    }

    @Override // yads.rx2
    public final void reevaluateBuffer(long j10) {
        this.f83181b.reevaluateBuffer(j10);
    }

    public tv(pm1 pm1Var, boolean z10, long j10, long j11) {
        long j12;
        this.f83181b = pm1Var;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.f83184e = j12;
        this.f83185f = j10;
        this.f83186g = j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // yads.pm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long seekToUs(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f83184e = r0
            yads.sv[] r0 = r5.f83183d
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f82766c = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            yads.pm1 r0 = r5.f83181b
            long r0 = r0.seekToUs(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L3a
            long r6 = r5.f83185f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f83186g
            r2 = -9223372036854775808
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 == 0) goto L3a
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
            goto L3a
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tv.seekToUs(long):long");
    }

    @Override // yads.qx2
    public final void a(rx2 rx2Var) {
        om1 om1Var = this.f83182c;
        om1Var.getClass();
        om1Var.a((rx2) this);
    }

    @Override // yads.om1
    public final void a(pm1 pm1Var) {
        if (this.f83187h != null) {
            return;
        }
        om1 om1Var = this.f83182c;
        om1Var.getClass();
        om1Var.a((pm1) this);
    }

    @Override // yads.pm1
    public final void a(om1 om1Var, long j10) {
        this.f83182c = om1Var;
        this.f83181b.a(this, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r1 > r3) goto L32;
     */
    @Override // yads.pm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(yads.op0[] r16, boolean[] r17, yads.ns2[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            yads.sv[] r1 = new yads.sv[r1]
            r0.f83183d = r1
            int r1 = r9.length
            yads.ns2[] r10 = new yads.ns2[r1]
            r11 = 0
            r1 = r11
        Lf:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L24
            yads.sv[] r2 = r0.f83183d
            r3 = r9[r1]
            yads.sv r3 = (yads.sv) r3
            r2[r1] = r3
            if (r3 == 0) goto L1f
            yads.ns2 r12 = r3.f82765b
        L1f:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Lf
        L24:
            yads.pm1 r1 = r0.f83181b
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.a(r2, r3, r4, r5, r6)
            long r3 = r0.f83184e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L65
            long r3 = r0.f83185f
            int r7 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r7 != 0) goto L65
            r13 = 0
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 == 0) goto L65
            int r3 = r8.length
            r4 = r11
        L4c:
            if (r4 >= r3) goto L65
            r7 = r8[r4]
            if (r7 == 0) goto L62
            yads.mx0 r7 = r7.c()
            java.lang.String r13 = r7.f80429m
            java.lang.String r7 = r7.f80426j
            boolean r7 = yads.ht1.a(r13, r7)
            if (r7 != 0) goto L62
            r5 = r1
            goto L65
        L62:
            int r4 = r4 + 1
            goto L4c
        L65:
            r0.f83184e = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L84
            long r3 = r0.f83185f
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L7e
            long r3 = r0.f83186g
            r5 = -9223372036854775808
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L84
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L7e
            goto L84
        L7e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L84:
            int r3 = r9.length
            if (r11 >= r3) goto Laa
            r3 = r10[r11]
            if (r3 != 0) goto L90
            yads.sv[] r3 = r0.f83183d
            r3[r11] = r12
            goto La1
        L90:
            yads.sv[] r4 = r0.f83183d
            r5 = r4[r11]
            if (r5 == 0) goto L9a
            yads.ns2 r5 = r5.f82765b
            if (r5 == r3) goto La1
        L9a:
            yads.sv r5 = new yads.sv
            r5.<init>(r15, r3)
            r4[r11] = r5
        La1:
            yads.sv[] r3 = r0.f83183d
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L84
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tv.a(yads.op0[], boolean[], yads.ns2[], boolean[], long):long");
    }
}
