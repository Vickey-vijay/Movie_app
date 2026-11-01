package ik;

import ck.p;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes2.dex */
public class j {
    public static final void a(boolean z10, Number number) {
        p.j(number, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    public static final e<Float> b(float f10, float f11) {
        return new d(f10, f11);
    }
}
