package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.sdk.AppLovinEventParameters;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfir {

    @Nullable
    public final zzccb zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final int zzQ;
    public final int zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final String zzU;
    public final zzfjn zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final List zzaA;
    public final boolean zzaB;
    public final List zzaC;
    public final boolean zzaD;
    public final int zzaE;
    public final Bundle zzaF;
    public final boolean zzaG;
    public final int zzaH;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;

    @Nullable
    public final zzbxy zzad;

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzt zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;

    @Nullable
    public final String zzal;
    public final boolean zzam;
    public final String zzan;
    public final String zzao;
    public final String zzap;
    public final boolean zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final boolean zzav;
    public final Map zzaw;

    @Nullable
    public final com.google.android.gms.ads.internal.util.client.zzv zzax;

    @Nullable
    public final com.google.android.gms.ads.internal.util.client.zzw zzay;
    public final double zzaz;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final int zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;
    public final String zzk;

    @Nullable
    public final zzcas zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;

    @Nullable
    public final zzfiw zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Code duplicated, block: B:276:0x075e A[PHI: r22 r24
  0x075e: PHI (r22v97 java.util.List) = 
  (r22v5 java.util.List)
  (r22v6 java.util.List)
  (r22v7 java.util.List)
  (r22v8 java.util.List)
  (r22v9 java.util.List)
  (r22v10 java.util.List)
  (r22v11 java.util.List)
  (r22v12 java.util.List)
  (r22v13 java.util.List)
  (r22v14 java.util.List)
  (r22v15 java.util.List)
  (r22v16 java.util.List)
  (r22v17 java.util.List)
  (r22v18 java.util.List)
  (r22v19 java.util.List)
  (r22v20 java.util.List)
  (r22v21 java.util.List)
  (r22v22 java.util.List)
  (r22v23 java.util.List)
  (r22v24 java.util.List)
  (r22v25 java.util.List)
  (r22v26 java.util.List)
  (r22v27 java.util.List)
  (r22v28 java.util.List)
  (r22v29 java.util.List)
  (r22v30 java.util.List)
  (r22v31 java.util.List)
  (r22v32 java.util.List)
  (r22v33 java.util.List)
  (r22v34 java.util.List)
  (r22v35 java.util.List)
  (r22v36 java.util.List)
  (r22v37 java.util.List)
  (r22v38 java.util.List)
  (r22v39 java.util.List)
  (r22v40 java.util.List)
  (r22v41 java.util.List)
  (r22v42 java.util.List)
  (r22v43 java.util.List)
  (r22v44 java.util.List)
  (r22v45 java.util.List)
  (r22v46 java.util.List)
  (r22v47 java.util.List)
  (r22v48 java.util.List)
  (r22v49 java.util.List)
  (r22v50 java.util.List)
  (r22v51 java.util.List)
  (r22v52 java.util.List)
  (r22v53 java.util.List)
  (r22v54 java.util.List)
  (r22v55 java.util.List)
  (r22v56 java.util.List)
  (r22v57 java.util.List)
  (r22v58 java.util.List)
  (r22v59 java.util.List)
  (r22v60 java.util.List)
  (r22v61 java.util.List)
  (r22v62 java.util.List)
  (r22v63 java.util.List)
  (r22v64 java.util.List)
  (r22v65 java.util.List)
  (r22v66 java.util.List)
  (r22v67 java.util.List)
  (r22v68 java.util.List)
  (r22v69 java.util.List)
  (r22v70 java.util.List)
  (r22v71 java.util.List)
  (r22v72 java.util.List)
  (r22v73 java.util.List)
  (r22v74 java.util.List)
  (r22v75 java.util.List)
  (r22v76 java.util.List)
  (r22v77 java.util.List)
  (r22v78 java.util.List)
  (r22v79 java.util.List)
  (r22v80 java.util.List)
  (r22v81 java.util.List)
  (r22v82 java.util.List)
  (r22v83 java.util.List)
  (r22v84 java.util.List)
  (r22v85 java.util.List)
  (r22v86 java.util.List)
  (r22v87 java.util.List)
  (r22v88 java.util.List)
  (r22v89 java.util.List)
  (r22v90 java.util.List)
  (r22v91 java.util.List)
  (r22v92 java.util.List)
  (r22v98 java.util.List)
 binds: [B:274:0x0759, B:271:0x0748, B:268:0x0737, B:265:0x0726, B:262:0x0715, B:259:0x0704, B:256:0x06f2, B:253:0x06e0, B:250:0x06ce, B:247:0x06bc, B:244:0x06aa, B:241:0x0698, B:238:0x0686, B:235:0x0674, B:232:0x0662, B:229:0x0650, B:226:0x063e, B:223:0x062c, B:220:0x061a, B:217:0x0608, B:214:0x05f6, B:211:0x05e4, B:208:0x05d2, B:205:0x05c0, B:202:0x05ae, B:199:0x059c, B:196:0x058a, B:193:0x0578, B:190:0x0566, B:187:0x0554, B:184:0x0542, B:181:0x0530, B:178:0x051e, B:175:0x050c, B:172:0x04fa, B:169:0x04e8, B:166:0x04d6, B:163:0x04c4, B:160:0x04b2, B:157:0x04a0, B:154:0x048f, B:151:0x047d, B:148:0x046b, B:145:0x0459, B:142:0x0447, B:139:0x0435, B:136:0x0423, B:133:0x0411, B:130:0x03ff, B:127:0x03ed, B:124:0x03db, B:121:0x03c9, B:118:0x03b7, B:115:0x03a5, B:112:0x0393, B:109:0x0381, B:106:0x036f, B:103:0x035e, B:100:0x034c, B:97:0x033a, B:94:0x0328, B:91:0x0316, B:88:0x0304, B:85:0x02f2, B:82:0x02e0, B:79:0x02cf, B:76:0x02bd, B:73:0x02ab, B:70:0x0299, B:67:0x0287, B:64:0x0275, B:61:0x0263, B:58:0x0251, B:55:0x023f, B:52:0x022d, B:49:0x021b, B:46:0x0209, B:43:0x01f7, B:40:0x01e6, B:37:0x01d4, B:34:0x01c3, B:31:0x01b1, B:28:0x019f, B:25:0x018d, B:22:0x017b, B:19:0x0169, B:16:0x0157, B:13:0x0145, B:11:0x0133] A[DONT_GENERATE, DONT_INLINE]
  0x075e: PHI (r24v91 java.util.List) = 
  (r24v2 java.util.List)
  (r24v3 java.util.List)
  (r24v4 java.util.List)
  (r24v5 java.util.List)
  (r24v6 java.util.List)
  (r24v7 java.util.List)
  (r24v8 java.util.List)
  (r24v9 java.util.List)
  (r24v10 java.util.List)
  (r24v11 java.util.List)
  (r24v12 java.util.List)
  (r24v13 java.util.List)
  (r24v14 java.util.List)
  (r24v15 java.util.List)
  (r24v16 java.util.List)
  (r24v17 java.util.List)
  (r24v18 java.util.List)
  (r24v19 java.util.List)
  (r24v20 java.util.List)
  (r24v21 java.util.List)
  (r24v22 java.util.List)
  (r24v23 java.util.List)
  (r24v24 java.util.List)
  (r24v25 java.util.List)
  (r24v26 java.util.List)
  (r24v27 java.util.List)
  (r24v28 java.util.List)
  (r24v29 java.util.List)
  (r24v30 java.util.List)
  (r24v31 java.util.List)
  (r24v32 java.util.List)
  (r24v33 java.util.List)
  (r24v34 java.util.List)
  (r24v35 java.util.List)
  (r24v36 java.util.List)
  (r24v37 java.util.List)
  (r24v38 java.util.List)
  (r24v39 java.util.List)
  (r24v40 java.util.List)
  (r24v41 java.util.List)
  (r24v42 java.util.List)
  (r24v43 java.util.List)
  (r24v44 java.util.List)
  (r24v45 java.util.List)
  (r24v46 java.util.List)
  (r24v47 java.util.List)
  (r24v48 java.util.List)
  (r24v49 java.util.List)
  (r24v50 java.util.List)
  (r24v51 java.util.List)
  (r24v52 java.util.List)
  (r24v53 java.util.List)
  (r24v54 java.util.List)
  (r24v55 java.util.List)
  (r24v56 java.util.List)
  (r24v57 java.util.List)
  (r24v58 java.util.List)
  (r24v59 java.util.List)
  (r24v60 java.util.List)
  (r24v61 java.util.List)
  (r24v62 java.util.List)
  (r24v63 java.util.List)
  (r24v64 java.util.List)
  (r24v65 java.util.List)
  (r24v66 java.util.List)
  (r24v67 java.util.List)
  (r24v68 java.util.List)
  (r24v69 java.util.List)
  (r24v70 java.util.List)
  (r24v71 java.util.List)
  (r24v72 java.util.List)
  (r24v73 java.util.List)
  (r24v74 java.util.List)
  (r24v75 java.util.List)
  (r24v76 java.util.List)
  (r24v77 java.util.List)
  (r24v78 java.util.List)
  (r24v79 java.util.List)
  (r24v80 java.util.List)
  (r24v81 java.util.List)
  (r24v82 java.util.List)
  (r24v83 java.util.List)
  (r24v84 java.util.List)
  (r24v85 java.util.List)
  (r24v86 java.util.List)
  (r24v87 java.util.List)
  (r24v88 java.util.List)
  (r24v89 java.util.List)
  (r24v92 java.util.List)
 binds: [B:274:0x0759, B:271:0x0748, B:268:0x0737, B:265:0x0726, B:262:0x0715, B:259:0x0704, B:256:0x06f2, B:253:0x06e0, B:250:0x06ce, B:247:0x06bc, B:244:0x06aa, B:241:0x0698, B:238:0x0686, B:235:0x0674, B:232:0x0662, B:229:0x0650, B:226:0x063e, B:223:0x062c, B:220:0x061a, B:217:0x0608, B:214:0x05f6, B:211:0x05e4, B:208:0x05d2, B:205:0x05c0, B:202:0x05ae, B:199:0x059c, B:196:0x058a, B:193:0x0578, B:190:0x0566, B:187:0x0554, B:184:0x0542, B:181:0x0530, B:178:0x051e, B:175:0x050c, B:172:0x04fa, B:169:0x04e8, B:166:0x04d6, B:163:0x04c4, B:160:0x04b2, B:157:0x04a0, B:154:0x048f, B:151:0x047d, B:148:0x046b, B:145:0x0459, B:142:0x0447, B:139:0x0435, B:136:0x0423, B:133:0x0411, B:130:0x03ff, B:127:0x03ed, B:124:0x03db, B:121:0x03c9, B:118:0x03b7, B:115:0x03a5, B:112:0x0393, B:109:0x0381, B:106:0x036f, B:103:0x035e, B:100:0x034c, B:97:0x033a, B:94:0x0328, B:91:0x0316, B:88:0x0304, B:85:0x02f2, B:82:0x02e0, B:79:0x02cf, B:76:0x02bd, B:73:0x02ab, B:70:0x0299, B:67:0x0287, B:64:0x0275, B:61:0x0263, B:58:0x0251, B:55:0x023f, B:52:0x022d, B:49:0x021b, B:46:0x0209, B:43:0x01f7, B:40:0x01e6, B:37:0x01d4, B:34:0x01c3, B:31:0x01b1, B:28:0x019f, B:25:0x018d, B:22:0x017b, B:19:0x0169, B:16:0x0157, B:13:0x0145, B:11:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    public zzfir(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List list;
        List listZzb;
        byte b10;
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        List listEmptyList4 = Collections.emptyList();
        List listEmptyList5 = Collections.emptyList();
        List listEmptyList6 = Collections.emptyList();
        List listEmptyList7 = Collections.emptyList();
        List listEmptyList8 = Collections.emptyList();
        List listEmptyList9 = Collections.emptyList();
        List listEmptyList10 = Collections.emptyList();
        List listEmptyList11 = Collections.emptyList();
        List listEmptyList12 = Collections.emptyList();
        List listEmptyList13 = Collections.emptyList();
        List listEmptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzguf.zzi();
        zzguf zzgufVarZzi = zzguf.zzi();
        HashMap map = new HashMap();
        zzguf zzgufVarZzi2 = zzguf.zzi();
        zzguf zzgufVarZzi3 = zzguf.zzi();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        JSONObject jSONObjectZzd = jSONObject2;
        JSONObject jSONObjectZzd2 = jSONObject3;
        JSONObject jSONObjectZzd3 = jSONObject4;
        JSONObject jSONObjectZzd4 = jSONObject5;
        JSONObject jSONObjectZzd5 = jSONObject6;
        List listZzb2 = zzgufVarZzi;
        Map mapZzc = map;
        List listZzb3 = zzgufVarZzi2;
        zzguf zzgufVarZza = zzgufVarZzi3;
        Bundle bundle2 = bundle;
        int iZza = 2;
        boolean zNextBoolean = true;
        int iZze = -1;
        int iNextInt = -1;
        int iNextInt2 = -1;
        zzfiw zzfiwVar = null;
        zzccb zzccbVarZza = null;
        zzbxy zzbxyVarZza = null;
        com.google.android.gms.ads.internal.client.zzt zztVarZza = null;
        String strNextString = null;
        com.google.android.gms.ads.internal.util.client.zzv zzvVarZzb = null;
        com.google.android.gms.ads.internal.util.client.zzw zzwVarZzd = null;
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String string = strNextString4;
        String strNextString5 = string;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        String strNextString18 = strNextString17;
        int iNextInt3 = 0;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        boolean zNextBoolean8 = false;
        int iNextInt4 = 0;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        boolean zNextBoolean11 = false;
        int iNextInt5 = 0;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        boolean zNextBoolean18 = false;
        boolean zNextBoolean19 = false;
        int iNextInt6 = 0;
        boolean zNextBoolean20 = false;
        boolean zNextBoolean21 = false;
        boolean zNextBoolean22 = false;
        double dNextDouble = 0.0d;
        List listZzb4 = listEmptyList11;
        List listZza = listEmptyList12;
        List listZzb5 = listEmptyList13;
        List listZza2 = listEmptyList14;
        JSONObject jSONObjectZzd6 = jSONObject;
        zzcas zzcasVarZza = null;
        String strNextString19 = strNextString18;
        String strNextString20 = strNextString19;
        int iZzc = 0;
        int iZzd = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            switch (str.hashCode()) {
                case -2138196627:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_source_instance_name")) {
                        b10 = -1;
                    } else {
                        b10 = 59;
                    }
                    break;
                case -1980587809:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("debug_signals")) {
                        b10 = -1;
                    } else {
                        b10 = 28;
                    }
                    break;
                case -1965512151:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("omid_settings")) {
                        b10 = -1;
                    } else {
                        b10 = 41;
                    }
                    break;
                case -1964744830:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("offline_ad_config")) {
                        b10 = -1;
                    } else {
                        b10 = 80;
                    }
                    break;
                case -1871425831:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("recursive_server_response_data")) {
                        b10 = -1;
                    } else {
                        b10 = 69;
                    }
                    break;
                case -1843156475:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_consent")) {
                        b10 = -1;
                    } else {
                        b10 = 71;
                    }
                    break;
                case -1840512279:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("presentation_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 82;
                    }
                    break;
                case -1828733410:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("network_ping_config")) {
                        b10 = -1;
                    } else {
                        b10 = 79;
                    }
                    break;
                case -1812055556:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("play_prewarm_options")) {
                        b10 = -1;
                    } else {
                        b10 = 49;
                    }
                    break;
                case -1785028569:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("parallel_key")) {
                        b10 = -1;
                    } else {
                        b10 = 73;
                    }
                    break;
                case -1776946669:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_source_name")) {
                        b10 = -1;
                    } else {
                        b10 = 57;
                    }
                    break;
                case -1662989631:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_interscroller")) {
                        b10 = -1;
                    } else {
                        b10 = 53;
                    }
                    break;
                case -1620552059:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("preload_sort_type")) {
                        b10 = -1;
                    } else {
                        b10 = 77;
                    }
                    break;
                case -1620470467:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("backend_query_id")) {
                        b10 = -1;
                    } else {
                        b10 = 47;
                    }
                    break;
                case -1550155393:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("nofill_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 13;
                    }
                    break;
                case -1440104884:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_custom_close_blocked")) {
                        b10 = -1;
                    } else {
                        b10 = 35;
                    }
                    break;
                case -1439500848:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("orientation")) {
                        b10 = -1;
                    } else {
                        b10 = 37;
                    }
                    break;
                case -1428969291:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("enable_omid")) {
                        b10 = -1;
                    } else {
                        b10 = 39;
                    }
                    break;
                case -1406227629:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("buffer_click_url_as_ready_to_ping")) {
                        b10 = -1;
                    } else {
                        b10 = 67;
                    }
                    break;
                case -1403779768:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("showable_impression_type")) {
                        b10 = -1;
                    } else {
                        b10 = 44;
                    }
                    break;
                case -1375413093:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_cover")) {
                        b10 = -1;
                    } else {
                        b10 = 54;
                    }
                    break;
                case -1360811658:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_sizes")) {
                        b10 = -1;
                    } else {
                        b10 = 19;
                    }
                    break;
                case -1306015996:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("adapters")) {
                        b10 = -1;
                    } else {
                        b10 = 20;
                    }
                    break;
                case -1303332046:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("test_mode_enabled")) {
                        b10 = -1;
                    } else {
                        b10 = 34;
                    }
                    break;
                case -1289032093:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("extras")) {
                        b10 = -1;
                    } else {
                        b10 = 29;
                    }
                    break;
                case -1240082064:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_event_value")) {
                        b10 = -1;
                    } else {
                        b10 = 51;
                    }
                    break;
                case -1234181075:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("allow_pub_rendered_attribution")) {
                        b10 = -1;
                    } else {
                        b10 = 30;
                    }
                    break;
                case -1168140544:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("presentation_error_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 14;
                    }
                    break;
                case -1152230954:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_type")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case -1146534047:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_scroll_aware")) {
                        b10 = -1;
                    } else {
                        b10 = 43;
                    }
                    break;
                case -1115838944:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("fill_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 12;
                    }
                    break;
                case -1081936678:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("allocation_id")) {
                        b10 = -1;
                    } else {
                        b10 = 21;
                    }
                    break;
                case -1078050970:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("video_complete_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case -1051269058:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("active_view")) {
                        b10 = -1;
                    } else {
                        b10 = 25;
                    }
                    break;
                case -982608540:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("valid_from_timestamp")) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case -972056451:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_source_instance_id")) {
                        b10 = -1;
                    } else {
                        b10 = 60;
                    }
                    break;
                case -776859333:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("click_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case -652881372:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("on_device_storage_configs")) {
                        b10 = -1;
                    } else {
                        b10 = 84;
                    }
                    break;
                case -570101180:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("late_load_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 74;
                    }
                    break;
                case -544216775:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("safe_browsing")) {
                        b10 = -1;
                    } else {
                        b10 = 26;
                    }
                    break;
                case -437057161:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("imp_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case -404433734:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("rtb_native_required_assets")) {
                        b10 = -1;
                    } else {
                        b10 = 62;
                    }
                    break;
                case -404326515:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("render_timeout_ms")) {
                        b10 = -1;
                    } else {
                        b10 = 38;
                    }
                    break;
                case -397704715:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_close_time_ms")) {
                        b10 = -1;
                    } else {
                        b10 = 45;
                    }
                    break;
                case -388807511:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("content_url")) {
                        b10 = -1;
                    } else {
                        b10 = 64;
                    }
                    break;
                case -369773488:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_close_button_enabled")) {
                        b10 = -1;
                    } else {
                        b10 = 50;
                    }
                    break;
                case -213449460:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("force_disable_hardware_acceleration")) {
                        b10 = -1;
                    } else {
                        b10 = 65;
                    }
                    break;
                case -213424028:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("watermark")) {
                        b10 = -1;
                    } else {
                        b10 = 46;
                    }
                    break;
                case -180214626:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("native_required_asset_viewability")) {
                        b10 = -1;
                    } else {
                        b10 = 63;
                    }
                    break;
                case -154616268:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_offline_ad")) {
                        b10 = -1;
                    } else {
                        b10 = 61;
                    }
                    break;
                case -29338502:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("allow_custom_click_gesture")) {
                        b10 = -1;
                    } else {
                        b10 = 32;
                    }
                    break;
                case 3107:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad")) {
                        b10 = -1;
                    } else {
                        b10 = 18;
                    }
                    break;
                case 3355:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("id")) {
                        b10 = -1;
                    } else {
                        b10 = 23;
                    }
                    break;
                case 3076010:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("data")) {
                        b10 = -1;
                    } else {
                        b10 = 22;
                    }
                    break;
                case 37109963:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals(CommonUrlParts.REQUEST_ID)) {
                        b10 = -1;
                    } else {
                        b10 = 68;
                    }
                    break;
                case 63195984:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("render_test_label")) {
                        b10 = -1;
                    } else {
                        b10 = 33;
                    }
                    break;
                case 107433883:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("qdata")) {
                        b10 = -1;
                    } else {
                        b10 = 24;
                    }
                    break;
                case 230323073:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_load_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case 281223176:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_secondary_analytics_logging_enabled")) {
                        b10 = -1;
                    } else {
                        b10 = 87;
                    }
                    break;
                case 418392395:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_closable_area_disabled")) {
                        b10 = -1;
                    } else {
                        b10 = 36;
                    }
                    break;
                case 542250332:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("consent_form_action_identifier")) {
                        b10 = -1;
                    } else {
                        b10 = 72;
                    }
                    break;
                case 549176928:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("presentation_error_timeout_ms")) {
                        b10 = -1;
                    } else {
                        b10 = 16;
                    }
                    break;
                case 597473788:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("debug_dialog_string")) {
                        b10 = -1;
                    } else {
                        b10 = 27;
                    }
                    break;
                case 639133141:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("response_info_extras_override")) {
                        b10 = -1;
                    } else {
                        b10 = 86;
                    }
                    break;
                case 754887508:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("container_sizes")) {
                        b10 = -1;
                    } else {
                        b10 = 17;
                    }
                    break;
                case 791122864:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("impression_type")) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case 805095541:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("analytics_event_name_to_parameters_map")) {
                        b10 = -1;
                    } else {
                        b10 = 78;
                    }
                    break;
                case 1010584092:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER)) {
                        b10 = -1;
                    } else {
                        b10 = 9;
                    }
                    break;
                case 1100650276:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("rewards")) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                case 1141602460:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("adapter_response_info_key")) {
                        b10 = -1;
                    } else {
                        b10 = 56;
                    }
                    break;
                case 1186014765:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("cache_hit_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 66;
                    }
                    break;
                case 1303622534:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("preload_sort_value")) {
                        b10 = -1;
                    } else {
                        b10 = 76;
                    }
                    break;
                case 1321720943:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("allow_pub_owned_ad_view")) {
                        b10 = -1;
                    } else {
                        b10 = 31;
                    }
                    break;
                case 1422388341:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_collapsible")) {
                        b10 = -1;
                    } else {
                        b10 = 70;
                    }
                    break;
                case 1437255331:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals(CampaignEx.JSON_KEY_AD_SOURCE_ID)) {
                        b10 = -1;
                    } else {
                        b10 = 58;
                    }
                    break;
                case 1556932485:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("post_click_lifecycle_monitoring_duration_ms")) {
                        b10 = -1;
                    } else {
                        b10 = 81;
                    }
                    break;
                case 1565514205:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("adapter_only_third_party_impression")) {
                        b10 = -1;
                    } else {
                        b10 = 85;
                    }
                    break;
                case 1637553475:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("bid_response")) {
                        b10 = -1;
                    } else {
                        b10 = 40;
                    }
                    break;
                case 1638957285:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("video_start_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case 1686319423:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("ad_network_class_name")) {
                        b10 = -1;
                    } else {
                        b10 = 55;
                    }
                    break;
                case 1688341040:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("video_reward_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case 1799285870:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("use_third_party_container_height")) {
                        b10 = -1;
                    } else {
                        b10 = 48;
                    }
                    break;
                case 1839650832:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("renderers")) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case 1875425491:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("is_analytics_logging_enabled")) {
                        b10 = -1;
                    } else {
                        b10 = ExifInterface.START_CODE;
                    }
                    break;
                case 2068142375:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("rule_line_external_id")) {
                        b10 = -1;
                    } else {
                        b10 = 52;
                    }
                    break;
                case 2072888499:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("manual_tracking_urls")) {
                        b10 = -1;
                    } else {
                        b10 = 15;
                    }
                    break;
                case 2075506442:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    if (!str.equals("render_serially")) {
                        b10 = -1;
                    } else {
                        b10 = 75;
                    }
                    break;
                case 2117205836:
                    listZzb = listEmptyList10;
                    list = listEmptyList9;
                    if (!str.equals("flow_control")) {
                        b10 = -1;
                    } else {
                        b10 = 83;
                    }
                    break;
                default:
                    list = listEmptyList9;
                    listZzb = listEmptyList10;
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    listEmptyList = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 1:
                    iZzc = zzc(jsonReader.nextString());
                    listEmptyList9 = list;
                    break;
                case 2:
                    listEmptyList2 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 3:
                    listEmptyList3 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 4:
                    listEmptyList4 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 5:
                    iZzd = zzd(jsonReader.nextInt());
                    listEmptyList9 = list;
                    break;
                case 6:
                    listEmptyList5 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 7:
                    listEmptyList6 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 8:
                    listEmptyList7 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 9:
                    strNextString20 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 10:
                    strNextString19 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 11:
                    zzcasVarZza = zzcas.zza(com.google.android.gms.ads.internal.util.zzbp.zze(jsonReader));
                    listEmptyList9 = list;
                    break;
                case 12:
                    listEmptyList8 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 13:
                    listEmptyList9 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    break;
                case 14:
                    listZzb = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 15:
                    listZzb4 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 16:
                    iNextInt3 = jsonReader.nextInt();
                    listEmptyList9 = list;
                    break;
                case 17:
                    listZza = zzfis.zza(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 18:
                    zzfiwVar = new zzfiw(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 19:
                    listZza2 = zzfis.zza(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 20:
                    listZzb5 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 21:
                    strNextString2 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 22:
                    jSONObjectZzd6 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 23:
                    strNextString3 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 24:
                    strNextString4 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 25:
                    string = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader).toString();
                    listEmptyList9 = list;
                    break;
                case 26:
                    zzccbVarZza = zzccb.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    listEmptyList9 = list;
                    break;
                case 27:
                    strNextString5 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 28:
                    jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 29:
                    jSONObjectZzd2 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 30:
                    zNextBoolean2 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 31:
                    zNextBoolean3 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 32:
                    zNextBoolean4 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 33:
                    zNextBoolean5 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 34:
                    zNextBoolean6 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 35:
                    zNextBoolean7 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 36:
                    zNextBoolean8 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 37:
                    iZze = zze(jsonReader.nextString());
                    listEmptyList9 = list;
                    break;
                case 38:
                    iNextInt4 = jsonReader.nextInt();
                    listEmptyList9 = list;
                    break;
                case 39:
                    zNextBoolean9 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 40:
                    strNextString6 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 41:
                    jSONObjectZzd3 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 42:
                    zNextBoolean10 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 43:
                    zNextBoolean11 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 44:
                    iNextInt5 = jsonReader.nextInt();
                    listEmptyList9 = list;
                    break;
                case 45:
                    iNextInt = jsonReader.nextInt();
                    listEmptyList9 = list;
                    break;
                case 46:
                    strNextString7 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 47:
                    strNextString8 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 48:
                    zNextBoolean12 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 49:
                    zzbxyVarZza = zzbxy.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    listEmptyList9 = list;
                    break;
                case 50:
                    jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 51:
                    zztVarZza = com.google.android.gms.ads.internal.client.zzt.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    listEmptyList9 = list;
                    break;
                case 52:
                    strNextString9 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 53:
                    zNextBoolean13 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 54:
                    jSONObjectZzd4 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 55:
                    strNextString10 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 56:
                    strNextString17 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 57:
                    strNextString11 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 58:
                    strNextString12 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 59:
                    strNextString13 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 60:
                    strNextString14 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 61:
                    zNextBoolean14 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 62:
                    jSONObjectZzd5 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 63:
                    zNextBoolean15 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 64:
                    strNextString = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 65:
                    zNextBoolean16 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 66:
                    com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 67:
                    zNextBoolean17 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 68:
                    strNextString15 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 69:
                    strNextString16 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 70:
                    zNextBoolean18 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 71:
                    zNextBoolean19 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 72:
                    iNextInt6 = jsonReader.nextInt();
                    listEmptyList9 = list;
                    break;
                case 73:
                    strNextString18 = jsonReader.nextString();
                    listEmptyList9 = list;
                    break;
                case 74:
                    listZzb2 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 75:
                    zNextBoolean20 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 76:
                    dNextDouble = jsonReader.nextDouble();
                    listEmptyList9 = list;
                    break;
                case 77:
                    iZza = zzfrn.zza(jsonReader.nextInt());
                    listEmptyList9 = list;
                    break;
                case 78:
                    if (((Boolean) zzbhe.zzaK.zzg()).booleanValue()) {
                        mapZzc = com.google.android.gms.ads.internal.util.zzbp.zzc(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList9 = list;
                    break;
                case 79:
                    if (((Boolean) zzbhe.zzjR.zzg()).booleanValue()) {
                        zzvVarZzb = com.google.android.gms.ads.internal.util.client.zzv.zzb(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList9 = list;
                    break;
                case 80:
                    if (((Boolean) zzbhe.zzjT.zzg()).booleanValue()) {
                        zzwVarZzd = com.google.android.gms.ads.internal.util.client.zzw.zzd(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList9 = list;
                    break;
                case 81:
                    if (((Boolean) zzbhe.zzoo.zzg()).booleanValue()) {
                        iNextInt2 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList9 = list;
                    break;
                case 82:
                    listZzb3 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    listEmptyList9 = list;
                    break;
                case 83:
                    zNextBoolean21 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 84:
                    if (((Boolean) zzbhe.zziP.zzg()).booleanValue()) {
                        zzgufVarZza = zzdzd.zza(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList9 = list;
                    break;
                case 85:
                    zNextBoolean22 = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                case 86:
                    if (((Boolean) zzbhe.zzhJ.zzg()).booleanValue()) {
                        try {
                            Bundle bundleZzl = com.google.android.gms.ads.internal.util.zzbp.zzl(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                            if (bundleZzl != null) {
                                bundle2 = bundleZzl;
                            }
                        } catch (IllegalStateException unused) {
                            jsonReader.skipValue();
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    listEmptyList9 = list;
                    break;
                case 87:
                    zNextBoolean = jsonReader.nextBoolean();
                    listEmptyList9 = list;
                    break;
                default:
                    jsonReader.skipValue();
                    listEmptyList9 = list;
                    break;
            }
            listEmptyList10 = listZzb;
        }
        jsonReader.endObject();
        this.zza = listEmptyList;
        this.zzb = iZzc;
        this.zzc = listEmptyList2;
        this.zzd = listEmptyList3;
        this.zzf = listEmptyList4;
        this.zze = iZzd;
        this.zzg = listEmptyList5;
        this.zzh = listEmptyList6;
        this.zzi = listEmptyList7;
        this.zzj = strNextString20;
        this.zzk = strNextString19;
        this.zzl = zzcasVarZza;
        this.zzm = listEmptyList8;
        this.zzn = listEmptyList9;
        this.zzo = listEmptyList10;
        this.zzp = listZzb4;
        this.zzq = iNextInt3;
        this.zzr = listZza;
        this.zzs = zzfiwVar;
        this.zzt = listZzb5;
        this.zzu = listZza2;
        this.zzw = strNextString2;
        this.zzv = jSONObjectZzd6;
        this.zzx = strNextString3;
        this.zzy = strNextString4;
        this.zzz = string;
        this.zzA = zzccbVarZza;
        this.zzB = strNextString5;
        this.zzC = jSONObjectZzd;
        this.zzD = jSONObjectZzd2;
        this.zzJ = zNextBoolean2;
        this.zzK = zNextBoolean3;
        this.zzL = zNextBoolean4;
        this.zzM = zNextBoolean5;
        this.zzN = zNextBoolean6;
        this.zzO = zNextBoolean7;
        this.zzP = zNextBoolean8;
        this.zzQ = iZze;
        this.zzR = iNextInt4;
        this.zzT = zNextBoolean9;
        this.zzU = strNextString6;
        this.zzV = new zzfjn(jSONObjectZzd3);
        this.zzW = zNextBoolean10;
        this.zzX = zNextBoolean11;
        this.zzY = iNextInt5;
        this.zzZ = strNextString7;
        this.zzaa = iNextInt;
        this.zzab = strNextString8;
        this.zzac = zNextBoolean12;
        this.zzad = zzbxyVarZza;
        this.zzae = zztVarZza;
        this.zzaf = strNextString9;
        this.zzag = zNextBoolean13;
        this.zzah = jSONObjectZzd4;
        this.zzE = strNextString10;
        this.zzF = strNextString11;
        this.zzG = strNextString12;
        this.zzH = strNextString13;
        this.zzI = strNextString14;
        this.zzai = zNextBoolean14;
        this.zzaj = jSONObjectZzd5;
        this.zzak = zNextBoolean15;
        this.zzal = strNextString;
        this.zzam = zNextBoolean16;
        this.zzS = zNextBoolean17;
        this.zzan = strNextString15;
        this.zzao = strNextString16;
        this.zzap = strNextString17;
        this.zzaq = zNextBoolean18;
        this.zzar = zNextBoolean19;
        this.zzas = iNextInt6;
        this.zzau = listZzb2;
        this.zzat = strNextString18;
        this.zzav = zNextBoolean20;
        this.zzaw = mapZzc;
        this.zzax = zzvVarZzb;
        this.zzay = zzwVarZzd;
        this.zzaz = dNextDouble;
        this.zzaH = iZza;
        this.zzaA = listZzb3;
        this.zzaB = zNextBoolean21;
        this.zzaC = zzgufVarZza;
        this.zzaD = zNextBoolean22;
        this.zzaE = iNextInt2;
        this.zzaF = bundle2;
        this.zzaG = zNextBoolean;
    }

    public static String zza(int i10) {
        switch (i10) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return BrandSafetyUtils.f43548k;
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzc(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzd(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 3 || i10 == 4) {
            return i10;
        }
        return 0;
    }

    public final boolean zzb() {
        return this.zzai || this.zzay != null;
    }

    private static int zze(String str) {
        if (C3426d4.i.C.equalsIgnoreCase(str)) {
            return 6;
        }
        return C3426d4.i.D.equalsIgnoreCase(str) ? 7 : -1;
    }
}
