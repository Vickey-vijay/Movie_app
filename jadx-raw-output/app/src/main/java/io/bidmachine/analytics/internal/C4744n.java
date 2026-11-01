package io.bidmachine.analytics.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0007R\u001b\u0010\u0019\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u001c"}, d2 = {"Lio/bidmachine/analytics/internal/n;", "", "", "e", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lio/bidmachine/analytics/internal/n$a;", "a", "Lio/bidmachine/analytics/internal/n$a;", "b", "()Lio/bidmachine/analytics/internal/n$a;", "inAppData", "d", "subsData", "c", "Lmj/g;", "stringRepresentation", "dataHash", "<init>", "(Lio/bidmachine/analytics/internal/n$a;Lio/bidmachine/analytics/internal/n$a;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final /* data */ class C4744n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a inAppData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a subsData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mj.g stringRepresentation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mj.g dataHash;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.n$a */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J@\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\f\u0010\u0015R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u001a"}, d2 = {"Lio/bidmachine/analytics/internal/n$a;", "", "", "d", "()Z", "", "toString", "()Ljava/lang/String;", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "history", "details", "a", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lio/bidmachine/analytics/internal/n$a;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<String> active;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<String> history;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<String> details;

        public a() {
            this(null, null, null, 7, null);
        }

        public final a a(List<String> active, List<String> history, List<String> details) {
            return new a(active, history, details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return ck.p.e(this.active, aVar.active) && ck.p.e(this.history, aVar.history) && ck.p.e(this.details, aVar.details);
        }

        public a(List<String> list, List<String> list2, List<String> list3) {
            this.active = list;
            this.history = list2;
            this.details = list3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a a(a aVar, List list, List list2, List list3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = aVar.active;
            }
            if ((i10 & 2) != 0) {
                list2 = aVar.history;
            }
            if ((i10 & 4) != 0) {
                list3 = aVar.details;
            }
            return aVar.a(list, list2, list3);
        }

        public final List<String> b() {
            return this.details;
        }

        public final List<String> c() {
            return this.history;
        }

        public final boolean d() {
            return this.active.isEmpty() && this.history.isEmpty() && this.details.isEmpty();
        }

        public int hashCode() {
            return (((this.active.hashCode() * 31) + this.history.hashCode()) * 31) + this.details.hashCode();
        }

        public /* synthetic */ a(List list, List list2, List list3, int i10, ck.i iVar) {
            this((i10 & 1) != 0 ? nj.s.k() : list, (i10 & 2) != 0 ? nj.s.k() : list2, (i10 & 4) != 0 ? nj.s.k() : list3);
        }

        public final List<String> a() {
            return this.active;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.n$b */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements bk.a<String> {
        public b() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C4744n.this.c().hashCode() + '_' + nj.b0.p0(nj.s.n(Integer.valueOf(C4744n.this.getInAppData().a().size()), Integer.valueOf(C4744n.this.getInAppData().c().size()), Integer.valueOf(C4744n.this.getInAppData().b().size()), Integer.valueOf(C4744n.this.getSubsData().a().size()), Integer.valueOf(C4744n.this.getSubsData().c().size()), Integer.valueOf(C4744n.this.getSubsData().b().size())), "_", null, null, 0, null, null, 62, null);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.n$c */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements bk.a<String> {
        public c() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            C4744n c4744n = C4744n.this;
            jSONObject.put("iaa", new JSONArray((Collection) c4744n.getInAppData().a()));
            jSONObject.put("iah", new JSONArray((Collection) c4744n.getInAppData().c()));
            jSONObject.put("iad", new JSONArray((Collection) c4744n.getInAppData().b()));
            jSONObject.put("sua", new JSONArray((Collection) c4744n.getSubsData().a()));
            jSONObject.put("suh", new JSONArray((Collection) c4744n.getSubsData().c()));
            jSONObject.put("sud", new JSONArray((Collection) c4744n.getSubsData().b()));
            return jSONObject.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4744n() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4744n)) {
            return false;
        }
        C4744n c4744n = (C4744n) other;
        return ck.p.e(this.inAppData, c4744n.inAppData) && ck.p.e(this.subsData, c4744n.subsData);
    }

    public C4744n(a aVar, a aVar2) {
        this.inAppData = aVar;
        this.subsData = aVar2;
        this.stringRepresentation = kotlin.b.a(new c());
        this.dataHash = kotlin.b.a(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return (String) this.stringRepresentation.getValue();
    }

    public final String a() {
        return (String) this.dataHash.getValue();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getInAppData() {
        return this.inAppData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getSubsData() {
        return this.subsData;
    }

    public final boolean e() {
        return this.inAppData.d() && this.subsData.d();
    }

    public int hashCode() {
        return (this.inAppData.hashCode() * 31) + this.subsData.hashCode();
    }

    public /* synthetic */ C4744n(a aVar, a aVar2, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new a(null, null, null, 7, null) : aVar, (i10 & 2) != 0 ? new a(null, null, null, 7, null) : aVar2);
    }

    public String toString() {
        return c();
    }
}
