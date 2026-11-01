package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface OSLogOrBuilder extends MessageOrBuilder {
    OSLog.Record getRecords(int i10);

    int getRecordsCount();

    List<OSLog.Record> getRecordsList();

    OSLog.RecordOrBuilder getRecordsOrBuilder(int i10);

    List<? extends OSLog.RecordOrBuilder> getRecordsOrBuilderList();
}
