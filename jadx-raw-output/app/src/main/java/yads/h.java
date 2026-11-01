package yads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77989b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f77990c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int i10 = this.f77989b;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int iA = hg0.a(i10);
        if (iA == 0) {
            return true;
        }
        if (iA == 2) {
            return false;
        }
        this.f77989b = 4;
        u23 u23Var = (u23) this;
        int i11 = u23Var.f83337g;
        while (true) {
            int i12 = u23Var.f83337g;
            if (i12 == -1) {
                u23Var.f77989b = 3;
                string = null;
                break;
            }
            int iA2 = u23Var.f83339i.f83730a.a(u23Var.f83334d, i12);
            if (iA2 == -1) {
                iA2 = u23Var.f83334d.length();
                u23Var.f83337g = -1;
            } else {
                u23Var.f83337g = iA2 + 1;
            }
            int i13 = u23Var.f83337g;
            if (i13 == i11) {
                int i14 = i13 + 1;
                u23Var.f83337g = i14;
                if (i14 > u23Var.f83334d.length()) {
                    u23Var.f83337g = -1;
                }
            } else {
                while (i11 < iA2 && u23Var.f83335e.a(u23Var.f83334d.charAt(i11))) {
                    i11++;
                }
                while (iA2 > i11 && u23Var.f83335e.a(u23Var.f83334d.charAt(iA2 - 1))) {
                    iA2--;
                }
                if (!u23Var.f83336f || i11 != iA2) {
                    int i15 = u23Var.f83338h;
                    if (i15 == 1) {
                        iA2 = u23Var.f83334d.length();
                        u23Var.f83337g = -1;
                        while (iA2 > i11 && u23Var.f83335e.a(u23Var.f83334d.charAt(iA2 - 1))) {
                            iA2--;
                        }
                    } else {
                        u23Var.f83338h = i15 - 1;
                    }
                    string = u23Var.f83334d.subSequence(i11, iA2).toString();
                    break;
                }
                i11 = u23Var.f83337g;
            }
        }
        this.f77990c = string;
        if (this.f77989b == 3) {
            return false;
        }
        this.f77989b = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f77989b = 2;
            String str = this.f77990c;
            this.f77990c = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
