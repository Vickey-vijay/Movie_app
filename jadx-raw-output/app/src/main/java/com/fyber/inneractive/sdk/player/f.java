package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f implements com.fyber.inneractive.sdk.player.controller.p, com.fyber.inneractive.sdk.player.controller.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.q f17963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t0 f17964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdRequest f17965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.measurement.e f17966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.measurement.f f17967e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q f17974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.r f17976n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f17968f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17969g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17970h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f17971i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17972j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17973k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f17977o = new c(this);

    public abstract void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject);

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
        IAlog.a("IMediaPlayerFlowManager: onPlayerError called with: %s", oVar.getMessage());
        a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, oVar), new JSONObject());
        if (this.f17970h) {
            IAlog.a("IMediaPlayerFlowManager: onPlayerError video was prepared. This is a critical error. Aborting!", new Object[0]);
            a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, oVar), new JSONObject());
        }
    }

    public abstract void a(com.fyber.inneractive.sdk.response.i iVar, VideoClickOrigin videoClickOrigin, x... xVarArr);

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z10) {
        try {
            t0 t0Var = this.f17964b;
            com.fyber.inneractive.sdk.response.g gVar = t0Var != null ? (com.fyber.inneractive.sdk.response.g) t0Var.f15747b : null;
            u uVar = u.VAST_MEDIA_LOAD_RETRY_ATTEMPTED;
            InneractiveAdRequest inneractiveAdRequest = this.f17965c;
            t0 t0Var2 = this.f17964b;
            JSONArray jSONArrayB = t0Var2 == null ? null : t0Var2.f15748c.b();
            w wVar = new w(gVar);
            wVar.f16129c = uVar;
            wVar.f16127a = inneractiveAdRequest;
            wVar.f16130d = jSONArrayB;
            if (this.f17976n != null && gVar != null) {
                wVar.f16132f.put(new com.fyber.inneractive.sdk.network.x().a(String.valueOf(z10), "waudio").a(this.f17976n.f15943g, "url").a(this.f17976n.f15941e, VastAttributes.BITRATE).a(TextUtils.isEmpty(this.f17976n.f15940d) ? "na" : this.f17976n.f15940d, "mime").a(this.f17976n.f15937a, "delivery").a(Integer.valueOf(this.f17973k), "media_file_index").a(this.f17963a.d(), "player").f16134a);
            }
            wVar.a((String) null);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    public f(Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        boolean zBooleanValue;
        com.fyber.inneractive.sdk.player.controller.q aVar = null;
        if (rVar != null) {
            try {
                Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.u) rVar.a(com.fyber.inneractive.sdk.config.global.features.u.class)).c("use_fmp_cache_mechanism");
                if (boolC != null) {
                    zBooleanValue = boolC.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                aVar = new com.fyber.inneractive.sdk.player.controller.f(context, zBooleanValue, rVar);
            } catch (Throwable th2) {
                if (IAlog.f18551a <= 3) {
                    IAlog.a("Failed creating exo player", new Object[0]);
                    th2.printStackTrace();
                }
            }
        } else {
            zBooleanValue = false;
            aVar = new com.fyber.inneractive.sdk.player.controller.f(context, zBooleanValue, rVar);
        }
        aVar = aVar == null ? new com.fyber.inneractive.sdk.player.controller.a(context) : aVar;
        this.f17963a = aVar;
        if (!aVar.f16234b.contains(this)) {
            aVar.f16234b.add(this);
        }
        com.fyber.inneractive.sdk.player.controller.q qVar = this.f17963a;
        if (!qVar.f16235c.contains(this)) {
            qVar.f16235c.add(this);
        }
        this.f17963a.f16238f = this.f17977o;
    }

    public static boolean a(int i10, int i11, s0 s0Var) {
        if (i11 == 1 || InneractiveAdManager.isCurrentUserAChild()) {
            return true;
        }
        if (i10 <= 15999) {
            return false;
        }
        com.fyber.inneractive.sdk.config.t0 t0Var = s0Var != null ? ((r0) s0Var).f15149f : null;
        return (t0Var == null || t0Var.f15207h == Skip.DEFAULT || t0Var.f15209j == UnitDisplayType.REWARDED) ? false : true;
    }

    public static int a(f fVar) {
        com.fyber.inneractive.sdk.response.e eVar;
        t0 t0Var = fVar.f17964b;
        if (t0Var == null || (eVar = t0Var.f15747b) == null) {
            return -1;
        }
        return ((com.fyber.inneractive.sdk.response.g) eVar).f18456y;
    }

    public final void a() {
        com.fyber.inneractive.sdk.measurement.f fVar = this.f17967e;
        if (fVar != null) {
            if (fVar.f15815a != null) {
                IAlog.a("%s destroy", "OMVideo");
                try {
                    fVar.f15815a.finish();
                } catch (Throwable th2) {
                    fVar.a(th2);
                }
            }
            fVar.f15816b = null;
            fVar.f15815a = null;
            fVar.f15817c = null;
        }
    }

    public static boolean a(com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.ignite.m mVar) {
        mVar.getClass();
        if (mVar == com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP && IAConfigManager.O.E.n() && rVar != null && rVar.a(com.fyber.inneractive.sdk.config.global.features.n.class) != null) {
            Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.n) rVar.a(com.fyber.inneractive.sdk.config.global.features.n.class)).c("enable_app_info_button");
            if (boolC != null ? boolC.booleanValue() : true) {
                return true;
            }
        }
        return false;
    }
}
