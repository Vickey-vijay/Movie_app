package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.BytesValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.Event;
import io.bidmachine.protobuf.sdk.Reader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB?\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0002\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lio/bidmachine/analytics/internal/g0;", "Lio/bidmachine/analytics/internal/Y;", "c", "()Lio/bidmachine/analytics/internal/g0;", "", "b", "()[B", "", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/String;", "readerName", "Lcom/explorestack/protobuf/Struct;", "g", "Lcom/explorestack/protobuf/Struct;", "extras", "", "Lio/bidmachine/analytics/internal/h0;", "h", "Ljava/util/List;", "readerRecordList", "Lio/bidmachine/analytics/internal/g0$a;", "i", "Lio/bidmachine/analytics/internal/g0$a;", "contentExtractor", IronSourceConstants.REQUEST_URL, "Lio/bidmachine/analytics/internal/p0;", "dispatchers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/explorestack/protobuf/Struct;Ljava/util/List;Lio/bidmachine/analytics/internal/g0$a;Lio/bidmachine/analytics/internal/p0;)V", "a", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class g0 extends Y<g0> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String readerName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Struct extras;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<ReaderRecord> readerRecordList;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final a contentExtractor;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/bidmachine/analytics/internal/g0$a;", "", "Lio/bidmachine/analytics/internal/h0$a;", "rule", "Lcom/explorestack/protobuf/BytesValue;", "a", "(Lio/bidmachine/analytics/internal/h0$a;)Lcom/explorestack/protobuf/BytesValue;", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public interface a {
        BytesValue a(ReaderRecord.Rule rule);
    }

    public g0(String str, String str2, Struct struct, List<ReaderRecord> list, a aVar, p0 p0Var) {
        super(o0.Post, str, p0Var, null, 8, null);
        this.readerName = str2;
        this.extras = struct;
        this.readerRecordList = list;
        this.contentExtractor = aVar;
    }

    @Override // io.bidmachine.analytics.internal.Y
    public byte[] b() {
        Object next;
        Timestamp timestampA;
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            Reader.Builder name = Reader.newBuilder().setName(this.readerName);
            List<ReaderRecord> list = this.readerRecordList;
            ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
            for (ReaderRecord readerRecord : list) {
                Reader.Record.Builder rule = Reader.Record.newBuilder().setRule(Reader.Rule.newBuilder().setGeneralRule(Reader.Rule.GeneralRule.newBuilder().setTag(b0.a(readerRecord.getRule().getTag())).setPath(b0.a(readerRecord.getRule().getPath())).build()));
                TrackerError error = readerRecord.getError();
                if (error == null) {
                    try {
                        Result.a aVar2 = Result.Companion;
                        objM3458constructorimpl = Result.m3458constructorimpl(rule.setRawData(this.contentExtractor.a(readerRecord.getRule())));
                    } catch (Throwable th2) {
                        Result.a aVar3 = Result.Companion;
                        objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
                    }
                    Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                    if (thM3461exceptionOrNullimpl != null) {
                        error = new TrackerError(this.readerName, thM3461exceptionOrNullimpl instanceof FileNotFoundException ? TrackerError.a.READER_NO_CONTENT : thM3461exceptionOrNullimpl instanceof SecurityException ? TrackerError.a.READER_NO_ACCESS : TrackerError.a.READER_INVALID, s0.a(thM3461exceptionOrNullimpl));
                    }
                }
                if (error != null) {
                    rule.setError(Error.newBuilder().setName(error.getName()).setError(Error.Data.newBuilder().setCode(Z.a(error.getType()).getNumber()).setDescription(error.getReason()).build()).build());
                }
                arrayList.add(rule.build());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                name.addRecords((Reader.Record) it.next());
            }
            Iterator<T> it2 = this.readerRecordList.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    long timestamp = ((ReaderRecord) next).getTimestamp();
                    do {
                        Object next2 = it2.next();
                        long timestamp2 = ((ReaderRecord) next2).getTimestamp();
                        if (timestamp < timestamp2) {
                            next = next2;
                            timestamp = timestamp2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            ReaderRecord readerRecord2 = (ReaderRecord) next;
            if (readerRecord2 != null && (timestampA = b0.a(readerRecord2.getTimestamp())) != null) {
                name.setTimestamp(timestampA);
            }
            return Event.newBuilder().setReader(name.build()).setExtrasPrivate(this.extras).build().toByteArray();
        } catch (Throwable th3) {
            Result.a aVar4 = Result.Companion;
            Result.m3458constructorimpl(kotlin.c.a(th3));
            return null;
        }
    }

    @Override // io.bidmachine.analytics.internal.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g0 a() {
        return this;
    }

    public /* synthetic */ g0(String str, String str2, Struct struct, List list, a aVar, p0 p0Var, int i10, ck.i iVar) {
        this(str, str2, struct, list, aVar, (i10 & 32) != 0 ? p0.INSTANCE.a() : p0Var);
    }
}
