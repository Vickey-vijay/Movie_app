package io.bidmachine.rendering.model;

import ck.p;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lio/bidmachine/rendering/model/UrlMediaSource;", "Lio/bidmachine/rendering/model/MediaSource;", "", "component1", "Lio/bidmachine/rendering/model/MediaSource$DeliveryType;", "component2", "url", "deliveryType", "copy", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "c", "Lio/bidmachine/rendering/model/MediaSource$DeliveryType;", "getDeliveryType", "()Lio/bidmachine/rendering/model/MediaSource$DeliveryType;", "<init>", "(Ljava/lang/String;Lio/bidmachine/rendering/model/MediaSource$DeliveryType;)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final /* data */ class UrlMediaSource extends MediaSource {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MediaSource.DeliveryType deliveryType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlMediaSource(String str, MediaSource.DeliveryType deliveryType) {
        super(deliveryType, null);
        p.j(str, "url");
        p.j(deliveryType, "deliveryType");
        this.url = str;
        this.deliveryType = deliveryType;
    }

    public static /* synthetic */ UrlMediaSource copy$default(UrlMediaSource urlMediaSource, String str, MediaSource.DeliveryType deliveryType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = urlMediaSource.url;
        }
        if ((i10 & 2) != 0) {
            deliveryType = urlMediaSource.getDeliveryType();
        }
        return urlMediaSource.copy(str, deliveryType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final MediaSource.DeliveryType component2() {
        return getDeliveryType();
    }

    public final UrlMediaSource copy(String url, MediaSource.DeliveryType deliveryType) {
        p.j(url, "url");
        p.j(deliveryType, "deliveryType");
        return new UrlMediaSource(url, deliveryType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrlMediaSource)) {
            return false;
        }
        UrlMediaSource urlMediaSource = (UrlMediaSource) other;
        return p.e(this.url, urlMediaSource.url) && getDeliveryType() == urlMediaSource.getDeliveryType();
    }

    @Override // io.bidmachine.rendering.model.MediaSource
    public MediaSource.DeliveryType getDeliveryType() {
        return this.deliveryType;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + getDeliveryType().hashCode();
    }

    public String toString() {
        return "UrlMediaSource(url=" + this.url + ", deliveryType=" + getDeliveryType() + ')';
    }
}
