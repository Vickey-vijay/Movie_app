package yads;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class p90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p90 f81312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s70 f81313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f81315d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p90)) {
            return false;
        }
        p90 p90Var = (p90) obj;
        return ck.p.e(this.f81312a, p90Var.f81312a) && ck.p.e(this.f81313b, p90Var.f81313b) && this.f81314c == p90Var.f81314c && ck.p.e(this.f81315d, p90Var.f81315d);
    }

    public static p90 a(p90 p90Var, p90 p90Var2, s70 s70Var, boolean z10, List list, int i10) {
        if ((i10 & 1) != 0) {
            p90Var2 = p90Var.f81312a;
        }
        if ((i10 & 2) != 0) {
            s70Var = p90Var.f81313b;
        }
        if ((i10 & 4) != 0) {
            z10 = p90Var.f81314c;
        }
        if ((i10 & 8) != 0) {
            list = p90Var.f81315d;
        }
        p90Var.getClass();
        return new p90(p90Var2, s70Var, z10, list);
    }

    public final int hashCode() {
        p90 p90Var = this.f81312a;
        return this.f81315d.hashCode() + ((Boolean.hashCode(this.f81314c) + ((this.f81313b.hashCode() + ((p90Var == null ? 0 : p90Var.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelUiState(prevState=" + this.f81312a + ", destination=" + this.f81313b + ", isLoading=" + this.f81314c + ", uiData=" + this.f81315d + ")";
    }

    public p90(p90 p90Var, s70 s70Var, boolean z10, List list) {
        this.f81312a = p90Var;
        this.f81313b = s70Var;
        this.f81314c = z10;
        this.f81315d = list;
    }
}
