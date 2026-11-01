package com.unity3d.ads.core.domain;

import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import java.util.UUID;

/* JADX INFO: compiled from: AndroidGenerateByteStringId.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AndroidGenerateByteStringId implements GetByteStringId {
    @Override // com.unity3d.ads.core.domain.GetByteStringId
    public ByteString invoke() {
        UUID uuidRandomUUID = UUID.randomUUID();
        p.i(uuidRandomUUID, "randomUUID()");
        return ProtobufExtensionsKt.toByteString(uuidRandomUUID);
    }
}
