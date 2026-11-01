package ab;

import android.content.Context;
import com.mgs.carparking.widgets.cache.model.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: LoaderFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, d> f3523b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, d> f3524c = new HashMap();

    public synchronized <D> d<D> a(String str, Type type) {
        return b(str, type);
    }

    public final synchronized <D> d<D> b(String str, Type type) {
        d<D> dVarC = c(str, type);
        if (dVarC != null) {
            return dVarC;
        }
        d<D> eVar = null;
        int i10 = a.f3525a[type.ordinal()];
        if (i10 == 1) {
            eVar = new e<>(str, this.f3522a);
            this.f3523b.put(str, eVar);
        } else if (i10 == 2) {
            eVar = new b<>(str, this.f3522a);
            this.f3524c.put(str, eVar);
        }
        return eVar;
    }

    /* JADX INFO: compiled from: LoaderFactory.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3525a;

        static {
            int[] iArr = new int[Type.values().length];
            f3525a = iArr;
            try {
                iArr[Type.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3525a[Type.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final <D> d<D> c(String str, Type type) {
        int i10 = a.f3525a[type.ordinal()];
        if (i10 == 1) {
            return this.f3523b.get(str);
        }
        if (i10 != 2) {
            return null;
        }
        return this.f3524c.get(str);
    }

    public c(Context context) {
        this.f3522a = context.getApplicationContext();
    }
}
