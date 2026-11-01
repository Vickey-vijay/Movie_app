package im;

import java.io.IOException;
import mm.j;
import mm.k;
import org.eclipse.jetty.io.Buffers;

/* JADX INFO: compiled from: AsyncHttpConnection.java */
/* JADX INFO: loaded from: classes9.dex */
public class c extends a implements om.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final zm.c f54247t = zm.b.a(c.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f54248q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public mm.d f54249r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mm.c f54250s;

    /* JADX WARN: Code duplicated, block: B:125:0x01fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x0291 A[Catch: all -> 0x02a8, TryCatch #4 {, blocks: (B:126:0x0200, B:128:0x0208, B:130:0x0210, B:132:0x0216, B:134:0x021e, B:135:0x0225, B:163:0x028d, B:165:0x0291, B:167:0x0295, B:169:0x0299, B:170:0x029b, B:171:0x029c, B:172:0x02a1, B:173:0x02a2, B:174:0x02a4, B:175:0x02a5, B:176:0x02a7), top: B:250:0x0200, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0295 A[Catch: all -> 0x02a8, TryCatch #4 {, blocks: (B:126:0x0200, B:128:0x0208, B:130:0x0210, B:132:0x0216, B:134:0x021e, B:135:0x0225, B:163:0x028d, B:165:0x0291, B:167:0x0295, B:169:0x0299, B:170:0x029b, B:171:0x029c, B:172:0x02a1, B:173:0x02a2, B:174:0x02a4, B:175:0x02a5, B:176:0x02a7), top: B:250:0x0200, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0299 A[Catch: all -> 0x02a8, TryCatch #4 {, blocks: (B:126:0x0200, B:128:0x0208, B:130:0x0210, B:132:0x0216, B:134:0x021e, B:135:0x0225, B:163:0x028d, B:165:0x0291, B:167:0x0295, B:169:0x0299, B:170:0x029b, B:171:0x029c, B:172:0x02a1, B:173:0x02a2, B:174:0x02a4, B:175:0x02a5, B:176:0x02a7), top: B:250:0x0200, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x029c A[Catch: all -> 0x02a8, TryCatch #4 {, blocks: (B:126:0x0200, B:128:0x0208, B:130:0x0210, B:132:0x0216, B:134:0x021e, B:135:0x0225, B:163:0x028d, B:165:0x0291, B:167:0x0295, B:169:0x0299, B:170:0x029b, B:171:0x029c, B:172:0x02a1, B:173:0x02a2, B:174:0x02a4, B:175:0x02a5, B:176:0x02a7), top: B:250:0x0200, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x02a2 A[Catch: all -> 0x02a8, TryCatch #4 {, blocks: (B:126:0x0200, B:128:0x0208, B:130:0x0210, B:132:0x0216, B:134:0x021e, B:135:0x0225, B:163:0x028d, B:165:0x0291, B:167:0x0295, B:169:0x0299, B:170:0x029b, B:171:0x029c, B:172:0x02a1, B:173:0x02a2, B:174:0x02a4, B:175:0x02a5, B:176:0x02a7), top: B:250:0x0200, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x02a5 A[Catch: all -> 0x02a8, TryCatch #4 {, blocks: (B:126:0x0200, B:128:0x0208, B:130:0x0210, B:132:0x0216, B:134:0x021e, B:135:0x0225, B:163:0x028d, B:165:0x0291, B:167:0x0295, B:169:0x0299, B:170:0x029b, B:171:0x029c, B:172:0x02a1, B:173:0x02a2, B:174:0x02a4, B:175:0x02a5, B:176:0x02a7), top: B:250:0x0200, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x028d A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // mm.j
    public j e() throws IOException {
        boolean z10;
        j jVarJ;
        j jVarJ2;
        j jVarJ3;
        j jVar = this;
        boolean z11 = false;
        for (boolean z12 = true; z12 && jVar == this; z12 = z10) {
            try {
                zm.c cVar = f54247t;
                cVar.i("while open={} more={} progress={}", Boolean.valueOf(this.f64595c.isOpen()), Boolean.valueOf(this.f54231g.i()), Boolean.valueOf(z12));
                i iVar = this.f54236l;
                cVar.i("exchange {} on {}", iVar, this);
                try {
                    if (this.f54230f.a() || iVar == null || iVar.s() != 2) {
                        z10 = false;
                    } else {
                        cVar.i("commit {}", iVar);
                        try {
                            m();
                            z10 = true;
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = true;
                            try {
                                zm.c cVar2 = f54247t;
                                cVar2.d("Failure on " + this.f54236l, th);
                                try {
                                    synchronized (this) {
                                        if (iVar != null) {
                                            if (!(th instanceof IOException)) {
                                                throw ((IOException) th);
                                            }
                                            if (!(th instanceof Error)) {
                                                throw ((Error) th);
                                            }
                                            if (th instanceof RuntimeException) {
                                                throw ((RuntimeException) th);
                                            }
                                            throw new RuntimeException(th);
                                        }
                                        if (iVar.s() != 10) {
                                            iVar.k().f(th);
                                        }
                                        cVar2.i("finally {} on {} progress={} {}", iVar, this, Boolean.valueOf(z10), this.f64595c);
                                        this.f54230f.r(false);
                                        q();
                                        synchronized (this) {
                                            i iVar2 = this.f54236l;
                                            this.f54236l = null;
                                            if (iVar2 != null) {
                                                iVar2.f(this.f54229e.h());
                                            }
                                            if (this.f54233i == 101 && (jVarJ2 = iVar2.J(this.f64595c)) != null) {
                                                i iVar3 = this.f54237m;
                                                if (iVar3 != null) {
                                                    this.f54229e.v(iVar3);
                                                }
                                                this.f54237m = null;
                                                jVar = jVarJ2;
                                            }
                                            i iVar4 = this.f54237m;
                                            if (iVar4 != null) {
                                                this.f54229e.v(iVar4);
                                                this.f54237m = null;
                                            }
                                            if (this.f54236l == null && !o()) {
                                                this.f54229e.s(this, true);
                                            }
                                        }
                                        this.f54231g.q();
                                        this.f54230f.q();
                                        f54247t.i("unhandle {} on {}", this.f54236l, this.f64595c);
                                        throw th;
                                    }
                                    z11 = true;
                                } catch (Throwable th3) {
                                    th = th3;
                                    z11 = true;
                                    f54247t.i("finally {} on {} progress={} {}", iVar, this, Boolean.valueOf(z10), this.f64595c);
                                    if (z11 || (this.f54230f.isComplete() && this.f54231g.isComplete())) {
                                        boolean z13 = !z11 && this.f54231g.s() && this.f54230f.s();
                                        this.f54230f.r(z13);
                                        q();
                                        if (z13) {
                                            this.f64595c.q((int) this.f54229e.h().D0());
                                        }
                                        synchronized (this) {
                                            i iVar5 = this.f54236l;
                                            this.f54236l = null;
                                            if (iVar5 != null) {
                                                iVar5.f(this.f54229e.h());
                                            }
                                            if (this.f54233i == 101 && (jVarJ = iVar5.J(this.f64595c)) != null) {
                                                i iVar6 = this.f54237m;
                                                if (iVar6 != null) {
                                                    this.f54229e.v(iVar6);
                                                }
                                                this.f54237m = null;
                                                jVar = jVarJ;
                                            }
                                            i iVar7 = this.f54237m;
                                            if (iVar7 != null) {
                                                if (z13 && jVar == this) {
                                                    this.f54236l = iVar7;
                                                } else {
                                                    this.f54229e.v(iVar7);
                                                }
                                                this.f54237m = null;
                                            }
                                            if (this.f54236l == null && !o()) {
                                                this.f54229e.s(this, !z13);
                                            }
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                    try {
                        if (this.f54230f.a() && !this.f54230f.isComplete()) {
                            if (this.f54230f.z() > 0) {
                                cVar.i("flushed", new Object[0]);
                                z10 = true;
                            }
                            if (this.f54230f.k(2)) {
                                if (this.f54249r == null) {
                                    this.f54249r = iVar.n(null);
                                }
                                if (this.f54249r == null) {
                                    cVar.i("complete {}", iVar);
                                    this.f54230f.complete();
                                    if (iVar.s() < 4) {
                                        iVar.Y(4);
                                    }
                                } else if (this.f54230f.D()) {
                                    cVar.i("addChunk", new Object[0]);
                                    mm.d dVar = this.f54249r;
                                    mm.d dVarN = iVar.n(null);
                                    this.f54249r = dVarN;
                                    this.f54230f.t(dVar, dVarN == null);
                                    if (this.f54249r == null) {
                                        iVar.Y(4);
                                    }
                                }
                                z10 = true;
                            }
                        }
                        if (this.f54230f.isComplete() && !this.f54248q) {
                            cVar.i("requestComplete {}", iVar);
                            this.f54248q = true;
                            iVar.k().onRequestComplete();
                            z10 = true;
                        }
                        if (!this.f54231g.isComplete() && this.f54231g.a()) {
                            cVar.i("parsed {}", iVar);
                            z10 = true;
                        }
                        this.f64595c.flush();
                        if (this.f54250s.m()) {
                            cVar.i("hasProgressed {}", iVar);
                            z10 = true;
                        }
                        cVar.i("finally {} on {} progress={} {}", iVar, this, Boolean.valueOf(z10), this.f64595c);
                        if (z11 || (this.f54230f.isComplete() && this.f54231g.isComplete())) {
                            boolean z14 = !z11 && this.f54231g.s() && this.f54230f.s();
                            this.f54230f.r(z14);
                            q();
                            if (z14) {
                                this.f64595c.q((int) this.f54229e.h().D0());
                            }
                            synchronized (this) {
                                i iVar8 = this.f54236l;
                                this.f54236l = null;
                                if (iVar8 != null) {
                                    iVar8.f(this.f54229e.h());
                                }
                                if (this.f54233i == 101 && (jVarJ3 = iVar8.J(this.f64595c)) != null) {
                                    i iVar9 = this.f54237m;
                                    if (iVar9 != null) {
                                        this.f54229e.v(iVar9);
                                    }
                                    this.f54237m = null;
                                    jVar = jVarJ3;
                                }
                                i iVar10 = this.f54237m;
                                if (iVar10 != null) {
                                    if (z14 && jVar == this) {
                                        this.f54236l = iVar10;
                                    } else {
                                        this.f54229e.v(iVar10);
                                    }
                                    this.f54237m = null;
                                }
                                if (this.f54236l == null && !o()) {
                                    this.f54229e.s(this, !z14);
                                }
                            }
                        } else {
                            continue;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        zm.c cVar3 = f54247t;
                        cVar3.d("Failure on " + this.f54236l, th);
                        synchronized (this) {
                            if (iVar != null) {
                                if (!(th instanceof IOException)) {
                                    throw ((IOException) th);
                                }
                                if (!(th instanceof Error)) {
                                    throw ((Error) th);
                                }
                                if (th instanceof RuntimeException) {
                                    throw ((RuntimeException) th);
                                }
                                throw new RuntimeException(th);
                            }
                            if (iVar.s() != 10 && iVar.s() != 11 && !iVar.w() && iVar.Y(9)) {
                                iVar.k().f(th);
                            }
                            this.f54231g.q();
                            this.f54230f.q();
                            f54247t.i("unhandle {} on {}", this.f54236l, this.f64595c);
                            throw th;
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    z10 = false;
                }
            } catch (Throwable th7) {
                this.f54231g.q();
                this.f54230f.q();
                f54247t.i("unhandle {} on {}", this.f54236l, this.f64595c);
                throw th7;
            }
        }
        this.f54231g.q();
        this.f54230f.q();
        f54247t.i("unhandle {} on {}", this.f54236l, this.f64595c);
        return jVar;
    }

    @Override // im.a
    public void q() throws IOException {
        this.f54248q = false;
        super.q();
    }

    @Override // om.a
    public void c() throws IOException {
        if (this.f54230f.p()) {
            this.f64595c.l();
        }
    }

    public c(Buffers buffers, Buffers buffers2, k kVar) {
        super(buffers, buffers2, kVar);
        this.f54250s = (mm.c) kVar;
    }

    @Override // im.a
    public boolean r(i iVar) throws IOException {
        boolean zR = super.r(iVar);
        if (zR) {
            this.f54250s.v();
        }
        return zR;
    }
}
