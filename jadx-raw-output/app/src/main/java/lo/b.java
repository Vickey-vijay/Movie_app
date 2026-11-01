package lo;

import org.fourthline.cling.support.model.Channel;

/* JADX INFO: compiled from: ChannelMute.java */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Channel f63906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f63907b;

    public Channel a() {
        return this.f63906a;
    }

    public Boolean b() {
        return this.f63907b;
    }

    public String toString() {
        return "Mute: " + b() + " (" + a() + ")";
    }

    public b(Channel channel, Boolean bool) {
        this.f63906a = channel;
        this.f63907b = bool;
    }
}
