package com.inmobi.media;

import android.content.Context;
import com.ironsource.C3426d4;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class W8 extends AbstractC2846f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W8 f23730c = new W8();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f23731d = new AtomicBoolean(true);

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        AtomicBoolean atomicBoolean = f23731d;
        jSONObject.put("a-audioBannerEnabled", String.valueOf(atomicBoolean.get()));
        if (atomicBoolean.get()) {
            long j10 = this.f24331a / 1000;
            if (j10 != 0) {
                jSONObject.put("a-lastAudioBannerPlayedTs", String.valueOf(j10));
            }
            int i10 = this.f24332b;
            if (i10 > 0) {
                jSONObject.put("a-audioBannerFreq", String.valueOf(i10));
            }
            Context context = Ji.f22951a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Ea eaA = Da.a(context, "banner_audio_pref_file");
                ck.p.j("user_mute_count", C3426d4.i.W);
                int i11 = eaA.f22577a.getInt("user_mute_count", -1);
                if (i11 > 0) {
                    jSONObject.put("a-b-umc", String.valueOf(i11));
                }
            }
        }
        return jSONObject;
    }
}
