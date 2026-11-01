package yads;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: loaded from: classes.dex */
public final class t82 implements h41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f82922a;

    public final Bitmap a(String str) {
        return (Bitmap) this.f82922a.get(str);
    }

    public final void a(String str, Bitmap bitmap) {
        this.f82922a.put(str, bitmap);
    }

    public t82(v82 v82Var) {
        this.f82922a = v82Var;
    }
}
