package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import bk.l;
import ck.p;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.di.ServiceProvider;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import kotlinx.coroutines.d;
import nk.h0;
import nk.j2;

/* JADX INFO: compiled from: UniversalRequestDataStoreProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class UniversalRequestDataStoreProvider {
    private DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> cachedDataStore;
    private final Context context;
    private final h0 dispatcher;

    public final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> invoke() {
        synchronized (this) {
            DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> dataStore = this.cachedDataStore;
            if (dataStore != null) {
                return dataStore;
            }
            DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> dataStoreCreateDataStore = createDataStore();
            this.cachedDataStore = dataStoreCreateDataStore;
            return dataStoreCreateDataStore;
        }
    }

    public UniversalRequestDataStoreProvider(Context context, h0 h0Var) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(h0Var, "dispatcher");
        this.context = context;
        this.dispatcher = h0Var;
    }

    private final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> createDataStore() {
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new UniversalRequestStoreSerializer(), new ReplaceFileCorruptionHandler(new l<CorruptionException, UniversalRequestStoreOuterClass.UniversalRequestStore>() { // from class: com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider.createDataStore.1
            @Override // bk.l
            public final UniversalRequestStoreOuterClass.UniversalRequestStore invoke(CorruptionException corruptionException) {
                p.j(corruptionException, "it");
                return new UniversalRequestStoreSerializer().getDefaultValue();
            }
        }), null, d.a(this.dispatcher.plus(j2.b(null, 1, null))), new bk.a<File>() { // from class: com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider.createDataStore.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(UniversalRequestDataStoreProvider.this.getContext(), ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
            }
        }, 4, null);
    }

    public final Context getContext() {
        return this.context;
    }

    public final h0 getDispatcher() {
        return this.dispatcher;
    }
}
