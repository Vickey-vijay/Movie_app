package yads;

import android.graphics.drawable.Drawable;
import androidx.work.Data;

/* JADX INFO: loaded from: classes7.dex */
public final class vj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tj0 f83940a = new tj0(ik.k.g(((int) (Runtime.getRuntime().maxMemory() / ((long) 1024))) / 8, Data.MAX_DATA_BYTES));

    public final uj0 a(String str) {
        return (uj0) this.f83940a.get(str);
    }

    public final void a(String str, Drawable drawable, s41 s41Var) {
        this.f83940a.put(str, new uj0(drawable, s41Var));
    }
}
