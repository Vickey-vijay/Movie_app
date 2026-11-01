package yads;

import android.util.LruCache;

/* JADX INFO: loaded from: classes11.dex */
public final class gp0 extends LruCache {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        p52 p52Var = (p52) obj2;
        if (p52Var != null) {
            p52Var.a();
        }
    }

    public gp0(int i10) {
        super(i10);
    }
}
