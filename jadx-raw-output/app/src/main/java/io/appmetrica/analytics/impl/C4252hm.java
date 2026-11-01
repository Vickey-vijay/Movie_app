package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4252hm implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4696ze f56915a = new C4696ze();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4214ga f56916b = new C4214ga();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Im f56917c = new Im();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4207g3 f56918d = new C4207g3();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4410o2 f56919e = new C4410o2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4638x6 f56920f = new C4638x6();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Em f56921g = new Em();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4471qd f56922h = new C4471qd();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final D9 f56923i = new D9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4654xm fromModel(@NonNull C4329km c4329km) {
        C4654xm c4654xm = new C4654xm();
        c4654xm.f57964s = c4329km.f57151u;
        c4654xm.f57965t = c4329km.f57152v;
        String str = c4329km.f57131a;
        if (str != null) {
            c4654xm.f57946a = str;
        }
        List list = c4329km.f57136f;
        if (list != null) {
            c4654xm.f57951f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c4329km.f57137g;
        if (list2 != null) {
            c4654xm.f57952g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c4329km.f57132b;
        if (list3 != null) {
            c4654xm.f57948c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c4329km.f57138h;
        if (list4 != null) {
            c4654xm.f57960o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c4329km.f57139i;
        if (map != null) {
            c4654xm.f57953h = this.f56920f.fromModel(map);
        }
        C4671ye c4671ye = c4329km.f57149s;
        if (c4671ye != null) {
            c4654xm.f57967v = this.f56915a.fromModel(c4671ye);
        }
        String str2 = c4329km.f57140j;
        if (str2 != null) {
            c4654xm.f57955j = str2;
        }
        String str3 = c4329km.f57133c;
        if (str3 != null) {
            c4654xm.f57949d = str3;
        }
        String str4 = c4329km.f57134d;
        if (str4 != null) {
            c4654xm.f57950e = str4;
        }
        String str5 = c4329km.f57135e;
        if (str5 != null) {
            c4654xm.f57963r = str5;
        }
        c4654xm.f57954i = this.f56916b.fromModel(c4329km.f57143m);
        String str6 = c4329km.f57141k;
        if (str6 != null) {
            c4654xm.f57956k = str6;
        }
        String str7 = c4329km.f57142l;
        if (str7 != null) {
            c4654xm.f57957l = str7;
        }
        c4654xm.f57958m = c4329km.f57146p;
        c4654xm.f57947b = c4329km.f57144n;
        c4654xm.f57962q = c4329km.f57145o;
        RetryPolicyConfig retryPolicyConfig = c4329km.f57150t;
        c4654xm.f57968w = retryPolicyConfig.maxIntervalSeconds;
        c4654xm.f57969x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c4329km.f57147q;
        if (str8 != null) {
            c4654xm.f57959n = str8;
        }
        Hm hm2 = c4329km.f57148r;
        if (hm2 != null) {
            this.f56917c.getClass();
            C4629wm c4629wm = new C4629wm();
            c4629wm.f57898a = hm2.f55324a;
            c4654xm.f57961p = c4629wm;
        }
        c4654xm.f57966u = c4329km.f57153w;
        C4155e3 c4155e3 = c4329km.f57154x;
        if (c4155e3 != null) {
            this.f56918d.getClass();
            C4455pm c4455pm = new C4455pm();
            c4455pm.f57526a = c4155e3.f56634a;
            c4654xm.f57970y = c4455pm;
        }
        C4385n2 c4385n2 = c4329km.f57155y;
        if (c4385n2 != null) {
            c4654xm.f57971z = this.f56919e.fromModel(c4385n2);
        }
        c4654xm.A = this.f56921g.fromModel(c4329km.f57156z);
        c4654xm.B = this.f56922h.fromModel(c4329km.A);
        c4654xm.C = this.f56923i.fromModel(c4329km.B);
        return c4654xm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4329km toModel(@NonNull C4654xm c4654xm) {
        C4303jm c4303jm = new C4303jm(this.f56916b.toModel(c4654xm.f57954i));
        c4303jm.f57030a = c4654xm.f57946a;
        c4303jm.f57039j = c4654xm.f57955j;
        c4303jm.f57032c = c4654xm.f57949d;
        c4303jm.f57031b = Arrays.asList(c4654xm.f57948c);
        c4303jm.f57036g = Arrays.asList(c4654xm.f57952g);
        c4303jm.f57035f = Arrays.asList(c4654xm.f57951f);
        c4303jm.f57033d = c4654xm.f57950e;
        c4303jm.f57034e = c4654xm.f57963r;
        c4303jm.f57037h = Arrays.asList(c4654xm.f57960o);
        c4303jm.f57040k = c4654xm.f57956k;
        c4303jm.f57041l = c4654xm.f57957l;
        c4303jm.f57046q = c4654xm.f57958m;
        c4303jm.f57044o = c4654xm.f57947b;
        c4303jm.f57045p = c4654xm.f57962q;
        c4303jm.f57049t = c4654xm.f57964s;
        c4303jm.f57050u = c4654xm.f57965t;
        c4303jm.f57047r = c4654xm.f57959n;
        c4303jm.f57051v = c4654xm.f57966u;
        c4303jm.f57052w = new RetryPolicyConfig(c4654xm.f57968w, c4654xm.f57969x);
        c4303jm.f57038i = this.f56920f.toModel(c4654xm.f57953h);
        C4579um c4579um = c4654xm.f57967v;
        if (c4579um != null) {
            this.f56915a.getClass();
            c4303jm.f57043n = new C4671ye(c4579um.f57777a, c4579um.f57778b);
        }
        C4629wm c4629wm = c4654xm.f57961p;
        if (c4629wm != null) {
            this.f56917c.getClass();
            c4303jm.f57048s = new Hm(c4629wm.f57898a);
        }
        C4455pm c4455pm = c4654xm.f57970y;
        if (c4455pm != null) {
            this.f56918d.getClass();
            c4303jm.f57053x = new C4155e3(c4455pm.f57526a);
        }
        C4430om c4430om = c4654xm.f57971z;
        if (c4430om != null) {
            c4303jm.f57054y = this.f56919e.toModel(c4430om);
        }
        C4604vm c4604vm = c4654xm.A;
        if (c4604vm != null) {
            this.f56921g.getClass();
            c4303jm.f57055z = new Dm(c4604vm.f57849a);
        }
        c4303jm.A = this.f56922h.toModel(c4654xm.B);
        C4504rm c4504rm = c4654xm.C;
        if (c4504rm != null) {
            this.f56923i.getClass();
            c4303jm.B = new C9(c4504rm.f57615a);
        }
        return new C4329km(c4303jm);
    }
}
