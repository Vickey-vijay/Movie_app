package com.unity3d.ads.core.data.datasource;

import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.core.device.Storage;
import kotlin.Result;
import mj.r;
import org.json.JSONException;
import rj.c;

/* JADX INFO: compiled from: AndroidLegacyConfigStoreDataSource.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidLegacyConfigStoreDataSource implements ByteStringDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_CONFIGURATION_STORE = "configuration.store";
    private final StorageManager storageManager;

    /* JADX INFO: compiled from: AndroidLegacyConfigStoreDataSource.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public AndroidLegacyConfigStoreDataSource(StorageManager storageManager) {
        p.j(storageManager, "storageManager");
        this.storageManager = storageManager;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object get(c<? super ByteStringStoreOuterClass.ByteStringStore> cVar) throws JSONException {
        Object objM3458constructorimpl;
        Object obj = this.storageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE).get(KEY_CONFIGURATION_STORE);
        String str = obj instanceof String ? (String) obj : null;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(str != null ? ProtobufExtensionsKt.fromBase64(str, true) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        ByteString byteString = (ByteString) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
        ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
        ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        ByteStringStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
        if (byteString == null) {
            byteString = ByteString.EMPTY;
            p.i(byteString, "EMPTY");
        }
        dsl_create.setData(byteString);
        return dsl_create._build();
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object set(ByteString byteString, c<? super r> cVar) {
        Storage storage = this.storageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE);
        storage.set(KEY_CONFIGURATION_STORE, ProtobufExtensionsKt.toBase64(byteString, true));
        storage.writeStorage();
        return r.f64562a;
    }
}
