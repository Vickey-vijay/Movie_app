package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import ck.p;
import com.ironsource.C3426d4;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import mj.r;
import rj.c;

/* JADX INFO: compiled from: PreservingByteStringPreferenceMigration.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class PreservingByteStringPreferenceMigration implements DataMigration<ByteStringStoreOuterClass.ByteStringStore> {
    private final Context context;
    private final GetByteStringData getByteStringData;
    private final String key;
    private final String name;

    @Override // androidx.datastore.core.DataMigration
    public /* bridge */ /* synthetic */ Object shouldMigrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, c cVar) {
        return shouldMigrate2(byteStringStore, (c<? super Boolean>) cVar);
    }

    public PreservingByteStringPreferenceMigration(Context context, String str, String str2, GetByteStringData getByteStringData) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "name");
        p.j(str2, C3426d4.i.W);
        p.j(getByteStringData, "getByteStringData");
        this.context = context;
        this.name = str;
        this.key = str2;
        this.getByteStringData = getByteStringData;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object cleanUp(c<? super r> cVar) {
        return r.f64562a;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object migrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, c<? super ByteStringStoreOuterClass.ByteStringStore> cVar) {
        if (!byteStringStore.getData().isEmpty()) {
            return byteStringStore;
        }
        String string = this.context.getSharedPreferences(this.name, 0).getString(this.key, null);
        if (string == null || string.length() == 0) {
            return byteStringStore;
        }
        ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(this.getByteStringData.invoke(string)).build();
        p.i(byteStringStoreBuild, "newBuilder()\n           …                 .build()");
        return byteStringStoreBuild;
    }

    /* JADX INFO: renamed from: shouldMigrate, reason: avoid collision after fix types in other method */
    public Object shouldMigrate2(ByteStringStoreOuterClass.ByteStringStore byteStringStore, c<? super Boolean> cVar) {
        return tj.a.a(byteStringStore.getData().isEmpty());
    }
}
