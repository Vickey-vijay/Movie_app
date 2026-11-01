package q6;

import com.google.zxing.NotFoundException;
import y5.j;

/* JADX INFO: compiled from: BoundingBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6.b f66530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f66531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f66532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f66533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f66534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f66535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f66536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f66537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f66538i;

    public c(c6.b bVar, j jVar, j jVar2, j jVar3, j jVar4) throws NotFoundException {
        boolean z10 = jVar == null || jVar2 == null;
        boolean z11 = jVar3 == null || jVar4 == null;
        if (z10 && z11) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z10) {
            jVar = new j(0.0f, jVar3.d());
            jVar2 = new j(0.0f, jVar4.d());
        } else if (z11) {
            jVar3 = new j(bVar.j() - 1, jVar.d());
            jVar4 = new j(bVar.j() - 1, jVar2.d());
        }
        this.f66530a = bVar;
        this.f66531b = jVar;
        this.f66532c = jVar2;
        this.f66533d = jVar3;
        this.f66534e = jVar4;
        this.f66535f = (int) Math.min(jVar.c(), jVar2.c());
        this.f66536g = (int) Math.max(jVar3.c(), jVar4.c());
        this.f66537h = (int) Math.min(jVar.d(), jVar3.d());
        this.f66538i = (int) Math.max(jVar2.d(), jVar4.d());
    }

    public static c j(c cVar, c cVar2) throws NotFoundException {
        if (cVar == null) {
            return cVar2;
        }
        return cVar2 == null ? cVar : new c(cVar.f66530a, cVar.f66531b, cVar.f66532c, cVar2.f66533d, cVar2.f66534e);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    public c a(int i10, int i11, boolean z10) throws NotFoundException {
        j jVar;
        j jVar2;
        j jVar3;
        j jVar4;
        j jVar5;
        int iD;
        j jVar6;
        j jVar7 = this.f66531b;
        j jVar8 = this.f66532c;
        j jVar9 = this.f66533d;
        j jVar10 = this.f66534e;
        if (i10 > 0) {
            j jVar11 = z10 ? jVar7 : jVar9;
            int iD2 = ((int) jVar11.d()) - i10;
            if (iD2 < 0) {
                iD2 = 0;
            }
            j jVar12 = new j(jVar11.c(), iD2);
            if (z10) {
                jVar = jVar12;
            } else {
                jVar2 = jVar12;
                jVar = jVar7;
            }
            if (i11 > 0) {
                if (z10) {
                    jVar5 = this.f66532c;
                } else {
                    jVar5 = this.f66534e;
                }
                iD = ((int) jVar5.d()) + i11;
                if (iD >= this.f66530a.g()) {
                    iD = this.f66530a.g() - 1;
                }
                jVar6 = new j(jVar5.c(), iD);
                if (z10) {
                    jVar3 = jVar6;
                } else {
                    jVar4 = jVar6;
                    jVar3 = jVar8;
                }
                return new c(this.f66530a, jVar, jVar3, jVar2, jVar4);
            }
            jVar3 = jVar8;
            jVar4 = jVar10;
            return new c(this.f66530a, jVar, jVar3, jVar2, jVar4);
        }
        jVar = jVar7;
        jVar2 = jVar9;
        if (i11 > 0) {
            if (z10) {
                jVar5 = this.f66532c;
            } else {
                jVar5 = this.f66534e;
            }
            iD = ((int) jVar5.d()) + i11;
            if (iD >= this.f66530a.g()) {
                iD = this.f66530a.g() - 1;
            }
            jVar6 = new j(jVar5.c(), iD);
            if (z10) {
                jVar3 = jVar6;
            } else {
                jVar4 = jVar6;
                jVar3 = jVar8;
            }
            return new c(this.f66530a, jVar, jVar3, jVar2, jVar4);
        }
        jVar3 = jVar8;
        jVar4 = jVar10;
        return new c(this.f66530a, jVar, jVar3, jVar2, jVar4);
    }

    public j b() {
        return this.f66532c;
    }

    public j c() {
        return this.f66534e;
    }

    public int d() {
        return this.f66536g;
    }

    public int e() {
        return this.f66538i;
    }

    public int f() {
        return this.f66535f;
    }

    public int g() {
        return this.f66537h;
    }

    public j h() {
        return this.f66531b;
    }

    public j i() {
        return this.f66533d;
    }

    public c(c cVar) {
        this.f66530a = cVar.f66530a;
        this.f66531b = cVar.f66531b;
        this.f66532c = cVar.f66532c;
        this.f66533d = cVar.f66533d;
        this.f66534e = cVar.f66534e;
        this.f66535f = cVar.f66535f;
        this.f66536g = cVar.f66536g;
        this.f66537h = cVar.f66537h;
        this.f66538i = cVar.f66538i;
    }
}
