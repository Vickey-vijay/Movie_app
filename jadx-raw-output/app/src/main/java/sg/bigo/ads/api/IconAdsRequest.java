package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;
import sg.bigo.ads.api.a.l;

/* JADX INFO: loaded from: classes9.dex */
public class IconAdsRequest extends sg.bigo.ads.api.b implements sg.bigo.ads.api.b.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l f69287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final sg.bigo.ads.api.core.b f69288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f69289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f69290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f69291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f69292n;

    public static class a extends c<a, IconAdsRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l f69293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public sg.bigo.ads.api.core.b f69294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f69295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f69296d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f69297e = 20;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f69298f;

        @Override // sg.bigo.ads.api.c
        public final /* synthetic */ sg.bigo.ads.api.b createAdRequest() {
            if (this.f69293a == null) {
                return null;
            }
            return new IconAdsRequest(this, (byte) 0);
        }
    }

    public interface b {
        int a();
    }

    private IconAdsRequest(@NonNull a aVar) {
        super(aVar.mSlotId, null);
        this.f69287i = aVar.f69293a;
        this.f69288j = aVar.f69294b;
        this.f69289k = aVar.f69295c;
        this.f69290l = aVar.f69296d;
        this.f69291m = aVar.f69297e;
        this.f69292n = aVar.f69298f;
    }

    public /* synthetic */ IconAdsRequest(a aVar, byte b10) {
        this(aVar);
    }

    @Override // sg.bigo.ads.api.b
    public final int c() {
        return this.f69287i.b();
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final Map<String, Object> d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sg.bigo.ads.api.core.b bVar = this.f69288j;
        if (bVar != null) {
            linkedHashMap.put("host_slot", bVar.b());
            linkedHashMap.put("host_placement", this.f69288j.c());
            linkedHashMap.put("host_ad_type", Integer.valueOf(this.f69288j.x()));
            linkedHashMap.put("host_adx_type", Integer.valueOf(this.f69288j.w()));
            linkedHashMap.put("dsp_source", this.f69288j.v());
            linkedHashMap.put("main_domain", this.f69288j.i());
            linkedHashMap.put("main_bundle", this.f69288j.n());
            linkedHashMap.put("main_adx_sid", Long.valueOf(this.f69288j.y()));
            linkedHashMap.put("main_ad_id", this.f69288j.r());
            linkedHashMap.put("dsp_extra", this.f69288j.an());
        }
        linkedHashMap.put("adx_type", 5);
        linkedHashMap.put("ad_type", Integer.valueOf(c()));
        linkedHashMap.put("icon_ads_type", Integer.valueOf(this.f69290l));
        linkedHashMap.put("scene_page", Integer.valueOf(this.f69289k));
        linkedHashMap.put("icon_num", Integer.valueOf(this.f69291m));
        return linkedHashMap;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean e() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean f() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean g() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final l h() {
        return this.f69287i;
    }

    @Override // sg.bigo.ads.api.b.b
    public final sg.bigo.ads.api.core.b i() {
        return this.f69288j;
    }

    @Override // sg.bigo.ads.api.b.c
    public final int j() {
        return this.f69291m;
    }

    @Override // sg.bigo.ads.api.b.c
    public final int k() {
        return this.f69289k;
    }

    @Override // sg.bigo.ads.api.b.c
    public final int l() {
        b bVar = this.f69292n;
        if (bVar != null) {
            return bVar.a();
        }
        return 1;
    }
}
