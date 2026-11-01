package io.bidmachine.analytics.internal;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0007J0\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\rJ,\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\u00042\u0006\u0010\u000e\u001a\u00020\tH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0010J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0012J,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0012J,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0012J4\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0015J:\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0018\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lio/bidmachine/analytics/internal/l0;", "", "Lio/bidmachine/analytics/internal/h0;", "readerRecord", "Lkotlin/Result;", "Lmj/r;", "b", "(Lio/bidmachine/analytics/internal/h0;)Ljava/lang/Object;", "a", "", "name", "Lio/bidmachine/analytics/internal/h0$a;", "readerRecordRule", "(Ljava/lang/String;Lio/bidmachine/analytics/internal/h0$a;)Ljava/lang/Object;", "readerName", "", "(Ljava/lang/String;)Ljava/lang/Object;", "readerRecordList", "(Ljava/util/List;)Ljava/lang/Object;", "c", "readerRecordRuleList", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;", "excludeReadeNameList", "excludeReaderRuleList", "(Ljava/util/List;Ljava/util/List;)Ljava/lang/Object;", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public interface l0 {
    Object a(ReaderRecord readerRecord);

    Object a(String readerName);

    Object a(String name, ReaderRecord.Rule readerRecordRule);

    Object a(String name, List<ReaderRecord.Rule> readerRecordRuleList);

    Object a(List<ReaderRecord> readerRecordList);

    Object a(List<String> excludeReadeNameList, List<ReaderRecord.Rule> excludeReaderRuleList);

    Object b(ReaderRecord readerRecord);

    Object b(List<ReaderRecord> readerRecordList);

    Object c(List<ReaderRecord> readerRecordList);
}
