package com.bytedance.sdk.openadsdk.core.ryl.lh;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.google.android.material.badge.BadgeDrawable;
import com.vungle.ads.internal.Constants;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class lh {
    private static SimpleDateFormat vt;
    private static boolean yu;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    @NonNull
    private final List<String> f13001lh;

    @NonNull
    public final Map<vt, String> ouw;

    @NonNull
    public final List<String> ouw() {
        ArrayList arrayList = new ArrayList();
        for (String strReplaceAll : this.f13001lh) {
            if (!TextUtils.isEmpty(strReplaceAll)) {
                for (vt vtVar : vt.values()) {
                    String str = this.ouw.get(vtVar);
                    if (str == null) {
                        str = "";
                    }
                    strReplaceAll = vtVar == vt.__MRC_IMPRESSION_ID__ ? strReplaceAll.replaceAll(vtVar.name(), str) : strReplaceAll.replaceAll("\\[" + vtVar.name() + "\\]", str);
                }
                arrayList.add(strReplaceAll);
            }
        }
        return arrayList;
    }

    public lh(@NonNull List<String> list, vpp vppVar) {
        int iUoy;
        this.f13001lh = list;
        HashMap map = new HashMap();
        this.ouw = map;
        map.put(vt.CACHEBUSTING, String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d))));
        vt vtVar = vt.TIMESTAMP;
        if (vt == null) {
            vt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.getDefault());
        }
        String str = vt.format(new Date());
        if (yu) {
            int iKsc = uoy.ksc();
            if (iKsc >= 0) {
                if (iKsc < 10) {
                    str = str + "+0" + iKsc;
                } else {
                    str = str + BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX + iKsc;
                }
            } else if (iKsc <= -10) {
                str = str + iKsc;
            } else {
                str = str + "-0" + (-iKsc);
            }
        }
        map.put(vtVar, str);
        map.put(vt.APPBUNDLE, zih.ouw().getPackageName());
        vt vtVar2 = vt.PLAYERSTATE;
        map.put(vtVar2, "");
        if (vppVar != null && ((iUoy = vppVar.uoy()) == 3 || iUoy == 7 || iUoy == 8)) {
            map.put(vtVar2, Constants.TEMPLATE_TYPE_FULLSCREEN);
        }
        map.put(vt.SERVERSIDE, "0");
    }

    @NonNull
    public final lh ouw(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.ouw.put(vt.ASSETURI, str);
        }
        return this;
    }

    @NonNull
    public static String ouw(long j10) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j10) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j10 % 1000));
    }
}
