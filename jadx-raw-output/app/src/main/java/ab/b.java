package ab;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: ImageLoader.java */
/* JADX INFO: loaded from: classes10.dex */
public class b<D> extends a<Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set<Object> f3521d;

    public b(String str, Context context) {
        super(str, context);
        if (this.f3521d == null) {
            this.f3521d = new HashSet();
        }
    }
}
