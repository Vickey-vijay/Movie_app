package lo;

import org.fourthline.cling.support.model.Channel;

/* JADX INFO: compiled from: ChannelLoudness.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Channel f63904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f63905b;

    public Channel a() {
        return this.f63904a;
    }

    public Boolean b() {
        return this.f63905b;
    }

    public String toString() {
        return "Loudness: " + b() + " (" + a() + ")";
    }

    public a(Channel channel, Boolean bool) {
        this.f63904a = channel;
        this.f63905b = bool;
    }
}
