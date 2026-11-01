package sg.bigo.ads.controller.a.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes8.dex */
public abstract class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f70401c = r.f70030a.a(30);

    @Nullable
    public static <T extends a> T a(List<T> list) {
        if (k.a((Collection) list)) {
            return null;
        }
        T t10 = (T) k.a((List) list);
        if (t10 != null) {
            t10.f70346d = false;
        }
        return t10;
    }

    public abstract sg.bigo.ads.controller.a.k a(String str);

    public void a(boolean z10) {
    }

    @NonNull
    public String toString() {
        return super.toString();
    }
}
