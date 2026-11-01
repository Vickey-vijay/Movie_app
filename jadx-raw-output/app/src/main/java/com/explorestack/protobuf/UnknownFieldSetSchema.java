package com.explorestack.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
class UnknownFieldSetSchema extends UnknownFieldSchema<UnknownFieldSet, UnknownFieldSet.Builder> {
    private final boolean proto3;

    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public void makeImmutable(Object obj) {
    }

    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public void addFixed32(UnknownFieldSet.Builder builder, int i10, int i11) {
        builder.mergeField(i10, UnknownFieldSet.Field.newBuilder().addFixed32(i11).build());
    }

    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public void addFixed64(UnknownFieldSet.Builder builder, int i10, long j10) {
        builder.mergeField(i10, UnknownFieldSet.Field.newBuilder().addFixed64(j10).build());
    }

    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public void addGroup(UnknownFieldSet.Builder builder, int i10, UnknownFieldSet unknownFieldSet) {
        builder.mergeField(i10, UnknownFieldSet.Field.newBuilder().addGroup(unknownFieldSet).build());
    }

    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public void addLengthDelimited(UnknownFieldSet.Builder builder, int i10, ByteString byteString) {
        builder.mergeField(i10, UnknownFieldSet.Field.newBuilder().addLengthDelimited(byteString).build());
    }

    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public void addVarint(UnknownFieldSet.Builder builder, int i10, long j10) {
        builder.mergeField(i10, UnknownFieldSet.Field.newBuilder().addVarint(j10).build());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public UnknownFieldSet.Builder getBuilderFromMessage(Object obj) {
        return ((GeneratedMessageV3) obj).unknownFields.toBuilder();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public UnknownFieldSet getFromMessage(Object obj) {
        return ((GeneratedMessageV3) obj).unknownFields;
    }

    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public int getSerializedSize(UnknownFieldSet unknownFieldSet) {
        return unknownFieldSet.getSerializedSize();
    }

    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public int getSerializedSizeAsMessageSet(UnknownFieldSet unknownFieldSet) {
        return unknownFieldSet.getSerializedSizeAsMessageSet();
    }

    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public UnknownFieldSet merge(UnknownFieldSet unknownFieldSet, UnknownFieldSet unknownFieldSet2) {
        return unknownFieldSet.toBuilder().mergeFrom(unknownFieldSet2).build();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public UnknownFieldSet.Builder newBuilder() {
        return UnknownFieldSet.newBuilder();
    }

    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public void setBuilderToMessage(Object obj, UnknownFieldSet.Builder builder) {
        ((GeneratedMessageV3) obj).unknownFields = builder.build();
    }

    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public void setToMessage(Object obj, UnknownFieldSet unknownFieldSet) {
        ((GeneratedMessageV3) obj).unknownFields = unknownFieldSet;
    }

    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public UnknownFieldSet toImmutable(UnknownFieldSet.Builder builder) {
        return builder.build();
    }

    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public void writeAsMessageSetTo(UnknownFieldSet unknownFieldSet, Writer writer) throws IOException {
        unknownFieldSet.writeAsMessageSetTo(writer);
    }

    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public void writeTo(UnknownFieldSet unknownFieldSet, Writer writer) throws IOException {
        unknownFieldSet.writeTo(writer);
    }

    public UnknownFieldSetSchema(boolean z10) {
        this.proto3 = z10;
    }

    @Override // com.explorestack.protobuf.UnknownFieldSchema
    public boolean shouldDiscardUnknownFields(Reader reader) {
        return reader.shouldDiscardUnknownFields();
    }
}
