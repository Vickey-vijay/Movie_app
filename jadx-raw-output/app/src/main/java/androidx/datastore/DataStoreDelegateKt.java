package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import bk.l;
import ck.p;
import com.ironsource.Y5;
import fk.c;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.d;
import nj.s;
import nk.j2;
import nk.l0;
import nk.w0;

/* JADX INFO: compiled from: DataStoreDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ar\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t0\u00072\b\b\u0002\u0010\r\u001a\u00020\f¨\u0006\u0011"}, d2 = {"T", "", Y5.c.f27928b, "Landroidx/datastore/core/Serializer;", "serializer", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Landroidx/datastore/core/DataMigration;", "produceMigrations", "Lnk/l0;", "scope", "Lfk/c;", "Landroidx/datastore/core/DataStore;", "dataStore", "datastore_release"}, k = 2, mv = {1, 5, 1})
public final class DataStoreDelegateKt {
    public static final <T> c<Context, DataStore<T>> dataStore(String str, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, l<? super Context, ? extends List<? extends DataMigration<T>>> lVar, l0 l0Var) {
        p.j(str, Y5.c.f27928b);
        p.j(serializer, "serializer");
        p.j(lVar, "produceMigrations");
        p.j(l0Var, "scope");
        return new DataStoreSingletonDelegate(str, serializer, replaceFileCorruptionHandler, lVar, l0Var);
    }

    public static /* synthetic */ c dataStore$default(String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, l lVar, l0 l0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i10 & 8) != 0) {
            lVar = new l() { // from class: androidx.datastore.DataStoreDelegateKt.dataStore.1
                @Override // bk.l
                public final List invoke(Context context) {
                    p.j(context, "it");
                    return s.k();
                }
            };
        }
        if ((i10 & 16) != 0) {
            l0Var = d.a(w0.b().plus(j2.b(null, 1, null)));
        }
        return dataStore(str, serializer, replaceFileCorruptionHandler, lVar, l0Var);
    }
}
