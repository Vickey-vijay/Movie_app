package y2;

import android.content.Context;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import org.json.JSONObject;

/* JADX INFO: compiled from: MintegralFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface b {
    void a(Context context, String str, String str2);

    void b(NewInterstitialWithCodeListener newInterstitialWithCodeListener);

    void loadFromBid(String str);

    void playVideoMute(int i10);

    void setExtraInfo(JSONObject jSONObject);

    void showFromBid();
}
