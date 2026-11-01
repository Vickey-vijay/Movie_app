package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes4.dex */
public final class Nf implements ProtobufStateStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinaryDataHelper f55635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtobufStateSerializer f55636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProtobufConverter f55637d;

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f55635b.remove(this.f55634a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    @NonNull
    public final Object read() {
        try {
            byte[] bArr = this.f55635b.get(this.f55634a);
            if (bArr != null && bArr.length != 0) {
                return this.f55637d.toModel((MessageNano) this.f55636c.toState(bArr));
            }
            return this.f55637d.toModel((MessageNano) this.f55636c.defaultValue());
        } catch (Throwable unused) {
            return this.f55637d.toModel((MessageNano) this.f55636c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(@NonNull Object obj) {
        this.f55635b.insert(this.f55634a, this.f55636c.toByteArray((MessageNano) this.f55637d.fromModel(obj)));
    }

    public Nf(@NonNull String str, @NonNull IBinaryDataHelper iBinaryDataHelper, @NonNull ProtobufStateSerializer<MessageNano> protobufStateSerializer, @NonNull ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f55634a = str;
        this.f55635b = iBinaryDataHelper;
        this.f55636c = protobufStateSerializer;
        this.f55637d = protobufConverter;
    }
}
