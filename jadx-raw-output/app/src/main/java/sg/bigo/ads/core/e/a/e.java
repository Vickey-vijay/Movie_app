package sg.bigo.ads.core.e.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.k;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f71332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f71333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f71334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JSONObject f71335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f71336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f71337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String[] f71338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String[] f71339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f71340j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f71341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, String> f71342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private sg.bigo.ads.common.g f71343m;

    public e(JSONObject jSONObject) {
        this(jSONObject, null);
    }

    public e(JSONObject jSONObject, sg.bigo.ads.common.g gVar) {
        this.f71343m = gVar;
        this.f71335e = jSONObject;
        this.f71342l = new HashMap();
        this.f71331a = jSONObject.optInt("type", 0);
        this.f71336f = jSONObject.optString("value", "");
        this.f71332b = jSONObject.optString("name", "");
        this.f71337g = jSONObject.optString(CommonUrlParts.UUID, "");
        this.f71341k = jSONObject.optInt("expired");
        this.f71333c = jSONObject.optInt("replace", 0);
        this.f71334d = jSONObject.optInt("norepeat", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reg");
        if (jSONArrayOptJSONArray != null) {
            this.f71338h = new String[jSONArrayOptJSONArray.length()];
            this.f71339i = new String[jSONArrayOptJSONArray.length()];
            a(jSONArrayOptJSONArray);
        }
        this.f71340j = jSONObject.optString("real_url");
    }

    private void a(JSONArray jSONArray) {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (jSONArray.optJSONObject(i10) != null) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                this.f71338h[i10] = jSONObjectOptJSONObject.optString("token", "");
                this.f71339i[i10] = jSONObjectOptJSONObject.optString("value", "");
            }
        }
    }

    private boolean f() {
        return this.f71333c == 1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private String g() {
        long jA;
        int iD;
        if (TextUtils.isEmpty(this.f71336f) || TextUtils.isEmpty(this.f71332b)) {
            return "";
        }
        String strTrim = this.f71336f.trim();
        if (this.f71338h != null && this.f71339i != null && this.f71343m != null) {
            for (int i10 = 0; i10 < this.f71338h.length; i10++) {
                String str = this.f71339i[i10];
                byte b10 = -1;
                switch (str.hashCode()) {
                    case -2138759690:
                        if (str.equals("regist_time")) {
                            b10 = 49;
                        }
                        break;
                    case -2076227591:
                        if (str.equals("timezone")) {
                            b10 = 21;
                        }
                        break;
                    case -1795462070:
                        if (str.equals("express_id")) {
                            b10 = 33;
                        }
                        break;
                    case -1600030548:
                        if (str.equals("resolution")) {
                            b10 = 17;
                        }
                        break;
                    case -1273393189:
                        if (str.equals("sec_price")) {
                            b10 = 36;
                        }
                        break;
                    case -1229750878:
                        if (str.equals("sec_bidder")) {
                            b10 = 37;
                        }
                        break;
                    case -1182905495:
                        if (str.equals("os_lang")) {
                            b10 = 13;
                        }
                        break;
                    case -1174888717:
                        if (str.equals("gps_adid")) {
                            b10 = 5;
                        }
                        break;
                    case -1029004888:
                        if (str.equals("ad_imp_indx")) {
                            b10 = ExifInterface.START_CODE;
                        }
                        break;
                    case -1007979832:
                        if (str.equals("os_ver")) {
                            b10 = 12;
                        }
                        break;
                    case -986522696:
                        if (str.equals("pkg_ch")) {
                            b10 = 10;
                        }
                        break;
                    case -986522112:
                        if (str.equals("pkg_vc")) {
                            b10 = 9;
                        }
                        break;
                    case -934795532:
                        if (str.equals("region")) {
                            b10 = 48;
                        }
                        break;
                    case -906980142:
                        if (str.equals("sdk_vc")) {
                            b10 = 23;
                        }
                        break;
                    case -820075192:
                        if (str.equals("vendor")) {
                            b10 = 14;
                        }
                        break;
                    case -793620671:
                        if (str.equals(MBridgeConstans.APP_KEY)) {
                            b10 = 6;
                        }
                        break;
                    case -777008198:
                        if (str.equals("click_prop")) {
                            b10 = 32;
                        }
                        break;
                    case -693230854:
                        if (str.equals("first_price")) {
                            b10 = 38;
                        }
                        break;
                    case -613897138:
                        if (str.equals("support_om")) {
                            b10 = 30;
                        }
                        break;
                    case -517414224:
                        if (str.equals("pkg_ver")) {
                            b10 = 8;
                        }
                        break;
                    case -424587677:
                        if (str.equals("first_bidder")) {
                            b10 = 39;
                        }
                        break;
                    case 3556:
                        if (str.equals(Q6.F)) {
                            b10 = 11;
                        }
                        break;
                    case 99677:
                        if (str.equals("dpi")) {
                            b10 = 18;
                        }
                        break;
                    case 104582:
                        if (str.equals("isp")) {
                            b10 = 16;
                        }
                        break;
                    case 106905:
                        if (str.equals("lan")) {
                            b10 = 19;
                        }
                        break;
                    case 106911:
                        if (str.equals(Q6.f27466s)) {
                            b10 = 27;
                        }
                        break;
                    case 107301:
                        if (str.equals("lng")) {
                            b10 = 28;
                        }
                        break;
                    case 107855:
                        if (str.equals("mac")) {
                            b10 = 46;
                        }
                        break;
                    case 108957:
                        if (str.equals("net")) {
                            b10 = 20;
                        }
                        break;
                    case 115792:
                        if (str.equals("uid")) {
                            b10 = 51;
                        }
                        break;
                    case 3053931:
                        if (str.equals("city")) {
                            b10 = 26;
                        }
                        break;
                    case 3165045:
                        if (str.equals(Q6.V0)) {
                            b10 = 3;
                        }
                        break;
                    case 3184265:
                        if (str.equals("guid")) {
                            b10 = 2;
                        }
                        break;
                    case 3197719:
                        if (str.equals("hdid")) {
                            b10 = 47;
                        }
                        break;
                    case 3236040:
                        if (str.equals("imei")) {
                            b10 = 44;
                        }
                        break;
                    case 3236474:
                        if (str.equals("imsi")) {
                            b10 = 45;
                        }
                        break;
                    case 25209764:
                        if (str.equals("device_id")) {
                            b10 = 52;
                        }
                        break;
                    case 55126294:
                        if (str.equals("timestamp")) {
                            b10 = 0;
                        }
                        break;
                    case 92714869:
                        if (str.equals("af_id")) {
                            b10 = 29;
                        }
                        break;
                    case 104069929:
                        if (str.equals("model")) {
                            b10 = 15;
                        }
                        break;
                    case 109757585:
                        if (str.equals("state")) {
                            b10 = 25;
                        }
                        break;
                    case 440309782:
                        if (str.equals("advertising_id")) {
                            b10 = 4;
                        }
                        break;
                    case 530453763:
                        if (str.equals("click_module")) {
                            b10 = 35;
                        }
                        break;
                    case 702731954:
                        if (str.equals("click_source")) {
                            b10 = 34;
                        }
                        break;
                    case 957831062:
                        if (str.equals("country")) {
                            b10 = 24;
                        }
                        break;
                    case 1139786014:
                        if (str.equals("pkg_name")) {
                            b10 = 7;
                        }
                        break;
                    case 1139954915:
                        if (str.equals("pkg_sver")) {
                            b10 = 43;
                        }
                        break;
                    case 1505024451:
                        if (str.equals("local_timestamp_ms")) {
                            b10 = 1;
                        }
                        break;
                    case 1583758243:
                        if (str.equals("action_type")) {
                            b10 = 31;
                        }
                        break;
                    case 1793985248:
                        if (str.equals("loss_reason")) {
                            b10 = 40;
                        }
                        break;
                    case 1845546289:
                        if (str.equals("new_uid")) {
                            b10 = 50;
                        }
                        break;
                    case 1939141228:
                        if (str.equals("ad_click_indx")) {
                            b10 = 41;
                        }
                        break;
                    case 1948386846:
                        if (str.equals("sdk_ver")) {
                            b10 = 22;
                        }
                        break;
                }
                String strValueOf = "0";
                switch (b10) {
                    case 0:
                        jA = r.a();
                        strValueOf = String.valueOf(jA);
                        break;
                    case 1:
                        jA = System.currentTimeMillis();
                        strValueOf = String.valueOf(jA);
                        break;
                    case 2:
                        strValueOf = this.f71343m.C();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strValueOf = this.f71343m.A();
                        break;
                    case 6:
                        strValueOf = this.f71343m.a();
                        break;
                    case 7:
                        strValueOf = this.f71343m.b();
                        break;
                    case 8:
                        strValueOf = String.valueOf(this.f71343m.c());
                        break;
                    case 9:
                        iD = this.f71343m.d();
                        strValueOf = String.valueOf(iD);
                        break;
                    case 10:
                        strValueOf = this.f71343m.e();
                        break;
                    case 11:
                        strValueOf = this.f71343m.i();
                        break;
                    case 12:
                        strValueOf = this.f71343m.j();
                        break;
                    case 13:
                    case 19:
                        strValueOf = this.f71343m.k();
                        break;
                    case 14:
                        strValueOf = this.f71343m.l();
                        break;
                    case 15:
                        strValueOf = this.f71343m.m();
                        break;
                    case 16:
                        strValueOf = this.f71343m.n();
                        break;
                    case 17:
                        strValueOf = this.f71343m.o();
                        break;
                    case 18:
                        iD = this.f71343m.p();
                        strValueOf = String.valueOf(iD);
                        break;
                    case 20:
                        strValueOf = this.f71343m.r();
                        break;
                    case 21:
                        strValueOf = this.f71343m.s();
                        break;
                    case 22:
                        strValueOf = this.f71343m.y();
                        break;
                    case 23:
                        strValueOf = "50602";
                        break;
                    case 24:
                        strValueOf = this.f71343m.t();
                        break;
                    case 25:
                        strValueOf = this.f71343m.w();
                        break;
                    case 26:
                        strValueOf = this.f71343m.x();
                        break;
                    case 27:
                    case 28:
                        break;
                    case 29:
                        strValueOf = this.f71343m.B();
                        break;
                    case 30:
                        strValueOf = "1";
                        break;
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                        if (this.f71342l.containsKey(str)) {
                            strValueOf = this.f71342l.get(str);
                            break;
                        }
                    default:
                        strValueOf = "";
                        break;
                }
                String str2 = this.f71338h[i10];
                if (strValueOf == null) {
                    strValueOf = "";
                }
                strTrim = strTrim.replace(str2, strValueOf);
            }
        }
        sg.bigo.ads.api.a.h hVar = i.f69318a;
        if (strTrim == null || hVar == null || !hVar.n().a(8)) {
            return strTrim;
        }
        try {
            return strTrim.replace(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d, "%7B").replace(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e, "%7D");
        } catch (Exception unused) {
            return strTrim;
        }
    }

    public final void a(@NonNull String str, @NonNull String str2) {
        this.f71342l.put(str, str2);
    }

    public final boolean a() {
        return "bigo_tracker".equals(this.f71337g);
    }

    public final boolean b() {
        return this.f71341k != 0 && r.a() / 1000 > ((long) this.f71341k);
    }

    public final boolean c() {
        return this.f71331a == 0;
    }

    @NonNull
    public final sg.bigo.ads.common.u.a d() {
        if (TextUtils.isEmpty(this.f71340j)) {
            e();
            sg.bigo.ads.common.t.a.a(0, 3, "ThirdTrack", "getRealUrl url = " + this.f71340j);
        }
        k.b aVar = null;
        if (c() && f()) {
            k kVar = d.a().f71324d;
            if (kVar != null) {
                aVar = kVar.a(this.f71340j);
                sg.bigo.ads.common.t.a.a(0, 3, "ThirdTrack", "replaceHost new url = " + aVar.a());
            } else {
                sg.bigo.ads.common.t.a.a(0, "ThirdTrack", "replaceHost handle is null, replace failed");
            }
        }
        if (aVar == null) {
            aVar = new k.a(this.f71340j);
        }
        return new sg.bigo.ads.core.e.a(aVar);
    }

    public final void e() {
        this.f71340j = g();
        sg.bigo.ads.common.t.a.a(0, 3, "ThirdTrack", "updateRealUrl url = " + this.f71340j);
        JSONObject jSONObject = this.f71335e;
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("real_url", this.f71340j);
            } catch (JSONException unused) {
            }
        }
    }

    public final String toString() {
        return "type=" + this.f71331a + ",name=" + this.f71332b + ",url=" + this.f71340j;
    }
}
