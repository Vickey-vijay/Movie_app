package io.bidmachine;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes8.dex */
public class UrlProvider {

    @NonNull
    private static final String PATH_AUCTION = "auction";

    @NonNull
    private static final String PATH_INIT = "init";

    @NonNull
    private static final String PATH_RTB = "rtb";

    @NonNull
    private static final String PATH_V3 = "v3";

    @Nullable
    private static String auctionUrlFromInit;

    @Nullable
    private static String auctionUrlFromSuccessRequest;

    @NonNull
    private static final String DEF_BASE_URL = "https://api.bidmachine.io";

    @NonNull
    private static final String[] DEF_BASE_URLS = {DEF_BASE_URL, "https://x.everestop.io", "https://x.blueduckredapple.com", "https://x.thecatmachine.com"};

    @NonNull
    private static final Queue<String> INIT_URL_QUEUE = new ConcurrentLinkedQueue();

    @NonNull
    private static final Queue<String> AUCTION_URL_QUEUE = new ConcurrentLinkedQueue();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setEndpoint$0(String str) {
        return String.format("Endpoint has an invalid format - %s", str);
    }

    static {
        setupUrls();
    }

    @NonNull
    public static Queue<String> getAuctionUrlQueue() {
        if (TextUtils.isEmpty(auctionUrlFromInit)) {
            return !TextUtils.isEmpty(auctionUrlFromSuccessRequest) ? new ConcurrentLinkedQueue<String>() { // from class: io.bidmachine.UrlProvider.2
                {
                    add(UrlProvider.auctionUrlFromSuccessRequest);
                }
            } : new ConcurrentLinkedQueue(AUCTION_URL_QUEUE);
        }
        return new ConcurrentLinkedQueue<String>() { // from class: io.bidmachine.UrlProvider.1
            {
                add(UrlProvider.auctionUrlFromInit);
            }
        };
    }

    @NonNull
    public static Queue<String> getInitUrlQueue() {
        return new ConcurrentLinkedQueue(INIT_URL_QUEUE);
    }

    public static synchronized void setAuctionUrlFromInit(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        auctionUrlFromInit = str;
    }

    public static void setAuctionUrlFromSuccessRequest(@NonNull String str) {
        if (auctionUrlFromSuccessRequest != null || TextUtils.isEmpty(str)) {
            return;
        }
        auctionUrlFromSuccessRequest = str;
    }

    @VisibleForTesting
    public static void setupUrls() {
        Queue<String> queue = INIT_URL_QUEUE;
        String[] strArr = DEF_BASE_URLS;
        setupInitUrls(queue, strArr);
        setupAuctionUrls(AUCTION_URL_QUEUE, strArr);
    }

    @NonNull
    private static String createAuctionUrl(@NonNull Uri uri) {
        return uri.buildUpon().appendPath("auction").appendPath(PATH_RTB).appendPath(PATH_V3).toString();
    }

    @NonNull
    private static String createInitUrl(@NonNull Uri uri) {
        return uri.buildUpon().appendPath("auction").appendPath("init").toString();
    }

    @VisibleForTesting
    public static void reset() {
        setupUrls();
        auctionUrlFromInit = null;
        auctionUrlFromSuccessRequest = null;
    }

    public static void setAuctionUrl(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Queue<String> queue = AUCTION_URL_QUEUE;
        queue.clear();
        queue.add(str);
    }

    public static void setEndpoint(@NonNull final String str) {
        if (!Utils.isUrlValid(str)) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.v5
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return UrlProvider.lambda$setEndpoint$0(str);
                }
            });
        } else {
            if (j2.get().isInitializationStarted()) {
                Logger.e("Can't change endpoint url after initialization");
                return;
            }
            Uri uri = Uri.parse(str);
            setInitUrl(createInitUrl(uri));
            setAuctionUrl(createAuctionUrl(uri));
        }
    }

    public static void setInitUrl(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Queue<String> queue = INIT_URL_QUEUE;
        queue.clear();
        queue.add(str);
    }

    private static void setupAuctionUrls(@NonNull Collection<String> collection, @NonNull String[] strArr) {
        collection.clear();
        for (String str : strArr) {
            collection.add(createAuctionUrl(Uri.parse(str)));
        }
    }

    private static void setupInitUrls(@NonNull Collection<String> collection, @NonNull String[] strArr) {
        collection.clear();
        for (String str : strArr) {
            collection.add(createInitUrl(Uri.parse(str)));
        }
    }
}
