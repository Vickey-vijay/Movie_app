package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public final class Bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3227u9 f22426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3073o4 f22428c;

    public static final boolean a(Set set, C3023m4 c3023m4) {
        ck.p.j(c3023m4, "it");
        return set.contains(c3023m4.f24802b.getType());
    }

    public Bh(C3227u9 c3227u9) {
        ck.p.j(c3227u9, "configClient");
        this.f22426a = c3227u9;
        this.f22427b = Bh.class.getSimpleName();
        this.f22428c = new C3073o4();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    public final AbstractC3098p4 a(C3048n4 c3048n4, C3023m4 c3023m4) {
        C2872g2 c2872g2B;
        String type = c3023m4.f24802b.getType();
        ck.p.j(c3048n4, "<this>");
        ck.p.j(type, "configType");
        switch (type) {
            case "crashReporting":
                c2872g2B = c3048n4.b();
                break;
            case "ads":
                c2872g2B = c3048n4.a();
                break;
            case "root":
                c2872g2B = c3048n4.c();
                break;
            case "telemetry":
                c2872g2B = c3048n4.e();
                break;
            case "signals":
                c2872g2B = c3048n4.d();
                break;
            default:
                c2872g2B = null;
                break;
        }
        if (c2872g2B == null) {
            return new C2745b4(5, c3023m4.f24802b.getLastUpdateTimeStamp(), c3023m4.f24802b.getType());
        }
        C2965jl c2965jlA = this.f22428c.a(c2872g2B, c3023m4);
        int i10 = c2965jlA.f24630a;
        if (i10 == 200) {
            Config config = c2965jlA.f24631b;
            config.setLastUpdateTimeStamp(System.currentTimeMillis());
            ck.p.i(this.f22427b, "tag");
            c3023m4.f24802b.getType();
            return new C3123q4(200, config);
        }
        if (i10 != 304) {
            return new C2745b4(c2965jlA.f24630a, c3023m4.f24802b.getLastUpdateTimeStamp(), c3023m4.f24802b.getType());
        }
        Config config2 = c2965jlA.f24631b;
        config2.setLastUpdateTimeStamp(System.currentTimeMillis());
        ck.p.i(this.f22427b, "tag");
        c3023m4.f24802b.getType();
        return new C3123q4(304, config2);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0338  */
    /* JADX WARN: Code duplicated, block: B:116:0x036a  */
    /* JADX WARN: Code duplicated, block: B:120:0x037a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0382  */
    /* JADX WARN: Code duplicated, block: B:124:0x0397 A[LOOP:5: B:122:0x0391->B:124:0x0397, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x03be A[LOOP:6: B:126:0x03b8->B:128:0x03be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x03ff A[LOOP:4: B:131:0x03f9->B:133:0x03ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x042d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0446  */
    /* JADX WARN: Code duplicated, block: B:140:0x0450  */
    /* JADX WARN: Code duplicated, block: B:142:0x0469 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x046d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0471  */
    /* JADX WARN: Code duplicated, block: B:148:0x0479  */
    /* JADX WARN: Code duplicated, block: B:150:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:152:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:158:0x0207 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x0231  */
    /* JADX WARN: Code duplicated, block: B:77:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x026b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x026d  */
    /* JADX WARN: Code duplicated, block: B:87:0x027f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0287  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x04b2 -> B:15:0x0054). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.lang.String r27, java.lang.String r28, com.inmobi.media.core.config.models.RootConfig r29, java.util.List r30, pk.n r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instruction units count: 1257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Bh.a(java.lang.String, java.lang.String, com.inmobi.media.core.config.models.RootConfig, java.util.List, pk.n, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052 A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:12:0x002a, B:21:0x004e, B:23:0x0052, B:24:0x0056, B:26:0x005c, B:28:0x006b, B:29:0x0072), top: B:39:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, LOOP:0: B:24:0x0056->B:26:0x005c, LOOP_END, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:12:0x002a, B:21:0x004e, B:23:0x0052, B:24:0x0056, B:26:0x005c, B:28:0x006b, B:29:0x0072), top: B:39:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:28:0x006b A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:12:0x002a, B:21:0x004e, B:23:0x0052, B:24:0x0056, B:26:0x005c, B:28:0x006b, B:29:0x0072), top: B:39:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Ne ne2, List list, ContinuationImpl continuationImpl) throws Throwable {
        Ah ah2;
        ArrayList arrayList;
        C3048n4 c3048n4;
        Iterator it;
        if (continuationImpl instanceof Ah) {
            ah2 = (Ah) continuationImpl;
            int i10 = ah2.f22373e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ah2.f22373e = i10 - Integer.MIN_VALUE;
            } else {
                ah2 = new Ah(this, continuationImpl);
            }
        } else {
            ah2 = new Ah(this, continuationImpl);
        }
        Object obj = ah2.f22371c;
        Object objF = sj.a.f();
        int i11 = ah2.f22373e;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = ah2.f22370b;
            list = ah2.f22369a;
            try {
                kotlin.c.b(obj);
                c3048n4 = (C3048n4) obj;
                if (c3048n4 != null) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(a(c3048n4, (C3023m4) it.next()));
                    }
                    return arrayList;
                }
                throw new JSONException("Error parsing config response");
            } catch (ClassCastException unused) {
                a(list, 2);
                return arrayList;
            } catch (JSONException unused2) {
                a(list, 2);
                return arrayList;
            }
        }
        kotlin.c.b(obj);
        ArrayList arrayList2 = new ArrayList();
        try {
            ah2.f22369a = list;
            ah2.f22370b = arrayList2;
            ah2.f22373e = 1;
            Object objA = ne2.a();
            if (objA == objF) {
                return objF;
            }
            obj = objA;
            arrayList = arrayList2;
            c3048n4 = (C3048n4) obj;
            if (c3048n4 != null) {
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(a(c3048n4, (C3023m4) it.next()));
                }
                return arrayList;
            }
            throw new JSONException("Error parsing config response");
        } catch (ClassCastException unused3) {
            arrayList = arrayList2;
            a(list, 2);
            return arrayList;
        } catch (JSONException unused4) {
            arrayList = arrayList2;
            a(list, 2);
            return arrayList;
        }
        return arrayList;
    }

    public static void a(int i10, List list, List list2) {
        Map mapO = kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)), mj.h.a("name", list), mj.h.a("lts", list2), mj.h.a("networkType", C3298x5.m()));
        Wj wj2 = Wj.f23753a;
        Wj.b("InvalidConfig", mapO, EnumC2735ak.SDK);
    }

    public static void a(List list, int i10) {
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3023m4) it.next()).f24802b.getType());
        }
        ArrayList arrayList2 = new ArrayList(nj.t.v(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((C3023m4) it2.next()).f24802b.getLastUpdateTimeStamp()));
        }
        a(i10, arrayList, arrayList2);
    }
}
