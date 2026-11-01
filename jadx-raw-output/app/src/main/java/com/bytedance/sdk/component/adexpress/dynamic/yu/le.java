package com.bytedance.sdk.component.adexpress.dynamic.yu;

import androidx.exifinterface.media.ExifInterface;
import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class le {
    private String ajl;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    public int f11432an;
    public String baa;
    public double bly;
    public int bs;
    public boolean byv;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public String f11433cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public String f11434cf;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    public boolean f11435cj;
    public boolean coz;
    public int eay;
    public int ehk;
    public String eot;
    public int euf;
    public double ex;
    public int ey;
    public int fak;

    /* JADX INFO: renamed from: fg, reason: collision with root package name */
    public String f11436fg;
    public float fkw;

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    public String f11437fn;
    public boolean fqk;
    public int fvf;
    public String fwd;

    /* JADX INFO: renamed from: gh, reason: collision with root package name */
    public int f11438gh;
    public int hun;
    public int ixm;
    public String jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public String f11439jg;
    public double jqy;
    public int jvy;
    public double kfa;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public int f11440ki;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    public JSONObject f11441kn;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public String f11442ko;
    public String ksc;
    private String lai;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public float f11443le;
    public int lgp;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f11444lh;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    public String f11445ln;
    public boolean lso;
    public int lvd;
    public int mq;
    public int ms;
    public int mt;
    private float mu;
    public String mwe;
    public String mwh;
    public int myk;

    /* JADX INFO: renamed from: ng, reason: collision with root package name */
    public String f11446ng;
    public List<ouw> njr;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    public long f11447nn = -1;
    public boolean npr;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public String f11448od;
    public boolean odc;
    public double osn;
    public float ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public int f11449pd;
    public float pno;
    public boolean pv;
    public boolean qbp;
    public boolean qld;
    public int qni;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public float f11450ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public String f11451rn;
    public boolean rrs;
    public String ryl;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public int f11452sd;

    /* JADX INFO: renamed from: sm, reason: collision with root package name */
    private String f11453sm;
    public boolean smu;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public String f11454tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public String f11455th;
    public double tlj;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    public boolean f11456ub;
    public int ucs;
    public int uoy;
    public boolean uq;
    public String ux;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private JSONObject f11457vf;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    public boolean f11458vh;

    /* JADX INFO: renamed from: vi, reason: collision with root package name */
    public boolean f11459vi;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public String f11460vm;
    public int vpp;
    public float vt;
    public int wbf;
    public String wp;
    public int xdk;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    public int f11461xn;
    private float xne;
    public int xwt;
    public int ycd;
    public int yhj;
    public int yib;
    public JSONObject yiz;
    public float yu;
    public JSONObject yw;
    public String zih;
    public int zin;
    public boolean zjp;
    public String zjq;
    public int zrz;
    public int zvq;

    public static le ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        le leVar = new le();
        leVar.lai = jSONObject.optString("adType", "embeded");
        leVar.ksc = jSONObject.optString("clickArea", "creative");
        leVar.jae = jSONObject.optString("clickTigger", "click");
        leVar.ajl = jSONObject.optString("fontFamily", "PingFangSC");
        leVar.f11434cf = jSONObject.optString("textAlign", "left");
        leVar.ryl = jSONObject.optString("color", "#999999");
        leVar.mwh = jSONObject.optString("bgColor", C3426d4.i.T);
        leVar.f11439jg = jSONObject.optString("bgImgUrl", "");
        leVar.zjq = jSONObject.optString("bgImgData", "");
        leVar.f11442ko = jSONObject.optString("borderColor", "#000000");
        leVar.f11453sm = jSONObject.optString("borderStyle", "solid");
        leVar.f11451rn = jSONObject.optString("heightMode", "auto");
        leVar.zih = jSONObject.optString("widthMode", "fixed");
        leVar.f11460vm = jSONObject.optString("interactText", "");
        leVar.qbp = jSONObject.optBoolean("isShowBgControl", false);
        leVar.f11455th = jSONObject.optString("interactBgColor", "");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            leVar.zin = jSONObjectOptJSONObject.optInt("translateY", 0);
            leVar.vpp = jSONObjectOptJSONObject.optInt("translateX", 0);
            leVar.jqy = jSONObjectOptJSONObject.optDouble("scaleX", 0.0d);
            leVar.ex = jSONObjectOptJSONObject.optDouble("scaleY", 0.0d);
        }
        leVar.f11454tc = jSONObject.optString("interactType", "");
        leVar.ms = jSONObject.optInt("interactSlideDirection", -1);
        leVar.f11448od = jSONObject.optString("justifyHorizontal", "space-around");
        leVar.f11433cd = jSONObject.optString("justifyVertical", "flex-start");
        leVar.bly = jSONObject.optDouble("timingStart");
        leVar.tlj = jSONObject.optDouble("timingEnd");
        leVar.xne = (float) jSONObject.optDouble("width", 0.0d);
        leVar.mu = (float) jSONObject.optDouble("height", 0.0d);
        leVar.ouw = (float) jSONObject.optDouble("borderRadius", 0.0d);
        leVar.vt = (float) jSONObject.optDouble("borderSize", 0.0d);
        leVar.f11444lh = jSONObject.optBoolean("interactValidate", false);
        leVar.pno = (float) jSONObject.optDouble("fontSize", 0.0d);
        leVar.yu = (float) jSONObject.optDouble("paddingBottom", 0.0d);
        leVar.fkw = (float) jSONObject.optDouble("paddingLeft", 0.0d);
        leVar.f11443le = (float) jSONObject.optDouble("paddingRight", 0.0d);
        leVar.f11450ra = (float) jSONObject.optDouble("paddingTop", 0.0d);
        leVar.uq = jSONObject.optBoolean("lineFeed", false);
        leVar.f11449pd = jSONObject.optInt("lineCount", 0);
        leVar.osn = jSONObject.optDouble("lineHeight", 1.2d);
        leVar.ey = jSONObject.optInt("letterSpacing", 0);
        leVar.rrs = jSONObject.optBoolean("isDataFixed", false);
        leVar.jvy = jSONObject.optInt("fontWeight");
        leVar.fqk = jSONObject.optBoolean("lineLimit");
        leVar.hun = jSONObject.optInt(C3426d4.i.L);
        leVar.ux = jSONObject.optString("align");
        leVar.lso = jSONObject.optBoolean("useLeft");
        leVar.f11456ub = jSONObject.optBoolean("useRight");
        leVar.f11435cj = jSONObject.optBoolean("useTop");
        leVar.pv = jSONObject.optBoolean("useBottom");
        leVar.wp = jSONObject.optString("data");
        leVar.f11441kn = jSONObject.optJSONObject("i18n");
        leVar.fak = jSONObject.optInt("marginLeft");
        leVar.uoy = jSONObject.optInt("marginRight");
        leVar.fvf = jSONObject.optInt("marginTop");
        leVar.bs = jSONObject.optInt("marginBottom");
        leVar.ucs = jSONObject.optInt("tagMaxCount");
        leVar.f11458vh = jSONObject.optBoolean("allowTextFlow");
        leVar.yib = jSONObject.optInt("textFlowType");
        leVar.yhj = jSONObject.optInt("textFlowDuration");
        leVar.mt = jSONObject.optInt("left");
        leVar.xdk = jSONObject.optInt("right");
        leVar.zvq = jSONObject.optInt("top");
        leVar.myk = jSONObject.optInt("bottom");
        leVar.f11446ng = jSONObject.optString("alignItems", "flex-start");
        leVar.fwd = jSONObject.optString("direction", "");
        leVar.coz = jSONObject.optBoolean("loop", false);
        leVar.lvd = jSONObject.optInt("zIndex");
        leVar.euf = jSONObject.optInt("interactVisibleTime");
        leVar.f11452sd = jSONObject.optInt("interactHiddenTime");
        leVar.smu = jSONObject.optBoolean("interactEnableMask");
        leVar.qld = jSONObject.optBoolean("interactWontHide");
        leVar.eot = jSONObject.optString("bgGradient");
        leVar.mq = jSONObject.optInt("areaType");
        leVar.f11432an = jSONObject.optInt("interactSlideThreshold", 0);
        leVar.f11461xn = jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.yu.vt() ? 0 : 120);
        leVar.zjp = jSONObject.optBoolean("openPlayableLandingPage", false);
        leVar.f11457vf = jSONObject.optJSONObject("video");
        leVar.yw = jSONObject.optJSONObject("image");
        leVar.f11438gh = jSONObject.optInt("borderShadowExtent");
        leVar.odc = jSONObject.optBoolean("bgGauseBlur");
        leVar.ycd = jSONObject.optInt("bgGauseBlurRadius");
        leVar.f11459vi = jSONObject.optBoolean("showTimeProgress", false);
        leVar.npr = jSONObject.optBoolean("showPlayButton", false);
        leVar.kfa = jSONObject.optDouble("bgColorCg", 0.0d);
        leVar.ixm = jSONObject.optInt("bgMaterialCenterCalcColor", 0);
        leVar.lgp = jSONObject.optInt("borderTopLeftRadius", 0);
        leVar.zrz = jSONObject.optInt("borderTopRightRadius", 0);
        leVar.wbf = jSONObject.optInt("borderBottomLeftRadius", 0);
        leVar.eay = jSONObject.optInt("borderBottomRightRadius", 0);
        leVar.yiz = jSONObject.optJSONObject("interactI18n");
        leVar.f11445ln = jSONObject.optString("imageObjectFit");
        leVar.f11436fg = jSONObject.optString("interactTitle");
        leVar.qni = jSONObject.optInt("interactTextPositionTop");
        leVar.f11437fn = jSONObject.optString("imageLottieTosPath");
        leVar.byv = jSONObject.optBoolean("animationsLoop");
        leVar.ehk = jSONObject.optInt("lottieAppNameMaxLength");
        leVar.xwt = jSONObject.optInt("lottieAdDescMaxLength");
        leVar.f11440ki = jSONObject.optInt("lottieAdTitleMaxLength");
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    ouw ouwVar = new ouw();
                    ouwVar.ouw = jSONObject2.optString("animationType");
                    ouwVar.vt = jSONObject2.optDouble("animationDuration");
                    ouwVar.f11466lh = jSONObject2.optDouble("animationScaleX");
                    ouwVar.yu = jSONObject2.optDouble("animationScaleY");
                    ouwVar.fkw = jSONObject2.optString("animationTimeFunction");
                    ouwVar.f11465le = jSONObject2.optDouble("animationDelay");
                    ouwVar.f11467ra = jSONObject2.optInt("animationIterationCount");
                    ouwVar.pno = jSONObject2.optString("animationDirection");
                    ouwVar.bly = jSONObject2.optDouble("animationInterval");
                    ouwVar.tlj = jSONObject2.optInt("animationBorderWidth");
                    ouwVar.f11469th = jSONObject2.optLong(C3426d4.i.W);
                    ouwVar.f11462cf = jSONObject2.optInt("animationEffectWidth");
                    ouwVar.ryl = jSONObject2.optInt("animationSwing", 1);
                    ouwVar.mwh = jSONObject2.optInt("animationTranslateX");
                    ouwVar.f11463jg = jSONObject2.optInt("animationTranslateY");
                    ouwVar.f11464ko = jSONObject2.optString("animationRippleBackgroundColor");
                    ouwVar.f11468rn = jSONObject2.optString("animationScaleDirection");
                    ouwVar.zih = jSONObject2.optInt("animationFadeStart");
                    ouwVar.f11470vm = jSONObject2.optInt("animationFadeEnd");
                    ouwVar.vpp = jSONObject2.optString("animationFillMode");
                    ouwVar.zin = jSONObject2.optInt("animationBounceHeight");
                    double d10 = leVar.bly;
                    if (d10 > 0.0d) {
                        ouwVar.f11465le += d10;
                    }
                    arrayList.add(ouwVar);
                }
                leVar.njr = arrayList;
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                leVar.baa = jSONObject.optString("triggerSlideDirection", "0");
                leVar.f11447nn = jSONObject.optLong("triggerSlideMinDistance", 0L);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return leVar;
    }

    public final void vt() {
        ouw(this, this.yw);
    }

    public final void ouw() {
        ouw(this, this.f11457vf);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void ouw(le leVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.hashCode();
            byte b10 = -1;
            switch (next.hashCode()) {
                case -2067713583:
                    if (next.equals("isShowBgControl")) {
                        b10 = 0;
                    }
                    break;
                case -1965619659:
                    if (next.equals("clickArea")) {
                        b10 = 1;
                    }
                    break;
                case -1912831834:
                    if (next.equals("triggerSlideDirection")) {
                        b10 = 2;
                    }
                    break;
                case -1885934767:
                    if (next.equals("bgImgUrl")) {
                        b10 = 3;
                    }
                    break;
                case -1822062213:
                    if (next.equals("lineCount")) {
                        b10 = 4;
                    }
                    break;
                case -1821293778:
                    if (next.equals("openPlayableLandingPage")) {
                        b10 = 5;
                    }
                    break;
                case -1813937113:
                    if (next.equals("lineLimit")) {
                        b10 = 6;
                    }
                    break;
                case -1578250488:
                    if (next.equals("interactBgColor")) {
                        b10 = 7;
                    }
                    break;
                case -1501175880:
                    if (next.equals("paddingLeft")) {
                        b10 = 8;
                    }
                    break;
                case -1422965251:
                    if (next.equals("adType")) {
                        b10 = 9;
                    }
                    break;
                case -1383228885:
                    if (next.equals("bottom")) {
                        b10 = 10;
                    }
                    break;
                case -1224696685:
                    if (next.equals("fontFamily")) {
                        b10 = 11;
                    }
                    break;
                case -1221029593:
                    if (next.equals("height")) {
                        b10 = 12;
                    }
                    break;
                case -1065511464:
                    if (next.equals("textAlign")) {
                        b10 = 13;
                    }
                    break;
                case -1063257157:
                    if (next.equals("alignItems")) {
                        b10 = 14;
                    }
                    break;
                case -1046708884:
                    if (next.equals("interactValidate")) {
                        b10 = 15;
                    }
                    break;
                case -1044792121:
                    if (next.equals("marginTop")) {
                        b10 = 16;
                    }
                    break;
                case -1019884910:
                    if (next.equals("useBottom")) {
                        b10 = 17;
                    }
                    break;
                case -1005195314:
                    if (next.equals("triggerSlideMinDistance")) {
                        b10 = 18;
                    }
                    break;
                case -962590849:
                    if (next.equals("direction")) {
                        b10 = 19;
                    }
                    break;
                case -912366651:
                    if (next.equals("tagMaxCount")) {
                        b10 = 20;
                    }
                    break;
                case -848877971:
                    if (next.equals("interactHiddenTime")) {
                        b10 = 21;
                    }
                    break;
                case -836058546:
                    if (next.equals("useTop")) {
                        b10 = 22;
                    }
                    break;
                case -734428249:
                    if (next.equals("fontWeight")) {
                        b10 = 23;
                    }
                    break;
                case -731417480:
                    if (next.equals("zIndex")) {
                        b10 = 24;
                    }
                    break;
                case -709393864:
                    if (next.equals("timingStart")) {
                        b10 = 25;
                    }
                    break;
                case -515807685:
                    if (next.equals("lineHeight")) {
                        b10 = 26;
                    }
                    break;
                case -321658193:
                    if (next.equals("textFlowDuration")) {
                        b10 = 27;
                    }
                    break;
                case -295409451:
                    if (next.equals("useRight")) {
                        b10 = 28;
                    }
                    break;
                case -289173127:
                    if (next.equals("marginBottom")) {
                        b10 = 29;
                    }
                    break;
                case -204859874:
                    if (next.equals("bgColor")) {
                        b10 = 30;
                    }
                    break;
                case -148259282:
                    if (next.equals("useLeft")) {
                        b10 = 31;
                    }
                    break;
                case -51738487:
                    if (next.equals("widthMode")) {
                        b10 = 32;
                    }
                    break;
                case 115029:
                    if (next.equals("top")) {
                        b10 = 33;
                    }
                    break;
                case 3076010:
                    if (next.equals("data")) {
                        b10 = 34;
                    }
                    break;
                case 3317767:
                    if (next.equals("left")) {
                        b10 = 35;
                    }
                    break;
                case 3327652:
                    if (next.equals("loop")) {
                        b10 = 36;
                    }
                    break;
                case 90130308:
                    if (next.equals("paddingTop")) {
                        b10 = 37;
                    }
                    break;
                case 92903173:
                    if (next.equals("align")) {
                        b10 = 38;
                    }
                    break;
                case 94842723:
                    if (next.equals("color")) {
                        b10 = 39;
                    }
                    break;
                case 108511772:
                    if (next.equals("right")) {
                        b10 = 40;
                    }
                    break;
                case 113126854:
                    if (next.equals("width")) {
                        b10 = 41;
                    }
                    break;
                case 164611121:
                    if (next.equals("timingEnd")) {
                        b10 = ExifInterface.START_CODE;
                    }
                    break;
                case 202355100:
                    if (next.equals("paddingBottom")) {
                        b10 = 43;
                    }
                    break;
                case 247204452:
                    if (next.equals("allowTextFlow")) {
                        b10 = 44;
                    }
                    break;
                case 302841174:
                    if (next.equals("interactWontHide")) {
                        b10 = 45;
                    }
                    break;
                case 365601008:
                    if (next.equals("fontSize")) {
                        b10 = 46;
                    }
                    break;
                case 428975654:
                    if (next.equals("justifyVertical")) {
                        b10 = 47;
                    }
                    break;
                case 439444041:
                    if (next.equals("interactVisibleTime")) {
                        b10 = 48;
                    }
                    break;
                case 713848971:
                    if (next.equals("paddingRight")) {
                        b10 = 49;
                    }
                    break;
                case 722830999:
                    if (next.equals("borderColor")) {
                        b10 = 50;
                    }
                    break;
                case 737768677:
                    if (next.equals("borderStyle")) {
                        b10 = 51;
                    }
                    break;
                case 747804969:
                    if (next.equals(C3426d4.i.L)) {
                        b10 = 52;
                    }
                    break;
                case 791643104:
                    if (next.equals("isDataFixed")) {
                        b10 = 53;
                    }
                    break;
                case 975087886:
                    if (next.equals("marginRight")) {
                        b10 = 54;
                    }
                    break;
                case 1110826708:
                    if (next.equals("justifyHorizontal")) {
                        b10 = 55;
                    }
                    break;
                case 1122368895:
                    if (next.equals("interactPosition")) {
                        b10 = 56;
                    }
                    break;
                case 1188229042:
                    if (next.equals("lineFeed")) {
                        b10 = 57;
                    }
                    break;
                case 1332036739:
                    if (next.equals("interactText")) {
                        b10 = 58;
                    }
                    break;
                case 1332055696:
                    if (next.equals("interactType")) {
                        b10 = 59;
                    }
                    break;
                case 1349188574:
                    if (next.equals("borderRadius")) {
                        b10 = 60;
                    }
                    break;
                case 1360828714:
                    if (next.equals("clickTigger")) {
                        b10 = 61;
                    }
                    break;
                case 1490178922:
                    if (next.equals("heightMode")) {
                        b10 = 62;
                    }
                    break;
                case 1761274325:
                    if (next.equals("textFlowType")) {
                        b10 = 63;
                    }
                    break;
                case 1824903757:
                    if (next.equals("borderSize")) {
                        b10 = 64;
                    }
                    break;
                case 1970934485:
                    if (next.equals("marginLeft")) {
                        b10 = 65;
                    }
                    break;
                case 2111078717:
                    if (next.equals("letterSpacing")) {
                        b10 = 66;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    leVar.qbp = jSONObject.optBoolean(next, false);
                    break;
                case 1:
                    leVar.ksc = jSONObject.optString(next);
                    break;
                case 2:
                    leVar.baa = jSONObject.optString(next);
                    break;
                case 3:
                    leVar.f11439jg = jSONObject.optString(next);
                    break;
                case 4:
                    leVar.f11449pd = jSONObject.optInt(next);
                    break;
                case 5:
                    leVar.zjp = jSONObject.optBoolean(next);
                    break;
                case 6:
                    leVar.fqk = jSONObject.optBoolean(next);
                    break;
                case 7:
                    leVar.f11455th = jSONObject.optString(next);
                    break;
                case 8:
                    leVar.fkw = (float) jSONObject.optDouble(next);
                    break;
                case 9:
                    leVar.lai = jSONObject.optString(next);
                    break;
                case 10:
                    leVar.myk = jSONObject.optInt(next);
                    break;
                case 11:
                    leVar.ajl = jSONObject.optString(next);
                    break;
                case 12:
                    leVar.mu = (float) jSONObject.optDouble(next);
                    break;
                case 13:
                    leVar.f11434cf = jSONObject.optString(next);
                    break;
                case 14:
                    leVar.f11446ng = jSONObject.optString(next);
                    break;
                case 15:
                    leVar.f11444lh = jSONObject.optBoolean(next);
                    break;
                case 16:
                    leVar.fvf = jSONObject.optInt(next);
                    break;
                case 17:
                    leVar.pv = jSONObject.optBoolean(next);
                    break;
                case 18:
                    leVar.f11447nn = jSONObject.optLong(next);
                    break;
                case 19:
                    leVar.fwd = jSONObject.optString(next);
                    break;
                case 20:
                    leVar.ucs = jSONObject.optInt(next);
                    break;
                case 21:
                    leVar.f11452sd = jSONObject.optInt(next);
                    break;
                case 22:
                    leVar.f11435cj = jSONObject.optBoolean(next);
                    break;
                case 23:
                    leVar.jvy = jSONObject.optInt(next);
                    break;
                case 24:
                    leVar.lvd = jSONObject.optInt(next);
                    break;
                case 25:
                    leVar.bly = jSONObject.optDouble(next);
                    break;
                case 26:
                    leVar.osn = jSONObject.optDouble(next);
                    break;
                case 27:
                    leVar.yhj = jSONObject.optInt(next);
                    break;
                case 28:
                    leVar.f11456ub = jSONObject.optBoolean(next);
                    break;
                case 29:
                    leVar.bs = jSONObject.optInt(next);
                    break;
                case 30:
                    leVar.mwh = jSONObject.optString(next);
                    break;
                case 31:
                    leVar.lso = jSONObject.optBoolean(next);
                    break;
                case 32:
                    leVar.zih = jSONObject.optString(next);
                    break;
                case 33:
                    leVar.zvq = jSONObject.optInt(next);
                    break;
                case 34:
                    leVar.wp = jSONObject.optString(next);
                    break;
                case 35:
                    leVar.mt = jSONObject.optInt(next);
                    break;
                case 36:
                    leVar.coz = jSONObject.optBoolean(next);
                    break;
                case 37:
                    leVar.f11450ra = (float) jSONObject.optDouble(next);
                    break;
                case 38:
                    leVar.ux = jSONObject.optString(next);
                    break;
                case 39:
                    leVar.ryl = jSONObject.optString(next);
                    break;
                case 40:
                    leVar.xdk = jSONObject.optInt(next);
                    break;
                case 41:
                    leVar.xne = (float) jSONObject.optDouble(next);
                    break;
                case 42:
                    leVar.tlj = jSONObject.optDouble(next);
                    break;
                case 43:
                    leVar.yu = (float) jSONObject.optDouble(next);
                    break;
                case 44:
                    leVar.f11458vh = jSONObject.optBoolean(next);
                    break;
                case 45:
                    leVar.qld = jSONObject.optBoolean(next);
                    break;
                case 46:
                    leVar.pno = (float) jSONObject.optDouble(next);
                    break;
                case 47:
                    leVar.f11433cd = jSONObject.optString(next);
                    break;
                case 48:
                    leVar.euf = jSONObject.optInt(next);
                    break;
                case 49:
                    leVar.f11443le = (float) jSONObject.optDouble(next);
                    break;
                case 50:
                    leVar.f11442ko = jSONObject.optString(next);
                    break;
                case 51:
                    leVar.f11453sm = jSONObject.optString(next);
                    break;
                case 52:
                    leVar.hun = jSONObject.optInt(next);
                    break;
                case 53:
                    leVar.rrs = jSONObject.optBoolean(next);
                    break;
                case 54:
                    leVar.uoy = jSONObject.optInt(next);
                    break;
                case 55:
                    leVar.f11448od = jSONObject.optString(next);
                    break;
                case 56:
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject != null) {
                        leVar.zin = jSONObjectOptJSONObject.optInt("translateY", 0);
                        leVar.vpp = jSONObjectOptJSONObject.optInt("translateX", 0);
                        leVar.jqy = jSONObjectOptJSONObject.optDouble("scaleX", 0.0d);
                        leVar.ex = jSONObjectOptJSONObject.optDouble("scaleY", 0.0d);
                    }
                    break;
                case 57:
                    leVar.uq = jSONObject.optBoolean(next);
                    break;
                case 58:
                    leVar.f11460vm = jSONObject.optString(next);
                    break;
                case 59:
                    leVar.f11454tc = jSONObject.optString(next);
                    break;
                case 60:
                    leVar.ouw = (float) jSONObject.optDouble(next);
                    break;
                case 61:
                    leVar.jae = jSONObject.optString(next);
                    break;
                case 62:
                    leVar.f11451rn = jSONObject.optString(next);
                    break;
                case 63:
                    leVar.yib = jSONObject.optInt(next);
                    break;
                case 64:
                    leVar.vt = (float) jSONObject.optDouble(next);
                    break;
                case 65:
                    leVar.fak = jSONObject.optInt(next);
                    break;
                case 66:
                    leVar.ey = jSONObject.optInt(next);
                    break;
            }
        }
    }
}
