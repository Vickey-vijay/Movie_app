package androidx.datastore;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import bk.a;
import bk.l;
import ck.p;
import com.ironsource.Y5;
import fk.c;
import java.io.File;
import java.util.List;
import jk.k;
import kotlin.Metadata;
import nk.l0;

/* JADX INFO: compiled from: DataStoreDelegate.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002BW\b\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f\u0012\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00130\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0096\u0002R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R,\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/datastore/DataStoreSingletonDelegate;", "T", "Lfk/c;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "thisRef", "Ljk/k;", "property", "getValue", "", Y5.c.f27928b, "Ljava/lang/String;", "Landroidx/datastore/core/Serializer;", "serializer", "Landroidx/datastore/core/Serializer;", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "corruptionHandler", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "produceMigrations", "Lbk/l;", "Lnk/l0;", "scope", "Lnk/l0;", "", "lock", "Ljava/lang/Object;", "INSTANCE", "Landroidx/datastore/core/DataStore;", "<init>", "(Ljava/lang/String;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lbk/l;Lnk/l0;)V", "datastore_release"}, k = 1, mv = {1, 5, 1})
public final class DataStoreSingletonDelegate<T> implements c<Context, DataStore<T>> {

    @GuardedBy("lock")
    private volatile DataStore<T> INSTANCE;
    private final ReplaceFileCorruptionHandler<T> corruptionHandler;
    private final String fileName;
    private final Object lock;
    private final l<Context, List<DataMigration<T>>> produceMigrations;
    private final l0 scope;
    private final Serializer<T> serializer;

    public /* bridge */ /* synthetic */ Object getValue(Object obj, k kVar) {
        return getValue((Context) obj, (k<?>) kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreSingletonDelegate(String str, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, l<? super Context, ? extends List<? extends DataMigration<T>>> lVar, l0 l0Var) {
        p.j(str, Y5.c.f27928b);
        p.j(serializer, "serializer");
        p.j(lVar, "produceMigrations");
        p.j(l0Var, "scope");
        this.fileName = str;
        this.serializer = serializer;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = lVar;
        this.scope = l0Var;
        this.lock = new Object();
    }

    public DataStore<T> getValue(Context thisRef, k<?> property) {
        DataStore<T> dataStore;
        p.j(thisRef, "thisRef");
        p.j(property, "property");
        DataStore<T> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            if (this.INSTANCE == null) {
                final Context applicationContext = thisRef.getApplicationContext();
                Serializer<T> serializer = this.serializer;
                ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler = this.corruptionHandler;
                l<Context, List<DataMigration<T>>> lVar = this.produceMigrations;
                p.i(applicationContext, "applicationContext");
                this.INSTANCE = DataStoreFactory.INSTANCE.create(serializer, replaceFileCorruptionHandler, lVar.invoke(applicationContext), this.scope, new a<File>() { // from class: androidx.datastore.DataStoreSingletonDelegate$getValue$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // bk.a
                    public final File invoke() {
                        Context context = applicationContext;
                        p.i(context, "applicationContext");
                        return DataStoreFile.dataStoreFile(context, ((DataStoreSingletonDelegate) this).fileName);
                    }
                });
            }
            dataStore = this.INSTANCE;
            p.g(dataStore);
        }
        return dataStore;
    }
}
