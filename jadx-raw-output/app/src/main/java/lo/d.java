package lo;

import org.fourthline.cling.support.model.Channel;

/* JADX INFO: compiled from: ChannelVolumeDB.java */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Channel f63910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f63911b;

    public Channel a() {
        return this.f63910a;
    }

    public Integer b() {
        return this.f63911b;
    }

    public String toString() {
        return "VolumeDB: " + b() + " (" + a() + ")";
    }

    public d(Channel channel, Integer num) {
        this.f63910a = channel;
        this.f63911b = num;
    }
}
