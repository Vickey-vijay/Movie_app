package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.Struct;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.Event;
import io.bidmachine.protobuf.sdk.Monitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B7\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0002\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lio/bidmachine/analytics/internal/P;", "Lio/bidmachine/analytics/internal/Y;", "c", "()Lio/bidmachine/analytics/internal/P;", "", "b", "()[B", "", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/String;", "monitorName", "Lcom/explorestack/protobuf/Struct;", "g", "Lcom/explorestack/protobuf/Struct;", "extras", "", "Lio/bidmachine/analytics/internal/Q;", "h", "Ljava/util/List;", "monitorRecordList", IronSourceConstants.REQUEST_URL, "Lio/bidmachine/analytics/internal/p0;", "dispatchers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/explorestack/protobuf/Struct;Ljava/util/List;Lio/bidmachine/analytics/internal/p0;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class P extends Y<P> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String monitorName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Struct extras;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<MonitorRecord> monitorRecordList;

    public P(String str, String str2, Struct struct, List<MonitorRecord> list, p0 p0Var) {
        super(o0.Post, str, p0Var, null, 8, null);
        this.monitorName = str2;
        this.extras = struct;
        this.monitorRecordList = list;
    }

    @Override // io.bidmachine.analytics.internal.Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public P a() {
        return this;
    }

    public /* synthetic */ P(String str, String str2, Struct struct, List list, p0 p0Var, int i10, ck.i iVar) {
        this(str, str2, struct, list, (i10 & 16) != 0 ? p0.INSTANCE.a() : p0Var);
    }

    @Override // io.bidmachine.analytics.internal.Y
    public byte[] b() {
        try {
            Result.a aVar = Result.Companion;
            Monitor.Builder name = Monitor.newBuilder().setName(this.monitorName);
            List<MonitorRecord> list = this.monitorRecordList;
            ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
            for (MonitorRecord monitorRecord : list) {
                Monitor.Record.Builder timestamp = Monitor.Record.newBuilder().setFields(b0.a(monitorRecord.a())).setTimestamp(b0.a(monitorRecord.getTimestamp()));
                TrackerError error = monitorRecord.getError();
                if (error != null) {
                    timestamp.setError(Error.newBuilder().setName(error.getName()).setError(Error.Data.newBuilder().setCode(Z.a(error.getType()).getNumber()).setDescription(error.getReason()).build()).build());
                }
                arrayList.add(timestamp.build());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                name.addRecords((Monitor.Record) it.next());
            }
            return Event.newBuilder().setMonitor(name.build()).setExtrasPrivate(this.extras).build().toByteArray();
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m3458constructorimpl(kotlin.c.a(th2));
            return null;
        }
    }
}
