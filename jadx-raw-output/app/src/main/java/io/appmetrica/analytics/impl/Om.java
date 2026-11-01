package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* JADX INFO: loaded from: classes.dex */
public final class Om extends Sm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProtobufStateSerializer f55709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProtobufConverter f55710c;

    @Override // io.appmetrica.analytics.impl.Sm
    public final IBinaryDataHelper a(Context context) {
        return C4418oa.I.B().b(context);
    }

    public Om(String str, ProtobufStateSerializer protobufStateSerializer, ProtobufConverter protobufConverter) {
        this.f55708a = str;
        this.f55709b = protobufStateSerializer;
        this.f55710c = protobufConverter;
    }

    @Override // io.appmetrica.analytics.impl.Sm
    public final IBinaryDataHelper b(Context context) {
        IBinaryDataHelper iBinaryDataHelperA;
        C4702zk c4702zkB = C4418oa.I.B();
        synchronized (c4702zkB) {
            iBinaryDataHelperA = c4702zkB.a(context);
        }
        return iBinaryDataHelperA;
    }

    @Override // io.appmetrica.analytics.impl.Sm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArrA;
        byte[] bArrA2;
        String str = this.f55708a;
        ProtobufStateSerializer protobufStateSerializer = this.f55709b;
        try {
            bArrA = AbstractC4249hj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArrA = new byte[16];
        }
        try {
            bArrA2 = AbstractC4249hj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArrA2 = new byte[16];
        }
        return new Nf(str, iBinaryDataHelper, new B8(protobufStateSerializer, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArrA, bArrA2)), this.f55710c);
    }
}
