package com.unity3d.ads.core.data.model;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import ck.p;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import mj.r;
import rj.c;

/* JADX INFO: compiled from: UniversalRequestStoreSerializer.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class UniversalRequestStoreSerializer implements Serializer<UniversalRequestStoreOuterClass.UniversalRequestStore> {
    private final UniversalRequestStoreOuterClass.UniversalRequestStore defaultValue;

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object writeTo(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, OutputStream outputStream, c cVar) {
        return writeTo2(universalRequestStore, outputStream, (c<? super r>) cVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public UniversalRequestStoreOuterClass.UniversalRequestStore getDefaultValue() {
        return this.defaultValue;
    }

    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, OutputStream outputStream, c<? super r> cVar) throws IOException {
        universalRequestStore.writeTo(outputStream);
        return r.f64562a;
    }

    public UniversalRequestStoreSerializer() {
        UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
        p.i(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, c<? super UniversalRequestStoreOuterClass.UniversalRequestStore> cVar) throws CorruptionException {
        try {
            UniversalRequestStoreOuterClass.UniversalRequestStore from = UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(inputStream);
            p.i(from, "parseFrom(input)");
            return from;
        } catch (InvalidProtocolBufferException e10) {
            throw new CorruptionException("Cannot read proto.", e10);
        } catch (Throwable th2) {
            throw new CorruptionException("Error while reading proto file.", th2);
        }
    }
}
