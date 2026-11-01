package com.explorestack.protobuf;

/* JADX INFO: loaded from: classes8.dex */
final class NewInstanceSchemaFull implements NewInstanceSchema {
    @Override // com.explorestack.protobuf.NewInstanceSchema
    public Object newInstance(Object obj) {
        return ((GeneratedMessageV3) obj).newInstance(GeneratedMessageV3.UnusedPrivateParameter.INSTANCE);
    }
}
