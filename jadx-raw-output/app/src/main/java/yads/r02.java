package yads;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class r02 implements d51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s02 f82064a;

    @Override // yads.d51
    public final void a(String str, Bitmap bitmap) {
    }

    public r02(s02 s02Var) {
        this.f82064a = s02Var;
    }

    @Override // yads.d51
    public final void a(Map map) {
        this.f82064a.f82483b.f80183b.putAll(map);
        this.f82064a.f82484c.a();
        Iterator it = this.f82064a.f82488g.iterator();
        while (it.hasNext()) {
            ((b10) it.next()).onFinishLoadingImages();
        }
    }
}
