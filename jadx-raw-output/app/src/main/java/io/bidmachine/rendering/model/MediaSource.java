package io.bidmachine.rendering.model;

import android.webkit.MimeTypeMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.rendering.internal.i;
import io.bidmachine.util.Utils;
import kotlin.Metadata;
import lk.a0;
import lk.x;
import mj.r;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lio/bidmachine/rendering/model/MediaSource;", "", "Lio/bidmachine/rendering/model/MediaSource$DeliveryType;", "a", "Lio/bidmachine/rendering/model/MediaSource$DeliveryType;", "getDeliveryType", "()Lio/bidmachine/rendering/model/MediaSource$DeliveryType;", "deliveryType", "<init>", "(Lio/bidmachine/rendering/model/MediaSource$DeliveryType;)V", VastTagName.COMPANION, "DeliveryType", "Lio/bidmachine/rendering/model/Base64MediaSource;", "Lio/bidmachine/rendering/model/UrlMediaSource;", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public abstract class MediaSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DeliveryType deliveryType;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/rendering/model/MediaSource$DeliveryType;", "", "(Ljava/lang/String;I)V", "PRELOAD", "STREAM", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum DeliveryType {
        PRELOAD,
        STREAM
    }

    private MediaSource(DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }

    public static final MediaSource from(String str) {
        return INSTANCE.from(str);
    }

    public static final MediaSource fromBase64(String str) {
        return INSTANCE.fromBase64(str);
    }

    public static final MediaSource fromDefaultSettings(String str) {
        return INSTANCE.fromDefaultSettings(str);
    }

    public static final MediaSource fromUrl(String str) {
        return INSTANCE.fromUrl(str);
    }

    public DeliveryType getDeliveryType() {
        return this.deliveryType;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lio/bidmachine/rendering/model/MediaSource$Companion;", "", "()V", "EXTENSION_VIDEO_STREAMABLE_M3U8", "", TypedValues.TransitionType.S_FROM, "Lio/bidmachine/rendering/model/MediaSource;", "input", "fromBase64", "fromDefaultSettings", "fromUrl", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final MediaSource from(String input) {
            MediaSource mediaSourceFromDefaultSettings = fromDefaultSettings(input);
            if (mediaSourceFromDefaultSettings != null) {
                return mediaSourceFromDefaultSettings;
            }
            MediaSource mediaSourceFromUrl = fromUrl(input);
            if (mediaSourceFromUrl != null) {
                return mediaSourceFromUrl;
            }
            if (input != null) {
                return fromBase64(input);
            }
            return null;
        }

        public final MediaSource fromBase64(String input) {
            if (input == null) {
                return null;
            }
            if (!(!a0.n0(input))) {
                input = null;
            }
            if (input != null) {
                return new Base64MediaSource(input);
            }
            return null;
        }

        public final MediaSource fromDefaultSettings(String input) {
            try {
                String strA = i.f60426a.a(input);
                if (strA != null) {
                    return MediaSource.INSTANCE.fromBase64(strA);
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        public final MediaSource fromUrl(String input) {
            String validUrl = Utils.getValidUrl(input);
            if (validUrl == null || a0.n0(validUrl) || !Utils.isHttpUrl(validUrl)) {
                return null;
            }
            DeliveryType deliveryType = DeliveryType.PRELOAD;
            try {
                if (x.A(MimeTypeMap.getFileExtensionFromUrl(validUrl), "m3u8", true)) {
                    deliveryType = DeliveryType.STREAM;
                }
                r rVar = r.f64562a;
            } catch (Throwable unused) {
            }
            return new UrlMediaSource(validUrl, deliveryType);
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }
    }

    public /* synthetic */ MediaSource(DeliveryType deliveryType, ck.i iVar) {
        this(deliveryType);
    }
}
