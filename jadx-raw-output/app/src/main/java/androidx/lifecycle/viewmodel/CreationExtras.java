package androidx.lifecycle.viewmodel;

import ck.p;
import com.ironsource.C3426d4;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: CreationExtras.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class CreationExtras {
    private final Map<Key<?>, Object> map = new LinkedHashMap();

    /* JADX INFO: compiled from: CreationExtras.kt */
    public interface Key<T> {
    }

    public abstract <T> T get(Key<T> key);

    /* JADX INFO: compiled from: CreationExtras.kt */
    public static final class Empty extends CreationExtras {
        public static final Empty INSTANCE = new Empty();

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        public <T> T get(Key<T> key) {
            p.j(key, C3426d4.i.W);
            return null;
        }

        private Empty() {
        }
    }

    public final Map<Key<?>, Object> getMap$lifecycle_viewmodel_release() {
        return this.map;
    }
}
