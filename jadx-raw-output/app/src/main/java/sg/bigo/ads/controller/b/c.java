package sg.bigo.ads.controller.b;

import android.os.Parcel;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements sg.bigo.ads.api.a.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[][] f70525n = {new int[]{1, 2}, new int[]{3, 4}};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f70533h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70526a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f70527b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f70528c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f70529d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f70530e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f70531f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f70532g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final a f70534i = new a(3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final a f70535j = new a(4);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final a f70536k = new a(12);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final a f70537l = new a(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final a f70538m = new a(20);

    public class a implements sg.bigo.ads.common.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70539a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f70540b = 20;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f70541c = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f70543e;

        public a(int i10) {
            this.f70543e = i10;
        }

        @Override // sg.bigo.ads.common.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeInt(this.f70539a);
            parcel.writeInt(this.f70540b);
            parcel.writeInt(this.f70543e);
            parcel.writeInt(this.f70541c);
        }

        public final void a(JSONObject jSONObject) {
            String str;
            int i10 = this.f70543e;
            if (i10 == 1) {
                this.f70539a = jSONObject.optInt("nat_load_fail_fill", 0);
                this.f70541c = jSONObject.optInt("nat_time_for_check_process", 5);
                str = "nat_min_video_loading_pro";
            } else if (i10 == 12) {
                this.f70539a = jSONObject.optInt("spl_load_fail_fill", 0);
                this.f70541c = jSONObject.optInt("spl_time_for_check_process", 5);
                str = "spl_min_video_loading_pro";
            } else if (i10 == 20) {
                this.f70539a = jSONObject.optInt("pop_load_fail_fill", 0);
                this.f70541c = jSONObject.optInt("pop_time_for_check_process", 5);
                this.f70540b = jSONObject.optInt("pop_min_video_loading_pro", 20);
                return;
            } else if (i10 == 3) {
                this.f70539a = jSONObject.optInt("int_load_fail_fill", 0);
                this.f70541c = jSONObject.optInt("int_time_for_check_process", 5);
                str = "int_min_video_loading_pro";
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f70539a = jSONObject.optInt("rew_load_fail_fill", 0);
                this.f70541c = jSONObject.optInt("rew_time_for_check_process", 5);
                str = "rew_min_video_loading_pro";
            }
            this.f70540b = jSONObject.optInt(str, 20);
        }

        @Override // sg.bigo.ads.common.f
        public final void b(@NonNull Parcel parcel) {
            this.f70539a = parcel.readInt();
            this.f70540b = parcel.readInt();
            this.f70543e = parcel.readInt();
            this.f70541c = parcel.readInt();
        }
    }

    @Override // sg.bigo.ads.api.a.d
    public final int a() {
        return this.f70526a;
    }

    @Override // sg.bigo.ads.api.a.d
    public final int a(int i10) {
        if (i10 == 1) {
            return this.f70532g;
        }
        if (i10 == 12) {
            return this.f70531f;
        }
        if (i10 == 20) {
            return this.f70533h;
        }
        if (i10 == 3) {
            return this.f70529d;
        }
        if (i10 != 4) {
            return 0;
        }
        return this.f70530e;
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeInt(this.f70526a);
        parcel.writeString(this.f70527b);
        parcel.writeString(this.f70528c);
        parcel.writeInt(this.f70529d);
        parcel.writeInt(this.f70530e);
        parcel.writeInt(this.f70531f);
        parcel.writeInt(this.f70532g);
        n.a(parcel, this.f70534i);
        n.a(parcel, this.f70535j);
        n.a(parcel, this.f70536k);
        n.a(parcel, this.f70537l);
        parcel.writeInt(this.f70533h);
        n.a(parcel, this.f70538m);
    }

    @Override // sg.bigo.ads.api.a.d
    public final boolean a(String str, int i10) {
        int i11 = !q.a((CharSequence) this.f70527b) ? 1 : 0;
        int i12 = !q.a((CharSequence) this.f70528c) ? 1 : 0;
        if (a(i10) > 0) {
            int i13 = f70525n[i11][i12];
            if (i13 != 1) {
                if (i13 != 2) {
                    return i13 == 3 && q.a(this.f70527b.split(StringUtils.COMMA), str);
                }
                if (!q.a(this.f70528c.split(StringUtils.COMMA), str)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // sg.bigo.ads.api.a.d
    public final int b(int i10) {
        a aVar;
        if (i10 == 1) {
            aVar = this.f70537l;
        } else if (i10 == 12) {
            aVar = this.f70536k;
        } else if (i10 == 20) {
            aVar = this.f70538m;
        } else if (i10 == 3) {
            aVar = this.f70534i;
        } else {
            if (i10 != 4) {
                return 5;
            }
            aVar = this.f70535j;
        }
        return aVar.f70541c;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f70526a = parcel.readInt();
        this.f70527b = parcel.readString();
        this.f70528c = parcel.readString();
        this.f70529d = parcel.readInt();
        this.f70530e = parcel.readInt();
        this.f70531f = parcel.readInt();
        this.f70532g = parcel.readInt();
        n.b(parcel, this.f70534i);
        n.b(parcel, this.f70535j);
        n.b(parcel, this.f70536k);
        n.b(parcel, this.f70537l);
        this.f70533h = parcel.readInt();
        n.b(parcel, this.f70538m);
    }

    @Override // sg.bigo.ads.api.a.d
    public final boolean c(int i10) {
        if (i10 == 1) {
            return this.f70537l.f70539a == 1;
        }
        if (i10 == 12) {
            return this.f70536k.f70539a == 1;
        }
        if (i10 == 20) {
            return this.f70538m.f70539a == 1;
        }
        if (i10 != 3) {
            return i10 == 4 && this.f70535j.f70539a == 1;
        }
        return this.f70534i.f70539a == 1;
    }

    @Override // sg.bigo.ads.api.a.d
    public final int d(int i10) {
        a aVar;
        if (i10 == 1) {
            aVar = this.f70537l;
        } else if (i10 == 12) {
            aVar = this.f70536k;
        } else if (i10 == 20) {
            aVar = this.f70538m;
        } else if (i10 == 3) {
            aVar = this.f70534i;
        } else {
            if (i10 != 4) {
                return 20;
            }
            aVar = this.f70535j;
        }
        return aVar.f70540b;
    }
}
