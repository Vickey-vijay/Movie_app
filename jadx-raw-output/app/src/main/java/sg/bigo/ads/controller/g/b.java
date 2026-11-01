package sg.bigo.ads.controller.g;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes11.dex */
public class b extends a<sg.bigo.ads.controller.a.f> implements i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sg.bigo.ads.api.a.h f70913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sg.bigo.ads.api.b f70914k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sg.bigo.ads.api.a.l f70915l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> f70916m;

    public b(@NonNull sg.bigo.ads.api.a.h hVar, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.controller.a.b bVar, @NonNull sg.bigo.ads.api.b bVar2, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> eVar) {
        super(gVar, bVar, ((long) lVar.d()) * 1000);
        this.f70913j = hVar;
        this.f70914k = bVar2;
        this.f70915l = lVar;
        this.f70916m = eVar;
        bVar2.a(this.f70897e, this.f70898f, this.f70899g);
    }

    @Override // sg.bigo.ads.controller.g.a
    @NonNull
    public final StringBuilder a(long j10, String str) {
        StringBuilder sbA = super.a(j10, str);
        sbA.append(StringUtils.COMMA);
        sbA.append(q.a(this.f70915l.l()));
        sbA.append(StringUtils.COMMA);
        sbA.append(q.a(this.f70915l.n()));
        return sbA;
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(int i10, int i11, String str) {
        sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.b, sg.bigo.ads.api.a.l> eVar = this.f70916m;
        if (eVar != null) {
            eVar.a(a(), i10, i11, str, this.f70915l);
        }
    }

    @Override // sg.bigo.ads.controller.g.a
    public void a(@NonNull String str, @NonNull Map<String, Object> map) {
        if (this.f70916m != null) {
            Object obj = map.get("logid");
            sg.bigo.ads.controller.c.b bVarA = sg.bigo.ads.controller.c.b.a(obj instanceof Long ? ((Long) obj).longValue() : 0L, this.f70914k.f69326h, this.f70915l, str);
            if (bVarA != null) {
                this.f70916m.a(a(), this.f70914k, bVarA);
            } else {
                a(1005, 0, "Invalid ad data.");
            }
        }
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(@NonNull a.b bVar) {
        int iU;
        bVar.a("slot", q.a(this.f70915l.l()));
        bVar.a(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, q.a(this.f70915l.n()));
        bVar.a("strategy_id", this.f70915l.a());
        bVar.a("support_adx_types", sg.bigo.ads.api.core.a.a(this.f70914k.c()));
        bVar.a("lat_enable", Integer.valueOf(this.f70894b.z() ? 1 : 0));
        bVar.a("hw_lat_enable", Integer.valueOf(this.f70894b.F() ? 1 : 0));
        bVar.a("fire_lat_enable", Integer.valueOf(this.f70894b.ad() ? 1 : 0));
        bVar.a("token", this.f70913j.l());
        bVar.a("slot_abflags", this.f70915l.o());
        bVar.a("global_abflags", this.f70913j.j());
        bVar.a("support_playable_ad", Integer.valueOf(this.f70915l.r()));
        bVar.a("session_id", this.f70914k.f69326h.f69328b);
        int iC = sg.bigo.ads.common.f.b.c();
        bVar.a("req_status", Integer.valueOf(iC));
        this.f70914k.c(iC);
        this.f70914k.b(this.f70894b.X());
        if (sg.bigo.ads.controller.e.h.a().f70870a) {
            bVar.a("algo_info", sg.bigo.ads.controller.e.h.a().f70874e.a(q.a(this.f70915l.l())));
        }
        bVar.a("auc_mode", Integer.valueOf(this.f70915l.v()));
        if (sg.bigo.ads.api.core.a.d(this.f70915l.b())) {
            iU = this.f70915l.q().a("splash_orientation");
        } else {
            sg.bigo.ads.api.a.h hVar = sg.bigo.ads.api.a.i.f69318a;
            iU = hVar == null ? 0 : hVar.u();
        }
        bVar.a("orientation", Integer.valueOf(iU));
        Map<String, Object> mapD = this.f70914k.d();
        if (mapD != null) {
            for (Map.Entry<String, Object> entry : mapD.entrySet()) {
                bVar.a(entry.getKey(), entry.getValue());
            }
        }
        String str = this.f70914k.f69326h.f69327a;
        if (!q.a((CharSequence) str)) {
            bVar.a("load_ext", str);
        }
        String strA = d.a(this.f70914k, this.f70894b);
        if (!TextUtils.isEmpty(strA)) {
            bVar.a("ad_info", strA);
        }
        sg.bigo.ads.common.b bVarAc = this.f70894b.ac();
        bVar.a("bat_stat", bVarAc != null ? String.valueOf(bVarAc.f69491c) : "");
        bVar.a("bat_num", bVarAc != null ? String.valueOf(bVarAc.f69489a) : "");
        bVar.a("bat_scale", bVarAc != null ? String.valueOf(bVarAc.f69490b) : "");
        bVar.a("tc_string", sg.bigo.ads.common.m.b.e());
        if (!(this instanceof j)) {
            bVar.a("imp_pattern", Integer.valueOf(this.f70894b.av()));
        }
        bVar.a("gp_vc", Integer.valueOf(this.f70894b.aw()));
    }

    @Override // sg.bigo.ads.controller.g.a
    @Nullable
    public final sg.bigo.ads.common.n.e c() {
        return sg.bigo.ads.common.u.a.e.d();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final long e() {
        sg.bigo.ads.controller.a.b bVar = this.f70895c;
        return bVar != null ? bVar.f70407a.f70339l.f70403b : super.e();
    }

    @Override // sg.bigo.ads.controller.g.a
    public void i() {
        sg.bigo.ads.common.x.a.y();
    }

    @Override // sg.bigo.ads.controller.g.a
    public boolean j() {
        return sg.bigo.ads.api.a.i.f69318a.d() && sg.bigo.ads.common.x.a.x();
    }

    @Override // sg.bigo.ads.controller.g.i
    @NonNull
    public final sg.bigo.ads.api.b k() {
        return this.f70914k;
    }

    @Override // sg.bigo.ads.controller.g.i
    @NonNull
    public final sg.bigo.ads.api.a.l l() {
        return this.f70915l;
    }

    @Override // sg.bigo.ads.controller.g.a
    @NonNull
    /* JADX INFO: renamed from: m */
    public sg.bigo.ads.controller.a.f f() {
        return this.f70895c.b("/Ad/GetUniAd", null);
    }
}
