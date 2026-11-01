package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.TimestampOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ReaderOrBuilder extends MessageOrBuilder {
    String getName();

    ByteString getNameBytes();

    Reader.Record getRecords(int i10);

    int getRecordsCount();

    List<Reader.Record> getRecordsList();

    Reader.RecordOrBuilder getRecordsOrBuilder(int i10);

    List<? extends Reader.RecordOrBuilder> getRecordsOrBuilderList();

    Timestamp getTimestamp();

    TimestampOrBuilder getTimestampOrBuilder();

    boolean hasTimestamp();
}
