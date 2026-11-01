package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Handler.Callback, com.fyber.inneractive.sdk.player.exoplayer2.source.r, com.fyber.inneractive.sdk.player.exoplayer2.source.t {
    public h A;
    public h B;
    public x C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f17402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f17403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f17404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f17405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.u f17406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f17407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HandlerThread f17408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f17409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f17410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v f17411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f17412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s f17413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f17414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.h f17415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.u f17416o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a[] f17417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f17419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f17421t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17422u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f17423v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f17425x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f17426y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h f17427z;

    public static void a(a aVar) {
        int i10 = aVar.f16286c;
        if (i10 == 2) {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            aVar.f16286c = 1;
            aVar.j();
        }
    }

    public final void b(boolean z10) {
        if (this.f17421t != z10) {
            this.f17421t = z10;
            this.f17409h.obtainMessage(2, z10 ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void c(boolean z10) {
        this.f17420s = false;
        this.f17419r = z10;
        if (!z10) {
            g();
            h();
            a(false);
            return;
        }
        int i10 = this.f17422u;
        if (i10 != 3) {
            if (i10 == 2) {
                this.f17407f.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.f17420s = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f17406e;
        if (!uVar.f17865a) {
            uVar.f17867c = SystemClock.elapsedRealtime();
            uVar.f17865a = true;
        }
        for (a aVar : this.f17417p) {
            if (aVar.f16286c != 1) {
                throw new IllegalStateException();
            }
            aVar.f16286c = 2;
            aVar.i();
        }
        this.f17407f.sendEmptyMessage(2);
    }

    public final synchronized void d() {
        if (this.f17418q) {
            return;
        }
        this.f17407f.sendEmptyMessage(6);
        while (!this.f17418q) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.f17408g.quit();
    }

    public final void e() {
        a(true);
        this.f17405d.a(true);
        a(1);
        synchronized (this) {
            this.f17418q = true;
            notifyAll();
        }
    }

    public final void f() throws d {
        h hVar = this.B;
        if (hVar == null) {
            return;
        }
        boolean z10 = true;
        while (hVar != null && hVar.f17381i) {
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVarA = hVar.f17388p.a(hVar.f17387o, hVar.f17373a.a());
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar.f17391s;
            if (jVar != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= jVarA.f17649b.f17645a) {
                        if (hVar == this.A) {
                            z10 = false;
                        }
                        hVar = hVar.f17383k;
                    } else if (jVarA.a(jVar, i10)) {
                        i10++;
                    }
                }
            }
            hVar.f17385m = jVarA;
            if (z10) {
                h hVar2 = this.A;
                h hVar3 = this.B;
                boolean z11 = hVar2 != hVar3;
                for (h hVar4 = hVar3.f17383k; hVar4 != null; hVar4 = hVar4.f17383k) {
                    hVar4.a();
                }
                h hVar5 = this.B;
                hVar5.f17383k = null;
                this.f17427z = hVar5;
                this.A = hVar5;
                boolean[] zArr = new boolean[this.f17402a.length];
                long jA = hVar5.a(this.f17412k.f17394c, z11, zArr);
                if (jA != this.f17412k.f17394c) {
                    this.f17412k.f17394c = jA;
                    a(jA);
                }
                boolean[] zArr2 = new boolean[this.f17402a.length];
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    a[] aVarArr = this.f17402a;
                    if (i11 >= aVarArr.length) {
                        break;
                    }
                    a aVar = aVarArr[i11];
                    boolean z12 = aVar.f16286c != 0;
                    zArr2[i11] = z12;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = this.B.f17375c[i11];
                    if (vVar != null) {
                        i12++;
                    }
                    if (z12) {
                        if (vVar != aVar.f16287d) {
                            if (aVar == this.f17414m) {
                                if (vVar == null) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f17406e;
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar6 = this.f17415n;
                                    uVar.getClass();
                                    uVar.a(hVar6.b());
                                    uVar.f17868d = hVar6.a();
                                }
                                this.f17415n = null;
                                this.f17414m = null;
                            }
                            a(aVar);
                            aVar.c();
                        } else if (zArr[i11]) {
                            long j10 = this.f17426y;
                            aVar.f16290g = false;
                            aVar.f16289f = false;
                            aVar.a(false, j10);
                        }
                    }
                    i11++;
                }
                this.f17409h.obtainMessage(3, hVar.f17385m).sendToTarget();
                a(zArr2, i12);
            } else {
                this.f17427z = hVar;
                for (h hVar7 = hVar.f17383k; hVar7 != null; hVar7 = hVar7.f17383k) {
                    hVar7.a();
                }
                h hVar8 = this.f17427z;
                hVar8.f17383k = null;
                if (hVar8.f17381i) {
                    long j11 = hVar8.f17379g;
                    long jMax = Math.max(j11, Math.abs(this.f17426y - (hVar8.f17377e - j11)));
                    h hVar9 = this.f17427z;
                    hVar9.a(jMax, false, new boolean[hVar9.f17386n.length]);
                }
            }
            b();
            h();
            this.f17407f.sendEmptyMessage(2);
            return;
        }
    }

    public final void g() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f17406e;
        if (uVar.f17865a) {
            uVar.a(uVar.b());
            uVar.f17865a = false;
        }
        for (a aVar : this.f17417p) {
            a(aVar);
        }
    }

    public final void h() {
        h hVar = this.B;
        if (hVar == null) {
            return;
        }
        long jG = hVar.f17373a.g();
        if (jG != -9223372036854775807L) {
            a(jG);
        } else {
            a aVar = this.f17414m;
            if (aVar == null || aVar.e()) {
                this.f17426y = this.f17406e.b();
            } else {
                long jB = this.f17415n.b();
                this.f17426y = jB;
                this.f17406e.a(jB);
            }
            h hVar2 = this.B;
            jG = Math.abs(this.f17426y - (hVar2.f17377e - hVar2.f17379g));
        }
        this.f17412k.f17394c = jG;
        this.f17423v = SystemClock.elapsedRealtime() * 1000;
        long jC = this.f17417p.length == 0 ? Long.MIN_VALUE : this.B.f17373a.c();
        i iVar = this.f17412k;
        if (jC == Long.MIN_VALUE) {
            long j10 = this.C.a(this.B.f17378f, this.f17411j, false).f17884d;
        }
        iVar.getClass();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.u) message.obj, message.arg1 != 0);
                    return true;
                case 1:
                    c(message.arg1 != 0);
                    return true;
                case 2:
                    a();
                    return true;
                case 3:
                    b((j) message.obj);
                    return true;
                case 4:
                    a((s) message.obj);
                    return true;
                case 5:
                    a(true);
                    this.f17405d.a(true);
                    a(1);
                    return true;
                case 6:
                    e();
                    return true;
                case 7:
                    a((Pair) message.obj);
                    return true;
                case 8:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.s) message.obj);
                    return true;
                case 9:
                    com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.s) message.obj;
                    h hVar = this.f17427z;
                    if (hVar != null && hVar.f17373a == sVar) {
                        b();
                    }
                    return true;
                case 10:
                    f();
                    return true;
                case 11:
                    a((e[]) message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (d e10) {
            Log.e("ExoPlayerImplInternal", "Renderer error.", e10);
            this.f17409h.obtainMessage(8, e10).sendToTarget();
            a(true);
            this.f17405d.a(true);
            a(1);
            return true;
        } catch (IOException e11) {
            Log.e("ExoPlayerImplInternal", "Source error.", e11);
            this.f17409h.obtainMessage(8, new d(e11)).sendToTarget();
            a(true);
            this.f17405d.a(true);
            a(1);
            return true;
        } catch (RuntimeException e12) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e12);
            this.f17409h.obtainMessage(8, new d(e12)).sendToTarget();
            a(true);
            this.f17405d.a(true);
            a(1);
            return true;
        }
    }

    public l(a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d dVar, c cVar, boolean z10, f fVar, i iVar, g gVar) {
        this.f17402a = aVarArr;
        this.f17404c = dVar;
        this.f17405d = cVar;
        this.f17419r = z10;
        this.f17409h = fVar;
        this.f17412k = iVar;
        this.f17403b = new a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar = aVarArr[i10];
            aVar.getClass();
            this.f17403b[i10] = aVar;
        }
        this.f17406e = new com.fyber.inneractive.sdk.player.exoplayer2.util.u();
        this.f17417p = new a[0];
        this.f17410i = new w();
        this.f17411j = new v();
        this.f17413l = s.f17526d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f17408g = handlerThread;
        handlerThread.start();
        this.f17407f = new Handler(handlerThread.getLooper(), this);
    }

    public final void b(j jVar) {
        if (this.C == null) {
            this.f17424w++;
            this.f17425x = jVar;
            return;
        }
        Pair pairA = a(jVar);
        if (pairA == null) {
            i iVar = new i(0, 0L);
            this.f17412k = iVar;
            this.f17409h.obtainMessage(4, 1, 0, iVar).sendToTarget();
            this.f17412k = new i(0, -9223372036854775807L);
            a(4);
            a(false);
            return;
        }
        int i10 = jVar.f17397c == -9223372036854775807L ? 1 : 0;
        int iIntValue = ((Integer) pairA.first).intValue();
        long jLongValue = ((Long) pairA.second).longValue();
        try {
            i iVar2 = this.f17412k;
            if (iIntValue == iVar2.f17392a && jLongValue / 1000 == iVar2.f17394c / 1000) {
                i iVar3 = new i(iIntValue, jLongValue);
                this.f17412k = iVar3;
                this.f17409h.obtainMessage(4, i10, 0, iVar3).sendToTarget();
            } else {
                long jA = a(iIntValue, jLongValue);
                int i11 = i10 | (jLongValue == jA ? 0 : 1);
                i iVar4 = new i(iIntValue, jA);
                this.f17412k = iVar4;
                this.f17409h.obtainMessage(4, i11, 0, iVar4).sendToTarget();
            }
        } catch (Throwable th2) {
            i iVar5 = new i(iIntValue, jLongValue);
            this.f17412k = iVar5;
            this.f17409h.obtainMessage(4, i10, 0, iVar5).sendToTarget();
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.t
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.x xVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g gVar) {
        this.f17407f.obtainMessage(7, Pair.create(xVar, gVar)).sendToTarget();
    }

    public final void a(int i10) {
        if (this.f17422u != i10) {
            this.f17422u = i10;
            this.f17409h.obtainMessage(1, i10, 0).sendToTarget();
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar, boolean z10) {
        this.f17409h.sendEmptyMessage(0);
        a(true);
        this.f17405d.a(false);
        if (z10) {
            this.f17412k = new i(0, -9223372036854775807L);
        }
        this.f17416o = uVar;
        uVar.a(this);
        a(2);
        this.f17407f.sendEmptyMessage(2);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0215  */
    /* JADX WARN: Code duplicated, block: B:106:0x0217  */
    /* JADX WARN: Code duplicated, block: B:110:0x021e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0229 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x022b  */
    /* JADX WARN: Code duplicated, block: B:115:0x022e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0232  */
    /* JADX WARN: Code duplicated, block: B:129:0x027d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0396  */
    /* JADX WARN: Code duplicated, block: B:191:0x0399  */
    /* JADX WARN: Code duplicated, block: B:206:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:208:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:210:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:211:0x03df  */
    /* JADX WARN: Code duplicated, block: B:214:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:216:0x03ec A[LOOP:2: B:213:0x03e4->B:216:0x03ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:241:0x043a  */
    /* JADX WARN: Code duplicated, block: B:243:0x0440 A[LOOP:1: B:242:0x043e->B:243:0x0440, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:246:0x044e  */
    /* JADX WARN: Code duplicated, block: B:248:0x0452  */
    /* JADX WARN: Code duplicated, block: B:253:0x0462  */
    /* JADX WARN: Code duplicated, block: B:254:0x0468  */
    /* JADX WARN: Code duplicated, block: B:262:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0287 A[EDGE_INSN: B:265:0x0287->B:131:0x0287 BREAK  A[LOOP:4: B:79:0x01bd->B:88:0x01d6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x0287 A[EDGE_INSN: B:275:0x0287->B:131:0x0287 BREAK  A[LOOP:5: B:90:0x01da->B:98:0x01f3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0178  */
    /* JADX WARN: Code duplicated, block: B:71:0x0181 A[LOOP:3: B:71:0x0181->B:75:0x0191, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:78:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01df  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a() throws d {
        h hVar;
        int i10;
        boolean z10;
        boolean z11;
        h hVar2;
        h hVar3;
        h hVar4;
        ?? r10;
        a[] aVarArr;
        h hVar5;
        h hVar6;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar2;
        boolean z12;
        ?? r11;
        a[] aVarArr2;
        a aVar;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar;
        a aVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar;
        ?? r12;
        a[] aVarArr3;
        com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar2;
        long j10;
        int i11;
        h hVar7;
        int i12;
        h hVar8;
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar;
        int i13;
        int i14;
        long jC;
        c cVar;
        long j11;
        a[] aVarArr4;
        int length;
        int i15;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.C == null) {
            this.f17416o.a();
        } else {
            h hVar9 = this.f17427z;
            if (hVar9 == null) {
                i10 = this.f17412k.f17392a;
            } else {
                int i16 = hVar9.f17378f;
                if (hVar9.f17380h || !hVar9.f17381i || ((hVar9.f17382j && hVar9.f17373a.c() != Long.MIN_VALUE) || this.C.a(i16, this.f17411j, false).f17884d == -9223372036854775807L || ((hVar = this.B) != null && i16 - hVar.f17378f == 100))) {
                    z11 = false;
                    z10 = true;
                } else {
                    i10 = this.f17427z.f17378f + 1;
                }
                hVar2 = this.f17427z;
                if (hVar2 == null && (!hVar2.f17381i || (hVar2.f17382j && hVar2.f17373a.c() != Long.MIN_VALUE))) {
                    h hVar10 = this.f17427z;
                    if (hVar10 != null && hVar10.f17384l) {
                        b();
                    }
                } else {
                    b(z11);
                }
                if (this.B != null) {
                    while (true) {
                        hVar3 = this.B;
                        hVar4 = this.A;
                        if (hVar3 == hVar4 || this.f17426y < hVar3.f17383k.f17377e) {
                            break;
                        }
                        hVar3.a();
                        a(this.B.f17383k);
                        h hVar11 = this.B;
                        this.f17412k = new i(hVar11.f17378f, hVar11.f17379g);
                        h();
                        this.f17409h.obtainMessage(5, this.f17412k).sendToTarget();
                    }
                    if (!hVar4.f17380h) {
                        r10 = z11;
                        while (true) {
                            aVarArr = this.f17402a;
                            if (r10 < aVarArr.length) {
                                aVar2 = aVarArr[r10];
                                vVar = this.A.f17375c[r10];
                                if (aVar2.f16287d != vVar || (vVar != null && !aVar2.f16289f)) {
                                    break;
                                } else {
                                    r10++;
                                }
                            } else {
                                hVar5 = this.A;
                                hVar6 = hVar5.f17383k;
                                if (hVar6 != null || !hVar6.f17381i) {
                                    break;
                                    break;
                                }
                                jVar = hVar5.f17385m;
                                this.A = hVar6;
                                jVar2 = hVar6.f17385m;
                                if (hVar6.f17373a.g() != -9223372036854775807L) {
                                    z12 = z10 ? 1 : 0;
                                } else {
                                    z12 = z11;
                                }
                                r11 = z11;
                                while (true) {
                                    aVarArr2 = this.f17402a;
                                    if (r11 < aVarArr2.length) {
                                        break;
                                    }
                                    aVar = aVarArr2[r11];
                                    if (jVar.f17649b.f17646b[r11] != null) {
                                        if (z12) {
                                            aVar.f16290g = z10;
                                        } else if (aVar.f16290g) {
                                            continue;
                                        } else {
                                            bVar = jVar2.f17649b.f17646b[r11];
                                            t tVar = jVar.f17651d[r11];
                                            t tVar2 = jVar2.f17651d[r11];
                                            if (bVar == null && tVar2.equals(tVar)) {
                                                int length2 = bVar.f17638c.length;
                                                o[] oVarArr = new o[length2];
                                                for (?? r15 = z11; r15 < length2; r15++) {
                                                    oVarArr[r15] = bVar.f17639d[r15];
                                                }
                                                h hVar12 = this.A;
                                                com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar3 = hVar12.f17375c[r11];
                                                long j12 = hVar12.f17377e - hVar12.f17379g;
                                                if (!aVar.f16290g) {
                                                    aVar.f16287d = vVar3;
                                                    aVar.f16289f = false;
                                                    aVar.f16288e = j12;
                                                    aVar.a(oVarArr);
                                                } else {
                                                    throw new IllegalStateException();
                                                }
                                            } else {
                                                aVar.f16290g = z10;
                                            }
                                        }
                                    }
                                    z11 = false;
                                    z10 = true;
                                    r11++;
                                }
                            }
                        }
                    } else {
                        r12 = z11;
                        while (true) {
                            aVarArr3 = this.f17402a;
                            if (r12 < aVarArr3.length) {
                                break;
                            }
                            a aVar3 = aVarArr3[r12];
                            vVar2 = this.A.f17375c[r12];
                            if (vVar2 == null && aVar3.f16287d == vVar2 && aVar3.f16289f) {
                                aVar3.f16290g = z10;
                            }
                            r12++;
                        }
                    }
                }
            }
            if (i10 >= this.C.a()) {
                this.f17416o.a();
                z11 = false;
                z10 = true;
            } else {
                if (this.f17427z == null) {
                    j10 = this.f17412k.f17394c;
                    z11 = false;
                    z10 = true;
                } else {
                    int i17 = this.C.a(i10, this.f17411j, false).f17883c;
                    if (i10 != this.C.a(i17, this.f17410i, 0L).f17957c) {
                        z11 = false;
                        z10 = true;
                        j10 = 0;
                    } else {
                        h hVar13 = this.f17427z;
                        z11 = false;
                        z10 = true;
                        Pair pairA = a(this.C, i17, -9223372036854775807L, Math.max(0L, ((hVar13.f17377e - hVar13.f17379g) + this.C.a(hVar13.f17378f, this.f17411j, false).f17884d) - this.f17426y));
                        if (pairA != null) {
                            int iIntValue = ((Integer) pairA.first).intValue();
                            long jLongValue = ((Long) pairA.second).longValue();
                            i10 = iIntValue;
                            j10 = jLongValue;
                        }
                    }
                }
                h hVar14 = this.f17427z;
                long j13 = hVar14 == null ? j10 + 60000000 : (hVar14.f17377e - hVar14.f17379g) + this.C.a(hVar14.f17378f, this.f17411j, z11).f17884d;
                this.C.a(i10, this.f17411j, z10);
                h hVar15 = new h(this.f17402a, this.f17403b, j13, this.f17404c, this.f17405d, this.f17416o, this.f17411j.f17882b, i10, (i10 != this.C.a() - (z10 ? 1 : 0) || this.C.a(this.f17411j.f17883c, this.f17410i, 0L).f17956b) ? z11 : z10 ? 1 : 0, j10);
                h hVar16 = this.f17427z;
                if (hVar16 != null) {
                    hVar16.f17383k = hVar15;
                }
                this.f17427z = hVar15;
                hVar15.f17373a.a(this);
                b(z10);
            }
            hVar2 = this.f17427z;
            if (hVar2 == null) {
                b(z11);
            } else {
                b(z11);
            }
            if (this.B != null) {
                while (true) {
                    hVar3 = this.B;
                    hVar4 = this.A;
                    if (hVar3 == hVar4) {
                        break;
                    }
                    break;
                    break;
                    hVar3.a();
                    a(this.B.f17383k);
                    h hVar17 = this.B;
                    this.f17412k = new i(hVar17.f17378f, hVar17.f17379g);
                    h();
                    this.f17409h.obtainMessage(5, this.f17412k).sendToTarget();
                }
                if (!hVar4.f17380h) {
                    r12 = z11;
                    while (true) {
                        aVarArr3 = this.f17402a;
                        if (r12 < aVarArr3.length) {
                            break;
                            break;
                        }
                        a aVar4 = aVarArr3[r12];
                        vVar2 = this.A.f17375c[r12];
                        if (vVar2 == null) {
                        }
                        r12++;
                    }
                } else {
                    r10 = z11;
                    while (true) {
                        aVarArr = this.f17402a;
                        if (r10 < aVarArr.length) {
                            aVar2 = aVarArr[r10];
                            vVar = this.A.f17375c[r10];
                            if (aVar2.f16287d != vVar) {
                                break;
                            }
                            break;
                            break;
                        }
                        hVar5 = this.A;
                        hVar6 = hVar5.f17383k;
                        if (hVar6 != null) {
                            break;
                        }
                        jVar = hVar5.f17385m;
                        this.A = hVar6;
                        jVar2 = hVar6.f17385m;
                        if (hVar6.f17373a.g() != -9223372036854775807L) {
                            z12 = z10 ? 1 : 0;
                        } else {
                            z12 = z11;
                        }
                        r11 = z11;
                        while (true) {
                            aVarArr2 = this.f17402a;
                            if (r11 < aVarArr2.length) {
                                break;
                                break;
                            }
                            aVar = aVarArr2[r11];
                            if (jVar.f17649b.f17646b[r11] != null) {
                                if (z12) {
                                    aVar.f16290g = z10;
                                } else if (aVar.f16290g) {
                                    bVar = jVar2.f17649b.f17646b[r11];
                                    t tVar3 = jVar.f17651d[r11];
                                    t tVar4 = jVar2.f17651d[r11];
                                    if (bVar == null) {
                                        aVar.f16290g = z10;
                                    } else {
                                        aVar.f16290g = z10;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            z11 = false;
                            z10 = true;
                            r11++;
                        }
                        r10++;
                    }
                }
            }
        }
        if (this.B == null) {
            c();
            a(jElapsedRealtime, 10L);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("doSomeWork");
        h();
        com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar = this.B.f17373a;
        long j14 = this.f17412k.f17394c;
        sVar.getClass();
        boolean z13 = true;
        boolean z14 = true;
        for (a aVar5 : this.f17417p) {
            aVar5.a(this.f17426y, this.f17423v);
            z14 = z14 && aVar5.e();
            boolean z15 = aVar5.f() || aVar5.e();
            if (!z15) {
                aVar5.f16287d.a();
            }
            z13 = z13 && z15;
        }
        if (!z13) {
            c();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar18 = this.f17415n;
        if (hVar18 != null) {
            s sVarA = hVar18.a();
            if (!sVarA.equals(this.f17413l)) {
                this.f17413l = sVarA;
                com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar2 = this.f17406e;
                com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar19 = this.f17415n;
                uVar2.getClass();
                uVar2.a(hVar19.b());
                uVar2.f17868d = hVar19.a();
                this.f17409h.obtainMessage(7, sVarA).sendToTarget();
            }
        }
        long j15 = this.C.a(this.B.f17378f, this.f17411j, false).f17884d;
        if (z14 && ((j15 == -9223372036854775807L || j15 <= this.f17412k.f17394c) && this.B.f17380h)) {
            a(4);
            g();
        } else {
            int i18 = this.f17422u;
            if (i18 == 2) {
                if (this.f17417p.length > 0) {
                    if (z13) {
                        boolean z16 = this.f17420s;
                        h hVar20 = this.f17427z;
                        if (!hVar20.f17381i) {
                            jC = hVar20.f17379g;
                        } else {
                            jC = hVar20.f17373a.c();
                        }
                        if (jC == Long.MIN_VALUE) {
                            h hVar21 = this.f17427z;
                            if (!hVar21.f17380h) {
                                jC = this.C.a(hVar21.f17378f, this.f17411j, false).f17884d;
                                cVar = this.f17405d;
                                h hVar22 = this.f17427z;
                                long jAbs = jC - Math.abs(this.f17426y - (hVar22.f17377e - hVar22.f17379g));
                                if (z16) {
                                    j11 = cVar.f16420e;
                                } else {
                                    j11 = cVar.f16419d;
                                }
                                if (j11 > 0 || jAbs >= j11) {
                                    a(3);
                                    if (this.f17419r) {
                                        i11 = 0;
                                        this.f17420s = false;
                                        uVar = this.f17406e;
                                        if (uVar.f17865a) {
                                            i13 = 1;
                                        } else {
                                            uVar.f17867c = SystemClock.elapsedRealtime();
                                            i13 = 1;
                                            uVar.f17865a = true;
                                        }
                                        for (a aVar6 : this.f17417p) {
                                            if (aVar6.f16286c == i13) {
                                                aVar6.f16286c = 2;
                                                aVar6.i();
                                            } else {
                                                throw new IllegalStateException();
                                            }
                                        }
                                    }
                                }
                            } else {
                                a(3);
                                if (this.f17419r) {
                                    i11 = 0;
                                    this.f17420s = false;
                                    uVar = this.f17406e;
                                    if (uVar.f17865a) {
                                        uVar.f17867c = SystemClock.elapsedRealtime();
                                        i13 = 1;
                                        uVar.f17865a = true;
                                    } else {
                                        i13 = 1;
                                    }
                                    while (i14 < r4) {
                                        if (aVar6.f16286c == i13) {
                                            aVar6.f16286c = 2;
                                            aVar6.i();
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                }
                            }
                        } else {
                            cVar = this.f17405d;
                            h hVar23 = this.f17427z;
                            long jAbs2 = jC - Math.abs(this.f17426y - (hVar23.f17377e - hVar23.f17379g));
                            if (z16) {
                                j11 = cVar.f16420e;
                            } else {
                                j11 = cVar.f16419d;
                            }
                            if (j11 > 0) {
                                a(3);
                                if (this.f17419r) {
                                    i11 = 0;
                                    this.f17420s = false;
                                    uVar = this.f17406e;
                                    if (uVar.f17865a) {
                                        uVar.f17867c = SystemClock.elapsedRealtime();
                                        i13 = 1;
                                        uVar.f17865a = true;
                                    } else {
                                        i13 = 1;
                                    }
                                    while (i14 < r4) {
                                        if (aVar6.f16286c == i13) {
                                            aVar6.f16286c = 2;
                                            aVar6.i();
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                }
                            } else {
                                a(3);
                                if (this.f17419r) {
                                    i11 = 0;
                                    this.f17420s = false;
                                    uVar = this.f17406e;
                                    if (uVar.f17865a) {
                                        uVar.f17867c = SystemClock.elapsedRealtime();
                                        i13 = 1;
                                        uVar.f17865a = true;
                                    } else {
                                        i13 = 1;
                                    }
                                    while (i14 < r4) {
                                        if (aVar6.f16286c == i13) {
                                            aVar6.f16286c = 2;
                                            aVar6.i();
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.f17422u == i12) {
                        aVarArr4 = this.f17417p;
                        length = aVarArr4.length;
                        for (i15 = i11; i15 < length; i15++) {
                            aVarArr4[i15].f16287d.a();
                        }
                    }
                    if ((!this.f17419r && this.f17422u == 3) || this.f17422u == 2) {
                        a(jElapsedRealtime, 10L);
                    } else if (this.f17417p.length != 0) {
                        a(jElapsedRealtime, 1000L);
                    } else {
                        this.f17407f.removeMessages(2);
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                }
                if (j15 == -9223372036854775807L || this.f17412k.f17394c < j15 || ((hVar8 = this.B.f17383k) != null && hVar8.f17381i)) {
                    a(3);
                    if (this.f17419r) {
                        i11 = 0;
                        this.f17420s = false;
                        uVar = this.f17406e;
                        if (uVar.f17865a) {
                            uVar.f17867c = SystemClock.elapsedRealtime();
                            i13 = 1;
                            uVar.f17865a = true;
                        } else {
                            i13 = 1;
                        }
                        while (i14 < r4) {
                            if (aVar6.f16286c == i13) {
                                aVar6.f16286c = 2;
                                aVar6.i();
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    }
                }
                i11 = 0;
            } else {
                i11 = 0;
                if (i18 == 3) {
                    if (!(this.f17417p.length > 0 ? z13 : j15 == -9223372036854775807L || this.f17412k.f17394c < j15 || ((hVar7 = this.B.f17383k) != null && hVar7.f17381i))) {
                        this.f17420s = this.f17419r;
                        i12 = 2;
                        a(2);
                        g();
                    }
                }
                if (this.f17422u == i12) {
                    aVarArr4 = this.f17417p;
                    length = aVarArr4.length;
                    while (i15 < length) {
                        aVarArr4[i15].f16287d.a();
                    }
                }
                if (!this.f17419r) {
                    if (this.f17417p.length != 0) {
                        a(jElapsedRealtime, 1000L);
                    } else {
                        this.f17407f.removeMessages(2);
                    }
                } else if (this.f17417p.length != 0) {
                    a(jElapsedRealtime, 1000L);
                } else {
                    this.f17407f.removeMessages(2);
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
            }
            i12 = 2;
            if (this.f17422u == i12) {
                aVarArr4 = this.f17417p;
                length = aVarArr4.length;
                while (i15 < length) {
                    aVarArr4[i15].f16287d.a();
                }
            }
            if (!this.f17419r) {
                if (this.f17417p.length != 0) {
                    a(jElapsedRealtime, 1000L);
                } else {
                    this.f17407f.removeMessages(2);
                }
            } else if (this.f17417p.length != 0) {
                a(jElapsedRealtime, 1000L);
            } else {
                this.f17407f.removeMessages(2);
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
        }
        i12 = 2;
        i11 = 0;
        if (this.f17422u == i12) {
            aVarArr4 = this.f17417p;
            length = aVarArr4.length;
            while (i15 < length) {
                aVarArr4[i15].f16287d.a();
            }
        }
        if (!this.f17419r) {
            if (this.f17417p.length != 0) {
                a(jElapsedRealtime, 1000L);
            } else {
                this.f17407f.removeMessages(2);
            }
        } else if (this.f17417p.length != 0) {
            a(jElapsedRealtime, 1000L);
        } else {
            this.f17407f.removeMessages(2);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
    }

    public final void c() {
        h hVar = this.f17427z;
        if (hVar == null || hVar.f17381i) {
            return;
        }
        h hVar2 = this.A;
        if (hVar2 == null || hVar2.f17383k == hVar) {
            for (a aVar : this.f17417p) {
                if (!aVar.f16289f) {
                    return;
                }
            }
            this.f17427z.f17373a.d();
        }
    }

    public final void b() {
        char c10;
        int i10;
        h hVar = this.f17427z;
        long jF = !hVar.f17381i ? 0L : hVar.f17373a.f();
        if (jF == Long.MIN_VALUE) {
            b(false);
            return;
        }
        h hVar2 = this.f17427z;
        long jAbs = Math.abs(this.f17426y - (hVar2.f17377e - hVar2.f17379g));
        long j10 = jF - jAbs;
        c cVar = this.f17405d;
        if (j10 > cVar.f16418c) {
            c10 = 0;
        } else {
            c10 = j10 < cVar.f16417b ? (char) 2 : (char) 1;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = cVar.f16416a;
        synchronized (lVar) {
            i10 = lVar.f17755c * 65536;
        }
        boolean z10 = c10 == 2 || (c10 == 1 && cVar.f16422g && !(i10 >= cVar.f16421f));
        cVar.f16422g = z10;
        b(z10);
        if (z10) {
            h hVar3 = this.f17427z;
            hVar3.f17384l = false;
            hVar3.f17373a.b(jAbs);
            return;
        }
        this.f17427z.f17384l = true;
    }

    public final void a(long j10, long j11) {
        this.f17407f.removeMessages(2);
        long jElapsedRealtime = (j10 + j11) - SystemClock.elapsedRealtime();
        if (jElapsedRealtime <= 0) {
            this.f17407f.sendEmptyMessage(2);
        } else {
            this.f17407f.sendEmptyMessageDelayed(2, jElapsedRealtime);
        }
    }

    public final long a(int i10, long j10) throws d {
        h hVar;
        g();
        this.f17420s = false;
        a(2);
        h hVar2 = this.B;
        if (hVar2 == null) {
            h hVar3 = this.f17427z;
            if (hVar3 != null) {
                hVar3.a();
            }
            hVar = null;
        } else {
            hVar = null;
            while (hVar2 != null) {
                if (hVar2.f17378f == i10 && hVar2.f17381i) {
                    hVar = hVar2;
                } else {
                    hVar2.a();
                }
                hVar2 = hVar2.f17383k;
            }
        }
        h hVar4 = this.B;
        if (hVar4 != hVar || hVar4 != this.A) {
            for (a aVar : this.f17417p) {
                aVar.c();
            }
            this.f17417p = new a[0];
            this.f17415n = null;
            this.f17414m = null;
            this.B = null;
        }
        if (hVar != null) {
            hVar.f17383k = null;
            this.f17427z = hVar;
            this.A = hVar;
            a(hVar);
            h hVar5 = this.B;
            if (hVar5.f17382j) {
                j10 = hVar5.f17373a.a(j10);
            }
            a(j10);
            b();
        } else {
            this.f17427z = null;
            this.A = null;
            this.B = null;
            a(j10);
        }
        this.f17407f.sendEmptyMessage(2);
        return j10;
    }

    public final void a(long j10) {
        h hVar = this.B;
        long j11 = hVar == null ? j10 + 60000000 : j10 + (hVar.f17377e - hVar.f17379g);
        this.f17426y = j11;
        this.f17406e.a(j11);
        for (a aVar : this.f17417p) {
            long j12 = this.f17426y;
            aVar.f16290g = false;
            aVar.f16289f = false;
            aVar.a(false, j12);
        }
    }

    public final void a(s sVar) {
        s sVarA;
        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar = this.f17415n;
        if (hVar != null) {
            sVarA = hVar.a(sVar);
        } else {
            sVarA = this.f17406e.a(sVar);
        }
        this.f17413l = sVarA;
        this.f17409h.obtainMessage(7, sVarA).sendToTarget();
    }

    public final void a(boolean z10) {
        this.f17407f.removeMessages(2);
        this.f17420s = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f17406e;
        if (uVar.f17865a) {
            uVar.a(uVar.b());
            uVar.f17865a = false;
        }
        this.f17415n = null;
        this.f17414m = null;
        this.f17426y = 60000000L;
        for (a aVar : this.f17417p) {
            try {
                a(aVar);
                aVar.c();
            } catch (d | RuntimeException e10) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e10);
            }
        }
        this.f17417p = new a[0];
        h hVar = this.B;
        if (hVar == null) {
            hVar = this.f17427z;
        }
        while (hVar != null) {
            hVar.a();
            hVar = hVar.f17383k;
        }
        this.f17427z = null;
        this.A = null;
        this.B = null;
        b(false);
        if (z10) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar2 = this.f17416o;
            if (uVar2 != null) {
                uVar2.b();
                this.f17416o = null;
            }
            this.C = null;
        }
    }

    public final void a(e[] eVarArr) {
        try {
            for (e eVar : eVarArr) {
                eVar.f16443a.a(eVar.f16444b, eVar.f16445c);
            }
            if (this.f17416o != null) {
                this.f17407f.sendEmptyMessage(2);
            }
            synchronized (this) {
                notifyAll();
            }
        } catch (Throwable th2) {
            synchronized (this) {
                notifyAll();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.fyber.inneractive.sdk.player.exoplayer2.x] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.fyber.inneractive.sdk.player.exoplayer2.l] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.fyber.inneractive.sdk.player.exoplayer2.x] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(Pair pair) {
        ?? r10;
        x xVar = this.C;
        x xVar2 = (x) pair.first;
        this.C = xVar2;
        Object obj = pair.second;
        int i10 = 6;
        ?? r11 = 0;
        if (xVar != null) {
            r10 = r11;
        } else if (this.f17424w > 0) {
            Pair pairA = a(this.f17425x);
            int i11 = this.f17424w;
            this.f17424w = 0;
            this.f17425x = null;
            if (pairA == null) {
                i iVar = new i(0, 0L);
                this.f17412k = iVar;
                this.f17409h.obtainMessage(6, new k(this.C, obj, iVar, i11)).sendToTarget();
                this.f17412k = new i(0, -9223372036854775807L);
                a(4);
                a(false);
                return;
            }
            this.f17412k = new i(((Integer) pairA.first).intValue(), ((Long) pairA.second).longValue());
            r10 = i11;
            i10 = 6;
            r11 = 0;
        } else {
            if (this.f17412k.f17393b == -9223372036854775807L) {
                if (xVar2.c()) {
                    i iVar2 = new i(0, 0L);
                    this.f17412k = iVar2;
                    this.f17409h.obtainMessage(6, new k(this.C, obj, iVar2, 0)).sendToTarget();
                    this.f17412k = new i(0, -9223372036854775807L);
                    a(4);
                    a(false);
                    return;
                }
                Pair pairA2 = a(this.C, 0, -9223372036854775807L, 0L);
                this.f17412k = new i(((Integer) pairA2.first).intValue(), ((Long) pairA2.second).longValue());
            }
            r10 = r11;
        }
        h hVar = this.B;
        if (hVar == null) {
            hVar = this.f17427z;
        }
        h hVar2 = hVar;
        if (hVar2 == null) {
            this.f17409h.obtainMessage(i10, new k(this.C, obj, this.f17412k, r10)).sendToTarget();
            return;
        }
        int iA = this.C.a(hVar2.f17374b);
        if (iA == -1) {
            int i12 = hVar2.f17378f;
            x xVar3 = this.C;
            int iA2 = -1;
            while (iA2 == -1 && i12 < xVar.a() - 1) {
                i12++;
                iA2 = xVar3.a(xVar.a(i12, this.f17411j, true).f17882b);
            }
            if (iA2 == -1) {
                i iVar3 = new i(r11, 0L);
                this.f17412k = iVar3;
                this.f17409h.obtainMessage(i10, new k(this.C, obj, iVar3, r10)).sendToTarget();
                this.f17412k = new i(r11, -9223372036854775807L);
                a(4);
                a(r11);
                return;
            }
            int i13 = this.C.a(iA2, this.f17411j, r11).f17883c;
            Pair pairA3 = a(this.C, 0, -9223372036854775807L, 0L);
            int iIntValue = ((Integer) pairA3.first).intValue();
            long jLongValue = ((Long) pairA3.second).longValue();
            this.C.a(iIntValue, this.f17411j, true);
            Object obj2 = this.f17411j.f17882b;
            hVar2.f17378f = -1;
            while (true) {
                hVar2 = hVar2.f17383k;
                if (hVar2 != null) {
                    hVar2.f17378f = hVar2.f17374b.equals(obj2) ? iIntValue : -1;
                } else {
                    i iVar4 = new i(iIntValue, a(iIntValue, jLongValue));
                    this.f17412k = iVar4;
                    this.f17409h.obtainMessage(i10, new k(this.C, obj, iVar4, r10)).sendToTarget();
                    return;
                }
            }
        } else {
            this.C.a(iA, this.f17411j, r11);
            ?? r12 = (iA != this.C.a() - 1 || this.C.a(this.f17411j.f17883c, this.f17410i, 0L).f17956b) ? r11 : 1;
            hVar2.f17378f = iA;
            hVar2.f17380h = r12;
            ?? r13 = hVar2 == this.A ? 1 : r11;
            i iVar5 = this.f17412k;
            if (iA != iVar5.f17392a) {
                i iVar6 = new i(iA, iVar5.f17393b);
                iVar6.f17394c = iVar5.f17394c;
                this.f17412k = iVar6;
            }
            while (true) {
                h hVar3 = hVar2.f17383k;
                if (hVar3 == null) {
                    break;
                }
                iA++;
                this.C.a(iA, this.f17411j, true);
                ?? r14 = (iA != this.C.a() - 1 || this.C.a(this.f17411j.f17883c, this.f17410i, 0L).f17956b) ? r11 : 1;
                if (!hVar3.f17374b.equals(this.f17411j.f17882b)) {
                    if (r13 == 0) {
                        int i14 = this.B.f17378f;
                        this.f17412k = new i(i14, a(i14, this.f17412k.f17394c));
                        break;
                    }
                    this.f17427z = hVar2;
                    hVar2.f17383k = null;
                    while (hVar3 != null) {
                        hVar3.a();
                        hVar3 = hVar3.f17383k;
                    }
                    break;
                }
                hVar3.f17378f = iA;
                hVar3.f17380h = r14;
                r13 |= hVar3 == this.A ? 1 : r11;
                hVar2 = hVar3;
            }
            this.f17409h.obtainMessage(i10, new k(this.C, obj, this.f17412k, r10)).sendToTarget();
        }
    }

    public final Pair a(j jVar) {
        x xVar = jVar.f17395a;
        if (xVar.c()) {
            xVar = this.C;
        }
        try {
            Pair pairA = a(xVar, jVar.f17396b, jVar.f17397c, 0L);
            x xVar2 = this.C;
            if (xVar2 == xVar) {
                return pairA;
            }
            int iA = xVar2.a(xVar.a(((Integer) pairA.first).intValue(), this.f17411j, true).f17882b);
            if (iA != -1) {
                return Pair.create(Integer.valueOf(iA), (Long) pairA.second);
            }
            int iIntValue = ((Integer) pairA.first).intValue();
            x xVar3 = this.C;
            int iA2 = -1;
            while (iA2 == -1 && iIntValue < xVar.a() - 1) {
                iIntValue++;
                iA2 = xVar3.a(xVar.a(iIntValue, this.f17411j, true).f17882b);
            }
            if (iA2 == -1) {
                return null;
            }
            int i10 = this.C.a(iA2, this.f17411j, false).f17883c;
            return a(this.C, 0, -9223372036854775807L, 0L);
        } catch (IndexOutOfBoundsException unused) {
            throw new q();
        }
    }

    public final Pair a(x xVar, int i10, long j10, long j11) {
        int iB = xVar.b();
        if (i10 >= 0 && i10 < iB) {
            xVar.a(i10, this.f17410i, j11);
            if (j10 == -9223372036854775807L) {
                j10 = this.f17410i.f17959e;
                if (j10 == -9223372036854775807L) {
                    return null;
                }
            }
            w wVar = this.f17410i;
            int i11 = wVar.f17957c;
            long j12 = wVar.f17961g + j10;
            long j13 = xVar.a(i11, this.f17411j, false).f17884d;
            while (j13 != -9223372036854775807L && j12 >= j13 && i11 < this.f17410i.f17958d) {
                j12 -= j13;
                i11++;
                j13 = xVar.a(i11, this.f17411j, false).f17884d;
            }
            return Pair.create(Integer.valueOf(i11), Long.valueOf(j12));
        }
        throw new IndexOutOfBoundsException();
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar) throws d {
        com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar2;
        h hVar = this.f17427z;
        if (hVar == null || (sVar2 = hVar.f17373a) != sVar) {
            return;
        }
        hVar.f17381i = true;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVarA = hVar.f17388p.a(hVar.f17387o, sVar2.a());
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar.f17391s;
        if (jVar != null) {
            for (int i10 = 0; i10 < jVarA.f17649b.f17645a; i10++) {
                if (!jVarA.a(jVar, i10)) {
                    hVar.f17385m = jVarA;
                    break;
                }
            }
        } else {
            hVar.f17385m = jVarA;
            break;
        }
        hVar.f17379g = hVar.a(hVar.f17379g, false, new boolean[hVar.f17386n.length]);
        if (this.B == null) {
            h hVar2 = this.f17427z;
            this.A = hVar2;
            a(hVar2.f17379g);
            a(this.A);
        }
        b();
    }

    public final void a(h hVar) throws d {
        if (this.B == hVar) {
            return;
        }
        boolean[] zArr = new boolean[this.f17402a.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f17402a;
            if (i10 < aVarArr.length) {
                a aVar = aVarArr[i10];
                boolean z10 = aVar.f16286c != 0;
                zArr[i10] = z10;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = hVar.f17385m.f17649b.f17646b[i10];
                if (bVar != null) {
                    i11++;
                }
                if (z10 && (bVar == null || (aVar.f16290g && aVar.f16287d == this.B.f17375c[i10]))) {
                    if (aVar == this.f17414m) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f17406e;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar2 = this.f17415n;
                        uVar.getClass();
                        uVar.a(hVar2.b());
                        uVar.f17868d = hVar2.a();
                        this.f17415n = null;
                        this.f17414m = null;
                    }
                    a(aVar);
                    aVar.c();
                }
                i10++;
            } else {
                this.B = hVar;
                this.f17409h.obtainMessage(3, hVar.f17385m).sendToTarget();
                a(zArr, i11);
                return;
            }
        }
    }

    public final void a(boolean[] zArr, int i10) throws d {
        int i11;
        this.f17417p = new a[i10];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            a[] aVarArr = this.f17402a;
            if (i12 >= aVarArr.length) {
                return;
            }
            a aVar = aVarArr[i12];
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = this.B.f17385m;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = jVar.f17649b.f17646b[i12];
            if (bVar != null) {
                int i14 = i13 + 1;
                this.f17417p[i13] = aVar;
                if (aVar.f16286c == 0) {
                    t tVar = jVar.f17651d[i12];
                    boolean z10 = this.f17419r && this.f17422u == 3;
                    boolean z11 = !zArr[i12] && z10;
                    int length = bVar.f17638c.length;
                    o[] oVarArr = new o[length];
                    for (int i15 = 0; i15 < length; i15++) {
                        oVarArr[i15] = bVar.f17639d[i15];
                    }
                    h hVar = this.B;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = hVar.f17375c[i12];
                    long j10 = this.f17426y;
                    i11 = i12;
                    long j11 = hVar.f17377e - hVar.f17379g;
                    if (aVar.f16286c == 0) {
                        aVar.f16285b = tVar;
                        aVar.f16286c = 1;
                        aVar.h();
                        if (!aVar.f16290g) {
                            aVar.f16287d = vVar;
                            aVar.f16289f = false;
                            aVar.f16288e = j11;
                            aVar.a(oVarArr);
                            aVar.a(z11, j10);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.h hVarD = aVar.d();
                            if (hVarD != null) {
                                if (this.f17415n == null) {
                                    this.f17415n = hVarD;
                                    this.f17414m = aVar;
                                    ((MediaCodecAudioRenderer) hVarD).Q.a(this.f17413l);
                                } else {
                                    throw new d(new IllegalStateException("Multiple renderer media clocks enabled."));
                                }
                            }
                            if (z10) {
                                if (aVar.f16286c == 1) {
                                    aVar.f16286c = 2;
                                    aVar.i();
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    i11 = i12;
                }
                i13 = i14;
            } else {
                i11 = i12;
            }
            i12 = i11 + 1;
        }
    }
}
