package io.bidmachine.iab.bridge;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.sdk.controller.f;
import io.bidmachine.iab.mraid.MraidLog;
import io.bidmachine.iab.mraid.MraidUtils;
import io.bidmachine.iab.mraid.MraidWebView;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class JsBridgeHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f59147a = new CopyOnWriteArrayList();

    private static JsBridge a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (JsBridge jsBridge : f59147a) {
            if (jsBridge.isHandled(str)) {
                return jsBridge;
            }
        }
        return null;
    }

    public static boolean addBridge(@NonNull JsBridge jsBridge) {
        List list = f59147a;
        return !list.contains(jsBridge) && list.add(jsBridge);
    }

    public static void handleJsCommand(@Nullable MraidWebView mraidWebView, @NonNull String str) {
        Map<String, String> commandUrl;
        MraidLog.d("JsBridgeHandler", "handleJsCommand - %s", str);
        try {
            JsBridge jsBridgeA = a(str);
            if (jsBridgeA == null || (commandUrl = MraidUtils.parseCommandUrl(str, jsBridgeA.getJsValidator())) == null) {
                return;
            }
            String str2 = commandUrl.get(f.b.f30923g);
            if (str2 == null) {
                MraidLog.w("JsBridgeHandler", "handleJsCommand not found", new Object[0]);
            } else {
                jsBridgeA.runJsCommand(mraidWebView, str2, commandUrl);
            }
        } catch (Throwable th2) {
            MraidLog.e("JsBridgeHandler", th2);
        }
    }

    public static boolean isHandled(@Nullable String str) {
        return a(str) != null;
    }

    @NonNull
    public static String obtainJs() {
        StringBuilder sb2 = new StringBuilder();
        for (JsBridge jsBridge : f59147a) {
            sb2.append("<script type='application/javascript'>");
            sb2.append(jsBridge.getJs());
            sb2.append("</script>");
        }
        return sb2.toString();
    }

    public static boolean removeBridge(@NonNull JsBridge jsBridge) {
        List list = f59147a;
        return list.contains(jsBridge) && list.remove(jsBridge);
    }
}
