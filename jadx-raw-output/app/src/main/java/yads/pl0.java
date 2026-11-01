package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class pl0 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f81446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m73[] f81447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f81449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f81450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f81451f = -9223372036854775807L;

    @Override // yads.ul0
    public final void a(jb2 jb2Var) {
        if (this.f81448c) {
            if (this.f81449d == 2) {
                if (jb2Var.f78968c - jb2Var.f78967b == 0) {
                    return;
                }
                if (jb2Var.m() != 32) {
                    this.f81448c = false;
                }
                this.f81449d--;
                if (!this.f81448c) {
                    return;
                }
            }
            if (this.f81449d == 1) {
                if (jb2Var.f78968c - jb2Var.f78967b == 0) {
                    return;
                }
                if (jb2Var.m() != 0) {
                    this.f81448c = false;
                }
                this.f81449d--;
                if (!this.f81448c) {
                    return;
                }
            }
            int i10 = jb2Var.f78967b;
            int i11 = jb2Var.f78968c - i10;
            for (m73 m73Var : this.f81447b) {
                jb2Var.e(i10);
                m73Var.a(i11, jb2Var);
            }
            this.f81450e += i11;
        }
    }

    @Override // yads.ul0
    public final void b() {
        if (this.f81448c) {
            if (this.f81451f != -9223372036854775807L) {
                for (m73 m73Var : this.f81447b) {
                    m73Var.a(this.f81451f, 1, this.f81450e, 0, null);
                }
            }
            this.f81448c = false;
        }
    }

    public pl0(List list) {
        this.f81446a = list;
        this.f81447b = new m73[list.size()];
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        for (int i10 = 0; i10 < this.f81447b.length; i10++) {
            i93 i93Var = (i93) this.f81446a.get(i10);
            l93Var.a();
            l93Var.b();
            m73 m73VarA = pq0Var.a(l93Var.f79733d, 3);
            lx0 lx0Var = new lx0();
            l93Var.b();
            lx0Var.f79957a = l93Var.f79734e;
            lx0Var.f79967k = "application/dvbsubs";
            lx0Var.f79969m = Collections.singletonList(i93Var.f78533b);
            lx0Var.f79959c = i93Var.f78532a;
            m73VarA.a(new mx0(lx0Var));
            this.f81447b[i10] = m73VarA;
        }
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f81448c = true;
        if (j10 != -9223372036854775807L) {
            this.f81451f = j10;
        }
        this.f81450e = 0;
        this.f81449d = 2;
    }

    @Override // yads.ul0
    public final void a() {
        this.f81448c = false;
        this.f81451f = -9223372036854775807L;
    }
}
