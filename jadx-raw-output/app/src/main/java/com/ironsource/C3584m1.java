package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.AdSize;
import java.util.Map;
import me.goldze.mvvmhabit.base.ContainerActivity;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3584m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3584m1 f29458a = new C3584m1();

    /* JADX INFO: renamed from: com.ironsource.m1$a */
    public static final class a implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IronSource.a f29459a;

        private final IronSource.a a() {
            return this.f29459a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f29459a == ((a) obj).f29459a;
        }

        public a(IronSource.a aVar) {
            ck.p.j(aVar, "value");
            this.f29459a = aVar;
        }

        public final a a(IronSource.a aVar) {
            ck.p.j(aVar, "value");
            return new a(aVar);
        }

        public int hashCode() {
            return this.f29459a.hashCode();
        }

        public String toString() {
            return "AdFormatEntity(value=" + this.f29459a + ")";
        }

        public static /* synthetic */ a a(a aVar, IronSource.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar2 = aVar.f29459a;
            }
            return aVar.a(aVar2);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put("adUnit", Integer.valueOf(C3772wf.c(this.f29459a)));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$b */
    public static final class b implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29460a;

        private final String a() {
            return this.f29460a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && ck.p.e(this.f29460a, ((b) obj).f29460a);
        }

        public b(String str) {
            ck.p.j(str, "value");
            this.f29460a = str;
        }

        public final b a(String str) {
            ck.p.j(str, "value");
            return new b(str);
        }

        public int hashCode() {
            return this.f29460a.hashCode();
        }

        public String toString() {
            return "AdIdentifier(value=" + this.f29460a + ")";
        }

        public static /* synthetic */ b a(b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f29460a;
            }
            return bVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.f29460a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$c */
    public static final class c implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AdSize f29461a;

        public c(AdSize adSize) {
            ck.p.j(adSize, "size");
            this.f29461a = adSize;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x004d  */
        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            int i10;
            ck.p.j(map, ContainerActivity.BUNDLE);
            String sizeDescription = this.f29461a.getSizeDescription();
            int iHashCode = sizeDescription.hashCode();
            if (iHashCode != -96588539) {
                if (iHashCode != 72205083) {
                    if (iHashCode != 446888797) {
                        if (iHashCode == 1951953708 && sizeDescription.equals("BANNER")) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                    } else if (sizeDescription.equals(com.ironsource.mediationsdk.l.f29841d)) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                } else if (sizeDescription.equals(com.ironsource.mediationsdk.l.f29839b)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
            } else if (sizeDescription.equals(com.ironsource.mediationsdk.l.f29844g)) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            map.put(com.ironsource.mediationsdk.l.f29845h, Integer.valueOf(i10));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$d */
    public static final class d implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29462a;

        private final String a() {
            return this.f29462a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && ck.p.e(this.f29462a, ((d) obj).f29462a);
        }

        public d(String str) {
            ck.p.j(str, "auctionId");
            this.f29462a = str;
        }

        public final d a(String str) {
            ck.p.j(str, "auctionId");
            return new d(str);
        }

        public int hashCode() {
            return this.f29462a.hashCode();
        }

        public String toString() {
            return "AuctionId(auctionId=" + this.f29462a + ")";
        }

        public static /* synthetic */ d a(d dVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dVar.f29462a;
            }
            return dVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put("auctionId", this.f29462a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$e */
    public static final class e implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29463a;

        private final int a() {
            return this.f29463a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f29463a == ((e) obj).f29463a;
        }

        public final e a(int i10) {
            return new e(i10);
        }

        public int hashCode() {
            return Integer.hashCode(this.f29463a);
        }

        public String toString() {
            return "DemandOnly(value=" + this.f29463a + ")";
        }

        public e(int i10) {
            this.f29463a = i10;
        }

        public static /* synthetic */ e a(e eVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = eVar.f29463a;
            }
            return eVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.f29463a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$f */
    public static final class f implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f29464a;

        private final long a() {
            return this.f29464a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f29464a == ((f) obj).f29464a;
        }

        public final f a(long j10) {
            return new f(j10);
        }

        public int hashCode() {
            return Long.hashCode(this.f29464a);
        }

        public String toString() {
            return "Duration(duration=" + this.f29464a + ")";
        }

        public f(long j10) {
            this.f29464a = j10;
        }

        public static /* synthetic */ f a(f fVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = fVar.f29464a;
            }
            return fVar.a(j10);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put("duration", Long.valueOf(this.f29464a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$g */
    public static final class g implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29465a;

        private final String a() {
            return this.f29465a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && ck.p.e(this.f29465a, ((g) obj).f29465a);
        }

        public g(String str) {
            ck.p.j(str, "dynamicSourceId");
            this.f29465a = str;
        }

        public final g a(String str) {
            ck.p.j(str, "dynamicSourceId");
            return new g(str);
        }

        public int hashCode() {
            return this.f29465a.hashCode();
        }

        public String toString() {
            return "DynamicDemandSourceId(dynamicSourceId=" + this.f29465a + ")";
        }

        public static /* synthetic */ g a(g gVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gVar.f29465a;
            }
            return gVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put("dynamicDemandSource", this.f29465a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$h */
    public static final class h implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29466a;

        private final String a() {
            return this.f29466a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && ck.p.e(this.f29466a, ((h) obj).f29466a);
        }

        public h(String str) {
            ck.p.j(str, "sourceId");
            this.f29466a = str;
        }

        public final h a(String str) {
            ck.p.j(str, "sourceId");
            return new h(str);
        }

        public int hashCode() {
            return this.f29466a.hashCode();
        }

        public String toString() {
            return "DynamicSourceId(sourceId=" + this.f29466a + ")";
        }

        public static /* synthetic */ h a(h hVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = hVar.f29466a;
            }
            return hVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put("dynamicDemandSource", this.f29466a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$j */
    public static final class j implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29468a;

        private final int a() {
            return this.f29468a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f29468a == ((j) obj).f29468a;
        }

        public final j a(int i10) {
            return new j(i10);
        }

        public int hashCode() {
            return Integer.hashCode(this.f29468a);
        }

        public String toString() {
            return "ErrorCode(code=" + this.f29468a + ")";
        }

        public j(int i10) {
            this.f29468a = i10;
        }

        public static /* synthetic */ j a(j jVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = jVar.f29468a;
            }
            return jVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(this.f29468a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$k */
    public static final class k implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29469a;

        private final String a() {
            return this.f29469a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && ck.p.e(this.f29469a, ((k) obj).f29469a);
        }

        public final k a(String str) {
            return new k(str);
        }

        public int hashCode() {
            String str = this.f29469a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ErrorReason(reason=" + this.f29469a + ")";
        }

        public k(String str) {
            this.f29469a = str;
        }

        public static /* synthetic */ k a(k kVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = kVar.f29469a;
            }
            return kVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            String str = this.f29469a;
            if (str == null || str.length() == 0) {
                return;
            }
            map.put("reason", this.f29469a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$l */
    public static final class l implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29470a;

        private final String a() {
            return this.f29470a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && ck.p.e(this.f29470a, ((l) obj).f29470a);
        }

        public l(String str) {
            ck.p.j(str, "value");
            this.f29470a = str;
        }

        public final l a(String str) {
            ck.p.j(str, "value");
            return new l(str);
        }

        public int hashCode() {
            return this.f29470a.hashCode();
        }

        public String toString() {
            return "Ext1(value=" + this.f29470a + ")";
        }

        public static /* synthetic */ l a(l lVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = lVar.f29470a;
            }
            return lVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_EXT1, this.f29470a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$m */
    public static final class m implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f29471a;

        private final JSONObject a() {
            return this.f29471a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && ck.p.e(this.f29471a, ((m) obj).f29471a);
        }

        public final m a(JSONObject jSONObject) {
            return new m(jSONObject);
        }

        public int hashCode() {
            JSONObject jSONObject = this.f29471a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        public String toString() {
            return "GenericParams(genericParams=" + this.f29471a + ")";
        }

        public m(JSONObject jSONObject) {
            this.f29471a = jSONObject;
        }

        public static /* synthetic */ m a(m mVar, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jSONObject = mVar.f29471a;
            }
            return mVar.a(jSONObject);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            JSONObject jSONObject = this.f29471a;
            if (jSONObject == null) {
                return;
            }
            map.put("genericParams", jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$n */
    public static final class n implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29472a;

        private final int a() {
            return this.f29472a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f29472a == ((n) obj).f29472a;
        }

        public final n a(int i10) {
            return new n(i10);
        }

        public int hashCode() {
            return Integer.hashCode(this.f29472a);
        }

        public String toString() {
            return "InstanceType(instanceType=" + this.f29472a + ")";
        }

        public n(int i10) {
            this.f29472a = i10;
        }

        public static /* synthetic */ n a(n nVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = nVar.f29472a;
            }
            return nVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put("instanceType", Integer.valueOf(this.f29472a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$o */
    public static final class o implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29473a;

        private final int a() {
            return this.f29473a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f29473a == ((o) obj).f29473a;
        }

        public final o a(int i10) {
            return new o(i10);
        }

        public int hashCode() {
            return Integer.hashCode(this.f29473a);
        }

        public String toString() {
            return "MultipleAdObjects(value=" + this.f29473a + ")";
        }

        public o(int i10) {
            this.f29473a = i10;
        }

        public static /* synthetic */ o a(o oVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = oVar.f29473a;
            }
            return oVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put("isMultipleAdObjects", Integer.valueOf(this.f29473a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$p */
    public static final class p implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29474a;

        private final int a() {
            return this.f29474a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f29474a == ((p) obj).f29474a;
        }

        public final p a(int i10) {
            return new p(i10);
        }

        public int hashCode() {
            return Integer.hashCode(this.f29474a);
        }

        public String toString() {
            return "OneFlow(value=" + this.f29474a + ")";
        }

        public p(int i10) {
            this.f29474a = i10;
        }

        public static /* synthetic */ p a(p pVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = pVar.f29474a;
            }
            return pVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put("isOneFlow", Integer.valueOf(this.f29474a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$q */
    public static final class q implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29475a;

        private final String a() {
            return this.f29475a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && ck.p.e(this.f29475a, ((q) obj).f29475a);
        }

        public q(String str) {
            ck.p.j(str, "value");
            this.f29475a = str;
        }

        public final q a(String str) {
            ck.p.j(str, "value");
            return new q(str);
        }

        public int hashCode() {
            return this.f29475a.hashCode();
        }

        public String toString() {
            return "Placement(value=" + this.f29475a + ")";
        }

        public static /* synthetic */ q a(q qVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = qVar.f29475a;
            }
            return qVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put("placement", this.f29475a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$r */
    public static final class r implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29476a;

        private final int a() {
            return this.f29476a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f29476a == ((r) obj).f29476a;
        }

        public final r a(int i10) {
            return new r(i10);
        }

        public int hashCode() {
            return Integer.hashCode(this.f29476a);
        }

        public String toString() {
            return "Programmatic(programmatic=" + this.f29476a + ")";
        }

        public r(int i10) {
            this.f29476a = i10;
        }

        public static /* synthetic */ r a(r rVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = rVar.f29476a;
            }
            return rVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f29476a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$s */
    public static final class s implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29477a;

        private final String a() {
            return this.f29477a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && ck.p.e(this.f29477a, ((s) obj).f29477a);
        }

        public s(String str) {
            ck.p.j(str, "sourceName");
            this.f29477a = str;
        }

        public final s a(String str) {
            ck.p.j(str, "sourceName");
            return new s(str);
        }

        public int hashCode() {
            return this.f29477a.hashCode();
        }

        public String toString() {
            return "Provider(sourceName=" + this.f29477a + ")";
        }

        public static /* synthetic */ s a(s sVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sVar.f29477a;
            }
            return sVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f29477a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$t */
    public static final class t implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29478a;

        private final int a() {
            return this.f29478a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f29478a == ((t) obj).f29478a;
        }

        public final t a(int i10) {
            return new t(i10);
        }

        public int hashCode() {
            return Integer.hashCode(this.f29478a);
        }

        public String toString() {
            return "RewardAmount(value=" + this.f29478a + ")";
        }

        public t(int i10) {
            this.f29478a = i10;
        }

        public static /* synthetic */ t a(t tVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = tVar.f29478a;
            }
            return tVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f29478a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$u */
    public static final class u implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29479a;

        private final String a() {
            return this.f29479a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && ck.p.e(this.f29479a, ((u) obj).f29479a);
        }

        public u(String str) {
            ck.p.j(str, "value");
            this.f29479a = str;
        }

        public final u a(String str) {
            ck.p.j(str, "value");
            return new u(str);
        }

        public int hashCode() {
            return this.f29479a.hashCode();
        }

        public String toString() {
            return "RewardName(value=" + this.f29479a + ")";
        }

        public static /* synthetic */ u a(u uVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uVar.f29479a;
            }
            return uVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f29479a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$v */
    public static final class v implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29480a;

        private final String a() {
            return this.f29480a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && ck.p.e(this.f29480a, ((v) obj).f29480a);
        }

        public v(String str) {
            ck.p.j(str, "version");
            this.f29480a = str;
        }

        public final v a(String str) {
            ck.p.j(str, "version");
            return new v(str);
        }

        public int hashCode() {
            return this.f29480a.hashCode();
        }

        public String toString() {
            return "SdkVersion(version=" + this.f29480a + ")";
        }

        public static /* synthetic */ v a(v vVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = vVar.f29480a;
            }
            return vVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.f29480a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$w */
    public static final class w implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29481a;

        private final int a() {
            return this.f29481a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f29481a == ((w) obj).f29481a;
        }

        public final w a(int i10) {
            return new w(i10);
        }

        public int hashCode() {
            return Integer.hashCode(this.f29481a);
        }

        public String toString() {
            return "SessionDepth(sessionDepth=" + this.f29481a + ")";
        }

        public w(int i10) {
            this.f29481a = i10;
        }

        public static /* synthetic */ w a(w wVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = wVar.f29481a;
            }
            return wVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put("sessionDepth", Integer.valueOf(this.f29481a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$x */
    public static final class x implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29482a;

        private final String a() {
            return this.f29482a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && ck.p.e(this.f29482a, ((x) obj).f29482a);
        }

        public x(String str) {
            ck.p.j(str, "subProviderId");
            this.f29482a = str;
        }

        public final x a(String str) {
            ck.p.j(str, "subProviderId");
            return new x(str);
        }

        public int hashCode() {
            return this.f29482a.hashCode();
        }

        public String toString() {
            return "SubProviderId(subProviderId=" + this.f29482a + ")";
        }

        public static /* synthetic */ x a(x xVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = xVar.f29482a;
            }
            return xVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put("spId", this.f29482a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$y */
    public static final class y implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29483a;

        private final String a() {
            return this.f29483a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && ck.p.e(this.f29483a, ((y) obj).f29483a);
        }

        public y(String str) {
            ck.p.j(str, "value");
            this.f29483a = str;
        }

        public final y a(String str) {
            ck.p.j(str, "value");
            return new y(str);
        }

        public int hashCode() {
            return this.f29483a.hashCode();
        }

        public String toString() {
            return "TransId(value=" + this.f29483a + ")";
        }

        public static /* synthetic */ y a(y yVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = yVar.f29483a;
            }
            return yVar.a(str);
        }

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
            map.put(IronSourceConstants.EVENTS_TRANS_ID, this.f29483a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m1$i */
    public static final class i implements InterfaceC3604n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f29467a = new i();

        @Override // com.ironsource.InterfaceC3604n1
        public void a(Map<String, Object> map) {
            ck.p.j(map, ContainerActivity.BUNDLE);
        }

        private i() {
        }
    }

    private C3584m1() {
    }
}
