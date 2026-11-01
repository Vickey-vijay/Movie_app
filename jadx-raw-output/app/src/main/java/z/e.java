package z;

import ck.p;
import org.fourthline.cling.support.model.Channel;

/* JADX INFO: compiled from: AudioRenderServiceImpl.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class e extends ko.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f85871c;

    @Override // ho.m
    public org.fourthline.cling.model.types.b[] a() {
        return new org.fourthline.cling.model.types.b[]{new org.fourthline.cling.model.types.b(0L)};
    }

    @Override // ko.a
    public Channel[] c() {
        return new Channel[]{Channel.Master};
    }

    public e(c cVar) {
        p.j(cVar, "audioControl");
        this.f85871c = cVar;
    }

    @Override // ko.a
    public boolean e(org.fourthline.cling.model.types.b bVar, String str) {
        p.j(bVar, "instanceId");
        p.j(str, "channelName");
        return this.f85871c.b(str);
    }

    @Override // ko.a
    public org.fourthline.cling.model.types.d f(org.fourthline.cling.model.types.b bVar, String str) {
        p.j(bVar, "instanceId");
        p.j(str, "channelName");
        return this.f85871c.a(str);
    }
}
