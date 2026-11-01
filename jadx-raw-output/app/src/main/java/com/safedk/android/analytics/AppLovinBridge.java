package com.safedk.android.analytics;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.k;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class AppLovinBridge {
    private static Context L = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f43423a = "SafeDK";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f43424b = "v1/events";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f43425c = "v1/image_uploaded";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f43426d = "v1/resolved";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f43427e = "platform";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f43428f = "package";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f43429g = "android";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f43430h = "body";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f43432j = "AppLovinBridge";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f43433k = "max_ad_events";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f43434l = "safedk_init";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f43435m = "user_info";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f43436n = "send_http_request";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f43437o = "receive_http_response";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f43438p = "safedk_ad_info";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f43439q = "max_revenue_events";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f43440r = "url";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f43441s = "backup_url";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f43442t = "post_body";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f43443u = "report";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f43444v = "metadata";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f43445w = "events";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f43446x = "public";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f43447y = "private";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f43448z = "ad_review_creative_id";
    private static String A = "https://edge.safedk.com/v1/events";
    private static String B = "https://edge.safedk.com/v1/events";
    private static String C = "https://edge.safedk.com/v1/image_uploaded";
    private static String D = "https://edge.safedk.com/v1/image_uploaded";
    private static String E = "https://edge.safedk.com/v1/resolved";
    private static String F = "https://edge.safedk.com/v1/resolved";
    private static final String[] G = {"platform"};
    private static final String[] H = {"sdk_uuid", "impression_id", "ad_format_type", "timestamp"};
    private static final String[] I = {k.f44468c};
    private static final String[] J = {k.f44467b};
    private static HashMap<String, ArrayList<b>> K = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static AppLovinCommunicatorSubscriber f43431i = new AppLovinCommunicatorSubscriber() { // from class: com.safedk.android.analytics.AppLovinBridge.1
        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage message) {
            Logger.d(AppLovinBridge.f43432j, "Response received " + message.getMessageData() + ", topic=" + message.getTopic() + ", url=" + message.getMessageData().getString("url"));
            Bundle messageData = message.getMessageData();
            String string = message.getMessageData().getString("url");
            if (string.endsWith(AppLovinBridge.f43424b)) {
                AppLovinBridge.b(AppLovinBridge.f43424b, messageData.getBundle("body"));
            } else if (string.endsWith(AppLovinBridge.f43425c)) {
                AppLovinBridge.b(AppLovinBridge.f43425c, messageData.getBundle("body"));
            } else if (string.endsWith(AppLovinBridge.f43426d)) {
                AppLovinBridge.b(AppLovinBridge.f43426d, messageData.getBundle("body"));
            }
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return AppLovinBridge.f43423a;
        }
    };

    public static void init(Context context) {
        L = context;
        registerToReceiveResponse(f43431i);
    }

    public static void receiveEdgeUrls(String url, String backupUrl) {
        Logger.d(f43432j, "receive edge urls, url=" + url + ", backupUrl=" + backupUrl);
        if (!TextUtils.isEmpty(url)) {
            A = url + "/" + f43424b;
            Logger.d(f43432j, "receive edge urls, edgeBrandSafetyReportUrl updated to " + A);
            C = url + "/" + f43425c;
            Logger.d(f43432j, "receive edge urls, ImageUploadedUrl updated to " + C);
            E = url + "/" + f43426d;
            Logger.d(f43432j, "receive edge urls, resolvedUrl updated to " + E);
        }
        if (!TextUtils.isEmpty(backupUrl)) {
            B = backupUrl + "/" + f43424b;
            Logger.d(f43432j, "Backup edgeBackupBrandSafetyReportUrl updated to " + B);
            D = backupUrl + "/" + f43425c;
            Logger.d(f43432j, "Backup ImageUploadedUrl updated to " + D);
            F = backupUrl + "/" + f43426d;
            Logger.d(f43432j, "Backup resolvedUrl updated to " + F);
        }
    }

    static void a(ArrayList<Bundle> arrayList, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        com.safedk.android.utils.k.b(f43432j, "report stats events start " + arrayList.size() + " events. edgeUrl=" + A + ", events : " + arrayList.toString());
        Bundle bundle = new Bundle();
        bundle.putString("url", A);
        bundle.putString(f43441s, B);
        Bundle bundle2 = new Bundle();
        Bundle bundleC = SafeDK.getInstance().w().c();
        synchronized (arrayList) {
            Iterator<Bundle> it = arrayList.iterator();
            while (it.hasNext()) {
                Bundle next = it.next();
                if ("impression".equals(next.getString(StatsEvent.f44666z)) && (a(next, H, "stats event") || !a(next))) {
                    Logger.d(f43432j, "report stats events not completed. removing event with missing fields.");
                    it.remove();
                }
            }
        }
        if (arrayList.isEmpty() || a(bundleC, G, "metadata")) {
            Logger.d(f43432j, "report stats events not completed. there are missing fields.");
            return;
        }
        bundle2.putBundle("metadata", bundleC);
        bundle2.putParcelableArrayList("events", arrayList);
        Bundle bundle3 = new Bundle();
        bundle3.putBundle("report", bundle2);
        bundle.putBundle(f43442t, bundle3);
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle, f43436n, appLovinCommunicatorPublisher);
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(L);
        Logger.d(f43432j, "publishing message with " + arrayList.size() + " events");
        appLovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
    }

    public static void reportImageUploadEvent(Bundle data, AppLovinCommunicatorPublisher callback) {
        Logger.d(f43432j, "report image upload event start. Data=" + data.toString());
        Bundle bundle = new Bundle();
        bundle.putString("url", C);
        bundle.putString(f43441s, D);
        Bundle bundleC = SafeDK.getInstance().w().c();
        data.putBundle("metadata", bundleC);
        bundle.putBundle(f43442t, data);
        if (a(data, I, "image uploaded") || a(bundleC, G, "metadata")) {
            Logger.d(f43432j, "report image upload event not completed. there are missing fields.");
            return;
        }
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle, f43436n, callback);
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(L);
        Logger.d(f43432j, "publishing message. body=" + data.toString());
        appLovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
    }

    public static void reportClickUrlResolvedEvent(Bundle data, AppLovinCommunicatorPublisher callback) {
        Logger.d(f43432j, "report click url resolved event start");
        Bundle bundle = new Bundle();
        bundle.putString("url", E);
        bundle.putString(f43441s, F);
        Bundle bundleC = SafeDK.getInstance().w().c();
        data.putBundle("metadata", bundleC);
        bundle.putBundle(f43442t, data);
        if (a(data, J, "resolved") || a(bundleC, G, "metadata")) {
            Logger.d(f43432j, "report image upload event not completed. there are missing fields.");
            return;
        }
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle, f43436n, callback);
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(L);
        Logger.d(f43432j, "publishing message. body=" + data.toString());
        appLovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
    }

    public static void reportMaxCreativeId(Bundle appLovinMaxBundle, String creativeId, AppLovinCommunicatorPublisher callback) {
        Logger.d(f43432j, "report max creative ID start, creative ID=" + creativeId + ", appLovin max bundle=" + appLovinMaxBundle.toString());
        Bundle bundle = new Bundle();
        bundle.putString(f43448z, creativeId);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("public", bundle);
        bundle2.putBundle(f43447y, appLovinMaxBundle);
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle2, f43438p, callback);
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(L);
        Logger.d(f43432j, "report max creative ID, publishing message. body=" + bundle2.toString());
        appLovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
    }

    private static boolean a(Bundle bundle) {
        return SdksMapping.getSdkPackageByPackageUUID(bundle.getString("sdk_uuid")) != null;
    }

    private static boolean a(Bundle bundle, String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            if (!bundle.containsKey(str2)) {
                hashSet.add(str2);
            }
        }
        if (hashSet.isEmpty()) {
            return false;
        }
        Logger.d(f43432j, "missing fields in " + str + " data: " + hashSet);
        return true;
    }

    public static void registerToReceiveMaxEvents(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, f43433k);
    }

    public static void registerToReceiveResponse(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, f43437o);
    }

    public static void registerToReceiveSafeDKSettings(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, f43434l);
    }

    public static void registerToReceiveMaxRevenueEvents(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, f43439q);
    }

    public static void registerToReceiveUserInfo(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, f43435m);
    }

    private static void a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        AppLovinCommunicator.getInstance(L).subscribe(appLovinCommunicatorSubscriber, Arrays.asList(str));
    }

    public static void registerListener(String requestName, b listener) {
        try {
            Logger.d(f43432j, "register listener started, request name=" + requestName);
            if (!K.containsKey(requestName)) {
                Logger.d(f43432j, "register listener, listener list created for request name=" + requestName);
                K.put(requestName, new ArrayList<>());
            }
            ArrayList<b> arrayList = K.get(requestName);
            Logger.d(f43432j, "register listener, listener added for request name=" + requestName + StringUtils.COMMA + listener);
            arrayList.add(listener);
        } catch (Throwable th2) {
            Logger.e(f43432j, "register listener failed. request name:" + requestName + ", listener: " + listener, th2);
            new CrashReporter().caughtException(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Bundle bundle) {
        try {
            Logger.d(f43432j, "notify listeners started, request name=" + str + ", data=" + bundle.toString());
            ArrayList<b> arrayList = K.get(str);
            if (arrayList != null) {
                for (b bVar : arrayList) {
                    Logger.d(f43432j, "Invoking handler for request name '" + str + "', Bundle : " + bundle.toString());
                    bVar.a(str, bundle);
                }
            }
        } catch (Throwable th2) {
            Logger.e(f43432j, "Failed to read response", th2);
        }
    }
}
