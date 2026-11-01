package yads;

import yads.u30;
import yads.yr;

/* JADX INFO: loaded from: classes11.dex */
public interface yr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yr f85093a = new yr() { // from class: cp.uc
        @Override // yads.yr
        public final String a(u30 u30Var) {
            return yr.b(u30Var);
        }
    };

    String a(u30 u30Var);

    static /* synthetic */ String b(u30 u30Var) {
        String str = u30Var.f83348h;
        return str != null ? str : u30Var.f83341a.toString();
    }
}
