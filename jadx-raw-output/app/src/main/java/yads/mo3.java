package yads;

import java.util.Comparator;
import yads.mo3;

/* JADX INFO: loaded from: classes7.dex */
public final class mo3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator f80309c = new Comparator() { // from class: cp.m6
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((mo3) obj).f80310a.f80719b, ((mo3) obj2).f80310a.f80719b);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final no3 f80310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80311b;

    public mo3(no3 no3Var, int i10) {
        this.f80310a = no3Var;
        this.f80311b = i10;
    }
}
