package lo;

import org.fourthline.cling.support.model.Channel;

/* JADX INFO: compiled from: ChannelVolume.java */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Channel f63908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f63909b;

    public Channel a() {
        return this.f63908a;
    }

    public Integer b() {
        return this.f63909b;
    }

    public String toString() {
        return "Volume: " + b() + " (" + a() + ")";
    }

    public c(Channel channel, Integer num) {
        this.f63908a = channel;
        this.f63909b = num;
    }
}
