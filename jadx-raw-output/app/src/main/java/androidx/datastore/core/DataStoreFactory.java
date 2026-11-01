package androidx.datastore.core;

import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import bk.a;
import ck.p;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.d;
import nj.r;
import nj.s;
import nk.j2;
import nk.l0;
import nk.w0;

/* JADX INFO: compiled from: DataStoreFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012Jb\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¨\u0006\u0013"}, d2 = {"Landroidx/datastore/core/DataStoreFactory;", "", "T", "Landroidx/datastore/core/Serializer;", "serializer", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "corruptionHandler", "", "Landroidx/datastore/core/DataMigration;", "migrations", "Lnk/l0;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/DataStore;", "create", "<init>", "()V", "datastore-core"}, k = 1, mv = {1, 5, 1})
public final class DataStoreFactory {
    public static final DataStoreFactory INSTANCE = new DataStoreFactory();

    private DataStoreFactory() {
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, a<? extends File> aVar) {
        p.j(serializer, "serializer");
        p.j(aVar, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, aVar, 12, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, a<? extends File> aVar) {
        p.j(serializer, "serializer");
        p.j(list, "migrations");
        p.j(aVar, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, list, null, aVar, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, l0 l0Var, a<? extends File> aVar) {
        p.j(serializer, "serializer");
        p.j(list, "migrations");
        p.j(l0Var, "scope");
        p.j(aVar, "produceFile");
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new SingleProcessDataStore(aVar, serializer, r.e(DataMigrationInitializer.INSTANCE.getInitializer(list)), replaceFileCorruptionHandler, l0Var);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, a<? extends File> aVar) {
        p.j(serializer, "serializer");
        p.j(aVar, "produceFile");
        return create$default(this, serializer, null, null, null, aVar, 14, null);
    }

    public static /* synthetic */ DataStore create$default(DataStoreFactory dataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, l0 l0Var, a aVar, int i10, Object obj) {
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = (i10 & 2) != 0 ? null : replaceFileCorruptionHandler;
        if ((i10 & 4) != 0) {
            list = s.k();
        }
        List list2 = list;
        if ((i10 & 8) != 0) {
            l0Var = d.a(w0.b().plus(j2.b(null, 1, null)));
        }
        return dataStoreFactory.create(serializer, replaceFileCorruptionHandler2, list2, l0Var, aVar);
    }
}
