package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class Ak implements ServiceStorageProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4603vl f54967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SQLiteOpenHelper f54968c;

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final <T, P extends MessageNano> ProtobufBinaryStateStorageFactory<T> createBinaryStateStorageFactory(String str, ProtobufStateSerializer<P> protobufStateSerializer, ProtobufConverter<T, P> protobufConverter) {
        Pm.f55759a.getClass();
        return new Om(str, protobufStateSerializer, protobufConverter);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f54966a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f54966a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final SQLiteOpenHelper getDbStorage() {
        return this.f54968c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f54966a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final TempCacheStorage getTempCacheStorage() {
        C4580un c4580un;
        C4702zk c4702zkB = C4418oa.I.B();
        Context context = this.f54966a;
        synchronized (c4702zkB) {
            c4580un = c4702zkB.f58064h;
            if (c4580un == null) {
                Tm tm2 = Tm.SERVICE;
                C4555tn c4555tn = c4702zkB.f58063g;
                if (c4555tn == null) {
                    c4555tn = new C4555tn(new C4503rl(c4702zkB.f(context)), "temp_cache");
                    c4702zkB.f58063g = c4555tn;
                }
                c4580un = new C4580un(context, tm2, c4555tn);
                c4702zkB.f58064h = c4580un;
            }
        }
        return c4580un;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences legacyModulePreferences() {
        return new Ab(this.f54967b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new Yc(str, this.f54967b);
    }

    public Ak(Context context, InterfaceC4603vl interfaceC4603vl, SQLiteOpenHelper sQLiteOpenHelper) {
        this.f54966a = context;
        this.f54967b = interfaceC4603vl;
        this.f54968c = sQLiteOpenHelper;
    }
}
