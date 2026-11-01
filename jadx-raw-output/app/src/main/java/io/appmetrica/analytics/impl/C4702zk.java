package io.appmetrica.analytics.impl;

import android.content.Context;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4702zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4082b7 f58057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z6 f58058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T2 f58059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U2 f58060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4543tb f58061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C4568ub f58062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C4555tn f58063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C4580un f58064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f58065i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f58066j = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f58067k = new LinkedHashMap();

    public final IBinaryDataHelper a(Context context) {
        T2 t10 = this.f58059c;
        if (t10 != null) {
            return t10;
        }
        T2 t11 = new T2(new C4503rl(f(context)), "binary_data");
        this.f58059c = t11;
        return t11;
    }

    public final synchronized IBinaryDataHelper b(Context context) {
        U2 u10;
        u10 = this.f58060d;
        if (u10 == null) {
            u10 = new U2(a(context));
            this.f58060d = u10;
        }
        return u10;
    }

    public final synchronized IBinaryDataHelper c(Context context) {
        return a(context);
    }

    public final synchronized Ia d(Context context) {
        C4568ub c4568ub;
        c4568ub = this.f58062f;
        if (c4568ub == null) {
            C4543tb c4543tb = this.f58061e;
            if (c4543tb == null) {
                c4543tb = new C4543tb(new C4503rl(f(context)));
                this.f58061e = c4543tb;
            }
            c4568ub = new C4568ub(c4543tb);
            this.f58062f = c4568ub;
        }
        return c4568ub;
    }

    public final synchronized Ia e(Context context) {
        C4543tb c4543tb;
        c4543tb = this.f58061e;
        if (c4543tb == null) {
            c4543tb = new C4543tb(new C4503rl(f(context)));
            this.f58061e = c4543tb;
        }
        return c4543tb;
    }

    public final synchronized Z6 f(Context context) {
        Z6 z10;
        z10 = this.f58058b;
        if (z10 == null) {
            C4082b7 c4082b7 = this.f58057a;
            String strA = new C4056a7(c4082b7.f56415a, c4082b7.f56416b, true).a(context, new C4224gk());
            N6 n10 = AbstractC4637x5.f57915c;
            n10.getClass();
            HashMap map = new HashMap();
            map.put("preferences", InterfaceC4562u5.f57754a);
            map.put("binary_data", AbstractC4512s5.f57648a);
            map.put("temp_cache", AbstractC4630wn.f57899a);
            Iterator<ModuleServicesDatabase> it = C4418oa.I.p().b().iterator();
            while (it.hasNext()) {
                for (TableDescription tableDescription : it.next().getTables()) {
                    map.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                }
            }
            C4278in c4278in = n10.f55611c;
            X6 x10 = n10.f55609a;
            V6 v10 = x10.f56139e;
            W6 w10 = x10.f56140f;
            C4468qa c4468qa = new C4468qa(false);
            c4468qa.a(114, new C4250hk());
            Iterator<ModuleServicesDatabase> it2 = C4418oa.I.p().b().iterator();
            while (it2.hasNext()) {
                Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                while (it3.hasNext()) {
                    for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                        c4468qa.a(entry.getKey(), entry.getValue());
                    }
                }
            }
            C4356ln c4356ln = new C4356ln("service database", map);
            c4278in.getClass();
            z10 = new Z6(context, strA, new C4304jn(v10, w10, c4468qa, c4356ln), PublicLogger.getAnonymousInstance());
            this.f58058b = z10;
        }
        return z10;
    }

    public final synchronized Z6 c(Context context, R4 r10) {
        Object z10;
        String str = new I4(r10).f55336a;
        LinkedHashMap linkedHashMap = this.f58065i;
        z10 = linkedHashMap.get(str);
        if (z10 == null) {
            C4082b7 c4082b7 = this.f58057a;
            String strA = new C4056a7(c4082b7.f56415a, c4082b7.f56416b, false).a(context, new I4(r10));
            N6 n10 = AbstractC4637x5.f57915c;
            n10.getClass();
            Object[] objArr = new Object[1];
            String str2 = r10.f55817b;
            if (str2 == null) {
                str2 = C3426d4.i.Z;
            }
            objArr[0] = str2;
            String str3 = String.format("component-%s", objArr);
            C4278in c4278in = n10.f55611c;
            X6 x10 = n10.f55609a;
            P6 p10 = x10.f56135a;
            Q6 q10 = x10.f56136b;
            C4468qa c4468qa = new C4468qa(false);
            c4468qa.a(112, new L4());
            C4356ln c4356ln = new C4356ln(str3, n10.f55610b.f57797a);
            c4278in.getClass();
            z10 = new Z6(context, strA, new C4304jn(p10, q10, c4468qa, c4356ln), PublicLogger.getAnonymousInstance());
            linkedHashMap.put(str, z10);
        }
        return (Z6) z10;
    }

    public C4702zk(File file) {
        this.f58057a = new C4082b7(file);
    }

    public final synchronized IBinaryDataHelper a(Context context, R4 r10) {
        Object t10;
        String str = new I4(r10).f55336a;
        LinkedHashMap linkedHashMap = this.f58067k;
        t10 = linkedHashMap.get(str);
        if (t10 == null) {
            t10 = new T2(new C4503rl(c(context, r10)), "binary_data");
            linkedHashMap.put(str, t10);
        }
        return (IBinaryDataHelper) t10;
    }

    public final synchronized Ia b(Context context, R4 r10) {
        Object c4543tb;
        String str = new I4(r10).f55336a;
        LinkedHashMap linkedHashMap = this.f58066j;
        c4543tb = linkedHashMap.get(str);
        if (c4543tb == null) {
            c4543tb = new C4543tb(new C4503rl(c(context, r10)));
            linkedHashMap.put(str, c4543tb);
        }
        return (Ia) c4543tb;
    }
}
