package yads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import yads.oe0;

/* JADX INFO: loaded from: classes9.dex */
public final class oe0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y43 f81012h = new y43() { // from class: cp.o7
        @Override // yads.y43
        public final Object get() {
            return oe0.a();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Random f81013i = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r63 f81014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p63 f81015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f81016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y43 f81017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public he2 f81018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s63 f81019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f81020g;

    public oe0() {
        this(f81012h);
    }

    public final synchronized void a(ye yeVar) {
        he2 he2Var;
        this.f81020g = null;
        Iterator it = this.f81016c.values().iterator();
        while (it.hasNext()) {
            ne0 ne0Var = (ne0) it.next();
            it.remove();
            if (ne0Var.f80655e && (he2Var = this.f81018e) != null) {
                ((mm1) he2Var).b(yeVar, ne0Var.f80651a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r1.f82314d < r2) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(yads.ye r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            yads.he2 r0 = r7.f81018e     // Catch: java.lang.Throwable -> Lbf
            r0.getClass()     // Catch: java.lang.Throwable -> Lbf
            yads.s63 r0 = r8.f84910b     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L10
            monitor-exit(r7)
            return
        L10:
            java.util.HashMap r0 = r7.f81016c     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = r7.f81020g     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lbf
            yads.ne0 r0 = (yads.ne0) r0     // Catch: java.lang.Throwable -> Lbf
            yads.ym1 r1 = r8.f84912d     // Catch: java.lang.Throwable -> Lbf
            if (r1 == 0) goto L37
            if (r0 == 0) goto L37
            long r2 = r0.f80653c     // Catch: java.lang.Throwable -> Lbf
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L2f
            int r0 = r0.f80652b     // Catch: java.lang.Throwable -> Lbf
            int r2 = r8.f84911c     // Catch: java.lang.Throwable -> Lbf
            if (r0 == r2) goto L37
            goto L35
        L2f:
            long r4 = r1.f82314d     // Catch: java.lang.Throwable -> Lbf
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L37
        L35:
            monitor-exit(r7)
            return
        L37:
            int r0 = r8.f84911c     // Catch: java.lang.Throwable -> Lbf
            yads.ne0 r0 = r7.a(r0, r1)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = r7.f81020g     // Catch: java.lang.Throwable -> Lbf
            if (r1 != 0) goto L45
            java.lang.String r1 = r0.f80651a     // Catch: java.lang.Throwable -> Lbf
            r7.f81020g = r1     // Catch: java.lang.Throwable -> Lbf
        L45:
            yads.ym1 r1 = r8.f84912d     // Catch: java.lang.Throwable -> Lbf
            r2 = 1
            if (r1 == 0) goto L99
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> Lbf
            if (r1 == 0) goto L99
            yads.ym1 r1 = new yads.ym1     // Catch: java.lang.Throwable -> Lbf
            yads.ym1 r3 = r8.f84912d     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r4 = r3.f82311a     // Catch: java.lang.Throwable -> Lbf
            long r5 = r3.f82314d     // Catch: java.lang.Throwable -> Lbf
            int r3 = r3.f82312b     // Catch: java.lang.Throwable -> Lbf
            r1.<init>(r3, r5, r4)     // Catch: java.lang.Throwable -> Lbf
            int r3 = r8.f84911c     // Catch: java.lang.Throwable -> Lbf
            yads.ne0 r1 = r7.a(r3, r1)     // Catch: java.lang.Throwable -> Lbf
            boolean r3 = r1.f80655e     // Catch: java.lang.Throwable -> Lbf
            if (r3 != 0) goto L99
            r1.f80655e = r2     // Catch: java.lang.Throwable -> Lbf
            yads.s63 r1 = r8.f84910b     // Catch: java.lang.Throwable -> Lbf
            yads.ym1 r3 = r8.f84912d     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r3 = r3.f82311a     // Catch: java.lang.Throwable -> Lbf
            yads.p63 r4 = r7.f81015b     // Catch: java.lang.Throwable -> Lbf
            r1.a(r3, r4)     // Catch: java.lang.Throwable -> Lbf
            yads.p63 r1 = r7.f81015b     // Catch: java.lang.Throwable -> Lbf
            yads.ym1 r3 = r8.f84912d     // Catch: java.lang.Throwable -> Lbf
            int r3 = r3.f82312b     // Catch: java.lang.Throwable -> Lbf
            yads.e6 r1 = r1.f81272h     // Catch: java.lang.Throwable -> Lbf
            yads.d6 r1 = r1.a(r3)     // Catch: java.lang.Throwable -> Lbf
            long r3 = r1.f76580b     // Catch: java.lang.Throwable -> Lbf
            long r3 = yads.ib3.b(r3)     // Catch: java.lang.Throwable -> Lbf
            yads.p63 r1 = r7.f81015b     // Catch: java.lang.Throwable -> Lbf
            long r5 = r1.f81270f     // Catch: java.lang.Throwable -> Lbf
            long r5 = yads.ib3.b(r5)     // Catch: java.lang.Throwable -> Lbf
            long r5 = r5 + r3
            r3 = 0
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> Lbf
            yads.he2 r1 = r7.f81018e     // Catch: java.lang.Throwable -> Lbf
            r1.getClass()     // Catch: java.lang.Throwable -> Lbf
        L99:
            boolean r1 = r0.f80655e     // Catch: java.lang.Throwable -> Lbf
            if (r1 != 0) goto La4
            r0.f80655e = r2     // Catch: java.lang.Throwable -> Lbf
            yads.he2 r1 = r7.f81018e     // Catch: java.lang.Throwable -> Lbf
            r1.getClass()     // Catch: java.lang.Throwable -> Lbf
        La4:
            java.lang.String r1 = r0.f80651a     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r3 = r7.f81020g     // Catch: java.lang.Throwable -> Lbf
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lbf
            if (r1 == 0) goto Lbd
            boolean r1 = r0.f80656f     // Catch: java.lang.Throwable -> Lbf
            if (r1 != 0) goto Lbd
            r0.f80656f = r2     // Catch: java.lang.Throwable -> Lbf
            yads.he2 r1 = r7.f81018e     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = r0.f80651a     // Catch: java.lang.Throwable -> Lbf
            yads.mm1 r1 = (yads.mm1) r1     // Catch: java.lang.Throwable -> Lbf
            r1.a(r8, r0)     // Catch: java.lang.Throwable -> Lbf
        Lbd:
            monitor-exit(r7)
            return
        Lbf:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.oe0.c(yads.ye):void");
    }

    public oe0(y43 y43Var) {
        this.f81017d = y43Var;
        this.f81014a = new r63();
        this.f81015b = new p63();
        this.f81016c = new HashMap();
        this.f81019f = s63.f82545b;
    }

    public final void b(ye yeVar) {
        ym1 ym1Var;
        if (yeVar.f84910b.c()) {
            this.f81020g = null;
            return;
        }
        ne0 ne0Var = (ne0) this.f81016c.get(this.f81020g);
        this.f81020g = a(yeVar.f84911c, yeVar.f84912d).f80651a;
        c(yeVar);
        ym1 ym1Var2 = yeVar.f84912d;
        if (ym1Var2 == null || !ym1Var2.a()) {
            return;
        }
        if (ne0Var != null) {
            long j10 = ne0Var.f80653c;
            ym1 ym1Var3 = yeVar.f84912d;
            if (j10 == ym1Var3.f82314d && (ym1Var = ne0Var.f80654d) != null && ym1Var.f82312b == ym1Var3.f82312b && ym1Var.f82313c == ym1Var3.f82313c) {
                return;
            }
        }
        ym1 ym1Var4 = yeVar.f84912d;
        a(yeVar.f84911c, new ym1(ym1Var4.f82311a, ym1Var4.f82314d));
        this.f81018e.getClass();
    }

    public static String a() {
        byte[] bArr = new byte[12];
        f81013i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:46:0x0075 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final ne0 a(int i10, ym1 ym1Var) {
        long j10;
        ne0 ne0Var = null;
        long j11 = Long.MAX_VALUE;
        for (ne0 ne0Var2 : this.f81016c.values()) {
            if (ne0Var2.f80653c == -1 && i10 == ne0Var2.f80652b && ym1Var != null) {
                ne0Var2.f80653c = ym1Var.f82314d;
            }
            if (ym1Var == null) {
                if (i10 == ne0Var2.f80652b) {
                    j10 = ne0Var2.f80653c;
                    if (j10 != -1 || j10 < j11) {
                        ne0Var = ne0Var2;
                        j11 = j10;
                    } else if (j10 == j11) {
                        int i11 = ib3.f78556a;
                        if (ne0Var.f80654d != null && ne0Var2.f80654d != null) {
                            ne0Var = ne0Var2;
                        }
                    }
                }
            } else {
                ym1 ym1Var2 = ne0Var2.f80654d;
                if (ym1Var2 == null) {
                    if (!ym1Var.a() && ym1Var.f82314d == ne0Var2.f80653c) {
                        j10 = ne0Var2.f80653c;
                        if (j10 != -1) {
                        }
                        ne0Var = ne0Var2;
                        j11 = j10;
                    }
                } else if (ym1Var.f82314d == ym1Var2.f82314d && ym1Var.f82312b == ym1Var2.f82312b && ym1Var.f82313c == ym1Var2.f82313c) {
                    j10 = ne0Var2.f80653c;
                    if (j10 != -1) {
                    }
                    ne0Var = ne0Var2;
                    j11 = j10;
                }
            }
        }
        if (ne0Var != null) {
            return ne0Var;
        }
        String str = (String) this.f81017d.get();
        ne0 ne0Var3 = new ne0(this, str, i10, ym1Var);
        this.f81016c.put(str, ne0Var3);
        return ne0Var3;
    }

    public final void a(he2 he2Var) {
        this.f81018e = he2Var;
    }

    public final synchronized void a(ye yeVar, int i10) {
        this.f81018e.getClass();
        if (i10 == 0) {
        }
        Iterator it = this.f81016c.values().iterator();
        while (it.hasNext()) {
            ne0 ne0Var = (ne0) it.next();
            if (ne0Var.a(yeVar)) {
                it.remove();
                if (ne0Var.f80655e) {
                    if (ne0Var.f80651a.equals(this.f81020g)) {
                        this.f81020g = null;
                    }
                    ((mm1) this.f81018e).b(yeVar, ne0Var.f80651a);
                }
            }
        }
        b(yeVar);
    }
}
