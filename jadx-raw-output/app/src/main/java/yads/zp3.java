package yads;

import android.location.Location;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ip2 f85560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f9 f85561b;

    public /* synthetic */ zp3() {
        this(new ip2(), new f9());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    public final g9 a(AdRequestConfiguration adRequestConfiguration) {
        String str;
        String str2;
        gp2 gp2VarA;
        String age = adRequestConfiguration.getAge();
        String gender = adRequestConfiguration.getGender();
        String contextQuery = adRequestConfiguration.getContextQuery();
        List<String> contextTags = adRequestConfiguration.getContextTags();
        Location location = adRequestConfiguration.getLocation();
        Map<String, String> parameters = adRequestConfiguration.getParameters();
        String biddingData = adRequestConfiguration.getBiddingData();
        AdTheme preferredTheme = adRequestConfiguration.getPreferredTheme();
        this.f85561b.getClass();
        String adUnitId = adRequestConfiguration.getAdUnitId();
        if (age == null) {
            str = null;
        } else {
            if (!(!lk.a0.n0(age))) {
                age = null;
            }
            if (age != null) {
                str = age;
            } else {
                str = null;
            }
        }
        if (gender == null) {
            str2 = null;
        } else {
            if (!(!lk.a0.n0(gender))) {
                gender = null;
            }
            if (gender != null) {
                str2 = gender;
            } else {
                str2 = null;
            }
        }
        String str3 = contextQuery != null ? contextQuery : null;
        List<String> list = contextTags != null ? contextTags : null;
        Location location2 = location != null ? location : null;
        Map<String, String> map = parameters != null ? parameters : null;
        String str4 = biddingData != null ? biddingData : null;
        if (preferredTheme != null) {
            this.f85560a.getClass();
            gp2VarA = ip2.a(preferredTheme);
        } else {
            gp2VarA = null;
        }
        return new g9(adUnitId, str, str2, str3, list, location2, map, str4, null, gp2VarA, false, null);
    }

    public zp3(ip2 ip2Var, f9 f9Var) {
        this.f85560a = ip2Var;
        this.f85561b = f9Var;
    }
}
